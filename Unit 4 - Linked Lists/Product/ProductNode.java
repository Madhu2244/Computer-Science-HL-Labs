//author Madhu Sharma
/**
 * ProductList controls a linked list of ProductNodes
 */
public class ProductList
{
  //INSTNACE VARIABLES
  private ProductNode head;
  
  /**
   * Construct a productList with a null head
   */
  public ProductList()
  {
    this.head = null;
  }
  
  /**
   * Add a product to the front of the list
   * @param product the product
   */
  public void addFirst(Product product)
  {
    ProductNode temp = new ProductNode(product, head);
    if(head==null)
    {
      head = new ProductNode(product, null);
    }
    else
    {
      head = temp;
    }
  }

  /**
   * Add a product to the end of the list
   * @param product the product to add
   */
  public void addLast(Product product)
  {
    if(head==null)
    {
      head = new ProductNode(product, null);
    }
    else
    {
      ProductNode temp = new ProductNode(product, null);
      ProductNode ptr = head;
      while(ptr != null && ptr.getNext() != null)
      {
        ptr = ptr.getNext();
      }
      if(ptr != null)
      {
        ptr.setNext(temp);
      }
    }
  }

  
  /**
   * Finds a string that matches the passed in name
   * @param name the name to search for
   * @return the name of the string if it is found. if not found, returns null
   */
  public String find(String name)
  {
    String temp = null;
    ProductNode ptr = head;
    while(ptr != null)
    {
      if(ptr.getData().getName().equals(name))
      {
        temp = ptr.getData().toString();
        ptr = ptr.getNext();
      }
      else
      {
        ptr = ptr.getNext();
      }
    }
    return temp;
  }
  
  /**
   * Returns the size of the Product list
   * @return the size of the Product list
   */
  public int size()
  {
    int count = 0;
    ProductNode ptr = head;
    while(ptr != null)
    {
      count++;
      ptr = ptr.getNext();
    }
    return count;
  }
  
  /**
   * Returns all the contents of the list
   * @return the contents of the list
   */
  public String toString()
  {
    String toReturn = "";
    ProductNode ptr = head;
    while((ptr != null))
    {
      toReturn += ptr.getData().toString();
      ptr = ptr.getNext();
    }
    return toReturn;
  }
  
  /**
   * Clears the contents of the list
   */
  public void clear()
  {
    head = null;
  }

  /**
   * Gets the first node of the linked list
   * @return the product information
   */
  public Product getFirst()
  {
    Product temp = null;
    if(head != null)
    {
      temp = head.getData();
    }
    if(temp == null)
     throw new IllegalArgumentException("no such element found");
    return temp;
  }
  
  /**
   * Gets the last node of the linked list
   * @return the product information
   */
  public Product getLast()
  {
    ProductNode ptr = head;
    Product temp = null;
    while(ptr != null && ptr.getNext() != null)
        ptr = ptr.getNext();
    if(ptr != null)
      temp = ptr.getData();
    if(temp == null)
      throw new IllegalArgumentException("no such element found");
    return temp;
  }
  
  /**
   * Adds a product in alphabetical order 
   * @param p the product to Adds
   */
  public void add(Product p)
  {
    ProductNode ptr = head;
    ProductNode prev = null;
    
    if(size()==0)
      head =new ProductNode(p,null);
    else
    {
      while(ptr!=null)
      {
        if(p.getName().compareTo(ptr.getData().getName())<0||ptr.getNext()==null)
        {
          if(size() ==1)
          {
            addFirst(p);
            break;
          }
          else if(ptr.getNext()==null)
          {
            addLast(p);
            break;
          }
          else
          {
          
            prev.setNext(new ProductNode(p,ptr));
            break;
          }
        }
        prev=ptr;
        ptr=ptr.getNext();
      }
 
    }
  }
  
  /**
   * adds a product in a specific index, shifting other products to the right
   * @param index the index to add the new product in
   * @param p the new product 
   */
  public void add(int index, Product p)
  {
    ProductNode ptr = head;
    if(index == 0)
    addFirst(p);
    else 
    {
      for(int i = 0; i < index -1; i++)
      {
       ptr = ptr.getNext();
      }
      ptr.setNext(new ProductNode(p, ptr.getNext()));
    }
    
  }
  
  /**
   * returns the first index of the given name
   * @param name the name to serach for
   * @return the index of the name
   */
  public int indexOf(String name)
  {
    int count = 0;
    ProductNode ptr = head;
    if(find(name) == null)
      count = -1;
    else
    {
      while(!(ptr.getData().getName().equals(name)))
      {
        ptr = ptr.getNext();
        count++;
      }
    }
    return count;
  }

  /**
   * removes the data in an index
   * @param index the index to remove
   * @return the removed data
   */
  public String remove(int index)
  {
    String toreturn = null;
    if(index > size()-1)
      throw new IllegalArgumentException("index out of bounds");
    ProductNode ptr = head;
    if(index==0)
    {
      toreturn = ptr.getData().toString();
      head = head.getNext();
    }
    else if(index == -1)
    {
      toreturn = null;
    }
    else if(index == 1)
    {
      toreturn = ptr.getNext().getData().toString();
      head.setNext(head.getNext().getNext());
    }
    else
    {
      for(int i = 0; i < index -1; i++)
      {
        ptr =ptr.getNext();
      }
      toreturn = ptr.getNext().getData().toString();
      ptr.setNext(ptr.getNext().getNext());
   
    }
    return toreturn;
  }

  /**
   * removes the data that matches the name
   * @param name the name to remove
   * @return the removed data
   */
  public String remove(String name)
  {
    int index = indexOf(name);
    if(index > size()-1)
      {
        throw new IllegalArgumentException("index out of bounds");
      }
    String toreturn = "";
    ProductNode ptr = head;
    if(index==0)
    {
      toreturn = ptr.getData().toString();
      head = head.getNext();
    }
    else if(index == 1)
    {
      toreturn = ptr.getNext().getData().toString();
      head.setNext(head.getNext().getNext());
    }
    else if(index == -1)
    {
      toreturn = null;
    }
    else
    {
      for(int i = 0; i < index -1; i++)
      {
        ptr =ptr.getNext();
      }
      toreturn = ptr.getNext().getData().toString();
      ptr.setNext(ptr.getNext().getNext());
   
    }
    return toreturn;
  }

  /**
   * Sets the data at a certain index to a new Product
   * @param index the index to change 
   * @param p the new Product
   */
  public void set(int index, Product p)
  {
    ProductNode ptr = head;
    if(index > size()-1)
     throw new IllegalArgumentException("index out of bounds");
    if(index == 0)
    {
      remove(0);
      addFirst(p);
    }
  
    else if(index== 1)
    {
       head.setNext(new ProductNode(p,ptr.getNext().getNext()));
    }
    else 
    {
      for(int i = 0; i < index - 1; i++)
        {
          ptr = ptr.getNext();
        }
      ptr.setNext(new ProductNode(p, ptr.getNext().getNext()));
    }
  }

  
}
