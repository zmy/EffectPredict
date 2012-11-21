//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.6 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2012.11.07 ʱ�� 03:49:33 PM CST 
//


package ca.drugbank;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DrugType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="DrugType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="drugbank-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cas-number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="general-references" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="synthesis-reference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="indication" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pharmacology" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mechanism-of-action" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="toxicity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="biotransformation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="absorption" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="half-life" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="protein-binding" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="route-of-elimination" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="volume-of-distribution" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="clearance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://drugbank.ca}secondary-accession-numbers"/>
 *         &lt;element ref="{http://drugbank.ca}groups"/>
 *         &lt;element ref="{http://drugbank.ca}taxonomy"/>
 *         &lt;element name="synonyms" type="{http://drugbank.ca}SynonymsType"/>
 *         &lt;element ref="{http://drugbank.ca}salts"/>
 *         &lt;element ref="{http://drugbank.ca}brands"/>
 *         &lt;element ref="{http://drugbank.ca}mixtures"/>
 *         &lt;element ref="{http://drugbank.ca}packagers"/>
 *         &lt;element ref="{http://drugbank.ca}manufacturers"/>
 *         &lt;element ref="{http://drugbank.ca}prices"/>
 *         &lt;element ref="{http://drugbank.ca}categories"/>
 *         &lt;element ref="{http://drugbank.ca}affected-organisms"/>
 *         &lt;element ref="{http://drugbank.ca}dosages"/>
 *         &lt;element ref="{http://drugbank.ca}atc-codes"/>
 *         &lt;element ref="{http://drugbank.ca}ahfs-codes"/>
 *         &lt;element ref="{http://drugbank.ca}patents"/>
 *         &lt;element ref="{http://drugbank.ca}food-interactions"/>
 *         &lt;element ref="{http://drugbank.ca}drug-interactions"/>
 *         &lt;element ref="{http://drugbank.ca}protein-sequences" minOccurs="0"/>
 *         &lt;element name="calculated-properties" type="{http://drugbank.ca}PropertiesType" minOccurs="0"/>
 *         &lt;element name="experimental-properties" type="{http://drugbank.ca}PropertiesType"/>
 *         &lt;element name="external-identifiers" type="{http://drugbank.ca}IdentifiersType"/>
 *         &lt;element ref="{http://drugbank.ca}external-links"/>
 *         &lt;element ref="{http://drugbank.ca}targets"/>
 *         &lt;element ref="{http://drugbank.ca}enzymes"/>
 *         &lt;element ref="{http://drugbank.ca}transporters"/>
 *         &lt;element ref="{http://drugbank.ca}carriers"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="small molecule"/>
 *             &lt;enumeration value="biotech"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="updated" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="created" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DrugType", propOrder = {
    "drugbankId",
    "name",
    "description",
    "casNumber",
    "generalReferences",
    "synthesisReference",
    "indication",
    "pharmacology",
    "mechanismOfAction",
    "toxicity",
    "biotransformation",
    "absorption",
    "halfLife",
    "proteinBinding",
    "routeOfElimination",
    "volumeOfDistribution",
    "clearance",
    "secondaryAccessionNumbers",
    "groups",
    "taxonomy",
    "synonyms",
    "salts",
    "brands",
    "mixtures",
    "packagers",
    "manufacturers",
    "prices",
    "categories",
    "affectedOrganisms",
    "dosages",
    "atcCodes",
    "ahfsCodes",
    "patents",
    "foodInteractions",
    "drugInteractions",
    "proteinSequences",
    "calculatedProperties",
    "experimentalProperties",
    "externalIdentifiers",
    "externalLinks",
    "targets",
    "enzymes",
    "transporters",
    "carriers"
})
public class DrugType {

