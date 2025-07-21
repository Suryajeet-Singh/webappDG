import java.util.HashMap;
import java.util.Map;

public class FrequencyofChar {
    public static void main(String[] args) {
        String str = "my name is loda lahsun surjeet singh surjeet";
        String words[]=str.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);

            } else {
                map.put(word, 1);
            }
        }

        System.out.println("Frequency of words: "+map);
    }
}
