
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


    }
}