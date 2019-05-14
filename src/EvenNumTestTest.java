import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    EvenNumTest ob=new EvenNumTest();

    @Test
    public void getNum(){
        boolean result=ob.isEven(2);
        assertEquals("true","true");
    }


}