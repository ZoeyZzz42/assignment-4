package Singleton;

public class SingleObject {
    // Static instance of SingleObject created during class loading
    private static SingleObject instance = new SingleObject();

//   Private constructor prevents instantiation from outside the class.
//   Essential for the Singleton pattern, ensuring controlled instance creation.
    private SingleObject(){};


     // Global access point to the SingleObject instance.
     // Returns the singleton instance created at class loading.
      // @return The singleton instance of SingleObject.
    public static SingleObject getInstance(){
        return instance;
    }

     // Method demonstrating the functionality of the singleton instance.
     // Can be replaced with more complex business logic specific to the application.

    public void showMessage(){
        System.out.println("Hello world!");
    }
}
