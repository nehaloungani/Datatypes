import java.util.Scanner;

public class swapping 
 {
  public static void main(String abc[])
  {
    int a,b,c;
    Scanner inp = new Scanner(System.in);
    // interacting with users
    System.out.print("Enter the first number");
    a=inp.nextInt();
    System.out.print("Enter the second number:");
    b=inp.nextInt();
    // before swapping
    c=a;
    a=b;
    b=c;
    //printing values after swapping
    System.out.println("swapped values are:" +a+ "and" +b);
    //free space in memory
    inp.close();
  }
}