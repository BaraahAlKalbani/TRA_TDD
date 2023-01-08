import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.LinkedHashMap;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author Bara'ah Nasser
 *
 */
class card47Test {

    /**
     * Test method for {@link card47#main(java.lang.String[])}.
     */
    

    /**
     * Test method for {@link card47#Exponant(java.util.LinkedHashMap)}.
     */
    @Test
    void testExponant() {
        LinkedHashMap<String, Double> hashMap = new LinkedHashMap<String,Double >();
        LinkedHashMap<String, Double> expectedHashMap = new LinkedHashMap<String,Double >();
        card47 card47=new card47();
        
        //base: 0, exponent: 0
        expectedHashMap.put("base",0.0);
        expectedHashMap.put("exponent", 0.0);
        expectedHashMap.put("result",0.0);
        
        hashMap.put("base",0.0);
        hashMap.put("exponent", 0.0);
        assertEquals(expectedHashMap,card47.Exponant(hashMap));
        hashMap.clear();
        expectedHashMap.clear();
        
        //base: null, exponent: null
        expectedHashMap.put("base",null);
        expectedHashMap.put("exponent", null);
        expectedHashMap.put("result",null);

        hashMap.put("base",null);
        hashMap.put("exponent", null);
        assertEquals(expectedHashMap,card47.Exponant(hashMap));
        hashMap.clear();
        expectedHashMap.clear();
        
        //base: <any positive number>, exponent  <any positive number>
        expectedHashMap.put("base",4.0);
        expectedHashMap.put("exponent", 5.0);
        expectedHashMap.put("result",1024.0);
        
        hashMap.put("base",4.0);
        hashMap.put("exponent", 5.0);
        
        assertEquals(expectedHashMap,card47.Exponant(hashMap));
        hashMap.clear();
        expectedHashMap.clear();
        
        //base: <any negative number>, exponent  <any negative  number>
        expectedHashMap.put("base",-2.0);
        expectedHashMap.put("exponent", -3.0);
        expectedHashMap.put("result",-0.125);
        
        hashMap.put("base",-2.0);
        hashMap.put("exponent", -3.0);
        
        assertEquals(expectedHashMap,card47.Exponant(hashMap));
        hashMap.clear();
        expectedHashMap.clear();
    }

    

}
