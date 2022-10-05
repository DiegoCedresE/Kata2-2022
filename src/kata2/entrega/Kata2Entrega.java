package kata2.entrega;

import java.util.HashMap;
import java.util.Map;

public class Kata2Entrega {

    public static void main(String[] args) {
        
        String[] data = {"Luis", "Pepe", "Luis", "Jose", "Diego", "Luis", "Juan", "Pedro"};
         
        GeneradorHistogram<String> GeneradorHistograma = new GeneradorHistogram(data);
        Map<String, Integer> histogram = GeneradorHistograma.getHistogram();
        
        for (Map.Entry<String, Integer> entry: histogram.entrySet()){
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }

    }
    
}
