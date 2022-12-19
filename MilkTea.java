
public class MilkTea extends Drink{
    DrinkIngredientFactory drinkIngredientFactory;
    public MilkTea(){
        //装饰者模式构造方法
        name = "MilkTea";
        description = "Milk Tea";
    }
    public MilkTea(DrinkIngredientFactory drinkIngredientFactory){
        this.drinkIngredientFactory = drinkIngredientFactory;
        name = "MilkTea";
    }
    public void addBase(){
        System.out.println("Adding Milk");
    }
    public int cost(){return 10;}   //装饰者模式

    //抽象工厂模式
    public void prepare(){
        System.out.println("Preparing " + name);
        milk = drinkIngredientFactory.createMilk();
    }
}
