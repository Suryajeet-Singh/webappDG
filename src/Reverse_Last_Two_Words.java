public class Reverse_Last_Two_Words {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        String s1 = "My name Suryajeet Singh";
        String[] s2 = s1.split(" ");
        for(int i= 0; i<s2.length/2;i++){
            str1.append(s2[i]+" ");
        }
        for(int i= s2.length/2; i<=s2.length-1;i++){
            str2.append(s2[i]+" ");
        }
        System.out.print(str2+""+str1);
    }
}
