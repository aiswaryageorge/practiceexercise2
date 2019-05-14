import static org.junit.Assert.*;
import org.junit.Test;

public class assignpolyTest {
    assignpoly p;

    {
        p = new assignpoly();
    }

    @Test

    public void polyTest() {
        String result = p.palindrome("aishu");
        assertEquals("uhsia", result);


    }

    @Test
    public void polyTes() {
        String result = p.palindrome("lol");
        assertEquals("lol", result);
    }
}