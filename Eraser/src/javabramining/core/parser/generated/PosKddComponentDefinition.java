//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.5-b16-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2005.10.30 at 04:44:43 PM BRST 
//


package javabramining.core.parser.generated;


/**
 * Java content class for PosKddComponentDefinition complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/E:/Rafael/Profissional/Desenvolvimento/Projetos/JavaBramining/Eraser/JBramining/jb-pre-methods.xsd line 79)
 * <p>
 * <pre>
 * &lt;complexType name="PosKddComponentDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kddscreen" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kddmethod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="resultType" type="{}ResultTypeDefinition"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface PosKddComponentDefinition {


    /**
     * Gets the value of the resultType property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getResultType();

    /**
     * Sets the value of the resultType property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setResultType(java.lang.String value);

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getDescription();

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setDescription(java.lang.String value);

    /**
     * Gets the value of the kddmethod property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getKddmethod();

    /**
     * Sets the value of the kddmethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setKddmethod(java.lang.String value);

    /**
     * Gets the value of the kddscreen property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getKddscreen();

    /**
     * Sets the value of the kddscreen property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setKddscreen(java.lang.String value);

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getName();

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setName(java.lang.String value);

}
