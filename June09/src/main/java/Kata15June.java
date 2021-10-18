import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Kata15June {
    public static Map<String, List<Integer>> getPeaks(int[] arr) {
        // Your code here!
        int peak;
        Map<String,List<Integer>> peaks = new HashMap<>();

        //create list
        List<Integer> peakValues = new ArrayList<>();
        String peakPositions = "";

        /*
        for (int i = 1; i < (arr.length-1); i++) {
            peak = arr[i];
            if (arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
                peakValues.add(arr[i]);
                if(peakPositions.isEmpty()){
                    peakPositions += i +"";
                }else{
                    peakPositions += "," + i;
                }

            }else if (arr[i] > arr[i-1] && arr[i] == arr[i+1]){
                for(int x = i; x < arr.length;x++){
                    if(arr[x] < arr[i]){
                        peakValues.add(arr[i]);

                    }

                }
            }
        }

        */

        for(int i = 1; i < arr.length - 1; i++){
            if(isPeak(i, arr)){
                peakValues.add(arr[i]);
                if(peakPositions.isEmpty()){
                    peakPositions += i +"";
                }else{
                    peakPositions += "," + i;
                }
            }

        }
        peaks.put(peakPositions,peakValues);
        return peaks;

    }

    public static boolean isPeak(int pos, int[] arr) {
        if (arr[pos - 1] < arr[pos] && arr[pos + 1] < arr[pos])
            return true;
        if (arr[pos - 1] < arr[pos] && arr[pos + 1] == arr[pos]){
            for (int i = pos + 1; i < arr.length; i++) {
                if (arr[i] > arr[pos]) {
                    return false;
                }
                if (arr[i] < arr[pos])
                    return true; // 111111123332
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        int[] arr = {0, 1, 2, 5, 1, 0};
        int[] arr = {3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 3};
//        [1, 2, 2, 2, 1]
//        int[] arr = {1, 2, 2, 2, 1, 2, 3, 3, 3, 3, 1};
//        int[] arr = {1, 2, 2, 2, 2, 1};
        System.out.println(getPeaks(arr));
    }
}

