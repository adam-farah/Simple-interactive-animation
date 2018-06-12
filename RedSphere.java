import java.util.*;
public class RedSphere extends Objects
{
  public RedSphere(float imageX, float imageY, float imageWidth, float imageHeight)
  {
    super("o1.png",imageX,imageY,imageWidth,imageHeight); //call the super
  }
  
  int c = 0;
  int imageSpeedX = 3;  //set up variables for speed
  int imageSpeedY = 0;
  
  public void move()
  {
    imageX += imageSpeedX; //to get the objects moving
    imageY += imageSpeedY;
    
    if(((imageX + imageWidth/2)  > 600) || ((imageX - imageWidth/2) < 0))
    {
      imageSpeedX *= -1;   //collision on the ends ov the window screen
    }
        
     if(((imageY - imageHeight/2) < 0)|| ((imageY - imageHeight/2)  > 415))
     {
     imageSpeedY *= -1;
     }
  }
  public void react()
  {
    c++;
    if(c%2 == 1)
    {
      imageSpeedX = 0;   //go from a horizontal motion to a vertical motion
      imageSpeedY = 3;
    }
    
    else
    {
      int imageSpeedX = 3;
      int imageSpeedY = 0; //goes back to normal after being pressed again
    }
  }
}