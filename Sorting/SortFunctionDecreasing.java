import java.util.Arrays;
import java.util.Collections;

public class SortFunctionDecreasing {
    public static void main(String[] args) {
        Integer arr[] = new Integer[]{2,5,3,8,1,7};

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));
    }
}


//points to remember :
//we cannot perform decreasing sort using the Arrays.sort 
//instead we should use the Collections inside the Arrays.sort 
//but while using collections we cannot have the primitive datatypes 
//So you should use wrapper classes like Integer instead of int
