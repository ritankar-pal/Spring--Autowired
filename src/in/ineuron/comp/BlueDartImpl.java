package in.ineuron.comp;

public class BlueDartImpl implements ICourier {

	static {
		System.out.println("BlueDart .class file is loading...");
	}
	
	public BlueDartImpl() {
		System.out.println("BlueDart Zero Arg Constructor is being loaded...");
	}
	
	@Override
	public String deliver(int oid) {
		System.out.println("BlueDartImpl.deliver()");
		return "Blue Dart Courier will deliver with the order id:: " + oid;
	}
	
}
