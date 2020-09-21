package org.springframework.beans.factory.xml.adoph;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.beans.testfixture.beans.AdophBean;
import org.springframework.beans.testfixture.beans.AdophCircleBean;
import org.springframework.core.io.ClassPathResource;

/**
 * todo: 描述
 *
 * @author tangqiandong
 * @version v1.0
 * @date 2020/8/28
 */
public class XmlBeanFactoryTests {

	public static void main(String[] args) {
		XmlBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("org/springframework/beans/factory/xml/XmlBeanFactoryTest.xml"));

		new Thread(() -> {
			AdophBean test1 = (AdophBean) beanFactory.getBean("test1");
			test1.print();
		}, "线程1").start();

		new Thread(() -> {
			AdophCircleBean test2 = (AdophCircleBean) beanFactory.getBean("test2");
			test2.print();
		}, "线程2").start();
	}

	@Test
	void testGetBean() throws InterruptedException {

	}

}
