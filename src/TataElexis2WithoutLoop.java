public class TataElexis2WithoutLoop {
    public static void print(int num){
        if(num >1000){
            return;
        }
        System.out.print(num+" ");
        print(num+1);
    }
    public static void main(String[] args) {

        print(1);

    }
}
