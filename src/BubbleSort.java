public class BubbleSort {
    static void bubbleSort(int[] a){
        int n = a.length;
        int temp;
        System.out.println("Ascending Order :");
        for(int i =0; i<n-1; i++){
            for(int j = 0; j<n-i-1; j++){
                if(a[j] > a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for (int k= 0; k<= n-1; k++) {
            System.out.print(a[k]+" ");
        }
    }
    public static void main(String[] args) {
        int[] a = {65,65,87,87,56,34,25,15};
        bubbleSort(a);
    }
}