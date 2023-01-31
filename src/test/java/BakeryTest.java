import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BakeryTest {

    Bakery bakery;
    Cupcake cupcake;

    CelebrationCake birthday;
    Traybake traybake;

    @BeforeEach
    void setUp(){
        bakery = new Bakery("Hansine's Cake Shop");
        cupcake = new Cupcake("Chocolate",false);
        birthday = new BirthdayCake("Victoria Sponge",false);
        traybake = new Traybake("Banana", true);

    }

    @Test
    void canAddCakesToMenuInString(){
        assertThat(bakery.countCakesInMenu()).isEqualTo(0);
        bakery.addCakesToMenu(cupcake);
        assertThat(bakery.countCakesInMenu()).isEqualTo(1);
        bakery.addCakesToMenu(birthday);
        bakery.addCakesToMenu(traybake);
        assertThat(bakery.countCakesInMenu()).isEqualTo(3);
        assertThat(bakery.menuToString()).isEqualTo("");
    }









}
