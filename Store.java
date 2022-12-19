
public abstract class Store {

    public PayBehavior payBehavior;//策略模式属性
    public void setPayBehavior(PayBehavior pb){
        payBehavior = pb;
    }
    public void performPay(){
        payBehavior.pay();
    }
    abstract Drink createDrink(String item);
    public Drink orderDrink(String type){
        Drink drink = createDrink(type);
        System.out.println("--- Making a " + drink.getName() + " ---");
        drink.prepare();
        drink.addBase();
        drink.addWater();
        return drink;
    }
}
