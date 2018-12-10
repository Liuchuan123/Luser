package cn.itcast.test;

import cn.itcast.pojo.Department;
import cn.itcast.service.DepartmentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: SSM
 * @description: 插入
 * @author: Mr.Liu
 * @create: 2018-12-04 14:08
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class testInsert {
    @Autowired
    DepartmentService departmentService;
    @Test
    public  void testInsert(){
        Department department = new Department();
        department.setDeName( "123456" );
        departmentService.insertdepart(department);
    }
}