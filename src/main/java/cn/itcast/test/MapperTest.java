//package cn.itcast.test;
//
//import cn.itcast.pojo.Employee;
//import org.apache.ibatis.session.SqlSession;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.util.UUID;
//
///*
//* 推荐spring项目使用spring的单元测试（spring-test），可以自动注入我们需要的组件
//*1.导入SpringTest模块
//* 2.@Contextconfiguration指定spring配置文件的位置
//* */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
//public class MapperTest {
//    @Autowired
//    DepartmentMapper departmentMapper;
//    @Autowired
//    EmployeeMapper employeeMapper;
//    @Autowired
//    SqlSession sqlSession;
//    @Test
//    public  void  testCRUD(){
////        departmentMapper.insertSelective(new Department(null,"测试部") );
////        departmentMapper.insertSelective(new Department(null,"开发部") );
////        departmentMapper.insertSelective(new Department(null,"产品部") );
//
////        employeeMapper.insertSelective(new Employee(null,"张三","m","zhangsan@qq.com",1) );
//        EmployeeMapper mapper = sqlSession.getMapper( EmployeeMapper.class);
//        for ( int i=0;i<1000;i++){
//            String name = UUID.randomUUID().toString().substring( 0, 5 )+i;
//            mapper.insertSelective(new Employee(null,name,"m",name+"@qq.com",1));
//        }
//        System.out.println("批量插入完成");
//    }
//}