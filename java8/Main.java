//concise  and  minimal  code

// ********  ******2******

// we were missing functional programming benefits in oops nature.
//To utilize functional programming  benefits in java 8  came.

// But still it is oop language .

// **************3*******

// To enable parallel programming .
// More compatible code for multicore processors.


// lectutre 2 

//  *****Features of java 8 ******
// 1.Lambda expressions are similar to methods, but they do not need a 
//name and they can be implemented right in the body of a method.
 // example of the lambda expression is:
 // (x,y) -> x + y
 // 2.stream api -> java stream api Data operation on collections.
 // 3.Date and time api -> under the package java.time, java 8 offers a new date and time api.
 // 4.Base64  encoding and decoding -> java.util.Base64 class
 // 5. Method reference and constructor reference 
    // :: operator 
//  6. Default methods in interfaces 
 // 7. static methods in interfaces
 // 8.functoinal interfaces
 // 9 . optional class
 //  10. java 10 improvements
 //  11.collection API improvements

 // lecture 3

 // What is lambda expression?
 // lambda expression is an anonymous function .
  //Examples: 
  // 1. Not having a name
    // 2. can having any return type
    // 3. can having modifier 

  // Steps to make any function lambda expression
    // 1. Remove the method name
    // 2. Remove the return type
    // 3. Remove method modifiers
    // 4. place arrow  

    // Syntax :
    // private void SayHello(){
    //   System.out.println("Hello");
    //  }

// fuction as lambda expression:

    // () -> System.out.println("Hello");

    // 1. if body has just one statement no need of curly braces.
  // (int a , int b) -> { System.out.println(a+b); };  
  //(a,b) -> System.out.println(a+b);  // type inference
  // 2.  use type intereference, copiler guess the situation or context..
  // 3. No return keyword 
//   (str) -> str.length();
// 4. if only one param remove brackets
// (str) -> str.length(); 
// str -> str.length();

// ___Benefits of lambda expression____
// 1. code conciseness
// 2. increase readability
// 3. enables functional programming
// 4. enables parallel processing
// 5. promotes reusability
// 6. JAR files size reduced
// 7. Elimination  of shadow variables

// lecture 4
// Functional interfaces -> Interface having exactly abstract method but can have any number of defaults and static methods. we can invoke lambda expression by using functional interface.

// @FunctionalInterface    

// What is the adavantage of this annotation?

// It restricts the interface to be a fuctional interface and some new
// So if people have already used some lambda expression and some new 
// team memeber added another abstract method in the interface
//  all lambda expression will have errors.


// @FunctionalInterface
// public interface Child extends  mini{
//     public void sayhello();

//     default  void saytata(){
        
//     };
// }


// lecture 5


//default methods Inside  Interface
// Until 1.7 only public qbstract methods were allowed 
// Weather we declare by writing or not.

// similary public static final varibles were allowed.

// Since java 8 we  can have concrete method as well inside interface

// lecture 6

// default methods in interfaces

// lecture 8

// static methods inside  interfaces

// static methods in Interface are those methods,
// which are defined in the interface with the keyword static

// static methods contain the complete definition of the function
// cannot be overridden or changed in the implementation class

// main fuction ko interface ke under lekh sakte hai

// lecture 9
//  Runnable interface example with lambda expression
// public class notes {
//     public static void main(String[] args) { 
//         Runnable obj = () -> {
//             for(int i=1;i<=5;i++){
  //           System.out.println("Hello "+i);  
  //         }
//       }; 
//       Thread t1 = new Thread(obj);
//       t1.start();  
//     }
// }
// lecture 10

// camparator interface with lambda expression

//     public static void main(String[] args) {
//         List<Integer> list =  new ArrayList<>();
//         list.add(20);
//         list.add(40);
//         list.add(20);
//         list.add(90);
//         Collections.sort(list, (a,b)-> a - b);
//         System.out.println(list);
//     }
// } 

//treeset
// import java.util.*;
// public class notes { 
//     public static void main(String[] args) {
//         TreeSet<Integer> set = new TreeSet<>((a,b) -> b - a); // descending order
//         set.add(10);
//         set.add(5);
//         set.add(30);
//         set.add(20);
  //         set.add(10);
