import interfaces.IFlavourDescribe;

public abstract class Cake implements IFlavourDescribe {


    protected String baseFlavour;

    protected boolean healthyOption;

    public Cake(String baseFlavour, boolean healthyOption) {
        this.baseFlavour = baseFlavour;
        this.healthyOption = healthyOption;
    }

    public abstract String eat();

    public String getBaseFlavour() {
        return this.baseFlavour;
    }
    public void setBaseFlavour(String baseFlavour) {
        this.baseFlavour = baseFlavour;
    }

    public String flavourDescription(){
        return "You have selected a " + this.baseFlavour;
    }
    // could make this an interface
    public void setHealthyOption(boolean healthyOption) {
        this.healthyOption = healthyOption;
    }

    public boolean isHealthyOption() {
        return healthyOption;
    }
}


