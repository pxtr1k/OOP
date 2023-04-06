public class Story{
    private int numberOfViews;
    private int numberOfReactions;
    public Story(int numberOfViews, int numberOfReactions){
        this.numberOfViews=numberOfViews;
        this.numberOfReactions=numberOfReactions;
    }
    public void setNumberOfViews(int numberOfViews) {
        this.numberOfViews = numberOfViews;
    }
    public int getNumberOfViews() {
        return numberOfViews;
    }
    public int getNumberOfReactions() {
        return numberOfReactions;
    }
    public void setNumberOfReactions(int numberOfReactions) {
        this.numberOfReactions = numberOfReactions;
    }
}
