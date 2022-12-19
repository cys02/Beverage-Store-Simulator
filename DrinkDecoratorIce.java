public class DrinkDecoratorIce extends DrinkDecorator{
    public DrinkDecoratorIce(Drink drink){
        this.drink = drink;
    }
    public String getDescription(){return drink.getDescription()+", Ice";}
    public int cost(){return 1+drink.cost();}
}
