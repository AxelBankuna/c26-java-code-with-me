public class Coderbyte {

    public static String arithGeo(int [] arr) {

        int diff = arr[2] - arr[1];
        int ratio = arr[2] / arr[1];


        String x = "arithmetic";
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] - arr[i - 1] != diff){
                    x = "-1";
            }
        }

        if(!(x.equals("-1"))) {
                return  x;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] / arr[i - 1] != ratio) {
                x = "-1";
            } else {
                x = "geometric";
            }
        }

        return  x;
    }
}

