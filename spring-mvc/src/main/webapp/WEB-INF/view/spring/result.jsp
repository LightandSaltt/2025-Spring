<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@include file="/WEB-INF/view/include/page.jsp" %>
<html>
<head>
    <title>Hello JSP</title>
    <%@include file="/WEB-INF/view/include/static.jsp" %>
</head>
<body>
<%--include는 무조건 이 방식을 쓰자--%>
<%@include file="/WEB-INF/view/include/header.jsp" %>
<%@include file="/WEB-INF/view/include/sidenav.jsp" %>
<main class="container">
    <h4>form</h4>
    <ul>
        <li><c:out value="${dto.userId}"/></li>
        <li><c:out value="${dto.email}"/></li>
        <li><c:out value="${dto.tel}"/></li>
        <li><c:out value="${dto.lastAccess}"/></li>
    </ul>
</main>
<%@include file="/WEB-INF/view/include/footer.jsp" %>
</body>
</html>