import org.junit.Assert;
import org.junit.Test;

public class TestSimulation {
    @Test
    public void testConstructor(){
        int numOfDice = 2;
        int numOfToss = 10;
        Simulation sim = new Simulation(numOfDice, numOfToss);
        Assert.assertNotNull(sim);
    }
    @Test
    public void testRunSimulation(){
        int numOfDice = 2;
        int numOfToss = 1000000;
        Simulation sim = new Simulation(numOfDice, numOfToss);
        sim.runSimulation();

    }

}
