import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WeddingCakeTest {

    WeddingCake cake;

    @BeforeEach
    void setUp(){
        cake = new WeddingCake("Red Velvet",false);
        cake.setCakeTopper(true);
    }

    @Test
    void canHaveCakeTopper(){
        assertThat(cake.hasCakeTopper()).isEqualTo(true);
    }

    @Test
    void decorationMessage__overloaded(){
        String coupleNames = "Anthony and Cleopatra!";
        assertThat(cake.decorationMessage(coupleNames)).isEqualTo("Congratulations Anthony and Cleopatra!");
    }

    @Test
    void decorationMessage__default(){
        assertThat(cake.decorationMessage()).isEqualTo("Just Married!");
    }

    @Test
    void flavourDescription(){
        assertThat(cake.flavourDescription()).isEqualTo("You have selected a Red Velvet wedding cake.");
    }

    @Test
    void canAddIcing(){
        cake.addIcing("Royal Icing");
        assertThat(cake.icingFlavour()).isEqualTo("Royal Icing");
    }

    @Test
    void canAddFilling(){
        cake.addFilling("Vanilla Frosting");
        assertThat(cake.fillingFlavour()).isEqualTo("Vanilla Frosting");
    }

    @Test
    void canEatWeddingCakes(){
        assertThat(cake.eat()).isEqualTo("Keep calm and eat WeddingCakes");
    }



}
