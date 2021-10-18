/*
Find the odd int

Given an array of integers, find the one that appears an odd number of times.

There will always be only one integer that appears an odd number of times.

Examples

[7] should return 7, because it occurs 1 time (which is odd).
[0] should return 0, because it occurs 1 time (which is odd).
[1,1,2] should return 2, because it occurs 1 time (which is odd).
[0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
[1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).
 */

import java.util.ArrayList;

public class CodeChallenge {
    //PROBLEM SOLVED ... 
    public static void main(String[] args) {
        System.out.println(findOddIndex(new int[]{1,1,2}));
    }

    public static int findOddIndex(int[] arr){

        ArrayList<Integer> checkedNumbers = new ArrayList<>();

        int count = 0;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count % 2 != 0){
                return arr[i];
            }
        }
        return result;
    }
}
