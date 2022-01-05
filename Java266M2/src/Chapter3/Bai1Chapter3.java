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


public class Bai1Chapter3 {
	public static void main(String[] args) {
		// Buoc 1: tao doi JSONParser
		JSONParser parser = new JSONParser();
				
		// Buoc 2: Doc du lieu file du JSON -> goi ham parse cua doi tuong Parser
		// Khai bao bien de luu gia tri cua file duoc doc -> co 2 gia tri:
		// Neu nhu 1 doi tuong -> JSONObject
		// Neu nhu nhieu doi tuong -> JSONArray
		try (FileReader reader = new FileReader("./src/Chapter3/QLCT_1.json"))
		{
			Object obj = parser.parse(reader);
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray qlctCONGTY = (JSONArray) jsonObject.get("CONG_TY");
			JSONArray qlctDONVI = (JSONArray) jsonObject.get("DON_VI");
			System.out.println("*****Thông tin công ty *****");
			for (Object o: qlctCONGTY) {
				System.out.print("\nTên công ty: ");
				JSONObject tmpObj = (JSONObject) o;
				System.out.print(tmpObj.get("Ten"));
				System.out.print("\nĐịa chỉ: ");
				System.out.print(tmpObj.get("Dia_chi"));
				System.out.print("\nMail: ");
				System.out.print(tmpObj.get("Mail"));
				System.out.print("\nĐiện thoại: ");
				System.out.print(tmpObj.get("Dien_thoai"));
				
			}
			System.out.print("\nTổng số đơn vị: ");
			System.out.print(qlctDONVI.size() +" đơn vị");
			System.out.print("\nTổng số nhân viên: ");
			List<Integer> sonhanvien = new ArrayList<Integer>();
			for(Object o : qlctDONVI) {
				JSONObject tmpObj = (JSONObject) o;
				sonhanvien.add(Integer.parseInt(tmpObj.get("So_Nhan_vien").toString()));
			}
			System.out.println("\n*****Thông tin đơn vị*****");
			System.out.println(sonhanvien);
			for(Object o : qlctDONVI) {
				JSONObject tmpObj = (JSONObject) o;
				System.out.print("\nTên đơn vị: ");
				System.out.print(tmpObj.get("Ten"));
				System.out.print("\nSố nhân viên: ");
				System.out.print(tmpObj.get("So_Nhan_vien"));
			}
			
//			System.out.println(qlctCONGTY);
			
//			qlctCONGTY.forEach(e->parseQLCTCONGTYObject((JSONObject) e));
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(ParseException e) {
			e.printStackTrace();
		}
	}

}
