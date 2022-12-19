//单件模式测试
public class test5 {
    public static void main(String[] args) {
        QingdaoStore qingdaoStore = QingdaoStore.getInstance();
        QingdaoStore qingdaoStore2 = QingdaoStore.getInstance();
        System.out.println();

        JinanStore jinanStore = JinanStore.getInstance();
        JinanStore jinanStore2 = JinanStore.getInstance();
    }
}
