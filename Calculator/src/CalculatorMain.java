import java.io.*;
import java.util.*;
public class CalculatorMain extends Div{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the 2 Values");
		Scanner s=new Scanner(System.in);
		int a,b;
	    a=s.nextInt();
	    b=s.nextInt();
        char c;
        System.out.println("Enter the Operator to be performed for Operation");
        c=s.next().charAt(0);
        switch(c)
        {
        case '+': Add(a,b);break;
        case '-': Subb(a,b);break;
        case '*': Mul(a,b);break;
        case '/': Div(a,b);break;
        default: System.out.println("Invalid Operator");
        }
	}

}
