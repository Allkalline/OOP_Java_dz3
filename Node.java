public class Node<Object> {
    Object data;
   Node<Object> next;

   public Node(Object data) {
       this.data = data;
   }

   public Object getData() {
       return data;
   }

    public void setData(Object data) {
        this.data = data;
    }


}