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
        int[] a = {2,5,6,8,6,4,12,7,9};
        bubbleSort(a);
    }
}