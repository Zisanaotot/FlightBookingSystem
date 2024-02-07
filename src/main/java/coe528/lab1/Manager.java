/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe528.lab1;

public class Manager {
    private Flight[] flights = new Flight[15];
    private Ticket tickets[] = new Ticket[1500];
    private int numOfFlights = 0;
	
    public void createFlights(Flight flight) {
	if (numOfFlights < flights.length) {
            flights[numOfFlights] = flight;
            numOfFlights++;
	}
	else {
            System.out.println("Error: Cannot add any more flights");
	}
    }
	
    public void displayAvailableFlights(String origin, String destination) {
	for (int i=0; i<(flights.length-1); i++){
            if (flights[i] != null) {
		if (flights[i].getOrigin().equals(origin) && flights[i].getDestination().equals(destination) && flights[i].getNumberOfSeatsLeft() > 0) {
                    System.out.println(flights[i].toString());
		}
            }
	}
    }
	
    public Flight getFlight(int flightNumber) {
	for (int i=0; i<(flights.length-1); i++) {
            if(flights[i].getFlightNumber() == flightNumber) {
                return flights[i];
            }
	}
	return null;
    }
	
    public void bookSeat(int flightNumber, Passenger p) {
	if (getFlight(flightNumber) != null && getFlight(flightNumber).bookASeat()) {
            for (int i=0; i<tickets.length; i++) {
		if (tickets[i] == null) {
                    tickets[i] = new Ticket(p, getFlight(flightNumber), p.applyDiscount(getFlight(flightNumber).getOriginalPrice()));
                    break;
		}
            }
	}
    }
	
    public static void main(String args[]) {
		
	Flight a = new Flight(1030, "Toronto", "Montreal", "02/09/2004 5:30pm", 300, 1000);
	Flight c = new Flight(330, "Chicago", "San Diego", "02/09/2004 6:00pm", 250, 1000);
	Manager manager = new Manager();
		
	manager.createFlights(a);
	manager.createFlights(c);
		
	manager.displayAvailableFlights("Toronto", "Montreal");
	manager.displayAvailableFlights("Chicago", "San Diego");
		
	// b.getFlight(1030).toString();
		
	Passenger Ali = new Member("Ali Fares", 19, 3);
	Passenger Fares = new Member("Fares Ali", 20, 6);
	Passenger Bob = new NonMember("Bob Burgers", 53);
	Passenger CodyKo = new NonMember("Cody Ko", 67);
		
	manager.bookSeat(1030, Ali);
	manager.bookSeat(1030, Fares);
	manager.bookSeat(1030, Bob);
	manager.bookSeat(330, CodyKo);
		
	manager.getFlight(1030).toString();
		
	System.out.println("");
		
	manager.tickets[0].toString();
	manager.tickets[1].toString();
	manager.tickets[2].toString();
	manager.tickets[3].toString();
		
    }
}