package practicePackage;

public class Pair {
    long max;
    long seq;

    public Pair(long seq, long max) {
        this.max = max;
        this.seq = seq;
    }

    public long getMax() {
        return max;
    }

    public void setMax(long max) {
        this.max = max;
    }

    public long getSeq() {
        return seq;
    }

    public void setSeq(long seq) {
        this.seq = seq;
    }
}
