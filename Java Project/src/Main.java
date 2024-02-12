import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] agrs){
        Scanner in=new Scanner(System.in);
        admin admin = new admin("Admin", "Admin");
        ArrayList<room> lst = new ArrayList<room>();
        ArrayList<Customer> cus=new ArrayList<Customer>();
        room r=new room();
        Customer cu=new Customer();
        lst.add(new room("Room 1","Normal",1, 100, "Free", 100));
        lst.add(new room("Room 2", "VIP",2, 150, "Free", 150));
        lst.add(new room("Room 3", "VVIP", 3,200, "Free", 200));
        lst.add(new room("Room 4", "Normal",4, 100, "Free", 100));
        lst.add(new room("Room 5", "VIP", 5,150, "Free", 150));
        lst.add(new room("Room 6",  "VVIP",6 ,200, "Free", 200));
        lst.add(new room("Room 7",  "Normal",7, 100, "Free", 100));
        lst.add(new room("Room 8",  "VIP", 8,150, "Free", 150));
        lst.add(new room("Room 9",  "VVIP",9, 200, "Free", 200));
        lst.add(new room("Room 10" , "Normal",10, 100, "Free", 100));

        cus.add(new Customer("thea", "069 278 670"));
        r.displayRoomDetails(lst);
        System.out.printf("%-20s %-20s %-20s %-20s %-11s %-12s %-13s %-20s %-15s", "[Name]", "[Phone Number]", "[Additional Name]", "[Additional Phone Number]", "[Room Name]", "[Room Id]", "[Room Type]", "[Capacity]", "[Availability]", "[Price]");
        cu.input_information(cus);
        cu.show_cus_information(cus);
        
         
        

        // Scanner in=new Scanner(System.in);
        // System.out.print("Password: ");
        // String password=in.nextLine();
        // if (admin.authenticate(password)) {
        //     System.out.println("Login successful!");
        // } else {
        //     System.out.println("Login failed. Incorrect password.");
        // }
    }
}