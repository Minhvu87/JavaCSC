package Chapter3;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class WriteJsonBySimple {

	public static void main(String[] args) {
		
		// Buoc 1: Tao du lieu de ghi:
		// Neu 1 doi tuong: khai bao JSONObject
		// Neu n doi tuong: khai bao JSONArray
		JSONArray arrStd = new JSONArray();
		
		JSONObject student1 = new JSONObject();
		JSONObject student2 = new JSONObject();
		
		// Buoc 2: Dua du lieu vao doi tuong khai bao buoc 1:
		// Dua doi tuong vao JSONArray -> dung ham add()
		// Dua thuoc tinh vao doi tuong JSONObject: dung ham put()
		arrStd.add(student1);
		student1.put("name", "Vinh Pham");
		student1.put("age", 24);
		student1.put("mark1", 8);
		student1.put("mark2", 7);
		
		arrStd.add(student2);
		student2.put("name", "Chung Le");
		student2.put("age", 18);
		student2.put("mark1", 8);
		student2.put("mark2", 7);
		
		System.out.println(arrStd.toJSONString());
		
		// Buoc 3: ghi file dung lop Java IO (FileWriter)
		try (FileWriter out = new FileWriter("src/Chapter3/student_out.json")){
			
			out.write(arrStd.toJSONString());
			
			out.flush();
			System.out.println("Done.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
