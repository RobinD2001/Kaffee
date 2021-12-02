class Milk extends AddOnDecorator {
    static double price = 1.0;
    boolean foamed;

    public Milk(boolean foamed, CaffeineInfusedBeverage drink) {
        super(drink);
        this.foamed = foamed;
        if(this.foamed) description_ = drink.getDescription() + " with foamed milk";
        else description_ = drink.getDescription() + " with milk";
    }

    public Milk(CaffeineInfusedBeverage drink) {
        this(false, drink);
    }

    public double cost() {
        return drink_.cost() + price;
    }

    public String getDescription() {
        return description_;
    }
}

class SoyMilk extends AddOnDecorator {
    static double price = 1.5;
    boolean foamed = false;

    public SoyMilk(boolean foamed, CaffeineInfusedBeverage drink) {
        super(drink);
        this.foamed = foamed;
        if(this.foamed) description_ = drink.getDescription() + " with foamed soymilk";
        else description_ = drink.getDescription() + " with soymilk";
    }

    public SoyMilk(CaffeineInfusedBeverage drink) {
        this(false, drink);
    }

    public double cost() {
        return drink_.cost() + price;
    }

    public String getDescription() {
        return description_;
    }
}

class Sugar extends AddOnDecorator {
    static double price = 1.2;

    public Sugar(CaffeineInfusedBeverage drink) {
        super(drink);
        description_ = drink.getDescription() + " with sugar";
    }
    public double cost() {
        return drink_.cost() + price;
    }

    public String getDescription() {
        return description_;
    }
}


public class AddOns { }

