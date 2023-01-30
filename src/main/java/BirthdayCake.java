public class BirthdayCake extends CelebrationCake{

    private int candles = 0;

    public BirthdayCake(String baseFlavour, boolean healthyOption){
        super(baseFlavour,healthyOption);
    }

    public void setCandles(int candles){
        this.candles = candles;
    }

    public int getCandles(){
        return candles;
    }

    public String decorationMessage(){
        return "Happy Birthday!";
    }

    public String flavourDescription(){
        return super.flavourDescription() + " birthday cake";
    }
}
