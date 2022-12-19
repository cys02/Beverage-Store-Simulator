//测试装饰者模式
public class test3 {
    public static void main(String[] args) {
        Drink drink1 = new FruitTea();
        drink1 = new DrinkDecoratorSugar(drink1);
        drink1 = new DrinkDecoratorIce(drink1);
        System.out.print("drink1的成分有：");
        System.out.println(drink1.getDescription());
        System.out.print("该饮品的价格为：¥");
        System.out.println(drink1.cost());

        System.out.println();

        Drink drink2 = new MilkTea();
        drink2 = new DrinkDecoratorIce(drink2);
        drink2 = new DrinkDecoratorSugar(drink2);
        System.out.print("drink2的成分有：");
        System.out.println(drink2.getDescription());
        System.out.print("该饮品的价格为：¥");
        System.out.println(drink2.cost());
    }
}
