package com.example.pattern.结构型模式.组合模式;

/**
 * 使用场景：将多个对象组合在一起进行操作，常用与表示树形结构中，如二叉树，数等
 *      部分和整体模式
 * @author liwen
 */
public class Tree {
    TreeNode root = null;

    public Tree(String name) {
        root = new TreeNode(name);
    }

    public static void main(String[] args) {
        Tree tree = new Tree("A");
        TreeNode nodeB = new TreeNode("B");
        TreeNode nodeC = new TreeNode("C");

        nodeB.add(nodeC);
        tree.root.add(nodeB);
        System.out.println("build the tree finished");
    }
}
