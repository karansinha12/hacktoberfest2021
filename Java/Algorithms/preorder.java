class PreOrder{
 
  public static void printPreorder(Node temp){
    if(temp == null){
      return;
    }
    System.out.println(temp.data);
    printPreorder(temp.left);
    printPreorder(temp.right);
  }
  
}
