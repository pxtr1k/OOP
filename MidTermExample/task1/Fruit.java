public abstract class Fruit {
    private String species;
    private int numberOfFruits;
    private double productionPrice;

    public Fruit(String species, int numberOfFruits, double productionPrice){
        this.species=species;
        this.numberOfFruits=numberOfFruits;
        this.productionPrice=productionPrice;
    }
    public void setNumberOfFruits(int numberOfFruits) {
        this.numberOfFruits = numberOfFruits;
    }
    public int getNumberOfFruits() {
        return numberOfFruits;
    }
    public double getProductionPrice() {
        return productionPrice;
    }
    public String getSpecies() {
        return species;
    }
    public void setProductionPrice(double productionPrice) {
        this.productionPrice = productionPrice;
    }
    public void setSpecies(String species) {
        this.species = species;
    }
    public double productionPrice(int numberOfTrees){
        return numberOfTrees*getProductionPrice();
    }
    public abstract double myMarketPrice();

}
