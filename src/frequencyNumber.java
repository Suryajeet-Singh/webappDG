import java.util.HashMap;
import java.util.Map;

public class frequencyNumber {
    public static void main(String args[]){
        int[] arr = {1,1,1,4,4,4,8,8,8,3,3,3,2,2,2,7};
        Map<Integer, Integer> mp = new HashMap<>();
        for(var el : arr){
            if(!mp.containsKey(el)){
                mp.put(el,1);
            }else{
                mp.put(el, mp.get(el)+1);
            }
        }
        int maxfrequency = 0, ansKey = 0;

        for(var e : mp.keySet()){
            if(mp.get(e) > maxfrequency){
                maxfrequency = mp.get(e);
                ansKey = e;
            }
        }

        System.out.printf("%d have the maximum frequency i.e. %d times ",ansKey,maxfrequency);
    }
}
