import java.util.ArrayList;
import java.util.List;

public class ListCityCountOfString {

	public static void main(String[] args) {
		
		List<String> city=new ArrayList<>();
		city.add("Pune");
		city.add("Delhi");
		city.add("Patiala");
		city.add("Noida");
		city.add("Bangalore");
		
		for(int i=0;i<=city.size()-1;i++)
		{
		  String cityname=city.get(i);
		  int cityStringlength=cityname.length();
		  System.out.println(cityname+ " " +cityStringlength);
		  
			
		}
			for (String cityName1 : city) {
				System.out.println(cityName1+" " + cityName1.length());
			}
	}

}
