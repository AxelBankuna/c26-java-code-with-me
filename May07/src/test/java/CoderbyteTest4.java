import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CoderbyteTest4 {

    @Test
    public void arithGeoTest(){
        Coderbyte4 test = new Coderbyte4();
        int [] a = {2, 4, 6, 8};
        Assertions.assertEquals("arithmetic", test.arithGeo(a));
    }

    @Test
    public void arithGeoTest2(){
        Coderbyte4 test = new Coderbyte4();
        int [] a = {2, 4, 8, 16};
        Assertions.assertNotEquals("arithmetic", test.arithGeo(a));
    }

    @Test
    public void arithGeoTest3(){
        Coderbyte4 test = new Coderbyte4();
        int [] a = {2, 6, 18, 54};
        Assertions.assertEquals("geometric", test.arithGeo(a));
    }

    @Test
    public void arithGeoTest4(){
        Coderbyte4 test = new Coderbyte4();
        int [] a = {2, 6, 18, 54, 55};
        Assertions.assertEquals("-1", test.arithGeo(a));
    }

}
