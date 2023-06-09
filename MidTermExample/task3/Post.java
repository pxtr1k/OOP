public class Post {
    private int numberOfLikes=0;
    private String caption;

    public Post(String caption){
        this.caption=caption;
    }
    public Post(int numberOfLikes, String caption){
        this.numberOfLikes=numberOfLikes;
        this.caption=caption;
    }
    public int getNumberOfLikes() {
        return numberOfLikes;
    }
    public String getCaption() {
        return caption;
    }
    public void setCaption(String caption) {
        this.caption = caption;
    }
    public void setNumberOfLikes(int numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }
    public void printPostData(){
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "This post has "+this.getNumberOfLikes()+" likes and the following caption: "+this.getCaption()+".\n";
    }
}
