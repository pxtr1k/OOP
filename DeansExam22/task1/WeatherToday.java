public class WeatherToday extends Weather implements WeatherTodayImpl{
    private int day;
    private int month;
    private int year;
    private String sunset;
    private String sunrise;

    public WeatherToday(double[] data, Unit unit, int day,int month, int year, String sunrise, String sunset){
        super(data, unit);
        this.day=day;
        this.month=month;
        this.year=year;
        this.sunrise=sunrise;
        this.sunset=sunset;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public String getSunrise() {
        return sunrise;
    }
    public static double getTempInCelsius(double fahrenheit) {
        return (( 5 *(fahrenheit - 32.0)) / 9.0);
    }
    @Override
    public String dateFormat(){
        StringBuilder sb=new StringBuilder();
        if(month<10 && day>9){
            sb.append(String.format("%4d-0%d-%2d", getYear(), getMonth(), getDay()));
        } else if(day<10 && month>9){
            sb.append(String.format("%4d-%2d-0%d", getYear(), getMonth(), getDay()));
        } else if(day<10 && month<10){
            sb.append(String.format("%4d-0%d-0%d", getYear(), getMonth(), getDay()));
        }else {
            return String.format("%4d--%2d--%2d", getYear(), getMonth(), getDay());
        }
        return sb.toString();
    }
    @Override
    public String makeDescription(){
        if(!(getUnit().equals(Unit.F))) {
            return String.format("WeatherToday [day=%s, daylightHours=%s, average=%.2f]", dateFormat(), daylight(), Calculation.calculateAverage(getData()));
        }
        double temp=getTempInCelsius(Calculation.calculateAverage(getData()));
        return String.format("WeatherToday [day=%s, daylightHours=%s, average=%.2f]", dateFormat(), daylight(), temp);
    }
    @Override
    public boolean avgAboveThold(double thold) {
        double temp=Calculation.calculateAverage(getData());
        if (getUnit().equals(Unit.F)) {
            temp = getTempInCelsius(Calculation.calculateAverage(getData()));
        }else{
           temp=temp;
        }
        if (temp > thold) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public String daylight(){
        String[] p1 = sunset.split(":");
        String[] p2 = sunrise.split(":");
        int duration = (Integer.parseInt(p1[0]) * 60 + Integer.parseInt(p1[1])) - (Integer.parseInt(p2[0]) * 60 + Integer.parseInt(p2[1]));
        int hours = duration / 60;
        int minutes = duration % 60;
        return String.format("%02d:%02d", hours, minutes);
    }

}