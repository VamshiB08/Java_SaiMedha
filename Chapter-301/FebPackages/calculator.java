package calculator;

import java.net.CacheRequest;
import java.util.Scanner;

import javax.lang.model.element.Element;

public class calculator {
  

  public static int add(int a, int b){
    return a+b;
  }

  public static int sub(int a, int b){
    return a-b;
  }

  public static int mult(int a, int b){
    return a*b;
  }

  public static int div(int a, int b){
    return a/b;
  }
  public static void main(String[] args) {
  

    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int ch;
    Scanner in = new Scanner(System.in);
    while(true){
    System.out.println("1.addition\n 2.subtraction\n 3.Multiplication\n 4.Divison\n 5.-1 Exit\n");
    System.out.println("Enter the choice: ");

    ch = in.nextInt();
    
    if(ch==1)System.out.println(add(a,b));
    else if(ch==2) System.out.println(sub(a,b));
    else if(ch==3) System.out.println(mult(a,b));
    else if(ch==4) System.out.println(div(a,b));
    else if(ch==-1) break;
    else System.out.println("enter valid choice..");

  }

  in.close();
    
  }
}
