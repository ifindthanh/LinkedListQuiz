package vn.com.ndthanh;

public class Node {
    private int value;
    private Node nextElement;
    
    public Node() {
        this.value = 0;
        this.nextElement = null;
    }
    
    public Node(int value, Node nextElement) {
        this.value = value;
        this.nextElement = nextElement;
    }

    public int getValue() {
        return value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public Node getNextElement() {
        return nextElement;
    }
    
    public void setNextElement(Node nextElement) {
        this.nextElement = nextElement;
    }
    
    
}
