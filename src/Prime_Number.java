import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the number");
        int number=scanner.nextInt();

        int count=0;
        for(int i=1; i<=number; i++)
        {
            if(number%i==0)
            {
                count++;
            }

        }
        if(count==2)
        {
            System.out.println("The number is prime...");
        }
        else{
            System.out.println("The number is not prime...");
        }
    }
}
