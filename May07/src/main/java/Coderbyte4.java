public class Coderbyte4 {

    public String arithGeo (int [] arr) {
        if (isArith(arr))
            return "arithmetic";
        if (isGeo(arr))
            return "geometric";
        return "-1";
    }

    public static boolean isArith (int [] arr) {
        int diff = arr[2] - arr[1];

        for (int i = 1; i < arr.length-1; i++){
            if (arr[i+1] - arr[i] != diff)
                return false;

        }
        return true;
    }

    public static boolean isGeo(int [] arr) {
        int ratio = arr[2] / arr[1];

        for (int i = 1; i < arr.length-1; i++){
            if (arr[i+1] / arr[i] != ratio)
                return false;

        }
        return true;
    }

}
