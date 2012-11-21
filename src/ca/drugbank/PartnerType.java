//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.6 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2012.11.07 ʱ�� 03:49:33 PM CST 
//


package ca.drugbank;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PartnerType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
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
     * ��ȡname���Ե�ֵ��
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
     * ����name���Ե�ֵ��
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
     * ��ȡgeneralFunction���Ե�ֵ��
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
     * ����generalFunction���Ե�ֵ��
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
     * ��ȡspecificFunction���Ե�ֵ��
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
     * ����specificFunction���Ե�ֵ��
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
     * ��ȡgeneName���Ե�ֵ��
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
     * ����geneName���Ե�ֵ��
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
     * ��ȡlocus���Ե�ֵ��
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
     * ����locus���Ե�ֵ��
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
     * ��ȡreaction���Ե�ֵ��
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
     * ����reaction���Ե�ֵ��
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
     * ��ȡsignals���Ե�ֵ��
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
     * ����signals���Ե�ֵ��
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
     * ��ȡcellularLocation���Ե�ֵ��
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
     * ����cellularLocation���Ե�ֵ��
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
     * ��ȡtransmembraneRegions���Ե�ֵ��
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
     * ����transmembraneRegions���Ե�ֵ��
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
     * ��ȡtheoreticalPi���Ե�ֵ��
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
     * ����theoreticalPi���Ե�ֵ��
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
     * ��ȡmolecularWeight���Ե�ֵ��
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
     * ����molecularWeight���Ե�ֵ��
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
     * ��ȡchromosome���Ե�ֵ��
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
     * ����chromosome���Ե�ֵ��
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
     * ��ȡspecies���Ե�ֵ��
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
     * ����species���Ե�ֵ��
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
     * ��ȡessentiality���Ե�ֵ��
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
     * ����essentiality���Ե�ֵ��
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
     * ��ȡreferences���Ե�ֵ��
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
     * ����references���Ե�ֵ��
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
     * ��ȡexternalIdentifiers���Ե�ֵ��
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
     * ����externalIdentifiers���Ե�ֵ��
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
     * ��ȡsynonyms���Ե�ֵ��
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
     * ����synonyms���Ե�ֵ��
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
     * ��ȡproteinSequence���Ե�ֵ��
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
     * ����proteinSequence���Ե�ֵ��
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
     * ��ȡgeneSequence���Ե�ֵ��
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
     * ����geneSequence���Ե�ֵ��
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
     * ��ȡpfams���Ե�ֵ��
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
     * ����pfams���Ե�ֵ��
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
     * ��ȡgoClassifiers���Ե�ֵ��
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
     * ����goClassifiers���Ե�ֵ��
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
     * ��ȡid���Ե�ֵ��
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
     * ����id���Ե�ֵ��
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
