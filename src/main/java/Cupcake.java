import java.util.ArrayList;

public class Cupcake extends Cake {

    private ArrayList<String> toppings;


    public Cupcake(String baseFlavour, boolean healthyOption) {
        super(baseFlavour, healthyOption);
        this.toppings = new ArrayList<>();
    }

    public String eat(){
        return "Keep calm and eat " + this.getClass().getName() +"s";
    }


    @Override
    public String flavourDescription() {
        return super.flavourDescription() + " cupcake with " + toppingsToString();
    }

    public int countToppings(){
        return toppings.size();
    }

    public void addToppings(String topping) {
        toppings.add(topping);
    }

    // helper method that formats toppings to a String
    private String toppingsToString(){
        String result = "";
        for(String topping : toppings){
            result += topping + " ";
        }
        return result;
    }



    @Override
    public boolean isHealthyOption() {
        return super.isHealthyOption();
    }
}
