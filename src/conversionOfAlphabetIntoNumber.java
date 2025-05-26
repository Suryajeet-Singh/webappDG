import java.util.HashMap;
import java.util.Map;

public class conversionOfAlphabetIntoNumber {
    public static void main(String[] args) {
        String str1 = "aaaabbbccccjjjhhhh";
        char[] ch = str1.toCharArray();
        Map<Character,Integer> mp = new HashMap<>();

        for(char ch1 : ch){
            if(!mp.containsKey(ch1)){
                mp.put(ch1,1);
            }
            else {
                mp.put(ch1, mp.get(ch1)+1);
            }
        }
        for(var e : mp.entrySet()){
            System.out.print(e.getKey()+""+e.getValue());
        }
    }
}
