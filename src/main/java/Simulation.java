public class Simulation {
    int numOfDice;
    int numOfToss;
    Bins bins;
    public Simulation(int numOfDice, int numOfToss) {
        this.numOfDice = numOfDice;
        this.numOfToss = numOfToss;
        this.bins = new Bins(this.numOfDice, this.numOfToss*6);
    }
    //to simulate the toos throwing
    public void runSimulation() {
        Dice dice = new Dice(this.numOfDice);
        bins = new Bins(this.numOfDice, this.numOfDice * 6);
        for (int i=0; i<this.numOfToss; i++){
            bins.incrementBins(dice.tossAndSum());
        }
    }
    public void printResults(){
        System.out.println("***");
        System.out.println("Simulation of "+ this.numOfDice + " dice tossed for " + numOfToss + " times");
        System.out.println("***");

        for (int i=numOfDice; i<=numOfDice*6; i++){
            String str = String.format("%2d :%8d:  %1.2f", i, bins.getBin(i),(double)this.bins.getBin(i)/numOfToss);
            double percent = (double)this.bins.getBin(i)/this.numOfToss;
            int num = (int)(percent*100);
            String var = "*".repeat(num);
            System.out.println(str + " " + var );
        }
    }

    public static void main(String[] args) {
        Simulation sim = new Simulation(2, 10000);

        sim.runSimulation();

        sim.printResults();

    }



}
