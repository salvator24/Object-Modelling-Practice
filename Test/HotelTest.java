import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class HotelTest {

	private Hotel hotel;
	private List<Days> days = new ArrayList<>();;
	private Customer customer;
	
	@Before
	public void setUp() throws Exception {
		hotel = new Hotel("Lakewood", 3, 100, 110, 90, 100);
	
		days.add(Days.WEDNESDAY);
		days.add(Days.THURSDAY);
		days.add(Days.SATURDAY);
		
		customer = new Customer(CustomerType.REGULAR, days);
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testSetTariff() {	
		
		hotel.setTariff(customer);
		assertEquals(320, hotel.getTariff());
		assertNotEquals(340, hotel.getTariff());
		assertNotEquals(0, hotel.getTariff());
	}

}
