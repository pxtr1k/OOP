public class InstagramStory extends WebEntry<Story>{
    public InstagramStory(String author, String date, Story entry){
        super(author, date, entry);
    }
    public double calculateStoryImpact(int numberOfFollowers){
      return (getEntry().getNumberOfViews()+ getEntry().getNumberOfReactions())/(double)numberOfFollowers;
    }
}
