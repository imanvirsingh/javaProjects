import java.util.Scanner;

public class rootsOfQuadrEquation {
    public static void main(String[] args){

        int a,b,c,discriminant;
        double root1,root2,sqr;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the quadratic Equation in form of ax^2+bx+c=0");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        discriminant =(b*b)-(4*a*c);
        sqr=Math.sqrt(discriminant);
        root1=(-b+sqr)/(2*a);
        root2=(-b-sqr)/(2*a);
        System.out.println("roots are: "+root1+" "+root2);

    }
}
