import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyArrTest {


    private MyArr test;

    @Before
    public void init(){
        test = new MyArr();

    }
    @Test
    public void testEquals() {
        int[] testing = {1,2,3,4,5,6,7,8,9,0};
        int[] expected = {5,6,7,8,9,0};
        Assert.assertArrayEquals(expected, test.checkAndGetFour(testing));
    }

    @Test
    public void testException(){
        int[] testing = {1,2,3,5,6,7,8,0};
        int[] expected = {0};

        Assert.assertArrayEquals( expected, test.checkAndGetFour(testing));
    }

    @Test
    public void testNotNull(){
        int[] testing = {1,2,3,4};
        Assert.assertNotNull(test.checkForOneAndFour(testing));
    }

    @Test
    public void testTheSame(){
        int[] testing = {10,9,8,7,6,5,4,3,2,1};
        int[] expected = {3,2,1};
        Assert.assertSame(expected, test.checkForOneAndFour(testing));
    }

    @Test
    public void test1(){
        int[] testing = {1,2,3,4,5,6,7,8};
        Assert.assertTrue(test.checkForOneAndFour(testing));
    }

    @Test
    public void test2(){
        int[] testing = {1,2,3,4,5,6,7,8};
        Assert.assertEquals(true, test.checkForOneAndFour(testing));
    }

    @Test
    public void test3(){
        int[] testing = {1,2,3,4,5,6,7,8};
        Assert.assertNotSame(false,test.checkForOneAndFour(testing));
//        Assert.fail("test");
    }
}