//we cannot sort with
//Arrays.sort
//Bubble sort 
//Loop through the array only once O(n)

//output : [0, 0, 0, 1, 1, 1, 1]

import java.util.Arrays;

public class MoveZerosAndOnes{
    public static void main(String[] args) {
        int arr[] = new int[]{1,0,0,1,0,1,1};
        int l = 0;
        int r = arr.length-1;

        while(l<r)
        {
            int temp = 0;
            if(arr[l]>=arr[r])
            {
                temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                r--;
            }
            else{
                l++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
