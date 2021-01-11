package RestAssuredAPITesting.RestAssuredAPITesting;

import java.util.HashMap;
import java.util.Map;

public class LoanCreationBody {
	public void createBodyForLoan() {
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("introducerId", "D5C99C868B00460F9A793241F1C88967");
		data.put("arrangerId", "D5C99C868B00460F9A793241F1C88967");
		data.put("supplierId", "D5C99C868B00460F9A793241F1C88967");
		data.put("externalId", "uniqueString");
		data.put("mainApplicant", "");
	}
}
