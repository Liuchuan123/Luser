import cn.itcast.pojo.Employee;
import com.github.pagehelper.PageInfo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

/*
* 使用spring测试模块提供的测试请求功能，测试curd请求的正确性
* spring4的测试需要servlet3.0的支持
* */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:applicationContext.xml","classpath:dispatherServlet.xml"})
public class MVCTest {
    //传入springmvc的ioc
    @Autowired
    WebApplicationContext context;
    //虚拟mvc请求，获取到处理结果
    MockMvc mockMvc;
    @Before
    public  void init(){
        mockMvc = MockMvcBuilders.webAppContextSetup( context ).build();
    }

    @Test
    public void testPage() throws Exception {
        MvcResult result = mockMvc.perform( MockMvcRequestBuilders.get( "/employee" ).param( "pn", "5" ) ).andReturn();

        //请求成功后，请求域中会有page，我们而已取出page进行验证
        PageInfo page = (PageInfo) result.getRequest().getAttribute( "page" );

        System.out.println("当前页码："+page.getPageNum());
        System.out.println("总页码："+page.getPages());
        System.out.println("总记录数"+page.getTotal());
        System.out.println("在页面下需要连续的页码");
        int[] nums = page.getNavigatepageNums();
        for (int i:nums){
            System.out.print(" "+i);
        }

        //获取员工数据

        List<Employee> list = page.getList();
        for(Employee  employee : list){
            System.out.println("id"+employee.getEpId()+"=========>name"+employee.getEpName());
        }

    }
}