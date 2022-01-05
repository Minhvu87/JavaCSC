package Chapter3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import Chapter2.Student;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {

		// Buoc 1: tao doi JSONParser
		JSONParser parser = new JSONParser();
		
		// Buoc 2: Doc du lieu file du JSON -> goi ham parse cua doi tuong Parser
		// Khai bao bien de luu gia tri cua file duoc doc -> co 2 gia tri:
		// Neu nhu 1 doi tuong -> JSONObject
		// Neu nhu nhieu doi tuong -> JSONArray
		Object obj = parser.parse(new FileReader("./src/Chapter3/student.json"));
		JSONArray array = (JSONArray) obj;
		
		// Buoc 3: xu ly
		// Muon liet ke danh sach ten sinh vien
		List<Student> listOfStudent = new ArrayList<>();
		for (int idx = 0; idx < array.size(); idx++) {
			JSONObject studentJson = (JSONObject) array.get(idx);
			
			Student student = new Student(studentJson.get("firstname").toString(), 
					studentJson.get("lastname").toString(),
					Integer.parseInt(studentJson.get("age").toString()), 
					Double.parseDouble(studentJson.get("mark1").toString()),
					Double.parseDouble(studentJson.get("mark2").toString()));
			
			listOfStudent.add(student);
		}
		listOfStudent.forEach(System.out::println);
	
	}

}