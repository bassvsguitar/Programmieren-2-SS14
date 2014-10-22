package exercise09;

import java.io.*;


public class EchoFinder implements EchoFinderInterface {

	 public String getPair(BufferedReader bufRead) 
	    { 
	        boolean eof    = false; 
	        String line    = null; 
	        String lineOld = null; 
	          
	  
	            while(eof == false) 
	            {        
	                try
	                { 
	                    line = bufRead.readLine(); 
	                      
	                    if(line == null) 
	                        throw new IOException(); 
	                } 
	                  
	                catch(IOException e) 
	                { 
	                    eof = true; 
	                    return null; 
	                } 
	                  
	                if(line.equals(lineOld)) 
	                { 
	                    eof = true; 
	                } 
	                  
	                else
	                { 
	                    lineOld = line; 
	                } 
	            } 
	          
	            return lineOld; 
	    } 

	@Override
	public BufferedReader getSystemInAsBufferedReader() {
		
		BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in)); 
		return bufRead;
	}
	
	public static void main(String[] args) {
		
		EchoFinder echo= new EchoFinder(); 
        String output; 
          
          
        output = echo.getPair(echo.getSystemInAsBufferedReader()); 
        System.out.println(output);

	}

}
