import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CoderByteTest {

    @Test
    public void arithGeoTest(){
        Coderbyte test = new Coderbyte();
        int [] a = {2, 4, 6, 8};
        Assertions.assertEquals("arithmetic", test.arithGeo(a));
    }

    @Test
    public void arithGeoTest2(){
        Coderbyte test = new Coderbyte();
        int [] a = {2, 4, 8, 16};
        Assertions.assertNotEquals("arithmetic", test.arithGeo(a));
    }

    @Test
    public void arithGeoTest3(){
       Coderbyte test = new Coderbyte();
        int [] a = {2, 6, 18, 54};
        Assertions.assertEquals("geometric", test.arithGeo(a));
    }

    @Test
    public void arithGeoTest4(){
        Coderbyte test = new Coderbyte();
        int [] a = {2, 6, 18, 54, 55};
        Assertions.assertEquals("-1", test.arithGeo(a));
    }
}
