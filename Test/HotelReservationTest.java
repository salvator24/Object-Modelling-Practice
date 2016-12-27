import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class HotelReservationTest {
	
	private Hotel lakewood;
	private Hotel bridgewood;
	
	private List<Days> days = new ArrayList<>();
	private Customer customer;
	
	
	@Before
	public void setUp() throws Exception {
		
		lakewood = new Hotel("Lakewood", 3, 100, 110, 90, 100);
		bridgewood = new Hotel("Bridgewood", 4, 90, 130, 80, 90);
		
		days.add(Days.WEDNESDAY);
		days.add(Days.THURSDAY);
		days.add(Days.SATURDAY);
		customer = new Customer(CustomerType.REGULAR, days);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testSetMinTariff() {
		HotelReservation.setMinTariff(customer, lakewood, bridgewood);
		assertEquals(lakewood, customer.getCheapestHotel());
		assertNotEquals(bridgewood, customer.getCheapestHotel());
	}

}
