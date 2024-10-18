import java.util.Comparator;
class Node implements Comparator<Node>{  
// Variables of the Node class  
  public int n;  
  public int cost;  
  
// Constructor 1  
  public Node(){
  }  
  
// Constructor 2  
  public Node(int n, int cost){  
    this.n = n;  
    this.cost = cost;  
  }  
  
@Override   
public int compare(Node n1, Node n2){  
  if (n1.cost < n2.cost){  
    return -1;  
  }  
  if (n1.cost > n2.cost){  
    return 1;  
  }  
  return 0;  
}  
}  