package test_Java_SE;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

class LoadingOfShipTest {
    @Test
    void loadingOfShip() {
        int cargoShip = 400_000;
        int cargoPort = 1_000_000;
        int expected = -200_000;
        int actual = LoadingOfShip.loadingOfShip(cargoPort, cargoShip);
        assertThat(expected, is(actual));
    }
}