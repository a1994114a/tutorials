
public class LList implements Comparable<LList>{
 protected Node head;
 protected Node tail;
 protected int  size;
 
 /* constructors */
 public LList(){
  head = tail = null;
  size = 0;
 }
 public LList(Node n){
  head = tail = n;
  size = 1;
 }

 /* simple getters */
 public int getSize(){ 
  return size; 
 }
 
 public String get(int position){
  // returns data of element at index position
  // returns null otherwise
  if( position < 0 || position > size -1 || head == null){
   return null;
  }
  int  count = 0;
  Node current = head;
  while(count < position){
   current = current.getNext();
   count += 1;
  }
  return current.getData();
 }
 
 
 /* setter */
 public boolean set(int position, String d){
  // set data of element at given position to d
  // returns true if successful and false otherwise
 if( position < 0 || position > size -1 || head == null){
   return false;
 }else{
     int  count = -1;
  Node current = head;
  while(count < position-1){
   current = current.getNext();
   count += 1;
  }
  current.next.data=d;
     return true;
   }
 }
 public boolean swap(int p1, int p2){
   if( p2< 0 || p2 > size -1 ||p1< 0 || p1 > size -1 || head == null||head.next==null){
   return false;
 }else{
    int  count = -1;
  Node current1 = head;
  while(count < p1-1){
   current1 = current1.getNext();
   count += 1;
  }
  count=-1;
  Node current2 = head;
   while(count < p2-1){
   current2 = current2.getNext();
   count += 1;
  }
   Node f= current1.next;
   current1.next=current2.next;
   current2.next=f;
   return true;
 }
 }
 /* add elements to the list */
 public LList addBack(String d){
  // add to back of list
  Node n = new Node(d);
  if( size == 0 ){
   head = tail = n;
  }else{
   tail.setNext(n);
   tail = n;
//   System.out.println(this.tail.data);
  }
  size += 1;
//  System.out.println(this.toString());
//  System.out.println(this.tail.data);
  return this;
 }
 
 public LList addFront(String d){
  // add to front of list
  Node n = new Node(d, head);
  head = n;
  if(size == 0){ tail = n; }
  size += 1;
  return this;
 }
 
 public LList add(int position, String d){
  // add a new node with data d at given position
  // return null if method fails
  if( position < 0 || position > size){
   return null;
  }
  if( position == 0){
   return addFront(d);
  }else if( position == size ){
   return addBack(d);
  }
  // find node at index position-1
  Node prev = head;
  int count = 0;
  while( count < position-1 ){
   count += 1;
   prev = prev.getNext();
  } // prev will point to node before 
  Node n = new Node(d, prev.getNext() );
  prev.setNext(n);
  size += 1;
  return this;
 }
 
 /* remove elements from the list */
 public String removeFront(){
  // remove x_0 (return data of x_0)
   if(size>=1){
     Node f= head;
     head=head.next;
     size-=1;
     int count=0;
     Node current= head;
     while(count<size-1){
       current=current.next;
       count++;
     }
     tail=current;     
     return f.data;
   }else{
  return null;
   }
 }
 
 public String remove(int position){
  // remove x_position (return data of x_position)
   if( position < 0 || position > size -1 || head == null){
    return null;
 }else{
 int  count = -1;
  Node current = head;
  while(count < position-1){
   current = current.getNext();
   count += 1;
  }
  Node f= current.next;
  try{current.next=current.next.next;}catch(NullPointerException e){current.next=null;}
  size-=1;
  count=0;
      current= head;
     while(count<size-1){
       current=current.next;
       count++;
     }
     tail=current;     
  try{return f.data;}catch(NullPointerException e){return null;}
 }
 }
 /* find element in list */
 public int find(String d){
  // return the first index k such that x_k == d
  // return -1 if d is not in the list
   if(head==null){return -1;}else{
   int  count = 0;
  Node current = head;
  if(current.data.equals(d)){return count;}
  while(count < size){
   current = current.getNext();
        count += 1;
        if(current.data.equals(d)){return count;}
  }
  return -1;
 }
 }
 public static boolean same(LList a, LList b){
   if(a.toString().equals(b.toString())){return true;}else{return false;}
 
 }
 public static boolean same(LList a, java.util.ArrayList<String> b){
   try{
     for(int i=0;i<a.size;i++){if(!a.get(i).equals(b.get(i))){return false;}}
   }catch(ArrayIndexOutOfBoundsException e){return false;}
   return true;
 }
 @Override
 public int compareTo(LList o){
  return size - o.size;
 }

 public static void main(String[] args){
   LList a = new LList(new Node("aa",new Node("bb",new Node("cc"))));

   LList b = new LList(new Node("aa",new Node("bb",new Node("cc"))));
      a.size=b.size=3;
   System.out.println(a.toString());
   System.out.println(b.toString());
   System.out.println(same(a,b));
 }
 
 @Override
 public String toString(){
  if( size == 0 || head == null){
   return null;
  }
  String out = "[";
  Node current = head;
  for(int i=0; i<size-1; i=i+1){
   out += current.getData() + "]->[";
   current = current.getNext();
  }
  return out+current.getData() +"]";
 }
}