import org.joda.time.DateTime;
import org.joda.time.Period;

public class permanentEmployee extends Employee{
        DateTime today =new DateTime();
        DateTime next = today.plusDays(30);

    public permanentEmployee(String cnic, String password) {
        super(cnic, password);
    }
        @Override
        public void LogIn(){
        System.out.println(today.toString("MM/dd/yyyy HH:mm:ss"));
        }
        @Override
        public void LogOut() {
            System.out.println(next.toString("MM/dd/yyyy HH:mm:ss"));
        }
        @Override
        public void CalculatePay(double salary) {
        Period p = new Period();
        System.out.println("Total days " + p.getDays() + " Total Salary "+ salary*p.getDays());
    }
}
