import model.Node;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class NodeParser extends DefaultHandler {


    Node node=new Node();

    //маркер места
    private String tmpCurrentTag;

    @Override
    public void startDocument() throws SAXException {
        System.out.println("start document");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("end document");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        tmpCurrentTag=qName; //метке присвыаиваю название тега
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
       tmpCurrentTag=null; //затираю метку, то есть готовлю для следующего тега
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
       // System.out.println("characters "+new String(ch,start,length));

    }
}
