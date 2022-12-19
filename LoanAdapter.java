//贷款适配器——把贷款适配为付款
public class LoanAdapter implements PayBehavior{
    LoanBehavior loanBehavior;
    public LoanAdapter(LoanBehavior loanBehavior){
        this.loanBehavior = loanBehavior;
    }
    public void pay(){
        loanBehavior.loan();
    }
}
