import java.util.Random;

public class Dice {
    private Integer numberOfDice;
    public Dice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public Integer tossAndSum() {
        Random random = new Random();
        int num =0;
        for (int i=0; i<this.numberOfDice; i++){
            num += random.nextInt(6) + 1;
        }
        return num;
    }

    public int getNumOfDice() {
        return this.numberOfDice;
    }


}
