<%--
  Created by IntelliJ IDEA.
  User: 1q
  Date: 2016/4/8
  Time: 18:19
  To change this template use File | Settings | File Templates.
--%>
<%@include file="/taglib/taglibs.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>列表</title>
</head>
    <table>
        <tr>
            <td>国家名称</td>
        </tr>
        <c:forEach items="${page.list}" var="list">
            <tr>
                <td>${list.countryname}</td>
            </tr>

        </c:forEach>
    </table>
</body>
</html>
