package order;

public enum Topping {

    エビフライ("エビフライ", 200),
    ささみ("ささみ", 100),
    チーズ("チーズ",50);

    String name;

    int price;

        Topping(String name, int price) {
            this.name = name;
            this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}
