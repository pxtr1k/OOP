
public class Concert extends Event implements EventPromoter{
	private Band playingband;
	private String[] songList;
	
	public Concert(String name, String date, String location, Band playingband, String[] songList) {
		super(name, date, location);
		this.playingband=playingband;
		this.songList=songList;
	}

	@Override
	public void printEventPoster() {
		System.out.println("Event date: " +this.getDate());
		System.out.println("Band:" + playingband.getBandName());
		System.out.println("Song list for this concert is: ");
		for(int i=0;i<songList.length;i++) {
			System.out.println("Song "+(i+1)+" "+songList[i]);
		}
		
		
	}
}
