public abstract class CelebrationCake extends Cake{

    private int numberOfTiers = 1;

    protected String filling;

    protected String icing;

    public CelebrationCake(String baseFlavour, boolean healthyOption){
        super(baseFlavour,healthyOption);
    }

    public String fillingFlavour(){
        return filling;
    }

    public void addFilling(String filling){
        this.filling = filling;
    }

    public String icingFlavour(){
        return icing;
    }

    public void addIcing(String icing){
        this.icing = icing;
    }

    public String decorationMessage(){
        return "No message";
    }



}
