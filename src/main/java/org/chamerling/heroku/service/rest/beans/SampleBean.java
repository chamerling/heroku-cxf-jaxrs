/**
 *
 */
package org.chamerling.heroku.service.rest.beans;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author chamerling
 * 
 */
@XmlRootElement
public class SampleBean {

	private String name;

	private String value;

	public SampleBean() {
	}

	public SampleBean(String name, String value) {
		this.name = name;
		this.value = value;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * @param value
	 *            the value to set
	 */
	public void setValue(String value) {
		this.value = value;
	}

}
