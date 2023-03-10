public class Traybake extends Cake{

    private String icing;
    public Traybake(String baseFlavour, boolean healthyOption){
        super(baseFlavour,healthyOption);
    }

    public String eat(){
        return "Keep calm and eat " + this.getClass().getName() + "s";
    }

    public String icingFlavour(){
        return icing;
    }

    public void addIcing(String icing){
        this.icing = icing;
    }

    public String flavourDescription(){
        return super.flavourDescription() + " traybake with " + this.icingFlavour();
    }


}
