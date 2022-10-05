package kata2.entrega;

import java.util.HashMap;
import java.util.Map;

public class GeneradorHistogram {
    private int [] data;
    
    public GeneradorHistogram(int [] data){
        this.data = data;
    }
    
    public Map <Integer, Integer> getHistogram(){
        Map<Integer,Integer> histogram = new HashMap<Integer,Integer>();
        for (int i = 0; i < this.data.length; i++){
            histogram.put(data[i], histogram.containsKey(data[i]) ? histogram.get(data[i]) + 1 : 1);
        }
        return histogram;
    }
    
}
