package badidea4;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Bad4 {

	public static void main(String[] args) {
		// stamp coupling and other troubles
		
		Set<Client> clients = new HashSet<>();
		clients.add(new Client("Alice", LocalDate.parse("1971-08-01")));
		clients.add(new Client("Bob", LocalDate.parse("1980-02-20")));
		clients.add(new Client("Carole", LocalDate.parse("2001-09-19")));
		
		for (Client c : clients) {
			System.out.println(isClientsBirthday(c));
		}
		
		
	}
	
	public static boolean isClientsBirthday(Client c) {
		if ((c.getBirthdate().getDayOfMonth() == LocalDate.now().getDayOfMonth()) &&
				(c.getBirthdate().getMonth() == LocalDate.now().getMonth())) {
			return true;
		}
		return false;
	}

}
