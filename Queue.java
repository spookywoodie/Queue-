/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistsample;

/**
 *
 * @author Metch
 */
public class Queue extends NodeListArray {
    
     Queue() {
        super();

    }

    public void Enqueue(Node n) {
        add(getSize(), n);
    }

    public Node Dequeue() {
        Node n = remove(0);
        return n;

    }
    public void MakeEmpty() {
        size = 0;
    }

    public boolean isEmpty() {
          return size == 0;
    }    
}
