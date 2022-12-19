import java.util.ArrayList;
import java.util.List;

public class ClientGroup implements Subject{
    public List<Observer> observers;
    public int price;
    public ClientGroup(){
        observers = new ArrayList<Observer>();
    }
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(price);//采用推数据的方式
        }
    }

    public void setPrice(int price){
        this.price = price;
        notifyObservers();
    }

    public int getPrice(){
        return price;
    }

}
