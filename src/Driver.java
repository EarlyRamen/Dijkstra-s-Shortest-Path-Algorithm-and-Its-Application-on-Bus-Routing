import java.util.*;
public class Driver{
  public static void main(String argvs[])  
{  
  
int totalNodes = 28;  
int s = 1;  
  
// representation of the connected edges   
// using the adjacency list   
// by declaration of the List class object  
  
// Declaring and object of the type List<Node>  
List<List<Node> > adjacent = new ArrayList<List<Node> >();  
  
// Initialize list for every node  
for (int i = 0; i < totalNodes; i++) {  
    List<Node> itm = new ArrayList<Node>();  
    adjacent.add(itm);  
}  
  
// adding the edges  
// The statement adjacent.get(0).add(new Node(1, 3)); means  
// to travel from node 0 to 1, one has to cover 3 units of distance  
// it does not mean one has to travel from 1 to 0  
// To travel from 1 to 0, we have to add the statement   
// adjacent.get(1).add(new Node(0, 3));  
// Note that the distance is the same i.e., 3 units in both the cases.  
// Similarly, we have added other edges too.  
//adjacent.get(0).add(new Node(1, 0));
adjacent.get(1).add(new Node(2, 48));  
adjacent.get(2).add(new Node(3, 109));  
adjacent.get(3).add(new Node(4, 154));  
adjacent.get(4).add(new Node(5, 245));  
adjacent.get(4).add(new Node(6, 173));  
adjacent.get(5).add(new Node(8, 100));  
adjacent.get(5).add(new Node(9, 57));  
adjacent.get(6).add(new Node(7, 200));  
adjacent.get(7).add(new Node(8, 415));  
adjacent.get(8).add(new Node(12, 80));  
adjacent.get(8).add(new Node(5, 100));  
adjacent.get(9).add(new Node(10, 420));  
adjacent.get(9).add(new Node(11, 142));  
adjacent.get(10).add(new Node(13, 90));  
adjacent.get(11).add(new Node(10, 400));  
adjacent.get(12).add(new Node(27, 444));  
adjacent.get(12).add(new Node(13, 496));  
adjacent.get(13).add(new Node(14, 101));  
adjacent.get(14).add(new Node(15, 764));  
adjacent.get(14).add(new Node(17, 322));  
adjacent.get(15).add(new Node(16, 785)); 
adjacent.get(15).add(new Node(19, 336)); 
adjacent.get(15).add(new Node(20, 450));  
adjacent.get(16).add(new Node(26, 147));  
adjacent.get(17).add(new Node(18, 491));  
adjacent.get(18).add(new Node(19, 315));  
adjacent.get(18).add(new Node(21, 782));  
adjacent.get(19).add(new Node(20, 221));  
adjacent.get(20).add(new Node(21, 403));  
adjacent.get(21).add(new Node(22, 248));  
adjacent.get(22).add(new Node(23, 137));  
adjacent.get(22).add(new Node(24, 373));  
adjacent.get(23).add(new Node(25, 336));  
adjacent.get(24).add(new Node(25, 264));  
adjacent.get(25).add(new Node(26, 519));  
adjacent.get(27).add(new Node(14, 668));  
  
// creating an object of the class DijkstraExample1  
Dijkstra obj = new Dijkstra(totalNodes);  
obj.dijkstra(adjacent, s);  
  
// Printing the shortest path to all the nodes  
// from the source node  
System.out.println("The shortest path from the node :");  
  
for (int j = 0; j < obj.distance.length; j++)  
{  
    System.out.println(s + " to " + j + " is " + obj.distance[j]);  
}  
}  
}  