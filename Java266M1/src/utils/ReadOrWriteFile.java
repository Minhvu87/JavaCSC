package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadOrWriteFile {
	public static void writeTXT(String strInput) {

	}

	public static String readTXT(File myFile) throws IOException {
		String strOutput = "";
		System.out.println("read: " + myFile.getPath());
		FileReader fr = new FileReader(myFile.getPath());
		BufferedReader br = new BufferedReader(fr);
		String line = "";
		while ((line = br.readLine()) != null) {
			strOutput = strOutput + line + "\n";

		}
		br.close();
		fr.close();

		return strOutput;
	}

}