    @XmlElement(name = "drugbank-id", required = true)
    protected String drugbankId;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(name = "cas-number", required = true)
    protected String casNumber;
    @XmlElement(name = "general-references", required = true)
    protected String generalReferences;
    @XmlElement(name = "synthesis-reference", required = true)
    protected String synthesisReference;
    @XmlElement(required = true)
    protected String indication;
    @XmlElement(required = true)
    protected String pharmacology;
    @XmlElement(name = "mechanism-of-action", required = true)
    protected String mechanismOfAction;
    @XmlElement(required = true)
    protected String toxicity;
    @XmlElement(required = true)
    protected String biotransformation;
    @XmlElement(required = true)
    protected String absorption;
    @XmlElement(name = "half-life", required = true)
    protected String halfLife;
    @XmlElement(name = "protein-binding", required = true)
    protected String proteinBinding;
    @XmlElement(name = "route-of-elimination", required = true)
    protected String routeOfElimination;
    @XmlElement(name = "volume-of-distribution", required = true)
    protected String volumeOfDistribution;
    @XmlElement(required = true)
    protected String clearance;
    @XmlElement(name = "secondary-accession-numbers", required = true)
    protected SecondaryAccessionNumbers secondaryAccessionNumbers;
    @XmlElement(required = true)
    protected Groups groups;
    @XmlElement(required = true)
    protected Taxonomy taxonomy;
    @XmlElement(required = true)
    protected SynonymsType synonyms;
    @XmlElement(required = true)
    protected Salts salts;
    @XmlElement(required = true)
    protected Brands brands;
    @XmlElement(required = true)
    protected Mixtures mixtures;
    @XmlElement(required = true)
    protected Packagers packagers;
    @XmlElement(required = true)
    protected Manufacturers manufacturers;
    @XmlElement(required = true)
    protected Prices prices;
    @XmlElement(required = true)
    protected Categories categories;
    @XmlElement(name = "affected-organisms", required = true)
    protected AffectedOrganisms affectedOrganisms;
    @XmlElement(required = true)
    protected Dosages dosages;
    @XmlElement(name = "atc-codes", required = true)
    protected AtcCodes atcCodes;
    @XmlElement(name = "ahfs-codes", required = true)
    protected AhfsCodes ahfsCodes;
    @XmlElement(required = true)
    protected Patents patents;
    @XmlElement(name = "food-interactions", required = true)
    protected FoodInteractions foodInteractions;
    @XmlElement(name = "drug-interactions", required = true)
    protected DrugInteractions drugInteractions;
    @XmlElement(name = "protein-sequences")
    protected ProteinSequences proteinSequences;
    @XmlElement(name = "calculated-properties")
    protected PropertiesType calculatedProperties;
    @XmlElement(name = "experimental-properties", required = true)
    protected PropertiesType experimentalProperties;
    @XmlElement(name = "external-identifiers", required = true)
    protected IdentifiersType externalIdentifiers;
    @XmlElement(name = "external-links", required = true)
    protected ExternalLinks externalLinks;
    @XmlElement(required = true)
    protected Targets targets;
    @XmlElement(required = true)
    protected Enzymes enzymes;
    @XmlElement(required = true)
    protected Transporters transporters;
    @XmlElement(required = true)
    protected Carriers carriers;
    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlAttribute(name = "updated", required = true)
    protected String updated;
    @XmlAttribute(name = "created", required = true)
    protected String created;
    @XmlAttribute(name = "version", required = true)
    protected BigDecimal version;

    /**
     * ��ȡdrugbankId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrugbankId() {
        return drugbankId;
    }

    /**
     * ����drugbankId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrugbankId(String value) {
        this.drugbankId = value;
    }

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
     * ��ȡdescription���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * ����description���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * ��ȡcasNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCasNumber() {
        return casNumber;
    }

    /**
     * ����casNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCasNumber(String value) {
        this.casNumber = value;
    }

    /**
     * ��ȡgeneralReferences���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeneralReferences() {
        return generalReferences;
    }

    /**
     * ����generalReferences���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeneralReferences(String value) {
        this.generalReferences = value;
    }

    /**
     * ��ȡsynthesisReference���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSynthesisReference() {
        return synthesisReference;
    }

    /**
     * ����synthesisReference���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSynthesisReference(String value) {
        this.synthesisReference = value;
    }

    /**
     * ��ȡindication���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndication() {
        return indication;
    }

    /**
     * ����indication���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndication(String value) {
        this.indication = value;
    }

    /**
     * ��ȡpharmacology���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPharmacology() {
        return pharmacology;
    }

    /**
     * ����pharmacology���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPharmacology(String value) {
        this.pharmacology = value;
    }

    /**
     * ��ȡmechanismOfAction���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMechanismOfAction() {
        return mechanismOfAction;
    }

    /**
     * ����mechanismOfAction���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMechanismOfAction(String value) {
        this.mechanismOfAction = value;
    }

    /**
     * ��ȡtoxicity���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToxicity() {
        return toxicity;
    }

    /**
     * ����toxicity���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToxicity(String value) {
        this.toxicity = value;
    }

    /**
     * ��ȡbiotransformation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiotransformation() {
        return biotransformation;
    }

    /**
     * ����biotransformation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiotransformation(String value) {
        this.biotransformation = value;
    }

    /**
     * ��ȡabsorption���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbsorption() {
        return absorption;
    }

    /**
     * ����absorption���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbsorption(String value) {
        this.absorption = value;
    }

    /**
     * ��ȡhalfLife���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHalfLife() {
        return halfLife;
    }

    /**
     * ����halfLife���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHalfLife(String value) {
        this.halfLife = value;
    }

    /**
     * ��ȡproteinBinding���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProteinBinding() {
        return proteinBinding;
    }

    /**
     * ����proteinBinding���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProteinBinding(String value) {
        this.proteinBinding = value;
    }

    /**
     * ��ȡrouteOfElimination���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRouteOfElimination() {
        return routeOfElimination;
    }

    /**
     * ����routeOfElimination���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRouteOfElimination(String value) {
        this.routeOfElimination = value;
    }

    /**
     * ��ȡvolumeOfDistribution���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVolumeOfDistribution() {
        return volumeOfDistribution;
    }

    /**
     * ����volumeOfDistribution���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVolumeOfDistribution(String value) {
        this.volumeOfDistribution = value;
    }

    /**
     * ��ȡclearance���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearance() {
        return clearance;
    }

    /**
     * ����clearance���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearance(String value) {
        this.clearance = value;
    }

    /**
     * ��ȡsecondaryAccessionNumbers���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SecondaryAccessionNumbers }
     *     
     */
    public SecondaryAccessionNumbers getSecondaryAccessionNumbers() {
        return secondaryAccessionNumbers;
    }

