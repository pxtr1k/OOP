public class Cherry extends Fruit{
    private boolean hasWorm;

    public Cherry(String species,  int numberOfFruits, double productionPrice, boolean hasWorm){
        super(species, numberOfFruits, productionPrice);
        this.hasWorm=hasWorm;
    }
    public void setHasWorm(boolean hasWorm) {
        this.hasWorm = hasWorm;
    }
    public boolean isHasWorm() {
        return hasWorm;
    }

    @Override
    public double productionPrice(int numberOfTrees) {
        return numberOfTrees*getProductionPrice();
    }

    @Override
    public double myMarketPrice() {
        if(hasWorm)
            return (1.2*getProductionPrice())/getNumberOfFruits();
        return (1.5*getProductionPrice())/getNumberOfFruits();
    }
}
