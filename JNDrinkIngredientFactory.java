import Ingredient.*;
//抽象工厂
public class JNDrinkIngredientFactory implements DrinkIngredientFactory{
    public Fruit createFruit(){
        return new FruitNectar();
    }
    public Milk createMilk(){
        return new MilkPowder();
    }
}
