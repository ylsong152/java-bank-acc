package src;

public class FixedDepositAccount extends BankAccount{
    // Constructor
    public FixedDepositAccount(String name, Float balance){
        super(name, balance);
    }
    public FixedDepositAccount(String name, Float balance, Float interest){
        super(name, balance);
    };
    public FixedDepositAccount(String name, Float balance, Float interest, Integer duration) {
        super(name, balance);
    };

    // Properties
    private float interest = 3;
    private int duration = 6;
    private boolean isInterestSet = false;
    private boolean isDurationSet = false;

    // Methods
    private float getInterest() {
        return this.interest;
    }
    private int getDuration() {
        return this.duration;
    }
    private void setInterest(float rate) {
        if (!isDurationSet) {
            this.interest = rate;
            this.isDurationSet = true;
        } else{
            throw new IllegalArgumentException();
        }
    }
    private void setDuration(int newDuration) {
        if(!isDurationSet) {
            this.duration = newDuration;
            this.isDurationSet = true;
        } else {
            throw new IllegalArgumentException();
        }
    }
    @Override 
    public float getBalance() {
        return (super.getBalance() * (1 + interest/100)) ;
    }

    @Override
    public void withdraw(float amount) {
        return; 
    }
    @Override
    public void deposit(float amount) {
        return; 
    }

    public static void main(String[] args) {
        FixedDepositAccount a = new FixedDepositAccount("Apple", (float) 100);
        System.out.println(a.getBalance());
    }
}
