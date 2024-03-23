import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TestDice {
        @Test
    public void testNumOfDice(){
        //Given
        int numberOfDice = 2;
        Dice dice = new Dice(numberOfDice);
        //When
        int expected = 2;
        int actual = dice.getNumOfDice();
        //Then
        Assert.assertEquals(expected,actual);


    }
    @Test
    public void testTossAndSum(){
        //Given
        int numberOfDice = 2;
        Dice dice = new Dice(numberOfDice);
        int maximumNum = numberOfDice * 6;
        //When
        Integer actual = dice.tossAndSum();
        //Then
        Assert.assertTrue(actual <= maximumNum);
        Assert.assertTrue(actual >= numberOfDice);

    }



}
