
public class Bins {
    int min;
    int max;
    int[] values ;


    public Bins(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getBin(int i) {
        return this.values[i - this.min];
    }

    public void incrementBins(int i) {
         this.values[i-this.min]++;
    }
}
