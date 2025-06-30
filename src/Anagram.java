import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the first string");
        String str1=scanner.next();
        System.out.println("Please enter the second string");
        String str2=scanner.next();

        char c1[]=str1.toLowerCase().toCharArray();
        char c2[]=str2.toLowerCase().toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        boolean result=Arrays.equals(c1,c2);
        if(result==true)
        {
            System.out.println("Strings are anagram...");
        }
        else{
            System.out.println("Strings are not anagram....");
        }
    }
}
