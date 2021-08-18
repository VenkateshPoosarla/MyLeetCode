class LRUCache {

    Node head=new Node();
    Node tail=new Node();
    
    class Node{
        Node prev;
        Node next;
        int value;
        int key;
    }
    // always add at the head
    void add(Node node){
        Node secondNode=head.next;
        head.next=node;
        node.next=secondNode;
        node.prev=head;
        secondNode.prev=node;
    }
    void remove(Node node){
        Node prev=node.prev;
        Node next=node.next;
        prev.next=next;
        next.prev=prev;
    }
    Map<Integer,Node> map;
    int capacity;
    public LRUCache(int capacity) {
        if(capacity<0) throw new IllegalStateException("capacity can't be negative");
         
        head.next=tail;
        tail.prev=head;
        this.capacity=capacity;
        map=new HashMap<>();
        
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            remove(node);
            add(node);
            return node.value;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node=map.get(key);
            remove(node);
            add(node);
            node.value=value;
        }else{
            if(map.size()==this.capacity){
                Node node=tail.prev;
                remove(node);
                map.remove(node.key);
            }
            Node newNode=new Node();
            newNode.key=key;
            newNode.value=value;
            add(newNode);
            map.put(key,newNode);
            
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */