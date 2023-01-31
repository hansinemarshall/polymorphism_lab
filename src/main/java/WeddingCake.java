public class WeddingCake extends CelebrationCake {

    private boolean cakeTopper;


    public WeddingCake(String baseFlavour, boolean healthyOption){
        super(baseFlavour,healthyOption);
    }

    public void setCakeTopper(boolean cakeTopper) {
        this.cakeTopper = cakeTopper;
    }

    public boolean hasCakeTopper(){
        return cakeTopper;
    }

    public String decorationMessage(){
        return "Just Married!";
    }

    public String flavourDescription(){
        return super.flavourDescription() + " wedding cake.";
    }

}
