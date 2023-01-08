import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author LAP-6
 *
 */
class card48Test {

    /**
     * Test method for {@link card48#reverse(java.lang.String)}.
     */
    @Test
    void testReverse() {
        
    card48 card48=new card48();
    //if the String is null
    assertEquals(null, card48.reverse(null));
    //if the String is Empty
    assertEquals("", card48.reverse(""));
    //if the have only a single character.
    assertEquals("d", card48.reverse("d"));

    }

}
