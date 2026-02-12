public class GarbageCollection {

    @Override
    protected void finalize() {
        System.out.println("Garbage Collected");
    }

    public static void main(String[] args) {

        GarbageCollection o1 = new GarbageCollection();

        // make object eligible
        o1 = null;

        // request garbage collection
        System.gc();
    }
}
