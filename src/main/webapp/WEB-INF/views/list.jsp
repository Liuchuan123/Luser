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
               <button class="btn btn-danger">新增</button>
           </div>
       </div>
       <div class="row">
           <%--表格--%>
           <div class="col-md-12">
               <table class="table table-bordered table-hover">
                   <tr>
                       <td>#</td>
                       <td>Name</td>
                       <td>gender</td>
                       <td>email</td>
                       <td>department</td>
                       <td>操作</td>
                   </tr>
                   <c:forEach items="${page.list}" var="emp">
                   <tr>
                       <td>${emp.epId}</td>
                       <td>${emp.epName}</td>
                       <td>${emp.gender == "m" ? "男":"女"}</td>
                       <td>${emp.epEmail}</td>
                       <td>${emp.department.deName}</td>
                       <td>
                           <button class="btn btn-info btn-sm"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>编辑</button>
                           <button class="btn btn-danger btn-sm"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span> 删除</button>
                       </td>
                   </tr>
                   </c:forEach>
               </table>
           </div>
       </div>
       <%--分页条--%>
       <div class="row">
           <div class="col-md-6">
                当前记录数：${page.total}  总页数：${page.pages}  当前页数：${page.pageNum}
           </div>
           <div class="col-md-6">
               <nav aria-label="Page navigation">
                   <ul class="pagination">



                        <c:if test="${page.hasPreviousPage}">
                            <li><a href="${pageContext.request.contextPath}/employee?pn=1">
                                首页
                            </a>
                            </li>
                       <li>
                           <a href="${pageContext.request.contextPath}/employee?pn=${page.pageNum-1}" aria-label="Previous">
                               <span aria-hidden="true">&laquo;</span>
                           </a>
                       </li>
                        </c:if>
                       <c:forEach items="${page.navigatepageNums}" var="i">
                           <c:if test="${i == page.pageNum}">
                                <li class="active"><a href="#">${i}</a></li>
                           </c:if>
                           <c:if test="${i!=page.pageNum}">
                               <li><a href="${pageContext.request.contextPath}/employee?pn=${i}">${i}</a></li>
                           </c:if>
                       </c:forEach>
                    <c:if test="${page.hasNextPage}">
                       <li>
                           <a href="${pageContext.request.contextPath}/employee?pn=${page.pageNum+1}" aria-label="Next">
                               <span aria-hidden="true">&raquo;</span>
                           </a>
                       </li>
                       <li><a href="${pageContext.request.contextPath}/employee?pn=${page.pages}">末页</a></li>
                    </c:if>
                   </ul>
               </nav>
           </div>
       </div>
   </div>
</body>
</html>
