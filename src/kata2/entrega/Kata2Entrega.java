package kata2.entrega;

import java.util.HashMap;
import java.util.Map;

public class Kata2Entrega {

    public static void main(String[] args) {
         int [] data = {9,2,3,4,5,8,1,2,3,9,5,3,6,2,7,3,6,0};
        Map <Integer, Integer> histogram = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < data.length; i++){
            if ( histogram.containsKey(data[i])){
                histogram.put(data[i], histogram.get(data[i]) + 1);
            }
            else{
                histogram.put(data[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry: histogram.entrySet()){
            System.out.println("Key: " +  entry.getKey() + ", Value: " + entry.getValue());
        }

    }
    
}
