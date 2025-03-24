package entity;

public class Patient {

    private String password;
    private String user_name;
    private String phone_number;
    private String active;
    private int  user_id;

    public Patient(String user_name, String phone_number, String active, String password, int user_id) {
        this.user_name = user_name;
        this.phone_number = phone_number;
        this.active = active;
        this.password = password;
        this.user_id = user_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }


}
