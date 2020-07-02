package com.sreekar;

public class RotateRight {

	/**
	 * Gets the right rotate array .
	 *
	 * @param steps    the steps
	 * @param elements the elements
	 * @return the right rotate
	 */
	public static int[] getRightRotate(int steps, int[] elements) {

		if (steps >= 0) {

			for (int i = 0; i < steps; i++) {
				int j, last;

				last = elements[elements.length - 1];

				for (j = elements.length - 1; j > 0; j--) {

					elements[j] = elements[j - 1];
				}

				elements[0] = last;
			}
		} else {
			elements = new int[0];
		}
		return elements;

	}

}
