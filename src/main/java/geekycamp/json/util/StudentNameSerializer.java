package geekycamp.json.util;

import java.io.IOException;

import geekycamp.json.Student;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class StudentNameSerializer extends JsonSerializer<Student>{

	@Override
	public void serialize(Student value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
		
		jgen.writeString(value.getName());
		
	}

}
