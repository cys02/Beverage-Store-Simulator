import Ingredient.*;

public abstract class Drink {
    public String name ;
    public Fruit fruit;
    public Milk milk;
    public String description = "Unknown Drink";

    public String getDescription() {
        //装饰者模式
        return description;
    }

    public void addWater(){
        //模版方法中由超类处理的部分
        System.out.println("Adding Water");
    }
    public void box(){
        System.out.println("Boxing The Cup");
    }
    public String getName(){
        return name;
    }
    public void setName(String name){this.name = name;}

    //模版方法模式
    public final void prepareRecipe(){
        addBase();
        addWater();
    }
    public void addBase(){};//模版方法模式子类实现的方法
    //这里本应该用抽象，由于该类同时应用于装饰者模式，
    // 而装饰者模式中不应该有此方法，故使用非抽象

    public int cost(){return 0;};//装饰者模式价格计算
    //这里本应该用抽象，由于该类同时应用于工厂方法模式，而工厂方法模式中不应该有此方法，故使用非抽象


    public void prepare(){};//抽象工厂模式(本应该为抽象)
    public String toString(){
        StringBuffer result = new StringBuffer();
        result.append("---- " + name + " ----\n");
        if(fruit!=null){
            result.append(fruit);
            result.append("\n");
        }
        if(milk!=null){
            result.append(milk);
            result.append("\n");
        }
        return result.toString();
    }
}
