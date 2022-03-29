package BST.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.rules.Timeout;
import org.junit.runner.Description;

import BST.main.BinarySearchTree;
import BST.main.BinaryTree;
import java.util.*;

public class BinarySearchTreeTests {

    @Test
    public void addTest_t1() {
        BinaryTree bst = new BinarySearchTree();
        assertEquals(0, bst.size());
        bst.add(1);
        assertEquals(1, bst.size());
        assertTrue(bst.contains(1));
        bst.add(2);
        assertEquals(2, bst.size());
        assertTrue(bst.contains(2));
        assertTrue(bst.contains(1));
        bst.add(3);
        bst.add(4);
        bst.add(5);
        assertEquals(5, bst.size());
        for (int i = 1; i <= 5; i++) {
            assertTrue(bst.contains(i));
        }
    }

    @Test
    public void addTest_t2() {
        BinaryTree bst = new BinarySearchTree();
        for (int i = 0; i < 5000; i++) {
            bst.add(i);
        }
        assertEquals(5000, bst.size());
        for (int i = 0; i < 5000; i++) {
            assertTrue(bst.contains(i));
        }
    }

    @Test
    public void getPreorder() {
        BinaryTree bst = getTree();
        bst.traverseTree("preorder");
    }

    @Test
    public void getInorder() {
        BinaryTree bst = getTree();
        bst.traverseTree("inorder");
    }

    @Test
    public void getPostorder() {
        BinaryTree bst = getTree();
        bst.traverseTree("postorder");
    }

    private BinaryTree getTree() {
        BinaryTree bst = new BinarySearchTree();
        bst.add(6);
        bst.add(2);
        bst.add(9);
        bst.add(1);
        bst.add(7);
        bst.add(4);
        bst.add(3);
        return bst;
    }
}
