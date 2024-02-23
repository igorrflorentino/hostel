package hostel.services.booking;

import java.time.LocalDate;
import java.util.Set;

public class Room {
	
	private int roomNumber;
	private String roomNickName;
	private int qntdBed;
	private boolean hasAir;
	private boolean isSuit;
	private int size;
	
	private Set<LocalDate> bookedDates;
	
	enum bed{
		king, queen, casal, solteiro;
	}
	
	public boolean isAvailable(LocalDate checkIn, LocalDate checkOut) {
        for (LocalDate date = checkIn; !date.isAfter(checkOut); date = date.plusDays(1)) {
            if (bookedDates.contains(date)) {
                return false;
            }
        }
        return true;
    }

	protected void bookRoom(LocalDate checkIn, LocalDate checkOut) {
        for (LocalDate date = checkIn; !date.isAfter(checkOut); date = date.plusDays(1)) {
            bookedDates.add(date);
        }
    }
}
