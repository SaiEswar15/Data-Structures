//given arr1 =   [9,2,3,4,5]
//given arr2 = [9,8,7,6,5,4]
//output arr = 1079999

class AdditionOfArrays {

    public static void main(String[] args) {
        
        int[] arr1 = new int[]{9,2,3,4,5};
        int[] arr2 = new int[]{9,8,7,6,5,4};
        
        int m = arr1.length;
        int n = arr2.length;
        
        int[] arr = new int[m>=n ? m : n];
        
        System.out.println(arr.length);
        
        int i = arr1.length-1;
        int j = arr2.length-1;
        int p = arr.length-1;
        
        int carry = 0;
        
        while(p >= 0 )
        {
            int sum = 0;
            if(i>=0)
            {
                sum = sum+arr1[i];
            }
            if(j>=0)
            {
                sum = sum+arr2[j];
            }
            
            sum = sum+carry;
            carry = sum/10;
            sum = sum%10;
            
            arr[p] = sum;
            i--;
            j--;
            p--;
        }
        System.out.println();
        if(carry != 0)
        {
            System.out.print(carry);
        }
        for (int el : arr)
        {
            System.out.print(el);
        }
        
        
    }
}