
public class FruitTea extends Drink{

    DrinkIngredientFactory drinkIngredientFactory;//抽象工厂

    public FruitTea(){
        //装饰者模式构造方法
        name = "FruitTea";
        description = "Fruit Tea";
    }
    public FruitTea(DrinkIngredientFactory drinkIngredientFactory){
        //抽象工厂构造方法
        this.drinkIngredientFactory = drinkIngredientFactory;
        name = "FruitTea";
    }
    public void addBase(){
        System.out.println("Add Fruit");
    }

    public int cost(){return 5;}//装饰者模式

    //抽象工厂模式
    public void prepare(){
        System.out.println("Preparing " + name);
        fruit = drinkIngredientFactory.createFruit();
    }
}
