import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CupcakeTest {

    Cupcake cupcake;

    @BeforeEach
    void setUp(){
        cupcake = new Cupcake("Chocolate",false);
    }

    @Test
    void isHealthyOption(){
        assertThat(cupcake.isHealthyOption()).isEqualTo(false);
    }

    @Test
    void canGetBaseFlavour(){
        assertThat(cupcake.getBaseFlavour()).isEqualTo("Chocolate");
    }


    @Test
    void canAddToppings(){
        assertThat(cupcake.countToppings()).isEqualTo(0);
        cupcake.addToppings("Chocolate Chips");
        assertThat(cupcake.countToppings()).isEqualTo(1);
    }
    @Test
    void canGetFlavourDescription(){
        cupcake.addToppings("Chocolate Chips");
        assertThat(cupcake.flavourDescription()).isEqualTo("You have selected a Chocolate cupcake with Chocolate Chips ");
    }

}
