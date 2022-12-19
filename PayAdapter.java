//付款适配器——把付款适配为贷款
public class PayAdapter implements LoanBehavior{
    PayBehavior payBehavior;
    public PayAdapter(PayBehavior payBehavior){
        this.payBehavior = payBehavior;
    }
    public void loan(){
        payBehavior.pay();
    }
}
