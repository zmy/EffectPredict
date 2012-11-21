//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.6 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2012.11.07 时间 03:49:33 PM CST 
//


package ca.drugbank;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BondType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BondType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actions" type="{http://drugbank.ca}BondActionsType"/>
 *         &lt;element name="references" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="position" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="partner" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BondType", propOrder = {
    "actions",
    "references"
})
@XmlSeeAlso({
    TargetBondType.class
})
public class BondType {

    @XmlElement(required = true)
    protected BondActionsType actions;
    @XmlElement(required = true)
    protected String references;
    @XmlAttribute(name = "position")
    protected BigInteger position;
    @XmlAttribute(name = "partner")
    protected BigInteger partner;

    /**
     * 获取actions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BondActionsType }
     *     
     */
    public BondActionsType getActions() {
        return actions;
    }

    /**
     * 设置actions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BondActionsType }
     *     
     */
    public void setActions(BondActionsType value) {
        this.actions = value;
    }

    /**
     * 获取references属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferences() {
        return references;
    }

    /**
     * 设置references属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferences(String value) {
        this.references = value;
    }

    /**
     * 获取position属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPosition() {
        return position;
    }

    /**
     * 设置position属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPosition(BigInteger value) {
        this.position = value;
    }

    /**
     * 获取partner属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPartner() {
        return partner;
    }

    /**
     * 设置partner属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPartner(BigInteger value) {
        this.partner = value;
    }

}
