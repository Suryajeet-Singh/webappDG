public class Factorial {
    public static void main(String[] args) {
        int fact = 1;
        int num = 6;
        while(num>0){
            fact = fact*num;
            num--;
        }
        System.out.println("Factorial Value is :"+fact);
    }
}
