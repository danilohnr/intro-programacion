package arreglos.unidimensionales;

import java.util.Arrays;
import static java.lang.Math.*;

public class ArreglosIntro {

	public static void main(String[] args) {
		double [] nums = {round(random()*100), round(random()*100), round(random()*100), round(random()*100), round(random()*100),};
		
		System.out.println(Arrays.toString(nums));
		System.out.println("========================");
		for (double i : nums) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("========================");
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		System.out.println("========================");
		
		//double [][] nums2 = new double[3][];
		//nums2[0] = nums;
		
		double [][] nums2 = {
				nums,
				nums,
				nums
		};
		
		System.out.println(Arrays.toString(nums2));
		System.out.println(Arrays.toString(nums2[0]));
		System.out.println(Arrays.toString(nums2[1]));
		System.out.println(Arrays.toString(nums2[2]));
		
		for (int i = 0; i < nums2.length; i++) {
			for (int j = 0; j < nums2[i].length; j++) {
				System.out.print(nums2[i][j] + " ");				
			}
			
		}
		
	}
}

