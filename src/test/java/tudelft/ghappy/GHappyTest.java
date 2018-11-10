package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GHappyTest {
/*

    gHappy("xxggxx") ==> true
    gHappy("xxgxx") ==> false
    gHappy("xxggyygxx") ==> false

 */

private  GHappy ghappy;

@BeforeEach
public  void init(){
    ghappy = new GHappy();
}
    @Test
    public void test1() {
        boolean b = ghappy.gHappy("xxggxx");
        Assertions.assertTrue(b);
    }

    @Test
    public void testOnlyOneG() {
    boolean b = ghappy.gHappy("xxgxx");
    Assertions.assertFalse(b);
    }

    @Test
    public void testMixedString() {
        boolean b = ghappy.gHappy("xxggyygxx");
        Assertions.assertFalse(b);
    }

    @Test
    public void testSingleG() {
        boolean b = ghappy.gHappy("g");
        Assertions.assertFalse(b);
    }

    @Test
    public void testEmptyString() {
        boolean b = ghappy.gHappy("");
        Assertions.assertTrue(b);
    }
}
