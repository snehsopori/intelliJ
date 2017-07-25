import org.junit.Assert;
import org.junit.Test;

/**
 * Created by soporis on 7/18/2017.
 */
public class TestingTrie {
    @Test
    public void checkForAnts() {
        boolean expectedOutput = true;
        Assert.assertEquals("The output should be true", expectedOutput, Dictionary.output("Ants"));
    }
}
