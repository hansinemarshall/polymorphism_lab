import java.util.ArrayList;

public abstract class Cake {


    protected String baseFlavour;

    protected boolean healthyOption;

    public Cake(String baseFlavour, boolean healthyOption) {
        this.baseFlavour = baseFlavour;
        this.healthyOption = healthyOption;
    }

    public String eat(){
        return "Keep calm and eat cake";
    }

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


