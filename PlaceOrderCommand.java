public class PlaceOrderCommand implements Command{
    Order order;
    public PlaceOrderCommand(Order order){
        this.order = order;
    }
    public void execute(){
        order.place();
    }
    public void undo(){
        order.cancel();
    }
}
