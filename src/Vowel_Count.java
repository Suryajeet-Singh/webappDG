import java.util.Scanner;

public class Vowel_Count {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the string");
        String str=scanner.nextLine();

        int vowelcount=0;
        int consocount=0;
        int spacecount=0;

        for(int i=0; i<str.length(); i++)
        {
            char ch=str.charAt(i);
            if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
            {
                vowelcount++;
            }
            else if(ch==' ')
            {
                spacecount++;
            }
            else {
                consocount++;
            }
        }
        System.out.println("vowels count is:"+vowelcount);
        System.out.println("Consonants count: "+consocount);
        System.out.println("space count: "+spacecount);
    }
}
