package com.sreekar;

public class BinaryTree {

	public static int getNodeHeight(TestNode root, TestNode x, int height) {
		if (root == null)
			return 0;
		if (root == x)
			return height;

		int level = getNodeHeight(root.left, x, height + 1);
		if (level != 0)
			return level;

		return getNodeHeight(root.right, x, height + 1);
	}

}
