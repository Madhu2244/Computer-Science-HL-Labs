//author Madhu Sharma
/**
 * ProducNode class creates a Linked List of Products
 */
public class ProductNode
{
  //INSTANCE FIELDS
  private Product data;
  private ProductNode next;
  
  //CONSTRUCTOR: Make a default and a two parameter overloaded CONSTRUCTOR
  /**
   * Constructs a linked list with a node containing a default product and no pointer
   */
  public ProductNode()
  {
    this.data = new Product();
    this.next = null;
  }

  public ProductNode(Product data)
  {
    this.data = data;
    this.next = null;
  }
  
  public ProductNode(Product data, ProductNode next)
  {
    this.data = data;
    this.next = next;
  }
  
  
  //Accessors - one for each instance field above
  public Product getData()
  {
    return data;
  }
  
  public ProductNode getNext()
  {
    return next;
  }

  
  //Mutators -- one for each instance field above. 
  public void setData(Product Data)
  {
    data = Data;
  }
  public void setNext(ProductNode Next)
  {
    next = Next;
  }

  
  
}