    /**
     * ����secondaryAccessionNumbers���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SecondaryAccessionNumbers }
     *     
     */
    public void setSecondaryAccessionNumbers(SecondaryAccessionNumbers value) {
        this.secondaryAccessionNumbers = value;
    }

    /**
     * ��ȡgroups���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Groups }
     *     
     */
    public Groups getGroups() {
        return groups;
    }

    /**
     * ����groups���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Groups }
     *     
     */
    public void setGroups(Groups value) {
        this.groups = value;
    }

    /**
     * ��ȡtaxonomy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Taxonomy }
     *     
     */
    public Taxonomy getTaxonomy() {
        return taxonomy;
    }

    /**
     * ����taxonomy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Taxonomy }
     *     
     */
    public void setTaxonomy(Taxonomy value) {
        this.taxonomy = value;
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
     * ��ȡsalts���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Salts }
     *     
     */
    public Salts getSalts() {
        return salts;
    }

    /**
     * ����salts���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Salts }
     *     
     */
    public void setSalts(Salts value) {
        this.salts = value;
    }

    /**
     * ��ȡbrands���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Brands }
     *     
     */
    public Brands getBrands() {
        return brands;
    }

    /**
     * ����brands���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Brands }
     *     
     */
    public void setBrands(Brands value) {
        this.brands = value;
    }

    /**
     * ��ȡmixtures���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Mixtures }
     *     
     */
    public Mixtures getMixtures() {
        return mixtures;
    }

    /**
     * ����mixtures���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Mixtures }
     *     
     */
    public void setMixtures(Mixtures value) {
        this.mixtures = value;
    }

    /**
     * ��ȡpackagers���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Packagers }
     *     
     */
    public Packagers getPackagers() {
        return packagers;
    }

    /**
     * ����packagers���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Packagers }
     *     
     */
    public void setPackagers(Packagers value) {
        this.packagers = value;
    }

    /**
     * ��ȡmanufacturers���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Manufacturers }
     *     
     */
    public Manufacturers getManufacturers() {
        return manufacturers;
    }

    /**
     * ����manufacturers���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Manufacturers }
     *     
     */
    public void setManufacturers(Manufacturers value) {
        this.manufacturers = value;
    }

    /**
     * ��ȡprices���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Prices }
     *     
     */
    public Prices getPrices() {
        return prices;
    }

    /**
     * ����prices���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Prices }
     *     
     */
    public void setPrices(Prices value) {
        this.prices = value;
    }

    /**
     * ��ȡcategories���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Categories }
     *     
     */
    public Categories getCategories() {
        return categories;
    }

    /**
     * ����categories���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Categories }
     *     
     */
    public void setCategories(Categories value) {
        this.categories = value;
    }

    /**
     * ��ȡaffectedOrganisms���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AffectedOrganisms }
     *     
     */
    public AffectedOrganisms getAffectedOrganisms() {
        return affectedOrganisms;
    }

    /**
     * ����affectedOrganisms���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AffectedOrganisms }
     *     
     */
    public void setAffectedOrganisms(AffectedOrganisms value) {
        this.affectedOrganisms = value;
    }

    /**
     * ��ȡdosages���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Dosages }
     *     
     */
    public Dosages getDosages() {
        return dosages;
    }

    /**
     * ����dosages���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Dosages }
     *     
     */
    public void setDosages(Dosages value) {
        this.dosages = value;
    }

