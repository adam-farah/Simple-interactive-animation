import java.util.*;
public class RainbowSphere extends Objects
{
  public RainbowSphere(float imageX, float imageY, float imageWidth, float imageHeight)
  {
    super("o3.png",imageX,imageY,imageWidth,imageHeight);  //call the super
  }
  
  int c = 0;
  int imageSpeedX = 0; //set up variables for speed
  int imageSpeedY = 3;
  public void move()
  {
    imageX += imageSpeedX; //to get the objects moving
    imageY += imageSpeedY;
    
    if(((imageX + imageWidth/2)  > 600) || ((imageX - imageWidth/2) < 0))
    {
      imageSpeedX *= -1;
    }                       //collision on the ends ov the window screen
        
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
      imageSpeedX = 3; //go from a vertical motion to a more diagonal motion
      imageSpeedY = 3;
    }
    
    else
    {
      int imageSpeedX = 0;
      int imageSpeedY = 3; //goes back to normal after being pressed again
    }
  }
}