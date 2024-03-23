import org.junit.Assert;
import org.junit.Test;

import java.security.PublicKey;

import static org.junit.Assert.assertEquals;

public class TestBins {

    @Test
    public void testConstructor(){
        //Given
        int min = 2;
        int max = 12;
        Bins bins = new Bins(min, max);
        //Then
        assertEquals(bins);
    }
    @Test
    public void testGetBin(){
        //Given
        int min = 2;
        int max = 12;
        Bins bins = new Bins(min, max);
        //When
        int actual = bins.getBin(4);
        //Then
        assertEquals(0, actual);
    }
    @Test
    public void testIncrementBins(){
        //Given
        int min = 2;
        int max = 12;
        Bins bins = new Bins(min, max);
        //When
        bins.incrementBins(4);
        assertEquals(1, bins.getBin(4).intValue());
    }
}
