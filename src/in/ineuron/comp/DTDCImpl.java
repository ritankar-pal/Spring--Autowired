package in.ineuron.comp;

public class DTDCImpl implements ICourier {

	static {
		System.out.println("DTDC .class file is loading...");
	}
	
	public DTDCImpl() {
		System.out.println("DTDC Zero Arg Constructor is being loaded...");
	}
	
	@Override
	public String deliver(int oid) {
		System.out.println("DTDCImpl.deliver()");
		return "DTDC Courier will deliver your orders with the order id:: " + oid;
	}
	
}
