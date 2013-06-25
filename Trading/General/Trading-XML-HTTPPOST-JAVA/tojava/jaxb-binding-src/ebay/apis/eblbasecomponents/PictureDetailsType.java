//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-661 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.27 at 04:06:26 PM PDT 
//


package ebay.apis.eblbasecomponents;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * 
 * 				Contains the data for a picture associated with an item.
 * 				Replaces the deprecated SiteHostedPicture and
 * 				VendorHostedPicture.
 * 				Not applicable to Half.com.
 * 			
 * 
 * <p>Java class for PictureDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PictureDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GalleryType" type="{urn:ebay:apis:eBLBaseComponents}GalleryTypeCodeType" minOccurs="0"/>
 *         &lt;element name="GalleryURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="PhotoDisplay" type="{urn:ebay:apis:eBLBaseComponents}PhotoDisplayCodeType" minOccurs="0"/>
 *         &lt;element name="PictureURL" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PictureSource" type="{urn:ebay:apis:eBLBaseComponents}PictureSourceCodeType" minOccurs="0"/>
 *         &lt;element name="GalleryDuration" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *         &lt;element name="GalleryStatus" type="{urn:ebay:apis:eBLBaseComponents}GalleryStatusCodeType" minOccurs="0"/>
 *         &lt;element name="GalleryErrorInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PictureDetailsType", propOrder = {
    "galleryType",
    "galleryURL",
    "photoDisplay",
    "pictureURL",
    "pictureSource",
    "galleryDuration",
    "galleryStatus",
    "galleryErrorInfo"
})
public class PictureDetailsType {

    @XmlElement(name = "GalleryType")
    protected GalleryTypeCodeType galleryType;
    @XmlElement(name = "GalleryURL")
    @XmlSchemaType(name = "anyURI")
    protected String galleryURL;
    @XmlElement(name = "PhotoDisplay")
    protected PhotoDisplayCodeType photoDisplay;
    @XmlElement(name = "PictureURL")
    @XmlSchemaType(name = "anyURI")
    protected List<String> pictureURL;
    @XmlElement(name = "PictureSource")
    protected PictureSourceCodeType pictureSource;
    @XmlElement(name = "GalleryDuration")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String galleryDuration;
    @XmlElement(name = "GalleryStatus")
    protected GalleryStatusCodeType galleryStatus;
    @XmlElement(name = "GalleryErrorInfo")
    protected String galleryErrorInfo;

    /**
     * Gets the value of the galleryType property.
     * 
     * @return
     *     possible object is
     *     {@link GalleryTypeCodeType }
     *     
     */
    public GalleryTypeCodeType getGalleryType() {
        return galleryType;
    }

    /**
     * Sets the value of the galleryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GalleryTypeCodeType }
     *     
     */
    public void setGalleryType(GalleryTypeCodeType value) {
        this.galleryType = value;
    }

    /**
     * Gets the value of the galleryURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGalleryURL() {
        return galleryURL;
    }

    /**
     * Sets the value of the galleryURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGalleryURL(String value) {
        this.galleryURL = value;
    }

    /**
     * Gets the value of the photoDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link PhotoDisplayCodeType }
     *     
     */
    public PhotoDisplayCodeType getPhotoDisplay() {
        return photoDisplay;
    }

    /**
     * Sets the value of the photoDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhotoDisplayCodeType }
     *     
     */
    public void setPhotoDisplay(PhotoDisplayCodeType value) {
        this.photoDisplay = value;
    }

    /**
     * Gets the value of the pictureURL property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pictureURL property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPictureURL().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPictureURL() {
        if (pictureURL == null) {
            pictureURL = new ArrayList<String>();
        }
        return this.pictureURL;
    }

    /**
     * Gets the value of the pictureSource property.
     * 
     * @return
     *     possible object is
     *     {@link PictureSourceCodeType }
     *     
     */
    public PictureSourceCodeType getPictureSource() {
        return pictureSource;
    }

    /**
     * Sets the value of the pictureSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link PictureSourceCodeType }
     *     
     */
    public void setPictureSource(PictureSourceCodeType value) {
        this.pictureSource = value;
    }

    /**
     * Gets the value of the galleryDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGalleryDuration() {
        return galleryDuration;
    }

    /**
     * Sets the value of the galleryDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGalleryDuration(String value) {
        this.galleryDuration = value;
    }

    /**
     * Gets the value of the galleryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link GalleryStatusCodeType }
     *     
     */
    public GalleryStatusCodeType getGalleryStatus() {
        return galleryStatus;
    }

    /**
     * Sets the value of the galleryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link GalleryStatusCodeType }
     *     
     */
    public void setGalleryStatus(GalleryStatusCodeType value) {
        this.galleryStatus = value;
    }

    /**
     * Gets the value of the galleryErrorInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGalleryErrorInfo() {
        return galleryErrorInfo;
    }

    /**
     * Sets the value of the galleryErrorInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGalleryErrorInfo(String value) {
        this.galleryErrorInfo = value;
    }

}