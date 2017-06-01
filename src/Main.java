

import order.*;
import payment.Campaign;
import payment.Treasurer;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> curryList = Arrays.asList(
                new Curry(
                        CurryType.ポークカレー,
                        Collections.singletonList(Topping.ささみ)
                ),
                new Curry(
                        CurryType.ビーフカレー,
                        Arrays.asList(Topping.ささみ,Topping.エビフライ,Topping.チーズ)
                )
        );

        Treasurer treasurer  = new Treasurer(
                new Order(
                        new UserId("aaaa"),
                        curryList
                ),
                Campaign.ポークカレー甘口半額
        );


        System.out.println(treasurer.getTotal());
    }

}
