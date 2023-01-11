import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author LAP-6
 *
 */
class ValidateExpressionTest {

    /**
     * Test method for
     * {@link ValidateExpression#scoop(java.lang.String, java.util.Stack)}.
     * @throws Exception 
     */
    @Test
    @DisplayName("Test When null")
    void testScoopNull() {
        ValidateExpression validateExpr=new ValidateExpression();
        String expString = null;
        assertEquals(false,validateExpr.scoop(expString));
    }
    @Test
    @DisplayName("Test When Empty")
    void testScoopEmpty()  {
        ValidateExpression validateExpr=new ValidateExpression();
        String expString = "";
        assertEquals(true,validateExpr.scoop(expString));
    }
    @Test
    @DisplayName("Test When Throw Exception")
    void testScoopException() {
        ValidateExpression validateExpr=new ValidateExpression();
        assertThrows(Exception.class,() -> validateExpr.scoop(null));
    }

}
