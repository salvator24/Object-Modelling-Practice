import java.util.ArrayList;
import java.util.List;

public enum Days {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
	public static List<Days> getWeekdays(){
		List<Days> weekdays = new ArrayList<>();
		weekdays.add(Days.MONDAY);
		weekdays.add(Days.TUESDAY);
		weekdays.add(Days.WEDNESDAY);
		weekdays.add(Days.THURSDAY);
		weekdays.add(Days.FRIDAY);
		return weekdays;
	}
	public static List<Days> getWeekends(){
		List<Days> weekends = new ArrayList<>();
		weekends.add(Days.SATURDAY);
		weekends.add(Days.SUNDAY);
		return weekends;
	}
}
