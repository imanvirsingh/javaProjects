import java.util.Scanner;

public class Cuboid {
    public static void main(String[] args){
         int length,breadth,height;
         int totalArea,volume,areaOfFront,areaOfSide,areaOfTop;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sides of cuboid in length, breadth, height");
        length=sc.nextInt();
        breadth=sc.nextInt();
        height=sc.nextInt();
        areaOfFront=length*height;
        areaOfSide=height*breadth;
        areaOfTop=length*breadth;
        totalArea=2*(areaOfFront+areaOfSide+areaOfTop);
        volume=height*breadth*length;
        System.out.println("Total area of cuboid is: "+totalArea);
        System.out.println("Volume of cuboid is: "+volume);
    }
}
