import java.util.Scanner;

public class AreaOfTringle {

    public static void main(String arg[]){

        int s1,s2,s3, mode;                            //to store all sides of triangle
        float base,height,area,S;              // to store area, base, height of triangle
        Scanner sc= new Scanner(System.in);     //to read user in put
        System.out.println("How would you like to find area of triangle");
        System.out.println("Press 1. to find area by base and height of triangle");
        System.out.println("Press 2. to find area by sides of triangle");
        mode=sc.nextInt();
        switch(mode){
            case 1:{                    //to find area by base and height of triangle
                System.out.println("Enter base of triangle");
                base= sc.nextFloat();
                System.out.println("Enter height of triangle");
                height=sc.nextFloat();
                area= base*height/2;
                System.out.println("Area of triangle is: "+area);
                break;
            }
            case 2:{                    //to find area of triangle by sides
                System.out.println("Enter first side of triangle");
                s1= sc.nextInt();
                System.out.println("Enter second side of triangle");
                s2= sc.nextInt();
                System.out.println("Enter third side of triangle");
                s3 = sc.nextInt();
                S=(s1+s2+s3)/2f;
                area= (float) Math.sqrt(S*(S-s1)*(S-s2)*(S-s3));
                System.out.println("Area of triangle is: "+area);
                break;
            }
            default:
                System.out.println("You Entered wrong option");
        }

    }
}
