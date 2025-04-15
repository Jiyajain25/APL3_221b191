public class Application
{
  public static void main(string args[]){
     Crow crow=newIndianCrow();
     Crow Adapter=crowadapter=new CrowAdapter(crow);
  }
 public static void client(Swan swan){
  swan.eat();
  swan.swin();
  swan.sing();
}
}