import java.io.Serializable;

public class Person implements Serializable {
    protected String name,phone_no,cnic;

    public Person(String name, String phone_no, String cnic) {
        this.name = name;
        this.phone_no = phone_no;
        this.cnic = cnic;
    }

    public Person(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }
}
