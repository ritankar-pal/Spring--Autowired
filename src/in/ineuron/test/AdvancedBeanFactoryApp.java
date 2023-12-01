package in.ineuron.test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.ineuron.comp.Flipkart;



public class AdvancedBeanFactoryApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
		
		Flipkart fpkt = factory.getBean("fpkt", Flipkart.class);
		System.out.println();
		System.out.println(fpkt.hashCode() + " -> " + fpkt);
		System.out.println();
		
		String cart = fpkt.doShopping(new String[] {"Titan", "Omegha"}, new float[] {10000.500f, 20000.0f});
		System.out.println(cart);
		
		
		factory.close();
		
	}

}
