public class Coderbyte2 {
    public String arithGeo(int[] arr) {
        if (isArithmetic(arr))
            return "arithmetic";
        if (isGeometric(arr))
            return "geometric";
        return "-1";
    }

    public static boolean isArithmetic(int[] arr) {
        int diff = arr[1] - arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != diff)
                return false;
        }
        return true;
    }

    public static boolean isGeometric(int[] arr) {
        int ratio = arr[1] / arr[0];
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i + 1] / arr[i] != ratio)
                return false;
        }
        return true;
    }
}
