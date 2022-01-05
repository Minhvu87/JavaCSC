package Chapter4;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class ReadXMLByDonHang {
public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		// B1: Tao doi tuong DocumentBuilderFactory
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		// B2: Tao doi tuong DocumentBuilder
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		// B3: Tao doi tuong Document
		// TH1: Doc du lieu tu file xml co san
		Document document = builder.parse(new File("./src/Chapter4/don_hang.xml"));
		
		// Root node
		Element rootNode = document.getDocumentElement();
		System.out.println(rootNode.getNodeName());
		
		// Danh sach child node cua root node
		NodeList rootChildNodes =  rootNode.getChildNodes();
		System.out.println("getLength of rootChildNodes = " + rootChildNodes.getLength());
		
		// Duyet cac node cua con cua Root node
		for (int idx = 0; idx < rootChildNodes.getLength(); idx++) {
			Node child = rootChildNodes.item(idx);
			if (child.getNodeType() == Node.ELEMENT_NODE && 
					"Ngay_dat_hang".equalsIgnoreCase(child.getNodeName())) {
				System.out.println(child.getNodeName());
				System.out.println(child.getTextContent());
			}
		}
		
		// Duyet khong theo thu tu
		NodeList noiDungList = document.getElementsByTagName("Noi_dung");
		System.out.println("noiDungList.getLength = "  + noiDungList.getLength());
	}

}
