import java.util.Scanner;

public class WageCalcu
{
    private String employeeName;
    private int hours;
    private double rate, pay;

    public void setEmployeeName ( String name )
    {
        employeeName = name;
    }
    public String getEmployeeName()
    {
        return employeeName;
    }
    public double calculatePay( int hours, double rate )
    {
        if ( hours > 40 )
        {
            int extraHours = hours - 40;
            pay = ( 40 * rate ) + ( extraHours * rate );
        }
        else pay = hours * rate;

        return pay;
    }
    public void displayEmployee()
    {
        System.out.printf( "Employee's name: %s", getEmployeeName() );
        System.out.printf( "\nGross Salary: ", + pay );
    }
}

public class Main {
    public static void main(String[] args) {
        int Is_Full_Time=1;
        double empcheck = Math.floor(Math.random()*10)%2;
        if(empcheck==Is_Full_Time){
            System.out.println("Employee is Present");
        }else{
            System.out.println("Employee is Absent ");
        }



        Scanner input = new Scanner( System.in);
        WageCalcu employee = new WageCalcu();

        System.out.print( "Enter Employee %s name: " );
        String name = input.nextLine();
        employee.setEmployeeName( name );

        System.out.print( "Enter how many hours worked: " );
        int hours = input.nextInt();

        System.out.print( "Enter hourly rate: " );
        double rate = input.nextInt();

        employee.calculatePay( hours, rate );
        employee.displayEmployee();

        System.out.println();



    }
}