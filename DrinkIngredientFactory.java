import Ingredient.*;

//抽象工厂
public interface DrinkIngredientFactory {
    public Fruit createFruit();
    public Milk createMilk();
}
