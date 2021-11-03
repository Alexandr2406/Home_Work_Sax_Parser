
import model.Node;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class SaxParser {

    public Node startParseTest() throws IOException, SAXException, ParserConfigurationException {

        DefaultHandler handler = new NodeParser();
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        File file = new File("test-files.xml");
        parser.parse(file,handler);
        return null;
    }
}

