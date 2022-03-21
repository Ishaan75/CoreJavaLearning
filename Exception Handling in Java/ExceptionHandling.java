import java.io.*;
import java.nio.channels.ScatteringByteChannel;

public class ExceptionHandling {

    // topic 1: - Introduction
    // topic 2:- Runtime Stack Mechanism
    // topic 3:- Default Exception handling in Java
    // topic 4:- Exception hierarchy
    // topic 5:- Checked Vs Unchecked Exception
    // topic 6:- Try Catch Block
    // topic 8:- Throw Keyword
    // topic 9:- Throws Keyword
}

class Introduction{

    // What is an Exception?
    // Answer:- An unexpected unwanted event that disturbs the normal flow of the program is known as Exception. It is highly
    // recommended handling an exception. Main objective of exception handling is Graceful Termination Of Program.

    // What is exactly Exception Handling?
    // Answer:- Exception Handling does not mean repairing an exception, we have to provide an alternative way to continue
    // rest of the program normally , this is the concept of exception handling

    /*
    Example

    try{
        // Read data from Remote file locating in London
    }
    catch(FileNotFoundException e){
        // Use local file and continue the rest of program normally
    }

     */
}

class RuntimeStackMechanism{

    // One runtime stack created by JVM for Main Thread

    public static void main(String args[]){
        doStuff();
    }
    public static void doStuff(){
        doMoreStuff();

    }
    public static void doMoreStuff(){
        System.out.println("Hello World");
        System.out.println(10/0);
    }
}

class ExceptionHierarchy{
    /*
    // Root Class :- Throwable Class
                            | |
                            | |
                            \_/
                   ---------- ------------
                   |                     |
               Exception                Error

    */
    // Exception Vs Error
}

class CheckedException{

    public static void main(String args[]){
        /*
        PrintWriter pw = new PrintWriter("abc.txt");
        pw.println("Hello in abc file");
        */
    }
}

class UncheckedException{

    public static void main(String args[]) throws FileNotFoundException{
        PrintWriter pw = new PrintWriter("abc.txt");
        pw.println("Hello in abc file");
        System.out.println(12/0);
    }
}

class TryCatchBlock{

    static class RiskyCode{
        public static void main(String args[]){
            System.out.println("Statement 1 ");
            System.out.println(10/0);
            System.out.println("Statement 2");
        }
    }

     static class SafeCode{
        public static void main(String args[]) {
            System.out.println("Statement 1");
            try{
                // Risky Code
                System.out.println(10/0);
            }
            catch(ArithmeticException e){
               System.out.println(10/2);
                // Methods to print exception
                e.printStackTrace();
                System.out.println(e);
                System.out.println(e.getMessage());
            }

            System.out.println("Statement 2");
        }
    }

    class ControlFlow{

        /*
        try{
            statement -1
            statement -2
            statement -3
        }
        catch{
            statement -4
        }
        statement - 5

         */
    }
}



class ThrowKeyword{
    public static void main(String[] args) {
        throw new ArithmeticException(" / by zero");
    }
    /*
    Example :- User defined exceptions or customized exceptions
    withdraw(double amount){
        if(amount > balance)
            throw InsufficientBalanceException;
    }
     */
}

class ThrowsKeyword{
    public static void main(String[] args)  throws InterruptedException{
        Thread.sleep(1000);
        System.out.println("Successful Termination");
    }

    /*
    Conclusion 1:- only required for checked exceptions
    Conclusion 2:- for unchecked ones , there is no impact of usage
    Conclusion 3:- required only to convince compiler
    Conclusion 4:- does not guarantee abnormal termination of the program
     */

    class ThrowableClass extends RuntimeException{
        public static void main(String[] args)  throws ThrowableClass{
            System.out.println("Hello");
        }
    }
}


class SpecialCases{
/*
    class CaseOne{
        public static void main(String[] args) {
            try{
                System.out.println("Hello");
            }
            catch (ArithmeticException e){

            }
        }
    }


    class CaseTwo{

        public static void main(String[] args) {
            try {
                System.out.println("Hello");
            }
            catch (Exception e){

            }
        }
    }

    class CaseThree{
        public static void main(String[] args) {
            try{
                System.out.println("Hello");
            }
            catch (IOException e){

            }
        }
    }

    class CaseFour{
        public static void main(String[] args) {
            try{
                System.out.println("Hello");
            }
            catch (InterruptedException e){

            }
        }
    }

    class CaseFive {
        public static void main(String[] args) {
            try {
                System.out.println("Hello");
            }
            catch (Error e) {
            }
        }
    }

 */
}
















class CustomizedExceptions{

    // Defining a customized exception
    static class InsufficientFundsException extends RuntimeException{

        InsufficientFundsException(String s){
            super(s);
        }
    }

    public static void main(String[] args)  {

        double amount = 20;
        double total = 10;

        if(amount > total){
            throw new InsufficientFundsException("Please withdraw cash less than the maximum withdrawal limit which is 10");
        }
    }
}


