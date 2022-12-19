//测试抽象工厂模式
public class test4 {
    public static void main(String[] args) {
        Store qdStore = QingdaoStore.getInstance();
        Store jnStore = JinanStore.getInstance();
        System.out.println("----以上为单件模式输出----");
        System.out.println();

        Drink drink = qdStore.orderDrink("FruitTea");
        System.out.println("Client ordered a "+drink);
        System.out.println();

        drink = jnStore.orderDrink("FruitTea");
        System.out.println("Client ordered a "+drink);
        System.out.println();

        drink = qdStore.orderDrink("MilkTea");
        System.out.println("Client ordered a "+drink);
        System.out.println();

        drink = jnStore.orderDrink("MilkTea");
        System.out.println("Client ordered a "+drink);
        System.out.println();

    }
}
