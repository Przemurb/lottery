<%@ page import="com.example.lottery.controll.LotteryResult" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8"%>
<html lang="pl">
<head>
    <meta charset="UTF-8">
    <title>Wyniki losowania</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
</head>
<body>
    <%
        LotteryResult result = (LotteryResult) request.getAttribute("checkLottery");
        List<Integer> draws = result.getDraws();
        List<Integer> coupon = result.getCoupon();
        int hits = result.getHitNumbers().size();
        List<Integer> hitNumbers = result.getHitNumbers();
    %>
    <main>
        <fieldset>
            <h1>Wyniki</h1>
            <p> Wynik losowania: <%= draws %> </p>
            <p> Twoje numery: <%= coupon %> </p>
            <h3> Liczba trafień: <%= hits %> </h3>
            <p> Trafione liczby: <%= hitNumbers %> </p>
        </fieldset>
    </main>
</body>
</html>
