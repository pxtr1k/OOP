public class NFT extends Token{
    public NFT(double amount, String name){
        super(amount, name);
    }
    @Override
    public String getTokenType(){
        return "NFT";
    }
    @Override
    public String toString(){
        return String.format("%.0f %s", getAmount(), getName());
    }
}
