public class Video extends Post{
    private int duration;
    private int numberOfViews=0;

    public Video(int duration, String caption){
        super(caption);
        this.duration=duration;
    }
    public Video(int duration ,int numberOfViews, int numberOfLikes, String caption){
        super(numberOfLikes, caption);
        this.numberOfViews=numberOfViews;
        this.duration=duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getNumberOfViews() {
        return numberOfViews;
    }

    public void setNumberOfViews(int numberOfViews) {
        this.numberOfViews = numberOfViews;
    }
    @Override
    public String toString() {
        return super.toString()+ "This video is "+this.getDuration()+" seconds long and has "+this.getNumberOfViews()+" views.";
    }
}
