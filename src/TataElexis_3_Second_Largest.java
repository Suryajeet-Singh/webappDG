public class TataElexis_3_Second_Largest {
    public static void main(String[] args) {
        int a[] = {12,8,6,4,6,12,7,9,5};
        int temp,i,j;
        int b[] = new int[a.length];
        int index = 0;
        for( i = 0; i < a.length;i++){
            for ( j= i+1;j<a.length;j++){
                    if(a[j]>a[i]) {
                        temp = a[j];
                        a[j] = a[i];
                        a[i] = temp;
                    }
                }
        }
        for (i = 1; i< a.length;i++) {
            if (a[i-1] != a[i]) {
                b[index++] = a[i-1];
            }
        }

//        for ( i = 0; i < index; i++) {
        if(index>=1){
            System.out.print(b[1] + " is the second largest number ");
        }
        else{
            System.out.println("Not found");
        }
    }
}
