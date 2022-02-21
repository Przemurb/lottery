package com.example.lottery.data;

import java.util.ArrayList;
import java.util.List;

public class Coupon {
    private final List<Integer> coupon;
    private final List<Integer> hitNumbers = new ArrayList<>();
    private int hits = 0;

    public List<Integer> getCoupon() {
        return coupon;
    }

    public List<Integer> getHitNumbers() {
        return hitNumbers;
    }

    public int getHits() {
        return hits;
    }


    public void checkCoupon(Draw draw, List<Integer> myCoupon) {
        for (Integer number : myCoupon) {
            if (draw.getDrawnNumbers().contains(number)) {
                hits++;
                hitNumbers.add(number);
            }
        }
    }

    public Coupon(List<Integer> myCoupon) throws CouponException {
        if (myCoupon == null || myCoupon.size() == 0) {
            throw new CouponException("Kupon jest pusty");
        }
        if (validationNumbers(myCoupon)) {
            this.coupon = myCoupon;
        } else
            throw new CouponException("Błędny kupon!");
    }


    private boolean validationNumbers(List<Integer> coupon) {
        long count = coupon.stream()
                .filter(n -> n > 0 & n <= Draw.RANGE)
                .distinct()
                .count();
        return count == Draw.DRAW_NUMBERS;
    }
}
