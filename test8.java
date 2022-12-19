public class test8 {
    public static void main(String[] args) {
        FruitTea fruitTea = new FruitTea();
        MilkTea milkTea = new MilkTea();

        System.out.println("Making fruitTea...");
        fruitTea.prepareRecipe();
        System.out.println();

        System.out.println("Making milkTea...");
        milkTea.prepareRecipe();
    }
}
