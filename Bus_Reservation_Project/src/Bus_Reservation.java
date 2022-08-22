import java.util.*;

public class Bus_Reservation {

	public static void main(String[] args) {
		System.out.println("WELCOME REDBUS");
		String userName = "mahes@123";
		int userPassword = 1234;
		String busName = "ybm";
		int seatCapacity = 40;
		String conf = "yes";
		Scanner scan = new Scanner(System.in);
		System.out.println("PLEASE ENTER YOUR CORRECT USERNAME AND PASSWORD");
		String name = scan.nextLine();
		int password = scan.nextInt();
		if (userName.equals(name) && (userPassword == password)) {
			System.out.println("CHOOSE YOUR RESPECTIVE BUS?");
			scan.nextLine();
			String bus = scan.nextLine();
			if (busName.equals(bus)) {
				System.out.println("CHOOSE YOUR SEAT NUMBER?");
				int seat = scan.nextInt();
				if (seat < seatCapacity) {
					System.out.println("SEAT AVAILABLE");
					System.out.println("ARE YOU CONFITRM WITH THIS  SEAT?");
					scan.nextLine();
					String confirm = scan.nextLine();
					if (conf.equals(confirm)) {
						System.out.println("YOUR TICKET BOOKED");
						System.out.println("THANKS");
					}
				}
			}

		} else {
			System.out.println("WRONG USERNAME OR PASSWORD");
		}

	}

}
