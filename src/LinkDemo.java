class Link{
    private class Node{
        private Object data;
        private Node next;
        public Node(Object data){
            this.data = data;
        }
        public void addNode(Node newNode){
            if (this.next == null){
                this.next = newNode;
            }else{
                this.next.addNode(newNode);
            }
        }
        public boolean containsNode(Object data){
            if (data.equals(this.data)){
                return true;
            }else{
                if (this.next !=null){
                    return this.next.containsNode(data);
                }else{
                    return false;
                }
            }
        }
        public Object getNode(int index){
            if (Link.this.foot++ == index){
                return this.data;
            }else{
                return this.next.getNode(index);
            }
        }
        public void setNode(int index,Object data){
            if (Link.this.foot == index){
                this.data = data;
            }else{
                this.next.setNode(index,data);
            }
        }
        public void removeNode(Node previous,Object data){
            if (data.equals(this.data)){
                previous.next = this.next;
            }else{
                this.next.removeNode(this,data);
            }
        }
        public void toArrayNode(){
            Link.this.retArray[Link.this.foot++] = this.data;
            if (this.next != null){
                this.next.toArrayNode();
            }
        }
    }
    private Node root;
    private int count;
    private int foot;
    private Object [] retArray;
    public void add(Object data){
        if (data == null){
            return;
        }
        Node newNode = new Node(data);
        if (this.root == null){
            this.root = newNode;
        }else{
            this.root.addNode(newNode);
        }
        this.count++;
    }
    public int size(){
        return this.count;
    }
    public boolean isEmpty(){
        return this.count == 0;
    }
    public boolean contains(Object data){
        if (data == null || this.root == null){
            return false;
        }else{
            return this.root.containsNode(data);
        }
    }
    public Object get(int index){
        if (index > this.count){
            return null;
        }
        this.foot = 0;
        return this.root.getNode(index);
    }
    public void set(int index,Object data){
        if (index > this.count){
            return;
        }
        this.foot = 0;
        this.root.setNode(index,data);
    }
    public void remove(Object data){
        if (this.contains(data)){
            if (data.equals(this.root.data)){
                this.root = this.root.next;
            }else{
                this.root.next.removeNode(this.root,data);
            }
            this.count--;
        }
    }
}
public class LinkDemo {
    public static void main(String[] args) {

    }
}
