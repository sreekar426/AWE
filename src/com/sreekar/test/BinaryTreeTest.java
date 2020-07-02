package com.sreekar.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sreekar.BinaryTree;
import com.sreekar.TestNode;

public class BinaryTreeTest {

	@Test

	public void testFindMaxHeight() {

		TestNode root = new TestNode(5);
		root.left = new TestNode(10);
		root.right = new TestNode(15);
		root.left.left = new TestNode(20);
		TestNode x = new TestNode(25);
		root.left.right = x;
		root.left.right.left = new TestNode(35);
		assertEquals(3, BinaryTree.getNodeHeight(root, x, 1));
		assertEquals(2, BinaryTree.getNodeHeight(root, x, 0));
		assertEquals(1, BinaryTree.getNodeHeight(root, x, -1));
	}

}
