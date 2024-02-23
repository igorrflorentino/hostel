/**
 * 
 */
/**
 * 
 */
module hostel.services {
	requires hostel.actors;
	requires java.sql;
	exports hostel.services.restaurant;
	exports hostel.services.bar;
	exports hostel.services.booking;
	exports hostel.services.tours;
}