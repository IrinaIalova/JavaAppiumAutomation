import org.junit.Assert;
import org.junit.Test;

/**
 * Created by iriska on 2018-12-02.
 */
public class MainClassTest extends MainClass
{
    @Test
    public void testGetLocalNumber()
    {
        int expected = this.getLocalNumber();
        int actual = 14;

        if (expected == actual)
        {
            System.out.println("OK, This is expected result: " + expected + " = " + actual);
        }
        else
        {
            System.out.println("FAIL, This is not an expected result: " + expected + "=" + actual);
        }
    }
}