//         System.out.println(set);
//     }
// }
  // treeMap
// import java.util.*;  
// public class notes {
//     public static void main(String[] args) {
//         TreeMap<Integer,String> map = new TreeMap<>((a,b) -> b - a); // descending order
//         map.put(1,"A");  
//         map.put(3,"C");
//         map.put(2,"B");
//         map.put(4,"D");

//         System.out.println(map);
//     }
// }
  


//difference between lambda expression and anonymous inner class
// example:
// import java.util.*;
// public class notes {
//     public static void main(String[] args) {
//         // Anonymous inner class
//         Runnable r1 = new Runnable() {
//             @Override
//             public void run() {
//                 System.out.println("Hello from Anonymous Inner Class");
//             }
//         };
//         Thread t1 = new Thread(r1);
//         t1.start();

//         // Lambda expression
//         Runnable r2 = () -> System.out.println("Hello from Lambda Expression");
//         Thread t2 = new Thread(r2);
//         t2.start();
//     }
// }

// what is predicate : AND, OR  and isEqual

// Boolean  value function  is predicate .

// leture 13

// function 

  // Function<String, Integer> function= String::length;

  //       Function<Integer, Integer> function1 = x -> 2 * x;
  //       System.out.println( "data = " + function1.apply(3));
  //       System.out.println(function.apply("jdfgfdn"));

    //  Predicate<Integer> predicateCheckEven = x -> x % 2 == 0;
    //     System.out.println(predicateCheckEven.test(2));


// identity function is a func that input as its output as result.
// example
  // Function<String, String> function= Function.identity();
  //       System.out.println(function.apply("mini"));

// function kab aya java8 me aya hai
// lecture 14

//Predicate -> Boolean valued function
//Function -> operation

//Consumer 
//Supplier

//  Consumer<String> consumer = s -> System.out.println(s);
//         consumer.accept("mini");

//lecture 15
// Supplier

// Supplier<Integer> supplier = () -> 1;
//         System.out.println(supplier.get());

//do it self
  // Supplier<String> supplier1 = () -> "heello";
  //       System.out.println(supplier1.get());

  //lecture 16
  // biPeredicate , biFunction , biConsumer

  // biPeredicate me two input leta hai
  //  BiPredicate<Integer, Integer> biPredicate  = (x,y) -> x % 2 == 0 && y % 2 == 0;
  //       System.out.println(biPredicate.test(2,2));

  // BiPredicate<String , Integer> biPredicate1 = (str , x) -> str.length() == x;
  //       System.out.println(biPredicate1.test("vipul", 5));

   
  //  Function<String , Integer> function = x -> x.length() ;
  //       BiFunction<String , String, Integer> function1 = (x, y) -> x.length() + y.length();

  //       System.out.println(function.apply("jacky"));
  //       System.out.println(function.apply("mini"+ "mini"));

  
        // Consumer<Integer> consumer = (x)->{
        //     System.out.println(x);
        // };
        // consumer.accept(1);

        // BiConsumer<Integer, Integer> biConsumer = (x, y) -> {
        //     System.out.println(x+ y);
        // };
        // biConsumer.accept(1 ,2);

// lecture 17
// UnaryOperator and BinaryOperator

//     UnaryOperator<Integer> unaryOperator = x -> x * x;
        // System.out.println(unaryOperator.apply(7));

        //  BinaryOperator<Integer> binaryOperator = (x,y) -> x + y;
        // System.out.println(binaryOperator.apply(1,2));

        //lecture 18
        //Method and constructor reference
        // Method reference allow  us to  reference the method  without invoking it making our code clear and readable.They can used in the place of lambda Expression only call and existing method.
//         package org.example;

// import java.util.Arrays;
// import java.util.List;
// import java.util.function.*;


// //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// public class Main {
//     public static void print(String s){
//        System.out.println(s);
//     }

//     public  static  void main(String[] args){
//         List<String> students = Arrays.asList("Alic","Bob","charle");
//         students.forEach(Main::print);
//     }

// }

//output -> 
// Alic
// Bob
// charle

//lecture 18
//java 8 Stream


