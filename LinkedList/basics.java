import java.util.*;

class basics{
    public static void main(String[] args) {
        
        LinkedList<Integer> ll = new LinkedList<>();
        for(int i=0;i<=10;i++){
            ll.add(i+5);
        }
        System.out.println(ll);
        ll.addFirst(4);
        System.out.println(ll);
        ll.addLast(16);
        ll.addLast(4);

        System.out.println(ll);
        System.out.println("Get element from index = " + ll.get(4));
        System.out.println("Get First Element = " + ll.getFirst());
        System.out.println("Get Last Element = " + ll.getLast());
        System.out.println("Get index of = " + ll.indexOf(4));      //* Gets First Index of 4 */
        System.out.println("Get Last Index of = " + ll.lastIndexOf(4)); //* Gets Last Index of 4 */
        
        System.out.println("Remove first element = " + ll.remove());
        System.out.println(ll);
        System.out.println("Remove first element = " + ll.removeFirst());
        System.out.println(ll);
        System.out.println("Remove last element = " + ll.removeLast());
        System.out.println(ll);
        System.out.println("Remove particular element = " + ll.remove((Object)7)); //*To remove 7 from linkedList */
        System.out.println(ll);
        System.out.println("Remove particular element at index = " + ll.remove(7)); //*To remove element at index 7 from linkedList */
        System.out.println(ll);

        System.out.println("printing via iterator");
        Iterator<Integer> itr = ll.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + "->");
        }

        System.out.println("Printing revesre order of linkedList");
        itr = ll.descendingIterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + "->");
        }
    }
}