import java.util.Scanner;
public class Main {
    final double pi=3.14;
    public double circle(int a)
    {
        return pi*a*a;
    }
    public int square(int s)
    {
        return s*s;
    }
    public int triangle(int a,int b)
    {
        return a*b/2;
    }
    public int multiply(int a,int b)
    {
        return a*b;
    }
    public static void main(String[] args) {
        Main m=new Main();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter option 1.circle 2.square 3.triangle");
        int c=input.nextInt();
        switch(c)
        {
            case 1:
            {
                System.out.println("Enter radius");
                int a=input.nextInt();
                System.out.println(m.circle(a));
                break;
            }
            case 2:
            {
                System.out.println("Enter side");
                int a = input.nextInt();
                System.out.println(m.square(a));
                break;
            }
            case 3:
            {
                System.out.println("Enter height and width");
                int a = input.nextInt();
                int b = input.nextInt();
                System.out.println(m.triangle(a, b));
            }
        }

    }
}