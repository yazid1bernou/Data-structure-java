
public class Linear_search {
	
	 public static void main (String [] args) {
		 
	  int arr[] =  { 4 , 5 , 7 , 2 } ; 
	  
	  int val = 5 ;
	    
	
	  
	  System.out.println( searchLinear(arr, val)); 
	  
	
	 }
	 
	 
    public static int searchLinear (int array[] , int val ) {  
    	 
     for (int i = 0 ;  i < array.length ; i++) {
    	 if(val == array[i])
    		 return i ;
     }
     return -1 ;
    }
	 
	

}
