import java.util.Scanner;

public class Excep {
 public static void main(String[] args) {
    //syntax      logical    runtime

    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    int b = input.nextInt();
    try { System.out.println(a/b);
      
    } catch (ArithmeticException e) {
      System.out.println(e);
      System.out.println("plese check the format");
    }
   
    
 }
    
}