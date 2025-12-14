package xmlFile;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ReadingXMLFileUsingDOMParserLibrary {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder(); // ParserConfigurationException
		Document document = builder.parse(".\\data\\employees.xml"); // SAXException, IOException

		// Extract root node from xml document
		Element root = document.getDocumentElement();

		// Extract the child nodes
		NodeList nodeList = root.getChildNodes();

		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);

			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				String tagName = element.getTagName();
				String txtContent = element.getTextContent();
				System.out.println("Tag Name: " + tagName);
				System.out.println("Content: " + txtContent);
			}
		}

	}

}
