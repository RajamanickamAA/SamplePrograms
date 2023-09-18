package episode57a;

import java.io.IOException;

import org.testng.annotations.DataProvider;


public class DataUtils {

	@DataProvider(name = "login"  , indices = {0, 1}, parallel = true )
	public String[][] getdata() {

		
		  String[][] data = new String[2][2]; 
		  data[0][0] = "Koushik350@gmail.com";
		  data[0][1] = "Pass123$";
		  
		  data[1][0] = "Koushik350@gmail.com"; 
		  data[1][1] = "Pass123$";
		 

		return data;
	}

}
