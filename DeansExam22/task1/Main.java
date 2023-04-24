public class Main {
    public static void main(String[] args) {
        WeatherToday w1 = new WeatherToday(new double[]{77.0, 80.6, 75.20 , 73.4}, Unit.F, 10, 7, 2022,  "05:18", "20:46");
        System.out.println(w1.makeDescription());
        System.out.println(w1.avgAboveThold(24.74));
        WeatherToday w2 = new WeatherToday(new double[]{27,30,35,29,27,28}, Unit.C, 23, 7, 2022, "05:48", "20:31");
        System.out.println(w2.makeDescription());
        System.out.println(w2.avgAboveThold(33));
    }

}
