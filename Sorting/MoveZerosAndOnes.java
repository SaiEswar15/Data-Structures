//we cannot sort with
//Arrays.sort
//Bubble sort 
//Loop through the array only once O(n)

//try : {1,0,0,1,0,1,1};{0,1,1,0,1,1,0}


import java.util.Arrays;

public class MoveZerosAndOnes{
    public static void main(String[] args) {
        int[] arr = new int[]{1,0,0,1,0,1,1};

        
        int i =0;
        int j = arr.length-1;

        while(i<j)
        {
            int temp = 0;
            if(arr[i] == 0 && arr[j] == 0)
            {
                i++;
            }
            else if(arr[i] == 1 && arr[j] == 1)
            {
                j--;
            }
            else if(arr[i]>arr[j])
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            else
            {
                i++;
                j--;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
