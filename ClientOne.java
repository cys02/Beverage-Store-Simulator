public class ClientOne extends Client implements Observer,DisplayElement{
    int price = 0;
    public ClientGroup clientGroup;
    public ClientOne(ClientGroup clientGroup){
        this.clientGroup = clientGroup;
        clientGroup.registerObserver(this);
    }
    public void update(int value){
        price = value;
        display();
    }
    public void display(){
        System.out.println("ClientOne——The Price Now Is: $"+price);
    }
}
