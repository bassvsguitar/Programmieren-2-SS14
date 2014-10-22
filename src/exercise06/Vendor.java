package exercise06;

public class Vendor extends Partner implements GoodsSource{

	/**
	 * @param args
	 */
	
	private String name;
	private String city;
	private String partner = "Lieferant: ";
	
	public Vendor (String name, String city){
		
		super(name, city);
		this.name = name;
		this.city = city;
	}
	
	@Override
	public String toString(){
		
		return partner + name + " /Ort: " + city; 

	}

	@Override
	public boolean deliver(int count) {
	
		return true;
	}

}
