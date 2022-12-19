//适配器模式测试
public class test7 {
    public static void main(String[] args) {
        PayBehavior payBehavior = new AliPay();
        LoanBehavior loanBehavior = new AntCreditPay();

        PayBehavior loanAdapter = new LoanAdapter(loanBehavior);
        LoanBehavior payAdapter = new PayAdapter(payBehavior);

        System.out.print("付款行为：");
        payBehavior.pay();
        System.out.print("贷款行为：");
        loanBehavior.loan();
        System.out.println();

        System.out.print("贷款适配器：");
        loanAdapter.pay();
        System.out.print("付款适配器：");
        payAdapter.loan();
    }
}
