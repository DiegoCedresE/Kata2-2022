package kata2.entrega;

import java.util.HashMap;
import java.util.Map;

public class GeneradorHistogram<T>{
    private final T [] data;
    
    public GeneradorHistogram(T [] data){
        this.data = data;
    }
    
    public Map <T, Integer> getHistogram(){
        Map <T,Integer> histogram = new HashMap<T,Integer>();
        for (int i = 0; i < this.data.length; i++){
            histogram.put(data[i], histogram.containsKey(data[i]) ? histogram.get(data[i]) + 1 : 1);
        }
        return histogram;
    }
    
}
