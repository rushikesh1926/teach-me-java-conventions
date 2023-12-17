package powerPackage;

import org.junit.Test;

public class powerTest {

    @Test
    public void oneRaisedToOneIsOne() {
        assert powerFinder.findPower(1, 1) == 1;
    }

    @Test
    public void twoPower1Is2() {
        assert powerFinder.findPower(2, 1) == 2;
    }

    @Test
    public void twoPower2Is4() {
        assert powerFinder.findPower(2, 2) == 4;
    }

    @Test
    public void threePower2Is9() {
        assert powerFinder.findPower(3, 2) == 9;
    }
}