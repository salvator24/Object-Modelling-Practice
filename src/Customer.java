import java.util.List;

public class Customer {
	private CustomerType customerType;
	private List<Days> days;
	private Hotel cheapestHotel;
	
	public Customer(CustomerType customerType, List<Days> days) {
		super();
		this.customerType = customerType;
		this.days = days;
	}
	
	public void show(){
		System.out.println(customerType);
		for(Days day:days){
			System.out.println(day);
		}
	}

	public CustomerType getCustomerType() {
		return customerType;
	}

	public List<Days> getDays() {
		return days;
	}

	public Hotel getCheapestHotel() {
		return cheapestHotel;
	}

	public void setCheapestHotel(Hotel cheapestHotel) {
		this.cheapestHotel = cheapestHotel;
	}
	
}
