//package cn.itcast.service;
//
//import cn.itcast.pojo.Employee;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class EmployeeService {
//    @Autowired
//    private EmployeeMapper employeeMapper;
//
//    /*
//    * 查询所有员工
//    * */
//    public List<Employee> findAll() {
//        return employeeMapper.selectByExampleWithDep(null);
//    }
//}