
package fr.afcepf.atod26.webservice.supertp.fichier;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.afcepf.atod26.webservice.supertp.fichier package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RecupereImageResponse_QNAME = new QName("http://fichier.supertp.webservice.atod26.afcepf.fr", "recupereImageResponse");
    private final static QName _RecupereImage_QNAME = new QName("http://fichier.supertp.webservice.atod26.afcepf.fr", "recupereImage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.afcepf.atod26.webservice.supertp.fichier
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RecupereImageResponse }
     * 
     */
    public RecupereImageResponse createRecupereImageResponse() {
        return new RecupereImageResponse();
    }

    /**
     * Create an instance of {@link RecupereImage }
     * 
     */
    public RecupereImage createRecupereImage() {
        return new RecupereImage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecupereImageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fichier.supertp.webservice.atod26.afcepf.fr", name = "recupereImageResponse")
    public JAXBElement<RecupereImageResponse> createRecupereImageResponse(RecupereImageResponse value) {
        return new JAXBElement<RecupereImageResponse>(_RecupereImageResponse_QNAME, RecupereImageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecupereImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://fichier.supertp.webservice.atod26.afcepf.fr", name = "recupereImage")
    public JAXBElement<RecupereImage> createRecupereImage(RecupereImage value) {
        return new JAXBElement<RecupereImage>(_RecupereImage_QNAME, RecupereImage.class, null, value);
    }

}
