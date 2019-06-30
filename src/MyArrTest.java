import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class MyArrTest extends Assert {

    private MyArr test;

    @Before
    public void init(){
        test = new MyArr();

    }
    private final int[] testing;
    private final int[] expected;

    public MyArrTest(final int[] expected, final int[] testing){
        this.testing =testing;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static List<Object[]> dataTest(){
        return Arrays.asList(new Object[][]{
                {new int[]{5}, new int[]{1,2,3,4,5}},
                {new int[]{5,6}, new int[]{1,2,3,4,5,6}},
                {new int[]{5,6,7}, new int[]{1,2,3,4,5,6,7}},
                {new int[]{0}, new int[]{5,213,67,34}},
                {new int[]{24,11}, new int[]{1213,1543,743,889}},
                {new int[]{423,61,32,1}, new int[]{4,423,61,32,1}},
        });
    }


    @Test
    public void testEquals() {
         assertArrayEquals(expected, test.checkAndGetFour(testing));
    }

    @Test
    public void testNotNull(){
        Assert.assertNotNull(test.checkForOneAndFour(testing));
    }

    @Test
    public void testNotTheSame(){
        Assert.assertNotSame(false,test.checkForOneAndFour(testing));
    }

    @Test
    public void testTheSame(){
        Assert.assertSame(true, test.checkForOneAndFour(testing));
    }

    @Test
    public void testForTrue(){
        Assert.assertTrue(test.checkForOneAndFour(testing));
    }

}