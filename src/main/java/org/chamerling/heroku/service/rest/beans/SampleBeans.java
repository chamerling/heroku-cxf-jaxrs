/**
 * 
 */
package org.chamerling.heroku.service.rest.beans;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author chamerling
 * 
 */
@XmlRootElement(name = "beans")
public class SampleBeans {
	@XmlElement(name = "bean")
	private List<SampleBean> s;

	public SampleBeans() {
	}

	public SampleBeans(List<SampleBean> s) {
		this.s = s;
	}

	public List<SampleBean> get() {
		return s;
	}

	public void set(List<SampleBean> s) {
		this.s = s;
	}
}
