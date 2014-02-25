package NumbersOrdered;

import java.util.Arrays;
import java.util.*;
/*There is a secret code and a hacker is trying to access the code.
 * There is a software that tells him if there is a perfect match or average match in 
 * the given list of numbers. If the position of the digits match then it would be a perfect match
 * else it would be an average match.
 * eg: Secret Code: 1234
 * Hacker code: 5314
 * the output would be average match, perfect match
 */
public class Numers {
	public static void main(String args[]){
		int[] a={1, 2, 3, 4};
		int[] b={9, 1, 5, 4};
		HashMap h=new HashMap();
		for(int i=0;i<a.length;i++){
			h.put(a[i], true);
			if(h.containsKey(b[i])){
				if(a[i]==b[i]){
					System.out.println("Perfect Match");
				}
				else{
					System.out.println("Average Match");
				}
			}
		}
	}
}

