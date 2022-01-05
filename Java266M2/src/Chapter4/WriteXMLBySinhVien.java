package Chapter4;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;



public class WriteXMLBySinhVien {
	public static void main(String[] args) throws ParserConfigurationException, TransformerException {

		// B1: Tao doi tuong DocumentBuilderFactory
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		// B2: Tao doi tuong DocumentBuilder
		DocumentBuilder builder = factory.newDocumentBuilder();

		// B3: Tao doi tuong Document
		Document document = builder.newDocument();
		
		// Tao ra root node -> tao SinhViensNode 
		Element sinhViensNode = document.createElement("SinhViens");
		document.appendChild(sinhViensNode);
		
		// =====  Tao ra cau truc DOM ===========================
		// Tao ra SinhVien node
		Element sinhVienNode = document.createElement("SinhVien");
		sinhVienNode.setAttribute("khoa", "CNTT");
		sinhViensNode.appendChild(sinhVienNode);
		
		Element hoTenNode = document.createElement("hoten");
		hoTenNode.setTextContent("Tran Van An");
		sinhVienNode.appendChild(hoTenNode);
		Element ngaySinhNode = document.createElement("ngaysinh");
		ngaySinhNode.setTextContent("10-10-1999");
		sinhVienNode.appendChild(ngaySinhNode);
		Element gioiTinhNode = document.createElement("gioitinh");
		gioiTinhNode.setTextContent("1");
		sinhVienNode.appendChild(gioiTinhNode);
		Element lopNode = document.createElement("lop");
		lopNode.setTextContent("CNTT_K2013");
		sinhVienNode.appendChild(lopNode);
		
		// == chuyen DOM -> ghi ra file XML ==============
		// B1: Tao doi tuong TranformerFactory
		TransformerFactory transFactory = TransformerFactory.newInstance();
		
		// B2: Tao doi tuong Transformer
		Transformer transformer = transFactory.newTransformer();
		
		// Tao input cho Transformer -> DOMSource
		DOMSource source = new DOMSource(document);
		
		// Tao output cho transformer -> StreamResult
		StreamResult output = new StreamResult(new File("./src/Chapter4/sinh_vien.xml"));
		
		// Thuc hien chuyen input -> output
		transformer.transform(source, output);
		System.out.println("Done!");
	}

}
