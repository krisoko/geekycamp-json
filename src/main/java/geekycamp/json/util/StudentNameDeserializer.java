package geekycamp.json.util;

import geekycamp.json.Student;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class StudentNameDeserializer extends JsonDeserializer<Student> {

	@Override
	public Student deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {

		Student s = new Student();
		s.setName(jp.getText());
		return s;
	}
}
