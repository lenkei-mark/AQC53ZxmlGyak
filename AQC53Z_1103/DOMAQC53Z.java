package domaqc53z;

public class DOMAQC54Z{

    public static void main(String[] args){
        try{
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.nextInstance();

            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

            Document document = documentBuilder.parse(new File("szemelyek.xml"));

            document.getDocumentElement().normalize();

            Element rootElement = document.getDocumentElement();

            System.out.println("Gyökér elem" + rootElement.getNodeName());

            NodeList childNodes = rootElement.getChildNodes();

            for(int i = 0; i < childNodes.getLength(); i++){
                Node node = childNodes.item(i);
                if(node.getNodeType() == Node.ELEMENT_NODE){
                    Element element = (Element)node;
                    String id = element.getAttribute("id");
                    System.out.println("id: " +id);

                    Node actualNode = element.getFirstChild();
                    while(actualNode !=null){
                        if(actualNode.getNodeType() ==Node.ELEMENT_NODE){
                            Element actualElement = (Element)actualNode;
                            System.out.println(" "+actualElement.getNodeName()+": "+actualElement.getTextContent());

                        }
                        actualNode = actualNode.getNextSibling();
                    }
                    System.out.println();
                }

            }

        } catch(ParseConfigurationException | SAXException | IOException e){
            e.printStackTrace();
        }
    }

}