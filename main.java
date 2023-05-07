public class main {
    public static void main(String[] args) {
        List list = new List();
        list.addLast("A");
        list.addLast(1);
        list.addFirst("a");
        list.addFirst(4);
        list.addLast("last");

        for (Object object : list) {
            System.out.println(object);
        }
        
    }
}
