import org.junit.Assert;
import org.junit.Test;

/**
 * Created by iriska on 2018-12-02.
 */
public class MainClassTest extends MainClass
{
    @Test
    public void testGetClassNumber()
    {
        System.out.println(this.getClassNumber());
        Assert.assertTrue("getClassNumber returned value below 45", this.getClassNumber() > 45) ;
    }
}
