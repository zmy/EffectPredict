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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PartnerType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PartnerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="general-function" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="specific-function" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="gene-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="locus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reaction" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="signals" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cellular-location" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transmembrane-regions" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="theoretical-pi" type="{http://drugbank.ca}DecimalOrEmptyType"/>
 *         &lt;element name="molecular-weight" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="chromosome" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://drugbank.ca}species"/>
 *         &lt;element ref="{http://drugbank.ca}essentiality"/>
 *         &lt;element name="references" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="external-identifiers" type="{http://drugbank.ca}IdentifiersType"/>
 *         &lt;element name="synonyms" type="{http://drugbank.ca}SynonymsType"/>
 *         &lt;element name="protein-sequence" type="{http://drugbank.ca}SequenceType" minOccurs="0"/>
 *         &lt;element name="gene-sequence" type="{http://drugbank.ca}SequenceType" minOccurs="0"/>
 *         &lt;element ref="{http://drugbank.ca}pfams"/>
 *         &lt;element ref="{http://drugbank.ca}go-classifiers"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartnerType", propOrder = {
    "name",
    "generalFunction",
    "specificFunction",
    "geneName",
    "locus",
    "reaction",
    "signals",
    "cellularLocation",
    "transmembraneRegions",
    "theoreticalPi",
    "molecularWeight",
    "chromosome",
    "species",
    "essentiality",
    "references",
    "externalIdentifiers",
    "synonyms",
    "proteinSequence",
    "geneSequence",
    "pfams",
    "goClassifiers"
})
public class PartnerType {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "general-function", required = true)
    protected String generalFunction;
    @XmlElement(name = "specific-function", required = true)
    protected String specificFunction;
    @XmlElement(name = "gene-name", required = true)
    protected String geneName;
    @XmlElement(required = true)
    protected String locus;
    @XmlElement(required = true)
    protected String reaction;
    @XmlElement(required = true)
    protected String signals;
    @XmlElement(name = "cellular-location", required = true)
    protected String cellularLocation;
    @XmlElement(name = "transmembrane-regions", required = true)
    protected String transmembraneRegions;
    @XmlElement(name = "theoretical-pi", required = true)
    protected String theoreticalPi;
    @XmlElement(name = "molecular-weight", required = true)
    protected String molecularWeight;
    @XmlElement(required = true)
    protected String chromosome;
    @XmlElement(required = true)
    protected Species species;
    @XmlElement(required = true)
    protected String essentiality;
    @XmlElement(required = true)
    protected String references;
    @XmlElement(name = "external-identifiers", required = true)
    protected IdentifiersType externalIdentifiers;
    @XmlElement(required = true)
    protected SynonymsType synonyms;
    @XmlElement(name = "protein-sequence")
    protected SequenceType proteinSequence;
    @XmlElement(name = "gene-sequence")
    protected SequenceType geneSequence;
    @XmlElement(required = true)
    protected Pfams pfams;
    @XmlElement(name = "go-classifiers", required = true)
    protected GoClassifiers goClassifiers;
    @XmlAttribute(name = "id", required = true)
    protected BigInteger id;

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取generalFunction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneralFunction() {
        return generalFunction;
    }

    /**
     * 设置generalFunction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneralFunction(String value) {
        this.generalFunction = value;
    }

    /**
     * 获取specificFunction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificFunction() {
        return specificFunction;
    }

    /**
     * 设置specificFunction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificFunction(String value) {
        this.specificFunction = value;
    }

    /**
     * 获取geneName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneName() {
        return geneName;
    }

    /**
     * 设置geneName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneName(String value) {
        this.geneName = value;
    }

    /**
     * 获取locus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocus() {
        return locus;
    }

    /**
     * 设置locus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocus(String value) {
        this.locus = value;
    }

    /**
     * 获取reaction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReaction() {
        return reaction;
    }

    /**
     * 设置reaction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReaction(String value) {
        this.reaction = value;
    }

    /**
     * 获取signals属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignals() {
        return signals;
    }

    /**
     * 设置signals属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignals(String value) {
        this.signals = value;
    }

    /**
     * 获取cellularLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellularLocation() {
        return cellularLocation;
    }

    /**
     * 设置cellularLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellularLocation(String value) {
        this.cellularLocation = value;
    }

    /**
     * 获取transmembraneRegions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransmembraneRegions() {
        return transmembraneRegions;
    }

    /**
     * 设置transmembraneRegions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransmembraneRegions(String value) {
        this.transmembraneRegions = value;
    }

    /**
     * 获取theoreticalPi属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTheoreticalPi() {
        return theoreticalPi;
    }

    /**
     * 设置theoreticalPi属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTheoreticalPi(String value) {
        this.theoreticalPi = value;
    }

    /**
     * 获取molecularWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMolecularWeight() {
        return molecularWeight;
    }

    /**
     * 设置molecularWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMolecularWeight(String value) {
        this.molecularWeight = value;
    }

    /**
     * 获取chromosome属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChromosome() {
        return chromosome;
    }

    /**
     * 设置chromosome属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChromosome(String value) {
        this.chromosome = value;
    }

    /**
     * 获取species属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Species }
     *     
     */
    public Species getSpecies() {
        return species;
    }

    /**
     * 设置species属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Species }
     *     
     */
    public void setSpecies(Species value) {
        this.species = value;
    }

    /**
     * 获取essentiality属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEssentiality() {
        return essentiality;
    }

    /**
     * 设置essentiality属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEssentiality(String value) {
        this.essentiality = value;
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
     * 获取externalIdentifiers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IdentifiersType }
     *     
     */
    public IdentifiersType getExternalIdentifiers() {
        return externalIdentifiers;
    }

    /**
     * 设置externalIdentifiers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiersType }
     *     
     */
    public void setExternalIdentifiers(IdentifiersType value) {
        this.externalIdentifiers = value;
    }

    /**
     * 获取synonyms属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SynonymsType }
     *     
     */
    public SynonymsType getSynonyms() {
        return synonyms;
    }

    /**
     * 设置synonyms属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SynonymsType }
     *     
     */
    public void setSynonyms(SynonymsType value) {
        this.synonyms = value;
    }

    /**
     * 获取proteinSequence属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SequenceType }
     *     
     */
    public SequenceType getProteinSequence() {
        return proteinSequence;
    }

    /**
     * 设置proteinSequence属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceType }
     *     
     */
    public void setProteinSequence(SequenceType value) {
        this.proteinSequence = value;
    }

    /**
     * 获取geneSequence属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SequenceType }
     *     
     */
    public SequenceType getGeneSequence() {
        return geneSequence;
    }

    /**
     * 设置geneSequence属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceType }
     *     
     */
    public void setGeneSequence(SequenceType value) {
        this.geneSequence = value;
    }

    /**
     * 获取pfams属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Pfams }
     *     
     */
    public Pfams getPfams() {
        return pfams;
    }

    /**
     * 设置pfams属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Pfams }
     *     
     */
    public void setPfams(Pfams value) {
        this.pfams = value;
    }

    /**
     * 获取goClassifiers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GoClassifiers }
     *     
     */
    public GoClassifiers getGoClassifiers() {
        return goClassifiers;
    }

    /**
     * 设置goClassifiers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GoClassifiers }
     *     
     */
    public void setGoClassifiers(GoClassifiers value) {
        this.goClassifiers = value;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

}
