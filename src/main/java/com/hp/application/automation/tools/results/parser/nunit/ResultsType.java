//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.13 at 09:45:43 AM CST 
//


package com.hp.application.automation.tools.results.parser.nunit;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for resultsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="resultsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="test-suite" type="{}test-suiteType" maxOccurs="unbounded"/>
 *         &lt;element name="test-case" type="{}test-caseType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultsType", propOrder = {
    "testSuite",
    "testCase"
})
public class ResultsType {

    @XmlElement(name = "test-suite")
    protected List<TestSuiteType> testSuite;
    @XmlElement(name = "test-case")
    protected List<TestCaseType> testCase;

    /**
     * Gets the value of the testSuite property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testSuite property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestSuite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestSuiteType }
     * 
     * 
     */
    public List<TestSuiteType> getTestSuite() {
        if (testSuite == null) {
            testSuite = new ArrayList<TestSuiteType>();
        }
        return this.testSuite;
    }

    /**
     * Gets the value of the testCase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testCase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestCase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestCaseType }
     * 
     * 
     */
    public List<TestCaseType> getTestCase() {
        if (testCase == null) {
            testCase = new ArrayList<TestCaseType>();
        }
        return this.testCase;
    }

}
