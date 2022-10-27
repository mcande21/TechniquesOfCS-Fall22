package ArrayExamples;

import java.util.Arrays;

public class Examples {


    /*
        Return the value of the largest element in the array
     */
    public static int max(final int [] arr){
       int curr_max = Integer.MIN_VALUE;

       for (int i = 0; i < arr.length; i++)
           if (arr[i] > curr_max)
               curr_max = arr[i];
       return curr_max;
    }

    /*
        reverse the values in the array. Modify the actual array passed.
     */

    public static int [] reverse(int [] arr){

        for (int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }

    /*
        Return the index of the item in array. If not found, return -1
     */

    public static int indexOf(final String [] arr, String item){
        // fill in code here

        for (int i = 0; i < arr.length; i++){
            if(item.equals(arr[i])){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int [] nums = {4, 1, 0, 9, 2, 8, 7}; // shorthand for the mess below.
        int [] numb2 = new int [] {1,2,3,4,5};

        // reverse(nums);
        System.out.println(Arrays.equals(reverse(nums), new int [] {7,8,2,9,0,1,4}));
        System.out.println(max(nums)==9);

        String [] names = {"Harry", "hermione", "Ron", "Draco"};
        System.out.println(indexOf(names, "Ron") == 2);
    }

}
