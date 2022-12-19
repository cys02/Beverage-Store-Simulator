public class CancelOrderCommand implements Command{
    Order order;
    public CancelOrderCommand(Order order){
        this.order = order;
    }
    public void execute(){
        order.cancel();
    }
    public void undo(){
        order.place();
    }
}
