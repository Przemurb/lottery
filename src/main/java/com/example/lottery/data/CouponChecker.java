package com.example.lottery.data;

import com.example.lottery.controll.LotteryResult;

import java.util.List;

public class CouponChecker {
    public static LotteryResult lotteryResult(List<Integer> myCoupon) throws CouponException {
        Draw draw = new Draw();

        Coupon coupon = new Coupon(myCoupon);
        coupon.checkCoupon(draw, myCoupon);
        List<Integer> hitNumbers = coupon.getHitNumbers();

        return new LotteryResult(draw.getDrawnNumbers(), myCoupon, hitNumbers);
    }
}
