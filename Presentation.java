import java.util.*;
public class Presentation
{
  ArrayList<Objects> theObjects;
  
  public Presentation()
  {
    theObjects = new ArrayList<Objects>(); //array list of the objects
    theObjects.add(new BlueSphere(100,300,100,100)); 
    theObjects.add(new RainbowSphere(300,300,100,100)); //values of there atributes
    theObjects.add(new RedSphere(500,300,100,100));
  }
  
  public ArrayList<Objects> getIt()
  {
    return theObjects; //get the objects
  }
  
  public void moveIt()
  {
    for(int i = 0;i < theObjects.size(); i++) //loop though all of them colling the move function
    {
      theObjects.get(i).move();
    }
  }
  
  public void reactToIt()
  {
    for(int i = 0; i < theObjects.size(); i++)
    {
      theObjects.get(i).react(); //loop through all the objects calling the react function
    }
  }
}