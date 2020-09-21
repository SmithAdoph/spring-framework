package org.springframework.beans.testfixture.beans;

/**
 * todo: 描述
 *
 * @author tangqiandong
 * @version v1.0
 * @date 2020/8/28
 */
public class AdophBean {

	public AdophCircleBean getTest2() {
		return test2;
	}

	public void setTest2(AdophCircleBean test2) {
		this.test2 = test2;
	}

	private AdophCircleBean test2;

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
		System.out.println("我是AdophBean 2");
	}
}
