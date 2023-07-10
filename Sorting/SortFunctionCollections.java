import java.util.Arrays;
import java.util.Collections;

public class SortFunctionCollections {
    public static void main(String[] args) {
        Integer arr[] = new Integer[]{2,5,3,8,1,7};

        Arrays.sort(arr,Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));
    }
}

//Points to remember :
//we cannot do sort function on collections 
//we should use the Arrays.sort to use the sort functionality
