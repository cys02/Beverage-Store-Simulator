import Ingredient.*;
//抽象工厂
public class QDDrinkIngredientFactory implements DrinkIngredientFactory{
    public Fruit createFruit(){
        return new FruitJuice();
    }
    public Milk createMilk(){
        return new FreshMilk();
    }
}
