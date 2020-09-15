package com.hiendn.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}

	public static List<Integer> findCommonElement(int[] a, int[] b) {
		ArrayList<Integer> common = new ArrayList<Integer>();
		if(a == null || b == null || a.length == 0 || a.length == 0) return common;
		int i = 0;
		int j = 0;
		Arrays.sort(a);
		Arrays.sort(b);
		while (true) {
			if (a[i] == b[j] && !common.contains(a[i])) {
				common.add(a[i]);
			}
			if (i == a.length - 1 || j == b.length - 1)
				break;
			if (a[i + 1] < b[j + 1]) {
				i++;
			} else {
				j++;
			}
		}
		return common;
	}
}
