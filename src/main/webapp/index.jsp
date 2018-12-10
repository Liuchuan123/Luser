<%--
  Created by IntelliJ IDEA.
  User: LIUCHUAN
  Date: 2018/11/15
  Time: 13:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/jquery-3.3.1.min.js"></script>
    <link href="${pageContext.request.contextPath}/static/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/bootstrap/js/bootstrap.min.js"></script>

</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-12">
            <h1>SSM-CRUD</h1>
        </div>
    </div>
    <div class="row">
        <div class="col-md-4 col-md-offset-8">
            <button class="btn btn-primary">新增</button>
            <button class="btn btn-danger">删除</button>
        </div>
    </div>
    <div class="row">
        <%--表格--%>
        <div class="col-md-12">
            <table class="table table-bordered table-hover" id="emp_table">
                <thead>
                <tr>
                    <th>#</th>
                    <th>Name</th>
                    <th>gender</th>
                    <th>email</th>
                    <th>department</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>

                </tbody>
            </table>
        </div>
    </div>
    <%--分页条--%>
    <div class="row">
        <div class="col-md-6">
            当前记录数：  总页数： 当前页数：
        </div>
        <div class="col-md-6">

        </div>
    </div>
</div>
<script type="text/javascript">
    $(function () {
        $.ajax({
            url:"${pageContext.request.contextPath}/employee",
            data:"pn=1",
            type:"get",
            success:function (result) {
            //console.log(result);
                build_emp_table(result)
        }
        })
    })
    function build_emp_table(result) {
        var emps = result.extend.page.list;
        $.each(emps,function (index,item) {
            var empIDTd = $("<td></td>").append(item.epId);
            var empNameTd = $("<td></td>").append(item.epName);
            var gender = item.gender=="m"?"男":"女";
            var empGenderTd = $("<td></td>").append(gender);
            var empEmailTd = $("<td></td>").append(item.epEmail);
            var empDepTd = $("<td></td>").append(item.department.deName);
            var editBtn = $("<button></button>").addClass("btn btn-primary btn-sm").append($("<span><s/pan>")
                .addClass("glyphicon glyphicon-pencil")).append("编辑");
            var deleteBtn = $("<button></button>").addClass("btn btn-danger btn-sm").append($("<span><s/pan>")
                .addClass("glyphicon glyphicon-trash")).append("删除");
            var btnTd = $("<td></td>").append(editBtn).append(" ").append(deleteBtn);
            $("<tr></tr>").append(empIDTd)
                .append(empNameTd)
                .append(empGenderTd)
                .append(empEmailTd)
                .append(empDepTd)
                .append(btnTd)
                .appendTo("#emp_table tbody")
        })
    }
    function build_emp_nav(result) {

    }
</script>
</body>
</html>
