package Chapter_12_Enum_AutoPack.Basic;

enum Apple {
    Jonathan(19),GoldenDel(7),RedDel(78),Winesap(9),Cortland(5);
    private int price;

    Apple(int price) {
        this.price = price;
    }

    Apple() {
        price = -1;
    }

    public int getPrice() {
        return price;
    }
}
