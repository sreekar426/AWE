package com.sreekar.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

import com.sreekar.SortingNumbers;

public class SortingNumbersTest {

	@Test
	public void sortNumbers() {

		int[] arr = new int[100];
		for (int i = 0; i < 100; i++) {
			arr[i] = i + 1;
		}

		Random generator = new Random();
		for (int i = 0; i < arr.length; ++i) {
			int j = generator.nextInt(arr.length - i);
			int tmp = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = arr[j];
			arr[j] = tmp;
		}

		int[] arrResult = new int[100];
		for (int i = 0; i < 100; i++) {
			arrResult[i] = i + 1;
		}

		assertEquals(Arrays.toString(arrResult), Arrays.toString(SortingNumbers.sortit(arr, arr.length)));
	}

}
