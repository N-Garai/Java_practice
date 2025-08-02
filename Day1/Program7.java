class Hello7{
  public static void main(String args[]){
   Hello7 obj=new Hello7();
    int l=obj.func("Hello World");
   System.out.println("length of string:"+l);
   
   
  }
  public int func(String str){
    int x=str.length();
    
    return x;
  }
}
