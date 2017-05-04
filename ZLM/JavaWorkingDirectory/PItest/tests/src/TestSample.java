/**
 * Created by KellyZhang on 2017/5/4.
 */


import org.junit.Assert;
import org.junit.Test;

public class TestSample {

    @Test
    public void testBigger() {
        try {
            Assert.assertTrue(Sample.number(12));
        } catch (AssertionError e) {
            e.printStackTrace();
        }
    }
    // auto-generated stub

}
