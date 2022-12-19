
//测试观察者模式
public class test2 {
    public static void main(String[] args) {
        ClientGroup clientGroup = new ClientGroup();
        ClientOne clientOne = new ClientOne(clientGroup);
        ClientTwo clientTwo = new ClientTwo(clientGroup);

        clientGroup.setPrice(5);
        System.out.println();
        clientGroup.setPrice(10);
    }
}
