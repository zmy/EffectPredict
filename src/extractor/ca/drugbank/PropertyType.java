//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.6 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2012.11.07 时间 03:49:33 PM CST 
//


package extractor.ca.drugbank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PropertyType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kind">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="logP"/>
 *               &lt;enumeration value="logS"/>
 *               &lt;enumeration value="logP/hydrophobicity"/>
 *               &lt;enumeration value="Water Solubility"/>
 *               &lt;enumeration value="caco2 Permeability"/>
 *               &lt;enumeration value="pKa"/>
 *               &lt;enumeration value="IUPAC Name"/>
 *               &lt;enumeration value="Molecular Weight"/>
 *               &lt;enumeration value="Monoisotopic Weight"/>
 *               &lt;enumeration value="SMILES"/>
 *               &lt;enumeration value="Molecular Formula"/>
 *               &lt;enumeration value="InChI"/>
 *               &lt;enumeration value="InChIKey"/>
 *               &lt;enumeration value="Polar Surface Area (PSA)"/>
 *               &lt;enumeration value="Refractivity"/>
 *               &lt;enumeration value="Polarizability"/>
 *               &lt;enumeration value="Rotatable Bond Count"/>
 *               &lt;enumeration value="H Bond Acceptor Count"/>
 *               &lt;enumeration value="H Bond Donor Count"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="source">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="JChem"/>
 *               &lt;enumeration value="ALOGPS"/>
 *               &lt;enumeration value=""/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyType", propOrder = {
    "kind",
    "value",
    "source"
})
public class PropertyType {

    @XmlElement(required = true)
    protected String kind;
    @XmlElement(required = true)
    protected String value;
    @XmlElement(required = true)
    protected String source;

    /**
     * 获取kind属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKind() {
        return kind;
    }

    /**
     * 设置kind属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKind(String value) {
        this.kind = value;
    }

    /**
     * 获取value属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 获取source属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置source属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

}
