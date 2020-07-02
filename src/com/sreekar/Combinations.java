package com.sreekar;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Combinations {

	public static void main(String[] args) {

		String[] outRes = getCombinations("abc");
		List<String> retur = new ArrayList<>();
		for (int i = 0; i < outRes.length; i++) {
			retur.add(outRes[i]);
		}
		retur.sort(Comparator.naturalOrder());
		System.out.println(retur);

	}

	public static String[] getCombinations(final String input) {
		final List<String> combinations = new ArrayList<String>();
		getCombinations(input.toCharArray(), combinations, 0, "");
		return combinations.toArray(new String[0]);
	}

	private static void getCombinations(final char[] input, final List<String> combinations, final int index,
			final String combination) {
		if (index == input.length) {
			if (combination.isEmpty()) {
				combinations.add("\"\"");
			} else {
				combinations.add(combination);
			}

			return;
		}
		getCombinations(input, combinations, index + 1, combination + String.valueOf(input[index]));
		getCombinations(input, combinations, index + 1, combination);
	}

}