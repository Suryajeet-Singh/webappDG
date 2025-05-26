import java.util.ArrayList;

public class duplicteChar2 {
    public static void main(String[] args) {
    String letter = "Suryajeet Singh";
    char[] letterArray = letter.toCharArray();
    ArrayList<Character> list = new ArrayList<Character>();
        for(int i = 0; i < letterArray.length; i++){
        if(!list.contains(letterArray[i])){
            list.add(letterArray[i]);
        }
    }
        StringBuilder str = new StringBuilder();
        for (var ch : list){
            str.append(ch);
        }
        System.out.println("Update String : "+str);
}
}
