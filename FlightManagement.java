import java.util.*;

public class FlightManagement {
    private ArrayList<Customer> customers;
    private ArrayList<Flight> flights;
    private ArrayList<Booking> bookings;
    private String currentUser;

    public FlightManagement(){
        this.customers = new ArrayList<Customer>();
        this.flights = new ArrayList<Flight>();
        this.bookings = new ArrayList<Booking>();
        this.currentUser = "";
    }

    public static void main(String[] args){
        FlightManagement fm = new FlightManagement();
        
        while(true){
            if((fm.currentUser != "customer") && (fm.currentUser != "staff") && (fm.currentUser != "quit")){
                fm.loginMenu();
            }else if(fm.currentUser == "customer"){
                fm.customerMenu();
            }else if(fm.currentUser == "staff"){
                fm.staffMenu();
            }else if(fm.currentUser == "quit"){
                break;
            }
        }
    }

    public void loginMenu(){
        
        System.out.println("Select a user type:");
        System.out.println("(new) new customer");
        System.out.println("(customer) existing customer");
        System.out.println("(staff) staff member");
        System.out.println("(quit) quit the system");
        System.out.println("");

        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();

        if(choice.equals("new")){
            System.out.println("Register a new customer:");

            System.out.print("Enter your name: ");
            String name = input.nextLine();

            System.out.print("Enter your phone: ");
            String phone = input.nextLine();

            System.out.print("Enter your email: ");
            String email = input.nextLine();

            Customer newCust = new Customer(customers.size()+1, name, phone, email);
            customers.addLast(newCust);
            choice = "";
            System.out.printf("User %s added\n\n", name);
        } else if(choice.equals("customer")){
            Customer cust = null;
            System.out.println("Login using your email: ");
            String email = input.nextLine();
            for(Customer c:customers){
                if(c.getEmail().equals(email)){
                    cust = c;
                    break;
                }
            }
            if(cust == null){
                System.out.println("No customer account was found with that email.");
                System.out.println();
            }else{
                currentUser = "customer";
                System.out.printf("Welcome, %s",cust.getName());
                System.out.println();
                System.out.println();
            }
        } else if(choice.equals("staff")){
            System.out.println("Welcome, staff member.");
            currentUser = "staff";
        } else if(choice.equals("quit")){
            System.out.println("Goodbye.");
            currentUser = "quit";
            input.close();
        } else {
            System.out.println("Input not recognized.\n");
        }
    }

    public void customerMenu(){
        // this needs a logout option to set currentUser to "". This will revert the loop back to login menu
    }

    public void staffMenu(){
        // this needs a logout option to set currentUser to "". This will revert the loop back to login menu
    }

    public void loadCustomers(){
        // this needs to load Customer data from file
    }

    public void loadFlights(){
        // this needs to load Flight data from file
    }

    public void loadBookings(){
        // this needs to load Booking data from file
    }

    public void saveState(){
        // this needs to save Customer, Flight, and Booking data to file
    }
}
