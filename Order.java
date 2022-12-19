//命令模式（订单相当于命令模式中的电灯）

public class Order {
    Drink drink;
    String OrderNumber;
    public Order(String OrderNumnber){
        this.OrderNumber = OrderNumnber;
    }
    public void place(){
        System.out.println(OrderNumber+" is placed");
    }
    public void cancel(){
        System.out.println(OrderNumber+" is cancelled");
    }
}
