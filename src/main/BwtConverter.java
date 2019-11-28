package main;

import java.util.Arrays;
import java.util.Comparator;

public class BwtConverter {
	public Bwt getLSequence(String kmer) {
		StringBuilder sb = new StringBuilder(kmer + "$");
		String[] arr = new String[sb.length()];
		for(int i = 0; i < arr.length; i++) {
			char head = sb.charAt(0);
			sb = sb.delete(0, 1);
			arr[i] = sb.append(head).toString();
		}
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});
		StringBuilder F = new StringBuilder();
		StringBuilder L = new StringBuilder();
		for(String s : arr) {
			L.append(s.charAt(s.length() - 1));
			F.append(s.charAt(0));
		}
		return new Bwt(F.toString(), L.toString());
	}
}
