import java.util.Random;

public class MyTestingClass {
    private int x;
    private int y;

    public MyTestingClass(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
        return x * 31 + y * 17;
    }

    public static void main(String[] args) {
        MyHashTable<MyTestingClass, String> table = new MyHashTable<>();
        Random rand = new Random();

        for (int i = 0; i < 10000; i++) {
            table.put(new MyTestingClass(rand.nextInt(1000), rand.nextInt(1000)), "val" + i);
        }

        table.printBuckets();
    }
}