import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class HotelReservation {
	public static void main(String arg[]) {
		
		Hotel lakewood = new Hotel("Lakewood", 3, 100, 110, 90, 100);
		Hotel bridgewood = new Hotel("Bridgewood", 4, 90, 130, 80, 90);
		Hotel ridgewood = new Hotel("Ridgewood", 2, 110, 120, 95, 105);
		
		Customer customer = null;
		
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			String[] input = br.readLine().split(", ");

			CustomerType custType = CustomerType.valueOf(input[0].toUpperCase());
			
			List<Days> days = new ArrayList<>();
			
			for(int i = 1; i < input.length; i++){
				days.add(Days.valueOf(input[i].toUpperCase())); 
			}
			
			customer = new Customer(custType, days);
		
		}
		catch(Exception  e){
			System.out.println("Invalid Input");
		}
		
		HotelReservation.setMinTariff(customer, lakewood, bridgewood, ridgewood);
		
		Hotel cheapestHotel = customer.getCheapestHotel();
		
		System.out.println(cheapestHotel.getName()+" $"+cheapestHotel.getTariff());
			
			
	}
	
	public static void setMinTariff(Customer customer, Hotel...hotels){
		
		List<Hotel> hotelList = Arrays.asList(hotels);
		
		hotelList.forEach(hotel->hotel.setTariff(customer));
		
		hotelList.sort((h1, h2)->{
			int cmp = Integer.compare(h1.getTariff(), h2.getTariff());
			if(cmp == 0)
				cmp = -Integer.compare(h1.getRating(), h2.getRating());
			return cmp;
		});
		
		customer.setCheapestHotel(hotelList.get(0));
		
	}
}