    /**
     * ��ȡatcCodes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AtcCodes }
     *     
     */
    public AtcCodes getAtcCodes() {
        return atcCodes;
    }

    /**
     * ����atcCodes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AtcCodes }
     *     
     */
    public void setAtcCodes(AtcCodes value) {
        this.atcCodes = value;
    }

    /**
     * ��ȡahfsCodes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AhfsCodes }
     *     
     */
    public AhfsCodes getAhfsCodes() {
        return ahfsCodes;
    }

    /**
     * ����ahfsCodes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AhfsCodes }
     *     
     */
    public void setAhfsCodes(AhfsCodes value) {
        this.ahfsCodes = value;
    }

    /**
     * ��ȡpatents���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Patents }
     *     
     */
    public Patents getPatents() {
        return patents;
    }

    /**
     * ����patents���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Patents }
     *     
     */
    public void setPatents(Patents value) {
        this.patents = value;
    }

    /**
     * ��ȡfoodInteractions���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link FoodInteractions }
     *     
     */
    public FoodInteractions getFoodInteractions() {
        return foodInteractions;
    }

    /**
     * ����foodInteractions���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link FoodInteractions }
     *     
     */
    public void setFoodInteractions(FoodInteractions value) {
        this.foodInteractions = value;
    }

    /**
     * ��ȡdrugInteractions���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link DrugInteractions }
     *     
     */
    public DrugInteractions getDrugInteractions() {
        return drugInteractions;
    }

    /**
     * ����drugInteractions���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link DrugInteractions }
     *     
     */
    public void setDrugInteractions(DrugInteractions value) {
        this.drugInteractions = value;
    }

    /**
     * ��ȡproteinSequences���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ProteinSequences }
     *     
     */
    public ProteinSequences getProteinSequences() {
        return proteinSequences;
    }

    /**
     * ����proteinSequences���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ProteinSequences }
     *     
     */
    public void setProteinSequences(ProteinSequences value) {
        this.proteinSequences = value;
    }

    /**
     * ��ȡcalculatedProperties���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PropertiesType }
     *     
     */
    public PropertiesType getCalculatedProperties() {
        return calculatedProperties;
    }

    /**
     * ����calculatedProperties���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PropertiesType }
     *     
     */
    public void setCalculatedProperties(PropertiesType value) {
        this.calculatedProperties = value;
    }

    /**
     * ��ȡexperimentalProperties���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link PropertiesType }
     *     
     */
    public PropertiesType getExperimentalProperties() {
        return experimentalProperties;
    }

    /**
     * ����experimentalProperties���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link PropertiesType }
     *     
     */
    public void setExperimentalProperties(PropertiesType value) {
        this.experimentalProperties = value;
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
     * ��ȡexternalLinks���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ExternalLinks }
     *     
     */
    public ExternalLinks getExternalLinks() {
        return externalLinks;
    }

    /**
     * ����externalLinks���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ExternalLinks }
     *     
     */
    public void setExternalLinks(ExternalLinks value) {
        this.externalLinks = value;
    }

    /**
     * ��ȡtargets���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Targets }
     *     
     */
    public Targets getTargets() {
        return targets;
    }

    /**
     * ����targets���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Targets }
     *     
     */
    public void setTargets(Targets value) {
        this.targets = value;
    }

    /**
     * ��ȡenzymes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Enzymes }
     *     
     */
    public Enzymes getEnzymes() {
        return enzymes;
    }

    /**
     * ����enzymes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Enzymes }
     *     
     */
    public void setEnzymes(Enzymes value) {
        this.enzymes = value;
    }

    /**
     * ��ȡtransporters���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Transporters }
     *     
     */
    public Transporters getTransporters() {
        return transporters;
    }

    /**
     * ����transporters���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Transporters }
     *     
     */
    public void setTransporters(Transporters value) {
        this.transporters = value;
    }

    /**
     * ��ȡcarriers���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Carriers }
     *     
     */
    public Carriers getCarriers() {
        return carriers;
    }

    /**
     * ����carriers���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Carriers }
     *     
     */
    public void setCarriers(Carriers value) {
        this.carriers = value;
    }

    /**
     * ��ȡtype���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * ����type���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * ��ȡupdated���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdated() {
        return updated;
    }

    /**
     * ����updated���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdated(String value) {
        this.updated = value;
    }

    /**
     * ��ȡcreated���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreated() {
        return created;
    }

    /**
     * ����created���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreated(String value) {
        this.created = value;
    }

    /**
     * ��ȡversion���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVersion() {
        return version;
    }

    /**
     * ����version���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVersion(BigDecimal value) {
        this.version = value;
    }

}
