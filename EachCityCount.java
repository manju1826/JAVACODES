import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EachCityCount {
public static void main(String[] args) {
	

	List<String> cities= new ArrayList<>();
	cities.add("Patiala");
	cities.add("Pune");
	cities.add("Noida");
	cities.add("Gonda");
	cities.add("Patiala");
	cities.add("Patiala");
	cities.add("Pune");
	Map<String, Integer> cityCount = getCityCount(cities);
	String maxCityName = null;
	int maxCityCount=0;
	for (Map.Entry<String, Integer> entry : cityCount.entrySet()) {
		String key = entry.getKey();
		Integer val = entry.getValue();
		if(val>maxCityCount) {
			maxCityCount=val;
			maxCityName=key;
			
		}
		
		
	}
	
	System.out.println(maxCityCount +" "+ maxCityName);

	
	
}
public static Map<String,Integer> getCityCount(List<String> cities)
{
	Map<String,Integer> cityCount= new HashMap<>();
	for (String city : cities) {
		Integer cityCounts=1;
		if (cityCount.containsKey(city)) {
			cityCounts = cityCount.get(city);
			cityCounts++;
		} 
	
		cityCount.put(city, cityCounts);
	}
	return cityCount; 
	
	
}
}
