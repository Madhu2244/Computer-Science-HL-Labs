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
  
  /**
   * Constructs a linked list with a node containing a product and no pointer
   * @param data the product
   */
  public ProductNode(Product data)
  {
    this.data = data;
    this.next = null;
  }
  
  /**
   * Constructs a linked list with a node containing a product pointing to another node
   * @param data the ProductNode
   * @param next the node that the linked list is pointing to.
   */
  public ProductNode(Product data, ProductNode next)
  {
    this.data = data;
    this.next = next;
  }
  
  
  //Accessors - one for each instance field above
  /**
   * Returns the data in the node (the product) 
   * @return the product
   */
  public Product getData()
  {
    return data;
  }
  
  /**
   * Returns the next node
   * @return the next node
   */
  public ProductNode getNext()
  {
    return next;
  }

  
  //Mutators -- one for each instance field above. 
  /**
   * Sets the product in the current node to a new one
   * @param data the new Product
   */
  public void setData(Product data)
  {
    this.data = data;
  }
  
  /**
   * Sets the next node to a new node
   * @param next the new node
   */
  public void setNext(ProductNode next)
  {
    this.next = next;
  }

  
  
}
