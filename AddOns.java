class Milk extends AddOnDecorator {
    static double price = 1.0;
    boolean foamed;

    /*
    Ruft Konstruktor von AddOnDecorator auf --> drink_ = drink
    Prueft ob Milch aufgeschaeumt sein soll --> aendert Beschreibung von CaffeineInfusedBeverage
     */
    public Milk(boolean foamed, CaffeineInfusedBeverage drink) {
        super(drink);
        this.foamed = foamed;
        if(this.foamed) description_ = drink.getDescription() + " with foamed milk";
        else description_ = drink.getDescription() + " with milk";
    }
    /*
    Es wird lediglich ein Konstruktor uebergeben; in diesem Fall ist Milch nicht aufgeschaeumt
     */
    public Milk(CaffeineInfusedBeverage drink) {
        this(false, drink);
    }

    /*
    Addiert Kosten von AddOn zum bisherigen Preis vom Getraenk
     */
    @Override
    public double cost() {
        return drink_.cost() + price;
    }

    /*
    Gibt Beschreibung des Getraenks zurueck
     */
    @Override
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
class OatMilk extends AddOnDecorator {
    static double price = 1.25;
    boolean foamed = false;

    public OatMilk(boolean foamed, CaffeineInfusedBeverage drink) {
        super(drink);
        this.foamed = foamed;
        if(this.foamed) description_ = drink.getDescription() + " with foamed oatmilk";
        else description_ = drink.getDescription() + " with oatmilk";
    }

    public OatMilk(CaffeineInfusedBeverage drink) {
        this(false, drink);
    }

    public double cost() {
        return drink_.cost() + price;
    }

    public String getDescription() {
        return description_;
    }
}
class LactoseFreeMilk extends AddOnDecorator {
    static double price = 1.75;
    boolean foamed = false;

    public LactoseFreeMilk(boolean foamed, CaffeineInfusedBeverage drink) {
        super(drink);
        this.foamed = foamed;
        if(this.foamed) description_ = drink.getDescription() + " with foamed lactose-free milk";
        else description_ = drink.getDescription() + " with lactose-free milk";
    }

    public LactoseFreeMilk(CaffeineInfusedBeverage drink) {
        this(false, drink);
    }

    public double cost() {
        return drink_.cost() + price;
    }

    public String getDescription() {
        return description_;
    }
}
class LowFatMilk extends AddOnDecorator {
    static double price = 1.0;
    boolean foamed = false;

    public LowFatMilk(boolean foamed, CaffeineInfusedBeverage drink) {
        super(drink);
        this.foamed = foamed;
        if(this.foamed) description_ = drink.getDescription() + " with foamed low-fat milk";
        else description_ = drink.getDescription() + " with low-fat milk";
    }

    public LowFatMilk(CaffeineInfusedBeverage drink) {
        this(false, drink);
    }

    public double cost() {
        return drink_.cost() + price;
    }

    public String getDescription() {
        return description_;
    }
}
class HazelnutMilk extends AddOnDecorator {
    static double price = 2.0;
    boolean foamed = false;

    public HazelnutMilk(boolean foamed, CaffeineInfusedBeverage drink) {
        super(drink);
        this.foamed = foamed;
        if(this.foamed) description_ = drink.getDescription() + " with foamed hazelnutmilk";
        else description_ = drink.getDescription() + " with hazelnutmilk";
    }

    public HazelnutMilk(CaffeineInfusedBeverage drink) {
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