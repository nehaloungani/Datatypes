import java.util.Scanner;
public class Datatypes
{
public static void main(String[] args) {
Scanner inp = new Scanner(System.in);

        int v_int;    // any num like age 
        float v_float; // salary 
        String v_str;  // msg
        Double v_Double; // double value
        Boolean v_Boolean; //true or false
    
    // interacting with user
     System.out.print("Enter your age:");
     v_int = inp.nextInt();

     System.out.print("Enter your salary:");
     v_float = inp.nextFloat();

     System.out.print("Enter any msg:");
     v_str= inp.next();

     System.out.print("Enter Double:");
     v_Double = inp.nextDouble();

     System.out.print("Enter Boolean:");
     v_Boolean = inp.nextBoolean();

     //printing values
     System.out.println(v_int);
     System.out.println(v_float);
     System.out.println(v_str);
     System.out.println(v_Double);
     System.out.println(v_Boolean); 
     inp.close();
}
}