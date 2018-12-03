package _02_More_Algorithms;

import java.util.List;

import _00_Sorting_Algorithms._00_SortedArrayChecker;

public class Algorithms {
	
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if (eggs.get(i) == "cracked") {
				return i;
			}
		}
		
		return -1;
	}
	
	public static int countPearls(List<Boolean> oysters) {
		int pearlNum = 0;
		
		for (Boolean oyster : oysters) {
			if (oyster) {
				pearlNum++;
			}
		}
		
		return pearlNum;
	}
	
	public static double findTallest(List<Double> peeps) {
		double max = Double.NEGATIVE_INFINITY;
		
		for (Double peep : peeps) {
			if (peep > max) {
				max = peep;
			}
		}
		
		return max;
	}
	
	public static String findLongestWord(List<String> words) {
		int max = 0;
		String longest = "";
		
		for (String word : words) {
			if (word.length() > max) {
				max = word.length();
				longest = word;
			}
		}
		
		return longest;
	}
	
	public static boolean containsSOS(List<String> messages) {
		for (String message : messages) {
			if  (message.contains("... --- ...")) {
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean isDoubleListSortedAscending(List<Double> list) {
		for (int i = 0; i < list.size(); i++) {
			if (i > 0 && list.get(i) < list.get(i-1)) {
				return false;
			}
		}
		return true;
	}
	
	public static List<Double> sortScores(List<Double> scores) {
		while (!isDoubleListSortedAscending(scores)) {
			for (int i = 0; i < scores.size(); i++) {
				if (i > 0 && scores.get(i) < scores.get(i-1)) {
					double first = scores.get(i-1);
					scores.set(i-1, scores.get(i));
					scores.set(i, first);
				}
			}
		}
		
		return scores;
	}
	
	public static boolean isStringListSortedByLengthAscending(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			if (i > 0 && list.get(i).length() < list.get(i-1).length()) {
				return false;
			}
		}
		return true;
	}
	
	public static List<String> sortDNA(List<String> sequences) {
		while (!isStringListSortedByLengthAscending(sequences)) {
			for (int i = 0; i < sequences.size(); i++) {
				if (i > 0 && sequences.get(i).length() < sequences.get(i-1).length()) {
					String first = sequences.get(i-1);
					sequences.set(i-1, sequences.get(i));
					sequences.set(i, first);
				}
			}
		}
		
		return sequences;
	}
	
	public static boolean isStringListAlphabetizedAscending(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			if (i > 0 && list.get(i).compareTo(list.get(i-1)) > 0) {
				return false;
			}
		}
		return true;
	}
	
	public static List<String> sortWords(List<String> words) {
		while (!isStringListSortedByLengthAscending(words)) {
			for (int i = 0; i < words.size(); i++) {
				if (i > 0 && words.get(i).compareTo(words.get(i-1)) > 0) {
					String first = words.get(i-1);
					words.set(i-1, words.get(i));
					words.set(i, first);
				}
			}
		}
		
		return words;
	}
}
