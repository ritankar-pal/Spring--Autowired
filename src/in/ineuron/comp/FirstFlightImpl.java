package in.ineuron.comp;

public class FirstFlightImpl implements ICourier {

	static {
		System.out.println("FirstFlight .class file is loading...");
	}
	
	public FirstFlightImpl() {
		System.out.println("FirstFlight Zero Arg Constructor is being loaded...");
	}
	
	@Override
	public String deliver(int oid) {
		System.out.println("FirstFlightImpl.deliver()");
		return "FirstFlight Courier will deliver your orders with the order id:: " + oid;
	}
	
}
