package order;

public enum CurryType {

    ポークカレー("ポークカレー",500),
    ポークカレー甘口("ポークカレー甘口",500),
    ビーフカレー("ビーフカレー",600);

    String curryType;
    int price;

    public int getPrice() {
        return price;
    }

    public String getCurryType(){
        return curryType;
    }

    CurryType(String curryType, int price) {
        this.curryType = curryType;
        this.price = price;
    }
}
