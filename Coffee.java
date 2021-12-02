public class Coffee {
    public static void printer(CaffeineInfusedBeverage c){
        System.out.printf("%s (%.2f EUR)%n", c.getDescription(), c.cost());
    }

    public static void main(String[] args) {
        CaffeineInfusedBeverage espressoWithMilk = new Milk(true, new Espresso());
        CaffeineInfusedBeverage espressoWithSoyMilk = new SoyMilk(new Espresso());
        CaffeineInfusedBeverage cappuccinoWithMilk = new Milk(new Cappuccino());
        CaffeineInfusedBeverage cappuccinoWithMilkSugar = new Milk(true, new Sugar(new Cappuccino()));
        printer(espressoWithMilk);
        printer(espressoWithSoyMilk);
        printer(cappuccinoWithMilk);
        printer(cappuccinoWithMilkSugar);
    }

}