public class ReverseString {
    public static void main(String[] args) {
        String str =  "Suryajeet Singh";
        String[] s1 = str.split(" ");
        for (int j=0; j< s1.length;j++){
            char[] ch = s1[j].toCharArray();
            for(int i = ch.length-1; i >=0; i--){
                System.out.print(" "+ch[i]);

//              result += ch[i];
            }
//            if(j < str.length()-1){
                System.out.println();
//            }
        }


    }
}
