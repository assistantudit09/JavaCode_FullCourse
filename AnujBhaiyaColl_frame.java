package com.company;
import java.util.*;

//class studentcse{
//      int mark;
//      String stu;
//      public studentcse(int mark,String stu){
//          this.mark=mark;
//          this.stu=stu;
//      }
//      public String toString(){
//         return ("mark is: "+ mark+ " student: "+stu);
//      }
//}
public class AnujBhaiyaColl_frame {
    public static void main(String[] args) {

        // normal array:-
       // String [] students=new String[10];  // initial capacity is 10., we only put 10 Strings only.

       // ArrayList:-
       /*
        List <Integer> li= new ArrayList<>();
        // when we allocate a Arraylist then it makes a empty array internally., And after it is fill the compiler expand it  by n+(n/2)+1.
        li.add(19);
        li.add (45);
        li.add(87);
       // System.out.println(li);
        li.add(987); // adding at the end
        System.out.println(li);

//        li.add(2,982); // adding element at a specific position.
//        System.out.println("old array: "+li);
//
//        // new array:-
//        List<Integer> newli=new ArrayList<>();
//        newli.add(7689);
//        newli.add(4356);
//        System.out.println("new array: "+newli);
//
//        li.addAll(newli); // adding new array to existing array.
//        System.out.println("adding new to old array: "+li);
//
//        System.out.println("index 2 value is: "+li.get(2));  // accesing element through index values.

       // li.remove(1); // removing elemnent through index

       // li.remove(Integer.valueOf(45));  // removing element by passing this integer
//        li.clear(); // clearing the list.
//        System.out.println("empty list: "+li);

        // adding and removing elements from ArrayList is = O(n) , because of shifting.

//        li.set(2,9999); // repalceing value through index element.  =O(1) ,because of accessing through index value.
//        System.out.println(li);
//
//        System.out.println(li.contains(99897)); // true if present or False.

        // Traversing all the element one by one :-

//        for(int i=0;i<li.size();i++){ // using for loop.
//            System.out.println(li.get(i));
//        }

//        for(int i: li) // for each loop.
//            System.out.println(i);

        Iterator<Integer> it=li.iterator(); // using iterative metohd.
        while(it.hasNext())
            System.out.println(it.next());
        */

        // STACK :-

       /* Stack<Float> num=new Stack<>();
        num.push(34.6f);
        num.push(56.3f);
        num.push(32.9f);
        num.push(98.32f);
        num.push(23.8f);
        System.out.println(num);
        System.out.println("top value is: "+num.peek()); // giving the peek or top element in a stack.
        num.pop(); // removing top element.
        num.pop(); // removing second top element.
        System.out.println(num);

        */

       // LINKEDLIST IN QUEUE:- (in queue interface linkedlist class is already availible.)

      /*  Queue<Integer> q=new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);
        System.out.println(q);

        System.out.println(q.peek()); // gives next in line(at first in queue)
        System.out.println(q.poll()+ " removed"); // removing next in line element.
        System.out.println(q.poll()+" removed");
        System.out.println(q);


        in above "arraylist" example u can use  "Linkedlist " ,  because all the methods of arraylist and linkedlist are same because of
        both these classes are implementing same Interface "List".

       */

        // PRIORITY QUEUE:-
        /* PRIORITY QUEUE IS A QUEUE WHERE U ARE GIVING PRIORITY TO A PARTICULAR ELEMENT FOR LEAVING THE QUEUE */

       /* PriorityQueue <Integer> pq=new PriorityQueue<>(); // it support   MINIHEAP--> SMALLEST ELEMENT PRIORITY
       //PriorityQueue <Integer> pq=new PriorityQueue<>(Comparator.reverseOrder()); // it supports MAXHEAP--> GREATEST ELEMENT PRIORITY.

        // all the functions are same as Queue.{ offer(),poll(),peek() }
        pq.offer(34);
        pq.offer(43);
        pq.offer(289);
        pq.offer(87);
        pq.offer(39);
        System.out.println("peak element is: "+pq.peek());

        System.out.println(pq);// u can see in output that elements are printed in scattered format. because of " MINHEAP "
                                  minheap stored element in Tree format .

        System.out.println("highest priority of queue: "+pq.poll()); // MINHEAP will poll the highest priority element here (smallest element)
                                                                      //MAXHEAP will poll the highest priority element here (Largest element)
        System.out.println(pq); // printing latest queue.
        */


       //ARRAYDEQUE:-
        /* IT IS A QUEUE WHERE WE CAN "ADD ELEMENT" AND "DELETE ELEMENT" FROM BOTH THE SIDE. */

      /*  Deque<Integer> adq=new ArrayDeque<>();
        adq.offer(10);
        adq.offer(14);
        adq.offer(23);
        adq.offer(78);
        adq.offer(93);
        System.out.println(adq);

        adq.offerFirst(999);  // adding elemnt from first
        adq.offerFirst(777);  //  ||

        adq.offerLast(888);// adding element from last
        adq.offerLast(555);// ||
        System.out.println(adq);

        System.out.println("deleted first element is: "+adq.pollFirst());  // deleting from first
        System.out.println("deleted last element is: "+adq.pollLast());     // deleting from last

        System.out.println(adq);

        System.out.println("peek is: "+adq.peek());
        System.out.println("peek first element is: "+adq.peekFirst());  // first peek
        System.out.println("peek last element is: "+adq.peekLast());    // last peek

       */

        //SET INTERFACE :- ( HASHSET ) :-
        /* IN "SET" U CANNOT USE DUPLICATE VALUE AS LIST. */
        //->> using "HASH SET" , the values are stored in scattered format ,means no sequence. (hashing format) --> O(1), bestcase./ optimized way.
        // ->> using "LINKED HASHSET", the values stored in sequential manner as u give to program.
        //->> using "TREE SET" ,the values stored in sorted format.{binary search appling internally} --> O(logn).

      // Set<Integer> myset=new HashSet<>();  // hashing format    --> best case for all the working (add,rempove,clear....)
       // Set<Integer> myset=new LinkedHashSet<>(); // sequential manner
       // Set<Integer> myset=new TreeSet<>(); // sorted format(ascending). (binary search internally)
       //  Set<Integer> myset=new TreeSet<>(Comparator.reverseOrder()); // sorting in reverse order.(descending)

        /*myset.add(340);
        myset.add(324);
        myset.add(2378);
        myset.add(329);
        myset.add(274);

        System.out.println(myset);

        myset.remove(329); // removing element.

        System.out.println(myset+ "  329 removed");

        System.out.println(myset.contains(1000)); //if contains true or false, boolean value
        System.out.println(myset.isEmpty());  // if empty true or false.

        System.out.println(myset.size());  // size of the set.

        myset.clear();  //clearing the whole set.
        System.out.println(myset +" set is cleared");

         */
        // ->> making a custom class using set:-

     /*  Set<studentcse> myset=new HashSet<>();
       myset.add(new studentcse(89,"kabir singh"));
       myset.add(new studentcse(39,"kabir patel"));
       myset.add(new studentcse(78,"junid khan"));

        System.out.println(myset);

        studentcse s1=new studentcse(45,"kiron pollard");
        studentcse s2=new studentcse(78,"virat kohli");
        System.out.println(s1.equals(s2)); // boolean value (equal or not)

      */


        // MAP interface:-
        /* map contains <key,value> pairs.
           key doesn't repete but value can be repete.
           */
        //Map<String,Integer> mymap=new HashMap<>(); // scattered format print
       /* Map<String,Integer> mymap=new TreeMap<>();  // sorting (binary search) --> O(log n) {sorting occurs in key}
        mymap.put("physics",89);
        mymap.put("chemistry",98);
        mymap.put("math",100);
        m   ymap.put("english",84);

        mymap.put("math",89);// it will update or override.
        mymap.putIfAbsent("math",89);  // using this method , u say that if key is not available then take it. / it doesnt over ride
        System.out.println( mymap.get("math")); // getting the value through key .
        System.out.println(mymap);

        System.out.println(mymap.keySet()); // give set of keys.

        // traversing of Map , we have to use two ways:-
        //1. traversing through keys. { only take <key> } in Set.
//
//           for(String str: mymap.keySet())
//            System.out.println(str+" "+mymap.get(str));


        // 2. traversing through both key and value. :- {take <key,value>} in Set
             //"MAP.ENTRY"--> <k,v> pairs. which are stored in "entrySet()".

        /* Set<Map.Entry<String,Integer>> mp=mymap.entrySet();
        for(Map.Entry<String,Integer> e: mp){
            System.out.println(e.getKey()+" "+e.getValue());
        }*/


       /* System.out.println(mymap.containsKey("computer")); // key cheaking
        System.out.println(mymap.containsValue(84)); // value cheaking

        System.out.println(mymap.isEmpty()); // empty or not.
        mymap.remove("english"); // removing values through key.

        System.out.println(mymap);
        */


        //ARRAY CLASSES AND COLLECTION CLASSES:-

        //1.array class:-
          /* it is basically manupulating on "simple array"  not manupulating on arraylist  */

        //binary search:-
       /* int arr[]= {2,4,5,7,8,9,45,78};
        int in=Arrays.binarySearch(arr,45); // this function give u index value performing binary search according to values, -->O(logn)
        System.out.println("element 45 found at index: "+in);
      */
      // sorting an array:-
       /* int a[]={34,56,2,4,89};
        Arrays.sort(a); // sorting array {internally appling quick sort)
        for(int i: a)
            System.out.println(i); */

        // we can make a newly array with same values:-
      /*  int arr[]={45,54,32,4,5,6,3,2};
        Arrays.fill(arr,50);  // all elements will replace by 50
        for(int i:arr)
            System.out.println(i);

       */

        //2. COLLECTION CLASS:-

        List<Integer> li=new ArrayList<>();
        li.add(34);
        li.add(789);
        li.add(32);
        li.add(83);
        li.add(723);

        System.out.println(li);
        System.out.println("minimum element: "+Collections.min(li)); // it gives the minimum value.
        System.out.println("maximum element: "+Collections.max(li)); // it gives the maximum value.
        System.out.println(Collections.frequency(li,32));  // it says how many times the element present.
        Collections.sort(li); // sorting / ascending.
        System.out.println("sorting in ascending order: "+li);

        Collections.sort(li,Comparator.reverseOrder());// sorting / reverse(descending)
        System.out.println("sorting on ascending order: "+li);

        // then comparator and comparable -->> from telusko.

    }

}
