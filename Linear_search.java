
public class Linear_search {
	
	 public static void main (String [] args) {
		 
	  int arr[] =  { 4 , 5 , 7 , 2 } ; 
	  
	  int val = 5 ;
	    
	  Linear_search e = new Linear_search() ;
	
	  
	  System.out.println( e.searchLinear(arr, val)); 
	  
	
	 }
	 
	 
    public  int searchLinear (int array[] , int val ) { 
    	 
     for (int i = 0 ;  i < array.length ; i++) {
    	 if(val == array[i])
    		 return i ;
     }
     return -1 ;
    }
	 
	

}
