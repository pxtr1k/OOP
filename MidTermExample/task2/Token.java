public abstract class Token {
    private double amount;
    private String name;

    public Token(double amount, String name){
        this.amount=amount;
        this.name=name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public abstract String getTokenType();

}
