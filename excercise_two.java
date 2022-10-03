import java.util.Scanner;
public class excercise_two {
    public void  greater(int a,int b)
    {
        if(a>b)
            System.out.println(a+" is greater");
        else
            System.out.println(b+" is greater");
    }
    public void eligibletovote(int age)
    {
        if(age>=18)
        {
            System.out.println("Eligible to vote");
        }
        else {
            System.out.println("Not Eligible to Vote");
        }
    }
    public void converttomonth(int days)
    {
        int month,day;
        month=days/30;
        day=days%30;
        System.out.println(month+"month"+day+"days");
    }
    public void validtriangle(int a1,int a2,int a3)
    {
        if(a1==0 || a2==0 || a3==0)
        {
            System.out.println("Enter values above 0");
        }
        if(a1+a2+a3==180)
        {
            System.out.println("valid Triangle");
        }
        else
            System.out.println(" Not a valid Triangle");
    }
    public void bonuscal(int basic) {
        double TA = 10 * basic / 100;
        double DA = 15 * basic / 100;
        double HRA = 20 * basic / 100;
        double PF = 12 * basic / 100;
        double bonus;
        if (basic > 20000) {
            bonus = 10 * basic / 100;
        } else {
            bonus = 20 * basic / 100;
        }
        double gross_salary=basic+TA+DA+HRA+bonus-PF;
        System.out.println("Gross Salary is :"+gross_salary);
    }
    public void add_discount(int p,int q)
    {
        int total=p*q;
        if(q>=10)
        {
            total+=10*total/100;
            System.out.println(total+".rs finalprice");
        }
        else {
            System.out.println(total+".rs finalprice");
        }

    }
    public void insurance(String str1,int ag,String str2)
    {
        String temp1="married",temp2="unmarried",tempgen1="male",tempgen2="famale";
        if(str1.equals("married"))
        {
            System.out.println("Provide insurance");
        }
        else if(str1.equals("unmarried") && ag>30 && str2.equals("male"))
        {
            System.out.println("Provide insurance");
        }
        else if(str1.equals("unmarried") && ag>25 && str2.equals("female"))
        {
            System.out.println("Provide insurance");
        }
        else {
            System.out.println("Don't provide insurance");
        }
    }
    public static void main(String[] args)
    {
        excercise_two obj=new excercise_two();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter choice : 1.check greater number 2.area 3.days to months 4.valid triangle 5.salary calculation 6.check price 7.insurance");
        int choice=input.nextInt();
        switch(choice) {
            case 1:
                System.out.println("Enter two number to check");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                obj.greater(num1, num2);
                break;
            case 2:
                System.out.println("enter age");
                int age = input.nextInt();
                obj.eligibletovote(age);
                break;
            case 3:
                System.out.println("enter days");
                int days = input.nextInt();
                obj.converttomonth(days);
                break;
            case 4:
                System.out.println("enter three angles");
                int a1 = input.nextInt();
                int a2 = input.nextInt();
                int a3 = input.nextInt();
                obj.validtriangle(a1, a2, a3);
                break;
            case 5:
                System.out.println("Enter Basic Salary");
                int basic = input.nextInt();
                obj.bonuscal(basic);
                break;
            case 6:
                System.out.println("Enter price and quantity");
                int price = input.nextInt();
                int quantity = input.nextInt();
                obj.add_discount(price, quantity);
                break;
            case 7:
                System.out.println("Age");
                int ag = input.nextInt();
                input.nextLine();
                System.out.println("Enter MaritalStatus as married or unmarried ");
                String str1 = input.nextLine();
                System.out.println("gender as male or female");
                String str2 = input.nextLine();

                obj.insurance(str1, ag, str2);
        }
    }
}
