package order;

import java.util.List;

public class Curry implements Product {

    private CurryType curry;
    private List<Topping> toppingList;

    public Curry(CurryType curry, List<Topping> topping) {
        this.curry = curry;
        this.toppingList = topping;
    }

    public Curry(CurryType curry) {
        this.curry = curry;
    }

    public CurryType getCurry() {
        return curry;
    }

    public List<Topping> getToppingList() {
        return toppingList;
    }

    public int getToppingTotal(){
        int total = 0;

        for (Topping topping: toppingList) {
            total += topping.getPrice();
        }
        return total;
    }

    @Override
    public int getPrice() {
        //トッピングも合わせた料金を計算する
        return curry.getPrice() +
                toppingList.stream()
                .mapToInt(Topping::getPrice)
                .sum();
    }
}
