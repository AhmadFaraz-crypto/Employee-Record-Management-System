import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<User> user = new ArrayList<>();
    public static void main(String[] args){
        char ch;
        do {
            Scanner inp = new Scanner(System.in);
            displayIntialScreen();
            int choice;
            choice = inp.nextInt();
            if (choice==1){
                NewUser();
            }
            if (choice==2){
                PartTimeEmp();
            }
            if (choice==3){
                PartTimeEmp();
            }
            System.out.println("Do you want to back ");
            ch = inp.next().charAt(0);
        }
        while (ch=='y' || ch=='Y');
    }
    private static void displayIntialScreen(){
        System.out.println("1) New Employee ");
        System.out.println("2) Part Time Employee ");
        System.out.println("3) Permanent Employee ");
    }
    private static void NewUser() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Name : ");
        String Name = inp.nextLine();
        System.out.println("Enter Cnic : ");
        String cnic = inp.nextLine();
        System.out.println("Enter Password : ");
        String password = inp.nextLine();
        user.add(new User(Name, cnic, password));
    }
    private static void displayEmployeeIntialScreen(){
        System.out.println("1 ) Time Start ");
        System.out.println("2 ) Finish Time ");
        System.out.println("3 ) Check Salary ");
    }
    private static void PartTimeEmp(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Cnic : ");
        String cnic = inp.nextLine();
        System.out.println("Enter Password : ");
        String password = inp.nextLine();
        for(User search : user){
            if(search.getCnic().equals(cnic)) {
                if (search.getPassword().equals(password)) {
                    System.out.println("Login Successful...");
                    displayEmployeeIntialScreen();
                    Employee employee = new partTimeEmployee(cnic, password);
                    int choice = inp.nextInt();
                    if(choice==1){
                        employee.LogIn();
                    }
                    if (choice==2){
                        employee.LogOut();
                    }
                    if(choice==3){
                        System.out.println("Enter Hourly Rate : ");
                        double HourlyRate = inp.nextDouble();
                        employee.CalculatePay(HourlyRate);
                    }
                }
                else {
                    System.out.println("Password Not match ");
                    break;
                }
            }
            else{
                System.out.println("Error ");
                break;
            }
        }
    }
    private static void PermanentEmp(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Cnic : ");
        String cnic = inp.nextLine();
        System.out.println("Enter Password : ");
        String password = inp.nextLine();
        for (User search : user){
            if (search.getCnic().equals(cnic)){
                if (search.getPassword().equals(password)){
                    System.out.println("Login Successful ");
                    displayIntialScreen();
                    Employee employee = new permanentEmployee(cnic, password);
                    int choice = inp.nextInt();
                    if (choice==1){
                        employee.LogIn();
                    }
                    if (choice==2){
                        employee.LogOut();
                    }
                    if (choice==3){
                        System.out.println("Enter Per day Amount : ");
                        double salary = inp.nextDouble();
                        employee.CalculatePay(salary);
                    }
                }
                else {
                    System.out.println("Password Not Match ");
                }
            }
            else {
                System.out.println("Try Again....");
            }
        }
    }
}
