public class Coffee {
    /*
    Schreibt Kaffee in Konsole
     */
    public static void printer(CaffeineInfusedBeverage c){
        System.out.printf("%s (%.2f EUR)%n", c.getDescription(), c.cost());
    }

    public static void main(String[] args) {
        CaffeineInfusedBeverage espressoWithMilk = new Milk(true, new Espresso());
        CaffeineInfusedBeverage espressoWithSoyMilk = new SoyMilk(new Espresso());
        CaffeineInfusedBeverage cappuccinoWithMilk = new Milk(new Cappuccino());
        CaffeineInfusedBeverage cappuccinoWithMilkSugar = new Milk(true, new Sugar(new Cappuccino()));
        CaffeineInfusedBeverage espressoWithHazelnutMilk = new HazelnutMilk(true, new Espresso());
        CaffeineInfusedBeverage americanoWithHazelnutMilkSugar = new HazelnutMilk(true, new Sugar(new Americano()));
        CaffeineInfusedBeverage latteMacchiatoWithSugar = new Sugar(new LatteMacchiato());
        CaffeineInfusedBeverage espresso = new Espresso();
        printer(espresso);
        printer(espressoWithMilk);
        printer(espressoWithSoyMilk);
        printer(espressoWithHazelnutMilk);
        printer(cappuccinoWithMilk);
        printer(cappuccinoWithMilkSugar);
        printer(americanoWithHazelnutMilkSugar);
        printer(latteMacchiatoWithSugar);

    }

}