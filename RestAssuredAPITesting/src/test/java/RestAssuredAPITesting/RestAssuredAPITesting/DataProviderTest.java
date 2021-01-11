package RestAssuredAPITesting.RestAssuredAPITesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	@DataProvider(name = "data")
	public Object[][] dataToPrint() {
//		Object[][] data = new Object[2][3];
//		data[0][0] = "Amit";
//		data[0][1] = "Patel";
//		data[0][2] = 1;
//		
//		data[1][0] = "Aarti";
//		data[1][1] = "Kacha";
//		data[1][2] = 2;
//		
//		return data;
		return new Object[][] {
			{"Sachin", "Patel", 3},
			{"Amit", "Patel", 4}
		};
	}
	
	@Test(dataProvider = "data")
	public void printData(String first, String last, int rollNo) {
		System.out.println("FirstName: " + first + " LastName: " + last + " rollNo: " + rollNo);
	}
}
