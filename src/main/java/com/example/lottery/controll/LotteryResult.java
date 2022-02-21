package com.example.lottery.controll;

import java.util.List;

public class LotteryResult {
    private List<Integer> draws;
    private List<Integer> coupon;
    private List<Integer> hitNumbers;

    public LotteryResult(List<Integer> draws, List<Integer> coupon, List<Integer> hitNumbers) {
        this.draws = draws;
        this.coupon = coupon;
        this.hitNumbers = hitNumbers;
    }

    public List<Integer> getHitNumbers() {
        return hitNumbers;
    }

    public void setHitNumbers(List<Integer> hitNumbers) {
        this.hitNumbers = hitNumbers;
    }

    public List<Integer> getDraws() {
        return draws;
    }

    public void setDraws(List<Integer> draws) {
        this.draws = draws;
    }

    public List<Integer> getCoupon() {
        return coupon;
    }

    public void setCoupon(List<Integer> coupon) {
        this.coupon = coupon;
    }
}
