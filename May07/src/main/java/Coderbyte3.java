public class Coderbyte3 {
    public static String arithGeo(int[] arr){

        int diff = arr[1] - arr[0];

        String arrith = "arithmetic";
        for(int i = 1; i < arr.length; i++){
            if(arr[i] - arr[i-1] != diff){
                arrith = "-1";
            }
        }

        if(!(arrith.equals(-1))) {
            return arrith;
        }

        int ratio = arr[1] / arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] / arr[i -1] != ratio){
                arrith = "-1";
            }
            else {
                arrith = "geometric";
            }
        }
        return arrith;
    }
}
