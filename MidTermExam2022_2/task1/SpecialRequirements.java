package zad1;

public interface SpecialRequirements {
	public String covid19Info();
	
	public static boolean canIFlyCovid19(Status[] statusList, int fromCountryZone, int toCountryZone) {
		if(fromCountryZone<=toCountryZone)
			return true;
		else if(fromCountryZone==2 && toCountryZone==1) {
			for(Status s:statusList) {
				if(s.equals(Status.VACCINATED) || s.equals(Status.RECOVERED) || s.equals(Status.TESTED)) {
					return true;				
				}
			}
		}
		else if(fromCountryZone==3 && (toCountryZone==1 || toCountryZone==2)) {
			int flagTested=0;
			boolean flag=false;
			for(Status s1:statusList) {
				if(s1.equals(Status.TESTED))
					flagTested++;
				else if(s1.equals(Status.RECOVERED) || s1.equals(Status.VACCINATED))
					flag=true;
			}
			if(flag && flagTested>0)
				return true;
			else if(flagTested>1)
				return true;	
		}
		return false;
	}
	
}
