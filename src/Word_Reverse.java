import java.util.Scanner;

public class Word_Reverse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the string");
        String str=scanner.nextLine();

        String words[]=str.split(" ");
        StringBuilder reverse=new StringBuilder();
        for(int i=words.length-1; i>=0; i--)
        {
            reverse.append(words[i]);
            if(i!=0)
            {
                reverse.append(" ");
            }
        }
        System.out.println("The reversed string is: "+reverse);

    }
}
