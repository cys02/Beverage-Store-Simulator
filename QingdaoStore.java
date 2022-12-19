public class QingdaoStore extends Store{
    //单件模式
    private static QingdaoStore uniqueInstance;

    public static QingdaoStore getInstance() {
        if (uniqueInstance == null) {
            System.out.println("Creating unique instance of Qingdao Store");
            uniqueInstance = new QingdaoStore();
        }
        System.out.println("Returning instance of Qingdao Store");
        return uniqueInstance;
    }

    private QingdaoStore(){
        //策略模式
        payBehavior = new AliPay();
    }
    //工厂方法模式&抽象工厂模式
    public Drink createDrink(String item){
        Drink drink = null;
        DrinkIngredientFactory drinkIngredientFactory =
                new QDDrinkIngredientFactory();
        if(item.equals("FruitTea")){
            drink = new FruitTea(drinkIngredientFactory);
            drink.setName("Qingdao Fruit Tea");
//            return new QingdaoFruitTea();
        }
        else if(item.equals("MilkTea")){
            drink  = new MilkTea(drinkIngredientFactory);
            drink.setName("Qingdao Milk Tea");
//            return new QingdaoMilkTea();
        }
        return drink;
    }
}
