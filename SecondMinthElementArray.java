package amazon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SecondMinthElementArray {

	public SecondMinthElementArray() {
		// TODO Auto-generated constructor stub
	}

	public  static int findSecondMinth(List<Integer> secMinthArray) {
		Set<Integer> set = new HashSet<>();
	    set.addAll(secMinthArray);
		Object[]  l = set.toArray();
		return (Integer)l[1];
	    
	}
	
	
	public static void main(String[] args) {
	        List<Integer> secMinthArray =  new ArrayList<>();
	        secMinthArray.add(1);
	        secMinthArray.add(3);
	        secMinthArray.add(9000);
	        secMinthArray.add(1000);
	        secMinthArray.add(10);
	        secMinthArray.add(1);
	       System.out.println(findSecondMinth(secMinthArray));       
	}

}
