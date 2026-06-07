
interface InnerMyclass {
 public static void greet() {
     System.out.println("Hello from InnerMyclass");
 }
    
 default   void display() {
     System.out.println("This is a default method in InnerMyclass");
 }
}

public class Myclass {
    public static void main(String[] args) {
        InnerMyclass.greet();
        InnerMyclass obj = new InnerMyclass() {};
        obj.display();
    }
}
