public class GarbageCollectorDemo {
    public static void main(String[] args) {
        GarbageCollectorDemo obj1 = new GarbageCollectorDemo();
        GarbageCollectorDemo obj2 = new GarbageCollectorDemo();

        obj1 = null;
        obj2 = null;

        System.gc();

        System.out.println("Garbage collection requested.");
    }

    protected void finalize() {
        System.out.println("Garbage collector called, object is being garbage collected.");
    }
}
