import java.util.List;

public class Hotel {
	private String name;
	private int rating;
	private int regularWeekendRate;
	private int regularWeekdayRate;
	private int rewardWeekendRate;
	private int rewardWeekdayRate;
	private int tariff = 0;
	
	public Hotel(String name, int rating, int regularWeekendRate,
			int regularWeekdayRate, int rewardWeekendRate, int rewardWeekdayRate) {
		super();
		this.name = name;
		this.rating = rating;
		this.regularWeekendRate = regularWeekendRate;
		this.regularWeekdayRate = regularWeekdayRate;
		this.rewardWeekendRate = rewardWeekendRate;
		this.rewardWeekdayRate = rewardWeekdayRate;
	}

	
	public String getName() {
		return name;
	}

	public int getRating() {
		return rating;
	}
	
	public int getTariff() {
		return tariff;
	}
	
	public void setTariff(Customer customer){
		
		CustomerType custType = customer.getCustomerType();
		
		List<Days> days = customer.getDays();
		
		if(custType.equals(CustomerType.REGULAR)){
			
			days.forEach(day->{
				
				if(Days.getWeekdays().contains(day)){
					tariff+=regularWeekdayRate;
				}
				else if(Days.getWeekends().contains(day)){
					tariff+=regularWeekendRate;
				}
				
			});
			
		}
		else if(custType.equals(CustomerType.REWARD)){
			
			days.forEach(day->{
				
				if(Days.getWeekdays().contains(day)){
					tariff+=rewardWeekdayRate;
				}
				else if(Days.getWeekends().contains(day)){
					tariff+=rewardWeekendRate;
				}
				
			});
			
		}
		
	}
	
}
