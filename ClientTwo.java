public class ClientTwo extends Client implements Observer,DisplayElement{
    int price = 0;
    public ClientGroup clientGroup;
    public ClientTwo(ClientGroup clientGroup){
        this.clientGroup = clientGroup;
        clientGroup.registerObserver(this);
    }
    public void update(int value){
        price = value;
        display();
    }
    public void display(){
        System.out.println("ClientTwo——The Price Now Is: $"+price);
    }
}
