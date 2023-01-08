import java.util.*;

public class card47 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        LinkedHashMap<String, Double> hashMap = new LinkedHashMap<String, Double>();
        hashMap.put("base", -2.0);
        hashMap.put("exponent", -3.0);
        Exponant(hashMap);
        for (java.util.Map.Entry<String, Double> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

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
