import java.util.ArrayList;

public class deleteWordFromSentence {
    public static void main(String[] args) {
        String str1 = "My name is Suryajeet Singh";
        String[] words = str1.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words){
            if(!word.equals("name")) {
                result.append(word).append(" ");
            }

        }
        System.out.println(" Result : "+result);
    }
}

