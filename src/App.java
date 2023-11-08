import LList.LList;
import Stack.*;
import Queue.*;
import BinaryTree.BinaryTree;



public class App {
    /**
     * Test your various data structures
     */
    public void start() {
        LList l = new LList();
        l.add(2);
        l.add(6);
        l.add(7);
        l.add(11);
        l.insert(2,5);
        l.remove(3);
        System.out.println(l);
    }
    
    
    public static void main(String[] args) throws Exception {
        new App().start();
    }
}
