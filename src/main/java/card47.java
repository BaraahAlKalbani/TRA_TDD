import java.util.*;

public class card47 {
    /**
     * this method will take a base and an exponent and will return the results in a
     * hash map
     * 
     * @param args: main method argument
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LinkedHashMap<String, Double> hashMap = new LinkedHashMap<String, Double>();
        hashMap.put("base", -2.0);
        hashMap.put("exponent", -3.0);
        Exponant(hashMap);
        // print the hash map
        for (java.util.Map.Entry<String, Double> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

    /**
     * this Method will calculate the a number powered by an exponent.
     * 
     * @param hashMap: hashmap with base and exponent
     * @return: return the hashmap with the result
     */
    public static LinkedHashMap<String, Double> Exponant(LinkedHashMap<String, Double> hashMap) {
        double result = 0;
        
        if (hashMap.get("base") == null || hashMap.get("exponent") == null) {
            System.out.println(" the base/Exponent Values Are null !! ");
            hashMap.put("result", null);
            return hashMap;
        }
        
        if (hashMap.get("base") == 0) {
            hashMap.put("result", 0.0);
            return hashMap;
        } else {
            Double baseValue = hashMap.get("base");
            Double exponentValue = hashMap.get("exponent");
            result = 1;
            //if the Exponent is negative
            if (exponentValue < 0) {
                for (int loop = 0; loop < -(exponentValue); loop++) {
                    result *= baseValue;
                }
                result = 1 / result;
                hashMap.put("result", result);
            } else {
                for (int loop = 0; loop < exponentValue; loop++) {
                    result *= baseValue;
                }
                hashMap.put("result", result);
                return hashMap;
            }
        }
        return hashMap;

    }

}
