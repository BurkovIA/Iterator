import RandomIterator.RandomIterator;
import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected int min;
    protected int max;
    protected Random random;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        this.random = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new RandomIterator(min, max);
    }
}

