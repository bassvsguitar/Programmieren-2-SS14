package exercise07;

public class ArrayQueue<T> implements Queue<T>{

	private int size;
	private T[] place_ref;
	private int checkFront = 0;
	private int checkEnd   = 0;
	
	@SuppressWarnings("unchecked")
	public ArrayQueue(int size){
	
		place_ref = (T[]) new Object[size];
		this.size = size;
		
		for(int i=0; i < place_ref.length; i++) 
        { 
            place_ref[i] = null; 
        } 
	}

	@Override
	public void enqueue(T element) throws IllegalAccessException {

		 if(nextEmpty()== true) {
			 
			 place_ref[checkFront] = (T)element; 
		
	              if(checkFront < size - 1){ 
	                
	            	checkFront++;
	              }
	              else{
	            	  
	                checkFront = 0;
	              }
	        }   
	        else{
	        	
	        	throw new IllegalAccessException(); 
	        }
	}

	@Override
	public T dequeue() {
		
		T dataContainer = place_ref[checkEnd]; 
        place_ref[checkEnd] = null; 
      
        if(checkEnd < size - 1){ 
            
        	checkEnd++;
        }
        else{
        	
        	checkEnd = 0; 
        }
  
        return dataContainer; 

	}

	@Override
	public T front() {
		 
		return place_ref[checkEnd];    
    }       
    
	public boolean nextEmpty(){
		
        if(place_ref[checkFront] == null){
        	
        	return true; 
        }
        else{
            
        	return false;
        }
    } 

	@Override
	public boolean empty() {
		 
		boolean empty=true; 
        for(int j =0 ; j < place_ref.length; j++){
        	
        	if(place_ref[j] != null){
        		
        		empty=false; 
        	}
	    } 
	    return empty; 
	      
	}
}
