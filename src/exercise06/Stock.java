package exercise06;

public class Stock implements GoodsSource, GoodsSink{

	/**
	 * @param args
	 */
	
	int amount = 0;
	boolean alert;
	String inventoryQuery;

	@Override
	public boolean deliver(int count) {
		
		if(count > amount){
			
			return alert = false;
		}
		else{
			
			amount = amount - count;
			return alert = true;
			
		}
		
	}

	@Override
	public void receive(int count) {


		amount += count;
		
	}
	
	@Override
	public String toString(){
		
		if(alert = true){
			
			inventoryQuery = "Lagerbestand ausreichend, Lieferung kann durchgefuehrt werden";
		}
		else if(alert = false){
			
			inventoryQuery = "Lagerbestand unzureichend, Lieferung verweigert";
		}
		
		return inventoryQuery;
	}

}
