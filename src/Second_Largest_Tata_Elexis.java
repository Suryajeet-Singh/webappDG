import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Second_Largest_Tata_Elexis {
    public static void main(String[] args) {
        int[] a = {-2,-6, -8, -6 , -4, -12, -7, -9,-19,-76,-8,-90};
        Set<Integer> ts = new TreeSet<>();
        for (int num : a) {
            ts.add(num);
        }

        int[] intArr = ts.stream().mapToInt(i -> i).toArray();
        System.out.println(Arrays.toString(intArr));
        System.out.println("second largest is :"+intArr[intArr.length-2]);


    }


}
