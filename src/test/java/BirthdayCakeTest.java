import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BirthdayCakeTest {

    BirthdayCake cake;

    @BeforeEach
    void setUp(){
        cake = new BirthdayCake("Vanilla",false);
        cake.setCandles(21);
    }

    @Test
    void canSetAndGetCandles(){
        assertThat(cake.getCandles()).isEqualTo(21);
    }

    @Test
    void canAddIcing(){
        cake.addIcing("Fondant icing");
        assertThat(cake.icingFlavour()).isEqualTo("Fondant icing");
    }

    @Test
    void canAddFilling(){
        cake.addFilling("Strawberry jam");
        assertThat(cake.fillingFlavour()).isEqualTo("Strawberry jam");
    }

    @Test
    void decorationMessage(){
        assertThat(cake.decorationMessage()).isEqualTo("Happy Birthday!");
    }

    @Test
    void flavourDescription(){
        assertThat(cake.flavourDescription()).isEqualTo("You have selected a Vanilla birthday cake");
    }
}
