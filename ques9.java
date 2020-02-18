enum property {
    house1(10000) ,house2(20000) , house3(300000);
    private int price;
    property(int price)
    {
        this.price = price;
    }
    int getPrice()
    {
        return price;
    }
}

public class ques9 {

    public static void main(String[] args) {
    for(property p : property.values())
    {

        System.out.println(p + " price is:"+ p.getPrice());
    }
    }
}
