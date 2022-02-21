import com.example.lottery.controll.LotteryResult;
import com.example.lottery.data.Coupon;
import com.example.lottery.data.CouponChecker;
import com.example.lottery.data.CouponException;
import com.example.lottery.data.Draw;

import java.util.List;

public class Test {
    public static void main(String[] args) throws CouponException {
        List<Integer> c = List.of(23, 14, 2, 12, 45, 42);

        LotteryResult r;
        try {
            r = CouponChecker.lotteryResult(c);
            int hits = r.getHitNumbers().size();
            System.out.println(hits);
        } catch (CouponException e) {
            System.out.println(e.getMessage());
        }


        Draw d = new Draw();
        System.out.print("Losowanie: ");
        for (Integer drawnNumber : d.getDrawnNumbers()) {
            System.out.print(drawnNumber + ", ");
        }
        System.out.println();


        Coupon coupon = new Coupon(c);
        System.out.print("Mój kupon:");

        coupon.getCoupon().forEach(n -> System.out.print(n +", "));
        System.out.println();
        coupon.checkCoupon(d, coupon.getCoupon());
        System.out.println("ilość trafień: " + coupon.getHits());
        for (Integer hitNumber : coupon.getHitNumbers()) {
            System.out.print(hitNumber +", ");
    }

}
}
