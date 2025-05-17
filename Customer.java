public class Customer {
    private int id;
    private String name;
    private String phone;
    private String email;

    public Customer(int id, String name, String phone, String email){
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString(){
        return String.format("%d, %s, %s, %s", id, name, phone, email);
    }

    public String getEmail(){
        return email;
    }

    public String getName(){
        return name;
    }
}
