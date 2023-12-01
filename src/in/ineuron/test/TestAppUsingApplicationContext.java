package in.ineuron.test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import in.ineuron.comp.Flipkart;



public class TestAppUsingApplicationContext {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext factory = new ClassPathXmlApplicationContext("in/ineuron/cfg/applicationContext.xml");
		System.out.println("*********Container Started***************\n");
		
		Flipkart flipkart = factory.getBean("fpkt", Flipkart.class);  //Flipkart object is being created with the respective setter injections
		System.out.println(flipkart + "\n");
		
		//caling the business method:: 
		String shopping = flipkart.doShopping(new String[] {"fossil", "tissot"}, new float[] {5000.500f, 8700.0f});
		System.out.println(shopping + "\n");
		
		System.out.println("*********Container Stopped***************\n");
	}

}
