//package cn.itcast.controller;
//
//import cn.itcast.pojo.Employee;
//import cn.itcast.pojo.Msg;
//import cn.itcast.service.EmployeeService;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import java.util.List;
//
////处理员工CRUD请求
//@Controller
//public class EmployeeController {
//    @Autowired
//    private EmployeeService employeeService;
//
//    @ResponseBody
//    @RequestMapping(value = "/employee",method = RequestMethod.GET)
//    public Msg getList(@RequestParam(value = "pn",defaultValue = "1")Integer pn){
//        PageHelper.startPage(pn,5);
//        List<Employee> all = employeeService.findAll();
//        PageInfo pageInfo = new PageInfo(all,5);
//        return Msg.success().add("page",pageInfo);
//    }
//
//    //@RequestMapping(value = "/employee",method = RequestMethod.GET)
//    public  String getList(@RequestParam(value = "pn",defaultValue = "1") Integer pn, Model model){
//        //这不是一个分页查询
//        //引入pageHelper分页插件
//        //在查询之前只需要调用
//        PageHelper.startPage(pn,5);  //传入页码以及每页大小
//        //tartPage后面紧跟的查询就是一个分页查询
//        List<Employee> list = employeeService.findAll();
//        //使用pageinfo包装查询后的结果，只需要将pageInfo交给页面就行了
//        //封装了详细的分页信息，以及有我们查询出来的数据
////        传入连续显示的页数
//        PageInfo page = new PageInfo(list,5);
//        model.addAttribute("page",page);
//        return "list";
//    }
//}