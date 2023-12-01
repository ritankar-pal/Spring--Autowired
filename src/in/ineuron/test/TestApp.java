package in.ineuron.test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import in.ineuron.comp.Flipkart;



public class TestApp {

	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("in/ineuron/cfg/applicationContext.xml");
		System.out.println("*********Container Started***************\n");
		
		Flipkart flipkart = factory.getBean("fpkt", Flipkart.class);  //Flipkart object is being created with the respective setter injections
		System.out.println(flipkart + "\n");
		
		//caling the business method:: 
		String shopping = flipkart.doShopping(new String[] {"fossil", "tissot"}, new float[] {5000.500f, 8700.0f});
		System.out.println(shopping + "\n");
		
		System.out.println("*********Container Stopped***************\n");
		
	}

}
