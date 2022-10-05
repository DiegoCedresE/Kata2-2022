package kata2.entrega;

import java.util.HashMap;
import java.util.Map;

public class Kata2Entrega {

    public static void main(String[] args) {
         int [] data = {9,2,3,4,5,8,1,2,3,9,5,3,6,2,7,3,6,0};
         
        
        GeneradorHistogram GeneradorHistograma = new GeneradorHistogram(data);
        Map<Integer, Integer> histogram = GeneradorHistograma.getHistogram();
        
        for (Map.Entry<Integer, Integer> entry: histogram.entrySet()){
            System.out.println("Key: " +  entry.getKey() + ", Value: " + entry.getValue());
        }

    }
    
}
