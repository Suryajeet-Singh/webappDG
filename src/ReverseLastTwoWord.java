public class ReverseLastTwoWord {
    public static void main(String[] args) {
        String s1 = "Suryajeet Singh";
        String[] s2 = s1.split(" ");
        for(int i = 0; i< s2.length;i++){
            char[] ch = s2[i].toCharArray();
            for(int j = ch.length-1 ; j > ch.length-3;j--){
                System.out.print(ch[j]);
            }
            System.out.println(" ");
        }
    }
}
