//命令模式测试
public class test6 {
    public static void main(String[] args) {
        //客户发出命令
        Client client = new Client();
        NoCommand noCommand = new NoCommand();

        //初始化遥控器
        Order order = new Order("00001");
        PlaceOrderCommand placeOrderCommand = new PlaceOrderCommand(order);
        CancelOrderCommand cancelOrderCommand = new CancelOrderCommand(order);
        client.setCommand(placeOrderCommand,cancelOrderCommand);

        client.placeOrder();//下单
        client.cancelOrder();//取消订单
        System.out.println("---- 撤回命令 ----");
        client.undoOrder();//撤回命令
    }
}
