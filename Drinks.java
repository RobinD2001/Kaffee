class Espresso extends CaffeineInfusedBeverage {
    static double price = 4.0;

    /*
    Setzt Beschreibung auf Kaffeename
     */
    public Espresso() {
        description_="Espresso";
    }

    @Override
    public double cost(){
        return price;
    }

    /*
    gibt Beschreibung (von CaffeineInfusedBeverage) zurueck
    */
    @Override
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

class Americano extends CaffeineInfusedBeverage {
    static double price = 3.0;

    public Americano() {
        description_="Americano";
    }
    public double cost(){
        return price;
    }

    public String getDescription() {
        return description_;
    }
}

class LatteMacchiato extends CaffeineInfusedBeverage {
    static double price = 4.5;

    public LatteMacchiato() {
        description_="Latte Macchiato";
    }
    public double cost(){
        return price;
    }

    public String getDescription() {
        return description_;
    }
}