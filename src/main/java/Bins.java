
public class Bins {
    int min;
    int max;
    int[] values ;


    public Bins(int min, int max) {
        this.min = min;
        this.max = max;
        values = new int[max-min+1];
    }

    public Integer getBin(int binNum) {
        return this.values[binNum - this.min];
    }

    public void incrementBins(int binNum) {
         this.values[binNum -this.min]++;
    }
}
