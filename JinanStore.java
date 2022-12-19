public class JinanStore extends Store{

    private static JinanStore uniqueInstance;

    public static JinanStore getInstance() {
        if (uniqueInstance == null) {
            System.out.println("Creating unique instance of Jinan Store");
            uniqueInstance = new JinanStore();
        }
        System.out.println("Returning instance of Jinan Store");
        return uniqueInstance;
    }

    private JinanStore(){
        //策略模式
        payBehavior = new WechatPay();
    }

    //工厂方法模式&抽象工厂模式
    public Drink createDrink(String item){
        Drink drink = null;
        DrinkIngredientFactory drinkIngredientFactory = new JNDrinkIngredientFactory();
        if(item.equals("FruitTea")){
            drink = new FruitTea(drinkIngredientFactory);
            drink.setName("Jinan Fruit Tea");
//            return new JinanFruitTea();
        }
        else if(item.equals("MilkTea")){
            drink = new MilkTea(drinkIngredientFactory);
            drink.setName("Jinan Milk Tea");
//            return new JinanMilkTea();
        }
        return drink;
    }
}
