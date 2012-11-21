//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.6 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2012.11.07 时间 03:49:33 PM CST 
//


package ca.drugbank;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>DrugType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取drugbankId属性的值。
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
     * 设置drugbankId属性的值。
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
     * 获取description属性的值。
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
     * 设置description属性的值。
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
     * 获取casNumber属性的值。
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
     * 设置casNumber属性的值。
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
     * 获取generalReferences属性的值。
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
     * 设置generalReferences属性的值。
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
     * 获取synthesisReference属性的值。
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
     * 设置synthesisReference属性的值。
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
     * 获取indication属性的值。
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
     * 设置indication属性的值。
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
     * 获取pharmacology属性的值。
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
     * 设置pharmacology属性的值。
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
     * 获取mechanismOfAction属性的值。
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
     * 设置mechanismOfAction属性的值。
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
     * 获取toxicity属性的值。
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
     * 设置toxicity属性的值。
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
     * 获取biotransformation属性的值。
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
     * 设置biotransformation属性的值。
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
     * 获取absorption属性的值。
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
     * 设置absorption属性的值。
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
     * 获取halfLife属性的值。
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
     * 设置halfLife属性的值。
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
     * 获取proteinBinding属性的值。
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
     * 设置proteinBinding属性的值。
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
     * 获取routeOfElimination属性的值。
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
     * 设置routeOfElimination属性的值。
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
     * 获取volumeOfDistribution属性的值。
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
     * 设置volumeOfDistribution属性的值。
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
     * 获取clearance属性的值。
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
     * 设置clearance属性的值。
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
     * 获取secondaryAccessionNumbers属性的值。
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
     * 设置secondaryAccessionNumbers属性的值。
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
     * 获取groups属性的值。
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
     * 设置groups属性的值。
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
     * 获取taxonomy属性的值。
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
     * 设置taxonomy属性的值。
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
     * 获取salts属性的值。
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
     * 设置salts属性的值。
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
     * 获取brands属性的值。
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
     * 设置brands属性的值。
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
     * 获取mixtures属性的值。
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
     * 设置mixtures属性的值。
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
     * 获取packagers属性的值。
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
     * 设置packagers属性的值。
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
     * 获取manufacturers属性的值。
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
     * 设置manufacturers属性的值。
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
     * 获取prices属性的值。
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
     * 设置prices属性的值。
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
     * 获取categories属性的值。
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
     * 设置categories属性的值。
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
     * 获取affectedOrganisms属性的值。
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
     * 设置affectedOrganisms属性的值。
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
     * 获取dosages属性的值。
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
     * 设置dosages属性的值。
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
     * 获取atcCodes属性的值。
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
     * 设置atcCodes属性的值。
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
     * 获取ahfsCodes属性的值。
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
     * 设置ahfsCodes属性的值。
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
     * 获取patents属性的值。
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
     * 设置patents属性的值。
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
     * 获取foodInteractions属性的值。
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
     * 设置foodInteractions属性的值。
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
     * 获取drugInteractions属性的值。
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
     * 设置drugInteractions属性的值。
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
     * 获取proteinSequences属性的值。
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
     * 设置proteinSequences属性的值。
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
     * 获取calculatedProperties属性的值。
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
     * 设置calculatedProperties属性的值。
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
     * 获取experimentalProperties属性的值。
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
     * 设置experimentalProperties属性的值。
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
     * 获取externalLinks属性的值。
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
     * 设置externalLinks属性的值。
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
     * 获取targets属性的值。
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
     * 设置targets属性的值。
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
     * 获取enzymes属性的值。
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
     * 设置enzymes属性的值。
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
     * 获取transporters属性的值。
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
     * 设置transporters属性的值。
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
     * 获取carriers属性的值。
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
     * 设置carriers属性的值。
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
     * 获取type属性的值。
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
     * 设置type属性的值。
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
     * 获取updated属性的值。
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
     * 设置updated属性的值。
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
     * 获取created属性的值。
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
     * 设置created属性的值。
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
     * 获取version属性的值。
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
     * 设置version属性的值。
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
