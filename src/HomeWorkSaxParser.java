import model.Child;
import model.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class HomeWorkSaxParser {
    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
     SaxParser parser=new SaxParser();
        Node node=parser.startParseTest();
        System.out.println(node);

    }
}
