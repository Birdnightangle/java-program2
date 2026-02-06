class StaticDemo {
    static int count;

    static {
        count = 10;
        System.out.println("Static block executed");
    }

    static void displayCount() {
        System.out.println("Count value: " + count);
    }

    StaticDemo() {
        count++;
        System.out.println("Constructor called, count = " + count);
    }

    public static void main(String[] args) {

        System.out.println("Main method started");

        StaticDemo.displayCount();

        StaticDemo obj1 = new StaticDemo();
        StaticDemo obj2 = new StaticDemo();

        StaticDemo.displayCount();
    }
}