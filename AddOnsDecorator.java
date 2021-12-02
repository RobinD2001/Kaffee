abstract class AddOnDecorator extends CaffeineInfusedBeverage {
    CaffeineInfusedBeverage drink_;

    public AddOnDecorator(CaffeineInfusedBeverage drink) {
        drink_ = drink;
    }
}
