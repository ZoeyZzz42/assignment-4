package Singleton;

// SingletonPatternDemo includes the main method to
// exemplify the application of the Singleton design pattern.
// It illustrates the process of accessing the sole instance of
// the SingleObject class and invoking a method on that particular instance.
public class SingletonPatternDemo {
    // The main method where the Singleton pattern is demonstrated.
    public static void main(String [] args){
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
}
