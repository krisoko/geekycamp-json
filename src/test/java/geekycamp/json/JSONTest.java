package geekycamp.json;

import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.junit.Test;

import com.fasterxml.jackson.databind.ObjectMapper;


public class JSONTest {
	
	@Test
	public void test_serializeJSON_and_ParseBack() throws Exception{
		
		ObjectMapper mapper = new ObjectMapper();
//		mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
		
		Student s = new Student();
		s.setName("Pesho");
		s.setSmoker(false);
		s.setSavings(234233.13d);
		s.setDateOfBirth(new SimpleDateFormat("yyyy-MM-dd").parse("2001-09-03"));
		s.setLotteryNumbers(Arrays.asList(new Integer[]{1,4,12,22,23,31}));
		
		Address address = new Address();
		address.setCountry("Bulgaria");
		address.setCity("Sofia");
		address.setZip("1618");
		address.setStreet("Tzar Boris III Blvd. 136A");
		s.setAddress(address);
		
		
		// serialize
		StringWriter sw = new StringWriter();
		mapper.writeValue(sw,s);
		
		String result = sw.getBuffer().toString();
		System.out.println(result);
		
		//parse back
		Student parsedStudent = mapper.readValue(
				result,
				Student.class);
		
		System.out.println(parsedStudent.getName());
		System.out.println(parsedStudent.getAddress().getCity());
		System.out.println(parsedStudent.getDateOfBirth());
	}
	
}
