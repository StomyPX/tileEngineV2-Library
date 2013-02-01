package px.tileEngineV2.ui;

import org.lwjgl.util.vector.Vector2f;
import org.lwjgl.util.vector.Vector4f;

import px.tileEngineV2.graphics.Texture;

/**Base class for all in-game menus. At the moment displays a standard menu with edge
 * decorations and
 * @author Michael Stopa */
public abstract class Window {
    
    // ++++ ++++ Data ++++ ++++
    
    //Location of the menu on screen from center (0,0) to corners (from -1,-1 to 1,1)
    protected Vector2f location;
    //Size of textbox in screen coordinates (-1, -1 to 1, 1)
    protected Vector2f size;
    //Text displayed in menu
    protected String text;
    //Color to tint the edge colors and text
    protected Vector4f tint;
    //Texture used along the back of the window instead of the default window texture.
    protected Texture menuTexture;
    
    // ++++ ++++ Initialization ++++ ++++
    
    public Window(String text, Vector2f location, Vector2f size, Vector4f tint,
            Texture menuTexture) {
        this.text = text;
        this.location = location;
        this.size = size;
        this.tint = tint;
    }
}
