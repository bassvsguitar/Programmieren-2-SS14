package exercise06;

public class Customer extends Partner implements GoodsSink{

	/**
	 * @param args
	 */
	
	private String name;
	private String city;
	private String partner = "Kunde: ";
	private int amount = 0;
	
	public Customer (String name, String city){
		
		super(name, city);
		this.name = name;
		this.city = city;
	}
	
	@Override
	public String toString(){
		
		return partner + name + " /Ort: " + city; 

	}
	
	public int getAmount(){
		
		return amount;
		
	}
	
	public void resetAmount(){
		
		amount = 0;
	}

	public void receive(int count) {
		
		amount += count;
		
	}
	
	public void sendInvoice(){
		
		System.out.println(toString()); 
        System.out.println(getAmount() + " Gluehbirnen wurden geliefert");
        resetAmount();
	}

}
