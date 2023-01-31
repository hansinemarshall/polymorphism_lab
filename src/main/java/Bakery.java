import java.util.ArrayList;

public class Bakery {

    private ArrayList<Cake> menu;
    private String name;

    public Bakery(String name){
        this.menu = new ArrayList<>();
    }

    public int countCakesInMenu(){
        return menu.size();
    }

    public void addCakesToMenu(Cake cake){
        this.menu.add(cake);
    }



    public String menuToString(){
        String result = "";
        for (Cake cake : menu){
            result += cake.getClass().getName() + "\n";
        }
        return result;
    }







}
