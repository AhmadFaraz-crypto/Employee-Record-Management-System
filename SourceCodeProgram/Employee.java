import java.util.Scanner;

public abstract class Employee {
    Scanner inp = new Scanner(System.in);
    protected String cnic;
    protected String password;
    public Employee(String cnic, String password){
        this.cnic = cnic;
        this.password = password;
    }
    public abstract void CalculatePay(double salary);
    public abstract void LogIn();
    public abstract void LogOut();
}
