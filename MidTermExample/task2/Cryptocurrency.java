public class Cryptocurrency extends Token implements Exchangable {
    private double exchangeRate;
    private CryptoCurrencyType type;

    public Cryptocurrency(double amount, CryptoCurrencyType type) {
        super(amount, type.name());
        if(type.name().equals("BTC")){
            exchangeRate=(Math.random()*(40900-40400+1)+40400);
        }
        if(type.name().equals("ETH")){
            exchangeRate=(Math.random()*(3000-2900+1)+2900);
        }
    }
    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }
    @Override
    public double getExchangeRate() {
        return exchangeRate;
    }
    public void setType(CryptoCurrencyType type) {
        this.type = type;
    }
    public CryptoCurrencyType getType() {
        return type;
    }
    @Override
    public String getTokenType(){
        return "Cryptocurrency";
    }
    @Override
    public String toString(){
        return String.format("%.4f %s", getAmount(), getName());
    }
}
