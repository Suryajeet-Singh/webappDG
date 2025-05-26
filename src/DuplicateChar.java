import java.util.ArrayList;

public class DuplicateChar {

    public static void main(String[] args) {
        String letter = "Hellooo";
        char[] letterArray = letter.toCharArray();
        ArrayList<Character> list = new ArrayList<Character>();
        for(int i = 0; i < letterArray.length; i++){
            if(list.contains(letterArray[i])){
                continue;
            }else{
                list.add(letterArray[i]);
                int count = 0;
                for(int x = 0; x < letterArray.length; x++){
                    if(letterArray[x] == letterArray[i]){
                        count++;
                    }
                }

            }
        }
        System.out.println(list.toString());
    }
}