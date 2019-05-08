public class User {
    private String name;
    private String Cnic;
    private String password;
    public User(String name, String Cnic, String password){
        this.name=name;
        this.Cnic=Cnic;
        this.password=password;
    }
    public String getName(){
        return name;
    }
    public String getCnic(){
        return Cnic;
    }
    public String getPassword(){
        return password;
    }
}
