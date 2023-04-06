public class InstagramPost<T extends Post> extends WebEntry<T>{

    public InstagramPost(String author, String date, T type){
        super(author, date, type);
    }

    public double calculatePostImpact(int profileLikes){
        return getEntry().getNumberOfLikes()/(double)profileLikes;
    }
}
