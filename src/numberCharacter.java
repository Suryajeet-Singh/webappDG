import javax.xml.stream.events.Characters;
import java.util.ArrayList;

public class numberCharacter {
    public static void main(String[] args) {
        String str1 = "a3b4c2";
        char[] ch = str1.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        int count = 0;
        for(int i = 0;i<str1.length()-1;i+=2){
            char ch1  = ch[i];
            for(int j = i+1; j< str1.length(); j+=2){
                 count   = Character.getNumericValue(ch[j]);
                 for(int k = 0 ; k< count; k++){
                     list.add(ch1);
                 }
                 break;
            }
        }
        System.out.println("charc : "+list);
    }
}
