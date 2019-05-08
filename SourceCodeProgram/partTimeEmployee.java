import org.joda.time.DateTime;
import org.joda.time.Period;

public class partTimeEmployee extends Employee{
    DateTime today = new DateTime();
    DateTime next = today.plusHours(8);

    public partTimeEmployee(String cnic, String password) {
        super(cnic, password);
    }
    @Override
    public void CalculatePay(double HourlyRate) {
        Period p = new Period(today, next);
        System.out.println("Total Hours " + p.getHours() + "Total Salary " + HourlyRate * p.getHours());
    }
    @Override
    public void LogIn(){
        System.out.println(today.toString("MM/dd/yyyy HH:mm:ss"));
    }
    @Override
    public void LogOut(){
        System.out.println(next.toString("MM/dd/yyyy HH:mm:ss"));
    }
}
