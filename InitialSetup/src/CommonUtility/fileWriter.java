package CommonUtility;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class fileWriter {

	public static void main(String[] args) 
	{
	  File newFile = new File("C:/Users/Love of God/workspace/April2018/AutomationHub/src/newFile.txt");
	 if ( newFile.exists())
	  {
		    System.out.println("The file already exists ");
	  }
	 else
	  {
	        try
	  {
		    newFile.createNewFile();
	  }
	        catch (Exception e)
	  {
			e.printStackTrace();
	  }
	        
	        try 
	  {
				FileWriter fileW = new FileWriter (newFile);
				BufferedWriter buffW = new BufferedWriter(fileW);
				buffW.write("This is a Practice by Me!!");
				buffW.close();
				System.out.println("File Process Successfully");
				
	 } catch (IOException e) {
				
				e.printStackTrace();
			}
    }

  }

}
