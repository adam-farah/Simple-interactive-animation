import processing.core.*;
import java.awt.*;
import java.io.*;
import static java.lang.Math.abs;

// This class is the controller in a model-view-controller setup.
// The controller receives events, updates the model accordingly,
// and tells the UI to update itself.
public class Applet extends PApplet
{
    // Attributes (model and view references)
    UI u;
    Presentation p;
    
    // Called once when the program starts
    public void setup()
    {
        // Set the size of the drawing's window (use
        // whatever dimensions you want)
        size(600,500);
        
        
        ////
        // Create instances of the model class(es) and UI class(es)...
        
        // The model should not know anything about the controller or view
        p = new Presentation();
        
        // The UI class needs a reference to the model and our
        // PApplet class (since it's PApplet that does the drawing)
        u = new UI(this, p);
    }
    
    
    // Called once every frame
    public void draw()
    {
        // Clear the screen (use whatever color you want)
        background(73,179,227);
        
        
        // Update the model
        // ...
        
        
        // Tell the UI to draw itself
        u.drawIt();
        p.moveIt();
    }
    
    
    // This method is called every time the mouse is clicked
    public void mouseClicked()
    {
        p.reactToIt();
    }
    
    
    
    ////////////////////////////////////////////////////////////
    // Use this to load images (in theory, we could just use loadImage
    // as built into Processing, but I had issues getting the path
    // right without it being an absolute path...so I skirted Processing's
    // way of loading images to do it more directly, allowing us to use
    // relative paths for the image filenames).
    public PImage getPImage(String filename)
    {
        PImage result = null;
        
        try
        {
            
            // Note: a lot of this code is just taking the simple parts of
            // what Processing does and doing it directly.
            InputStream input = new FileInputStream(filename);
            
            BufferedInputStream bis = new BufferedInputStream(input);
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            int c = bis.read();
            while (c != -1) 
            {
                out.write(c);
                c = bis.read();
            }
            
            byte[] bytes = out.toByteArray();
            Image awtImage = Toolkit.getDefaultToolkit().createImage(bytes);
            result = loadImageMT(awtImage);
            
            // Fix transparency if needed
            for (int i = 0; i < result.pixels.length; i++) 
            {
                if ((result.pixels[i] & 0xff000000) != 0xff000000)
                {
                    result.format = ARGB;
                    break;
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("Could not load image file " + filename + ".");
        }
        
        return result;
    }
    //
    ////////////////////////////////////////////////////////////
    
    
    
    // Kick start Processing and its main draw loop
    public static void main(String[] args)
    {
        // In your own example, replace MyApplet with
        // your class's name
        PApplet.main(Applet.class.getCanonicalName());
    }
}