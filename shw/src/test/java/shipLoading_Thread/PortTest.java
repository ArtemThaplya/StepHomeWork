package shipLoading_Thread;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;

class PortTest {
    private Port port = new Port();

    @Test
    void chekedCargoPort() throws InterruptedException {
        int cargoShip = 400_000;
        int cargoPort = 1_000_000;
        int expected = -200_000;
        int actual = port.chekedCargoPort(cargoShip);
        Assert.assertThat(expected, is(actual));
    }
}