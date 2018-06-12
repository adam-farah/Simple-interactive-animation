import processing.core.*;
import java.util.*;

public class UI
{
  protected Applet a;
  protected Presentation pr;
  protected ArrayList<PImage> imageList; //the actual images
  
  public UI(Applet ap, Presentation p)
  {
    a = ap;
    pr = p;  
  
    imageList = new ArrayList<PImage>();
    
    for(Objects o : pr.getIt())
    {
      imageList.add(a.getPImage(o.getImage()));
    }
    
    a.imageMode(PApplet.CENTER);
  }
  public void drawIt()
  {    
    for (int i=0; i < pr.getIt().size(); i++)
    {
      Objects images = pr.getIt().get(i);  //this is the drawing method, called by the controller as the program runs
      
      a.image(imageList.get(i), images.getX(), images.getY(),images.getWidth(), images.getHeight());
    }
  }
}