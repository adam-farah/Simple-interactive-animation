public abstract class Objects
{
  protected String image;
  protected float imageX;
  protected float imageY;  //atributes of the objects
  protected float imageWidth;
  protected float imageHeight;
  
  public Objects(String i, float x, float y, float w, float h)
  {
    image = i;
    imageX = x; //contructor
    imageY = y;
    imageWidth = w;
    imageHeight = h;
  }
  
  public String getImage() {return image;}
  public float getX() {return imageX;}
  public float getY() {return imageY;} //getters
  public float getWidth() {return imageWidth;}
  public float getHeight() {return imageHeight;}
  
  public abstract void move(); //abstract functions will be made later in the sub classes
  public abstract void react();
}