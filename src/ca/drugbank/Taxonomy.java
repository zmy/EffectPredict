//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.6 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2012.11.07 ʱ�� 03:49:33 PM CST 
//


package ca.drugbank;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="kingdom" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://drugbank.ca}substructures"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "kingdom",
    "substructures"
})
@XmlRootElement(name = "taxonomy")
public class Taxonomy {

    @XmlElement(required = true)
    protected String kingdom;
    @XmlElement(required = true)
    protected Substructures substructures;

    /**
     * ��ȡkingdom���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKingdom() {
        return kingdom;
    }

    /**
     * ����kingdom���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKingdom(String value) {
        this.kingdom = value;
    }

    /**
     * ��ȡsubstructures���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Substructures }
     *     
     */
    public Substructures getSubstructures() {
        return substructures;
    }

    /**
     * ����substructures���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Substructures }
     *     
     */
    public void setSubstructures(Substructures value) {
        this.substructures = value;
    }

}
