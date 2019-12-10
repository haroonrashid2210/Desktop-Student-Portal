public class Admin extends Person {
    private String username,password;

    public Admin(String name, String phone_no, String cnic, String username, String password) {
        super(name, phone_no, cnic);
        this.username = username;
        this.password = password;
    }

    public Admin(Admin admin){
        this.username = admin.getUsername();
        this.password = admin.getPassword();
        this.name = admin.getName();
        this.phone_no = admin.getPhone_no();
        this.cnic = admin.getCnic();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
