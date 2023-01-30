import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TraybakeTest {

    Traybake traybake;

    @BeforeEach
    void setUp(){
        traybake = new Traybake("Carrot", true);
        traybake.addIcing("Cream Cheese Frosting");
    }

    @Test
    void canGetIcingFlavour(){
        assertThat(traybake.icingFlavour()).isEqualTo("Cream Cheese Frosting");
    }

    @Test
    void canGetFlavourDescription(){
        assertThat(traybake.flavourDescription()).isEqualTo("You have selected a Carrot traybake with Cream Cheese Frosting");
    }
}
