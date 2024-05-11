package javaapplication70;
class object{
   long counter=0;
   void createobject()
   {
       counter++;
   }
   void displaythenumberofobjects()
   {
       System.out.println("The number of created objects ais: "+counter);
   }
}

public class countcreatedobjects {    
    public static void main(String args[])
    {
        object o = new object();
        o.createobject();
        o.displaythenumberofobjects();
    }
}
