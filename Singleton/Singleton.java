public class Singleton {
    // Private static instance of the Singleton
    private static Singleton instance;

    // Private constructor to prevent instantiation from other classes
    private Singleton() {
        // Initialization code here
    }

    // Public method to provide access to the Singleton instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Add other methods and properties as needed

    public void doSomething() {
        System.out.println("Singleton is doing something.");
    }
}

public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1 == singleton2); // Should print "true"

        singleton1.doSomething();
        singleton2.doSomething();
    }
}
