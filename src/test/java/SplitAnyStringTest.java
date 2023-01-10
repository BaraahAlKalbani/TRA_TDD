import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author Bara'ah Nasser
 *
 */
class SplitAnyStringTest {

    /**
     * Test method for {@link SplitAnyString#main(java.lang.String[])}.
     */
    @Test
    void testMain() {
        SplitAnyString splitAnyString =new SplitAnyString();
        // test if null for both of the arguments.
        assertEquals(null,splitAnyString.reverseString(null, null));
        //test if empty string as the first argument.
        assertEquals("",splitAnyString.reverseString("", " "));
        //test if empty string as the second argument.
        assertEquals("D C B A",splitAnyString.reverseString("A B C D",""));
        //test if Return an empty array.
        assertEquals("",splitAnyString.reverseString("",""));
    }

}
