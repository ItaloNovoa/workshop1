import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio1 {
	 static boolean isAnagram(String a, String b) {	        
	    	a=a.toLowerCase();
			b=b.toLowerCase();
	        if ( a.length()!=b.length() ) {
	            return false;
	        }
	        ArrayList<String> aa = new ArrayList<String>(), bb=new ArrayList<String>();
	        
	        for (int i=0;i<a.length();i++) {
	            aa.add(a.charAt(i)+"");                
	            bb.add(b.charAt(i)+""); 
	                        
	        }
	        
	        Collections.sort(aa);
	        Collections.sort(bb);
	        
	        if(aa.equals(bb)) {
	            return true;
	        }
	        return false;
	    }

	    public static void main(String[] args) {	    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
	
}
