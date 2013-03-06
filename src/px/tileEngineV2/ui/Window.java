package px.tileEngineV2.ui;

import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector2f;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;

import px.tileEngineV2.core.GameCore;
import px.tileEngineV2.graphics.Renderer;
import px.tileEngineV2.graphics.Texture;

/**Base class for all in-game menus. At the moment displays a standard menu with edge
 * decorations and
 * @author Michael Stopa */
public abstract class Window {
    
    // ++++ ++++ Enums ++++ ++++
    
    public enum HorzAlign {
        LEFT,
        CENTER,
        RIGHT
    }
    
    public enum VertAlign {
        TOP,
        CENTER,
        BOTTOM
    }
    
    // ++++ ++++ Data ++++ ++++

    //Location of the menu on screen from center (0,0) to corners (from -50,-50 to 50, 50)
    protected Vector3f location;
    //Size of central screen in units (size doesn't count the 1 unit border)
    protected Vector2f size;
    //Alignments relative to edges of the screen.
    protected HorzAlign horzAlign = HorzAlign.CENTER;
    protected VertAlign vertAlign = VertAlign.CENTER;
    //Color to tint the edge colors
    protected Vector4f edgeColor = new Vector4f(1f, 1f, 1f, 1f);
    protected Vector4f backColor = new Vector4f(1f, 1f, 1f, 1f);
    //Texture used along the back of the window instead of the default window texture.
    protected Texture backTexture;
    protected Texture cornerTexture;
    protected Texture edgeTexture;
    protected Renderer renderer;
    
    // ++++ ++++ Initialization ++++ ++++
    
    public Window(Vector3f location, Vector2f size, HorzAlign horizontalAlignment,
            VertAlign verticalAlignment, Vector4f edgeColor, Texture backTexture,
            Vector4f backColor) {
        this.location = location;
        this.size = size;
        if (horizontalAlignment != null) { this.horzAlign = horizontalAlignment; }
        if (verticalAlignment != null) { this.vertAlign = verticalAlignment; }
        if (edgeColor != null) { this.edgeColor = edgeColor; }
        if (backTexture != null) {
            this.backTexture = backTexture;
        } else {
            this.backTexture = GameCore.getInstance().getTexture("textures/ui/BackPlate");
        }
        if (backColor != null) { this.backColor = backColor; }
        this.cornerTexture = GameCore.getInstance().getTexture("textures/ui/Corner");
        this.edgeTexture = GameCore.getInstance().getTexture("textures/ui/Edge");
        this.renderer = GameCore.getInstance().getRenderer();
    }
    
    // ++++ ++++ Rendering ++++ ++++
    
    public void draw() {
        //Top left corner
        Matrix4f tlc = new Matrix4f();
        renderer.drawQuadUi(cornerTexture, tlc, 0f, horzAlign, vertAlign, edgeColor);
    }
}
