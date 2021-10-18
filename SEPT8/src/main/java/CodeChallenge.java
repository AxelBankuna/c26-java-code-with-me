/*
An Array consisting of "0" and "1"'s also called a binary array is given as an input.

Task

Find the length of the longest contiguous subarray which consists of Equal number of "0"s and "1"s.

[1,1,0,1,1,0,1,1]
 */

public class CodeChallenge {
    public static void main(String[] args) {
        System.out.println(longestSubArray(new int[]{1,1,0,1,1,0,1,0,1}));
    }
    public static int longestSubArray(int[] array){
        int longestLength = 0;
        for (int start = 0; start < array.length; start++) {
            int ones = 0 , zeros = 0;
            for (int end = start; end <array.length ; end++) {
                 if(array[end] == 0){
                     zeros++;
                 }else {
                     ones++;
                 }

                if(ones == zeros){
                    if((ones + zeros) > longestLength ){
                        longestLength = ones + zeros;
                    }
                }
            }
        }
        return longestLength;
    }
}
