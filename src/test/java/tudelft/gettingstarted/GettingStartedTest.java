package tudelft.gettingstarted;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class GettingStartedTest {

    @Test
    public void addFiveTo20() {
        int result = new GettingStarted().addFive(20);
        int result2 = new GettingStarted().addFive(95);
        Assertions.assertEquals(25,result);
        Assertions.assertEquals(100, result2);
    }

//    UNCOMMENT THE CODE BELOW, AND FILL THE GAPS!

    @Test
    public void addFiveToZero() {
        int result = new GettingStarted().addFive(0);
        Assertions.assertEquals(5, result);
    }
//
    @Test
    public void addFiveToMinus20() {
        int result = new GettingStarted().addFive(-20);
        Assertions.assertEquals(-15,result);
    }
}
