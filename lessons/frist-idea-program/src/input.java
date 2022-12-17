import javax.swing.*;
import java.util.Scanner;
public class input {
    public  static  void main(String[] args){
        Scanner input = new Scanner(System.in);
       System.out.print("please enter some input:");
       int rollno = input.nextInt();
       System.out.println("your roll number is " + rollno);

       int a = 1082_2425_20;
       System.out.println(a);

       String name= input.next();
       System.out.println(name);

       float marks=input.nextFloat();
       System.out.println(marks);




    }
}
