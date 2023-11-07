import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void eliminateMaximumTest1() {
        int[] dist = {1, 3, 4};
        int[] speed = {1, 1, 1};
        int expected = 3;
        int actual = new Solution().eliminateMaximum(dist, speed);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eliminateMaximumTest2() {
        int[] dist = {1, 1, 2, 3};
        int[] speed = {1, 1, 1, 1};
        int expected = 3;
        int actual = new Solution().eliminateMaximum(dist, speed);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eliminateMaximumTest3() {
        int[] dist = {3, 2, 4};
        int[] speed = {5, 3, 2};
        int expected = 1;
        int actual = new Solution().eliminateMaximum(dist, speed);

        Assert.assertEquals(expected, actual);
    }
}
