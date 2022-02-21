package com.example.lottery.controll;

import com.example.lottery.data.CouponChecker;
import com.example.lottery.data.CouponException;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServletLotteryController", value = "/check")
public class ServletLotteryController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int n1 = Integer.parseInt(request.getParameter("n1"));
        int n2 = Integer.parseInt(request.getParameter("n2"));
        int n3 = Integer.parseInt(request.getParameter("n3"));
        int n4 = Integer.parseInt(request.getParameter("n4"));
        int n5 = Integer.parseInt(request.getParameter("n5"));
        int n6 = Integer.parseInt(request.getParameter("n6"));
        List<Integer> coupon = List.of(n1, n2, n3, n4, n5, n6);


        LotteryResult lotteryResult;
        try {
            lotteryResult = CouponChecker.lotteryResult(coupon);
            request.setAttribute("checkLottery", lotteryResult);
            if(lotteryResult.getHitNumbers().size() > 0) {
                request.getRequestDispatcher("/check.jsp").forward(request, response);
            } else {
                request.getRequestDispatcher("/loss.jsp").forward(request, response);
            }
        } catch (CouponException e) {
                request.getRequestDispatcher("/wrong.html").forward(request,response);
        }
    }
}
