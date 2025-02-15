import java.util.Scanner;

public class areaoftriangle {
    public static void main(String[] args) {
        float base;
        float height;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of the triangle: ");
        base=sc.nextFloat();
        System.out.println("Enter the height of the triangle: ");
        height=sc.nextFloat();
        float area=(base*height)/2;
        System.out.println("The area of the triangle is: "+area);
        sc.close();


    }
}


