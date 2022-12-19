public class DrinkDecoratorSugar extends DrinkDecorator{
    public DrinkDecoratorSugar(Drink drink){
        this.drink = drink;
    }
    public String getDescription(){return drink.getDescription()+", Sugar";}
    public int cost(){return 2+drink.cost();}
}
