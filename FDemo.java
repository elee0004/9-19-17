public class FDemo {
    int x;

    FDemo(Int i) {
        x = i;
    }

    //called when object is recycles
    protected void finalize() {
        System.out.println("finalizing " + x);
    }

    //generates an object that is immediately destroyed
    void generator (int i) {
        FDemo o = new FDemo(i);
    }
}
