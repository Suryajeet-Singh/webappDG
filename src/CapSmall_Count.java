import java.util.Scanner;

public class CapSmall_Count {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the loda string....");
        String str=scanner.nextLine();
        String str1=str.replaceAll(" ","");

        int capcount=0;
        int smallcount=0;
        for(int i=0; i<str1.length(); i++)
        {
            char ch=str.charAt(i);
            if(ch>='A' && ch<='Z') {
                capcount++;
            }
            else
            {
                smallcount++;
            }
        }
        System.out.println("Capital count is: "+capcount);
        System.out.println("Small count is: "+smallcount);
    }
}
