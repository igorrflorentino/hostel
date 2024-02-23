package hostel.services.booking;

import java.time.LocalDate;
import java.util.UUID;
import java.util.Set;

import hostel.actors.clients.*;

public class Hospitality {

	private Set<Room> rooms;
	private Set<UUID> reservationIDs;
	
	public UUID makeID() {
		return UUID.randomUUID();
	}
	
	 public boolean isRoomAvailable(int roomNumber, LocalDate checkIn, LocalDate checkOut) {
	        Room room = rooms. (roomNumber);
	        if (room == null) {
	            System.out.println("Room number " + roomNumber + " does not exist.");
	            return false;
	        }
	        return room.isAvailable(checkIn, checkOut);
	    }
	
	
	
	
	
	
	
	
	public boolean reservar(Person hospede, Room quarto, Date checkIn, Date checkOut) {
		
	
		this.reservationID = makeID();
		
		return true;
	}
	
}
