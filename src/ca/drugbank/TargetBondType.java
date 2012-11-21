//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.6 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2012.11.07 时间 03:49:33 PM CST 
//


package ca.drugbank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TargetBondType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TargetBondType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://drugbank.ca}BondType">
 *       &lt;sequence>
 *         &lt;element name="known-action">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="yes"/>
 *               &lt;enumeration value="no"/>
 *               &lt;enumeration value="unknown"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetBondType", propOrder = {
    "knownAction"
})
public class TargetBondType
    extends BondType
{

    @XmlElement(name = "known-action", required = true)
    protected String knownAction;

    /**
     * 获取knownAction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKnownAction() {
        return knownAction;
    }

    /**
     * 设置knownAction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKnownAction(String value) {
        this.knownAction = value;
    }

}
