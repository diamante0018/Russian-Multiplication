package main;

import java.util.ArrayList;
/**
 * This class multiplies two numbers using the Russian multiplication method.
 * @author Edoardo
 *
 */
public class Mol {
	private ArrayList<Long> n1,n2;
	private Integer i;
	
	/**
	 * Class Mol constructor 
	 */
	public Mol() {
		n1 = new ArrayList<Long>();
		n2 = new ArrayList<Long>();
		i = 0;
	}
	
	/**
	 * <p> This method computes a List containing all the results from the division/multiplication step </p>
	 * @param Long a
	 * @param Long b
	 * @return void
	 */
	public void computeList(Long a,Long b) {
		n1.add(i, a);	
		n2.add(i, b);
		i += 1;
		
		while (a != 1) {
			a = a / 2;
			b = b * 2;
			
			n1.add(i, a);
			n2.add(i, b);
			i += 1;
		}
	}
	
	/**
	 * <p> This method returns the result from the sum step (pairs that have an even numbers on the 'left' column are not counted) </p>
	 * @return Long result
	 */
	public Long actualMol() {
		Long result = 0l;
		
		for (int j=0;j<i;j++) {
			if (n1.get(j) % 2 != 0) {
				result = result + n2.get(j);
			}
		}
		return result;	
	}

	public static void main(String[] args) {
		Mol calc = new Mol();
		calc.computeList(13l, 20l);
		System.out.println("Result: " + calc.actualMol());
	}

}
