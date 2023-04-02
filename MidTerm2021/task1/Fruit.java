public abstract class Fruit {
    private String species;
    private int numberOfFruits;
    private double productionPrice;

    public Fruit(String species, int numberOfFruits, double productionPrice){
        this.species=species;
        this.numberOfFruits=numberOfFruits;
        this.productionPrice=productionPrice;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public void setProductionPrice(double productionPrice) {
        this.productionPrice = productionPrice;
    }
    public String getSpecies() {
        return species;
    }
    public double getProductionPrice() {
        return productionPrice;
    }
    public int getNumberOfFruits() {
        return numberOfFruits;
    }
    public void setNumberOfFruits(int numberOfFruits) {
        this.numberOfFruits = numberOfFruits;
    }
    double productionPrice(int numberOfTrees){
        return numberOfTrees*this.getProductionPrice();
    }
    public abstract double myMarketPrice();
}
