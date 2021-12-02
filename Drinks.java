class Espresso extends CaffeineInfusedBeverage {
    static double price = 4.0;

    public Espresso() {
        description_="Espresso";
    }
    public double cost(){
        return price;
    }

    public String getDescription() {
        return description_;
    }
}

class Cappuccino extends CaffeineInfusedBeverage {
    static double price = 4.5;

    public Cappuccino() {
        description_="Cappuccino";
    }
    public double cost(){
        return price;
    }

    public String getDescription() {
        return description_;
    }
}

public class Drinks { }
