package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		assertEquals(_00_LinearSearch.linearSearch(new String[] {"horse", "neigh", "ragghh", "duck", "humanity"}, "duck"), 3);
		assertEquals(_00_LinearSearch.linearSearch(new String[] {"horse", "neigh", "ragghh", "duck", "humanity"}, "ragghh"), 2);
		assertEquals(_00_LinearSearch.linearSearch(new String[] {"7", "u", "o", "p", "t", "&", "%"}, "&"), 5);
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		assertEquals(_01_BinarySearch.binarySearch(new int[] {1, 2, 3, 4, 5, 6, 7, 8}, 0, 7, 2), 1);
		assertEquals(_01_BinarySearch.binarySearch(new int[] {5, 6, 7, 10, 17}, 0, 4, 7), 2);
		assertEquals(_01_BinarySearch.binarySearch(new int[] {2, 5, 8, 11, 14, 17}, 0, 5, 14), 4);
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		assertEquals(_02_InterpolationSearch.interpolationSearch(new int[] {1, 2, 3, 4, 5, 6, 7, 8}, 2), 1);
		assertEquals(_02_InterpolationSearch.interpolationSearch(new int[] {5, 6, 7, 8, 9}, 7), 2);
		assertEquals(_02_InterpolationSearch.interpolationSearch(new int[] {2, 5, 8, 11, 14, 17}, 14), 4);
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		assertEquals(_03_ExponentialSearch.exponentialSearch(new int[] {1, 2, 3, 4, 5, 6, 7, 8}, 2), 1);
		assertEquals(_03_ExponentialSearch.exponentialSearch(new int[] {5, 6, 7, 10, 17}, 7), 2);
		assertEquals(_03_ExponentialSearch.exponentialSearch(new int[] {2, 5, 8, 11, 14, 17}, 14), 4);
	}
}
