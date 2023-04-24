public interface Calculation {
    public String makeDescription();
    public static double calculateAverage(double[] data){
        double sum=0.;
        for(double d:data){
            sum+=d;
        }
        double average=sum/data.length;
        return average;
    }
}
