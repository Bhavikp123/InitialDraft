package CommonUtility;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class readJSON {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
	JSONParser parser = new JSONParser();
	

	try
	{
		Object obj = parser.parse(new FileReader("myJSON.json"));
		JSONObject jsonObject = (JSONObject)obj;
		String name = (String) jsonObject.get("Name");
		System.out.println("Name is: "+ name);
		
		String location = (String) jsonObject.get("Location");
		System.out.println("Location is: "+ location);
		
		//Loop Array
		
		JSONArray coursesArray = (JSONArray) jsonObject.get("Courses");
		Iterator<String> iterator = coursesArray.iterator();
		
		while(iterator.hasNext()){
			System.out.println("Courses: " + iterator.next());
		}
		
	}
	catch (FileNotFoundException e){e.printStackTrace();}
	catch (IOException e){e.printStackTrace();}
	catch (ParseException e){e.printStackTrace();}
	catch (Exception e){e.printStackTrace();}
	
	
	}

}
