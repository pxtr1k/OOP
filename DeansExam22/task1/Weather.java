public abstract class Weather implements Calculation {
    private double[] data;
    private Unit unit;
    Weather(double[] data, Unit unit){
        this.data=data;
        this.unit=unit;
    }

    public void setData(double[] data) {
        this.data = data;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public Unit getUnit() {
        return unit;
    }

    public double[] getData() {
        return data;
    }
    public abstract boolean avgAboveThold(double thold);
}
