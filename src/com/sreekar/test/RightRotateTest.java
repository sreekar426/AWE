package com.sreekar.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import com.sreekar.RotateRight;

public class RightRotateTest {

	@Test

	public void testFindMax() {
		assertEquals(Arrays.toString(new int[] { 7, 8, 9, 1, 2 }),
				Arrays.toString(RotateRight.getRightRotate(3, new int[] { 1, 2, 7, 8, 9 })));
		assertEquals(Arrays.toString(new int[] {}),
				Arrays.toString(RotateRight.getRightRotate(-1, new int[] { 1, 2, 7, 8, 9 })));
		assertEquals(Arrays.toString(new int[] { 8, 9, 1, 2, 7 }),
				Arrays.toString(RotateRight.getRightRotate(2, new int[] { 1, 2, 7, 8, 9 })));
		assertEquals(Arrays.toString(new int[] { 1, 2, 7, 8, 9 }),
				Arrays.toString(RotateRight.getRightRotate(0, new int[] { 1, 2, 7, 8, 9 })));
	}

}
