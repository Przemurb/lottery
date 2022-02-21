<%@ page import="com.example.lottery.controll.LotteryResult" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Collections" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="pl">
<head>
    <meta charset="UTF-8">
    <title>Przegrana</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
</head>
<body>
<%
    LotteryResult result = (LotteryResult) request.getAttribute("checkLottery");
    List<Integer> draws = result.getDraws();
    List<Integer> coupon = result.getCoupon();
%>
<main>
    <fieldset>
        <h1>Nic nie wygrałeś</h1>
        <p> Wynik losowania: <%= draws %> </p>
        <p> Twoje numery: <%= coupon %> </p>
    </fieldset>
</main>


</body>
</html>
