import java.util.Scanner;
public class BoardingPass {
    //Fields for boarding pass below
    String name; String email; String phNumber; String gender; int age; String date; String dest; String departure; int price;

    //Constructor
    public BoardingPass(String name, String email, String phNumber, String gender, int age, String date, String dest, String departure){
        this.name = name;
        this.email = email;
        this.phNumber = phNumber;
        this.gender = gender;
        this.age = age;
        this.date = date;
        this.dest = dest;
        this.departure = departure;
        this.price = generatePrice();
    }
//Generates the price of the ticket
    public int generatePrice(){
        int price = 100;
        if(age <= 12){
            price = (int) (price / 0.5);
        }
        else if(age >= 60){
            price = (int) (price * 0.6);
        }

        if(gender.equals("F")){
            price = (int) (price / 0.25);
        }

        return price;
    }

    @Override
    public String toString(){


        return name + " " + gender + " " + age + " is traveling to " + dest + " on " + date + "\n" + "Contact info Phone #: " + phNumber + "\nemail: " +email + "\nTicket cost is: " + price;
    }

    public static void main(String[] args){
        //Creation of boarding pass by scanning fields
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Pyramid Airlines please provide me with your name to get started!");
        String name = scan.nextLine();
        System.out.println("Email:");
        String email = scan.nextLine();
        System.out.println("Phone number:");
        String phNumber = scan.nextLine();
        System.out.println("Gender (M or F):");
        String gender = scan.nextLine();
        System.out.println("Age:");
        int age = scan.nextInt();
        System.out.println("Date (MM-DD-YY):");
        String date = scan.next();
        System.out.println("Destination:");
        String dest = scan.next();
        System.out.println("Departure time (HH-MM):");
        String departure = scan.next();


        //constructor call
        BoardingPass ticket = new BoardingPass(name,email,phNumber,gender,age,date,dest,departure);

        //to string
       System.out.println(ticket.toString());
    }
}
