
//测试策略模式
public class test1 {
    public static void main(String[] args) {
       Store qingdaostore = QingdaoStore.getInstance();
       qingdaostore.performPay();

       Store jinanstore = JinanStore.getInstance();
       jinanstore.performPay();
    }
}

