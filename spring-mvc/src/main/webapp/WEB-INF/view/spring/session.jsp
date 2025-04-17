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
    <c:if test="${param.attr == 'welcome'}">
        <h4>
            환영합니다!
        </h4>
    </c:if>
    <h4>
        <c:out value="${principal}"/>
    </h4>
</main>
<%@include file="/WEB-INF/view/include/footer.jsp" %>
</body>
</html>