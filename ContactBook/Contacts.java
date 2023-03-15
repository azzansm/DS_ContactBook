package ContactBook;
public class Contacts {
    private final String name;
    private final String email;
    private final String phone;

    public Contacts(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    @Override
    public String toString(){
        return "Contact [" +  "Name = " + name + ", Email = " + email+ ", Phone = " + phone +"]";
    }
}
