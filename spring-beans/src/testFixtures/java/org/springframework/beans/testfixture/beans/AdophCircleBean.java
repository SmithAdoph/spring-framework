package org.springframework.beans.testfixture.beans;

/**
 * todo: 描述
 *
 * @author tangqiandong
 * @version v1.0
 * @date 2020/8/28
 */
public class AdophCircleBean {

	private AdophBean test1;

	private Integer id;
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void print() {
		System.out.println("我是AdophCircleBean 1");
	}

	public AdophBean getTest1() {
		return test1;
	}

	public void setTest1(AdophBean test1) {
		this.test1 = test1;
	}
}
