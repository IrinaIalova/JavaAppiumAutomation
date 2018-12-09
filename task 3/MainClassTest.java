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
        System.out.println(this.getClassString());
        String name = this.getClassString();
        if ((name.contains("hello")) || (name.contains("Hello")))
        {

            System.out.println("Test passed, string has an expected word");
        }
        else
        {
            System.out.println("Test failed, string has't an expected word");
        }
    }
}


