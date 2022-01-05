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

public class Qlct {
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {

		// Buoc 1: tao doi JSONParser
		JSONParser parser = new JSONParser();
		
		// Buoc 2: Doc du lieu file du JSON -> goi ham parse cua doi tuong Parser
		// Khai bao bien de luu gia tri cua file duoc doc -> co 2 gia tri:
		// Neu nhu 1 doi tuong -> JSONObject
		// Neu nhu nhieu doi tuong -> JSONArray
		Object obj = parser.parse(new FileReader("./src/Chapter3/QLCT_1.json"));
		JSONObject jsonObject = (JSONObject) obj;
		JSONArray qlctCONGTY = (JSONArray) jsonObject.get("CONG_TY");
		JSONArray qlctDONVI = (JSONArray) jsonObject.get("DON_VI");
		List<Cong_ty> listOfCongty = new ArrayList<Cong_ty>();
		List<Don_vi> listOfDonvi = new ArrayList<Don_vi>();
		List<Integer> sonhanvien = new ArrayList<Integer>();
		// Buoc 3: xu ly
		// Muon liet ke ten cong ty
		for (int idx = 0; idx < qlctCONGTY.size(); idx++) {
			JSONObject CongtyJson = (JSONObject) qlctCONGTY.get(idx);
			Cong_ty congty = new Cong_ty(CongtyJson.get("Ten").toString(),
					CongtyJson.get("Dia_chi").toString(),CongtyJson.get("Mail").toString(),
					CongtyJson.get("Dien_thoai").toString());
			listOfCongty.add(congty);
		}
		
		for (int idx = 0; idx < qlctDONVI.size(); idx++) {
			JSONObject DonviJson = (JSONObject) qlctDONVI.get(idx);
			Don_vi donvi = new Don_vi(DonviJson.get("Ten").toString(),
					Integer.parseInt(DonviJson.get("So_Nhan_vien").toString()));
			listOfDonvi.add(donvi);
			sonhanvien.add(donvi.getSo_nhan_vien());
		}
		listOfCongty.forEach(System.out::println);
		System.out.println("Tổng số đơn vị: " +qlctDONVI.size() + " đơn vị");
		System.out.println("Tổng số nhân viên: " + sonhanvien.stream().reduce(0, Integer::sum));
		System.out.println("*****Thông tin đơn vị*****");
		listOfDonvi.forEach(System.out::println);
		
	}
}


