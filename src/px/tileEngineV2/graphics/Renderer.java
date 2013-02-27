package px.tileEngineV2.graphics;

import java.util.LinkedList;

import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector2f;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;

/**An abstract template for platform-specific implementations of a Renderer to be
 * accessed by the core game library. All draw calls should pass through an implementation
 * extending this class.
 * @author Michael Stopa */
public abstract class Renderer {
    
    public LinkedList<Animation> animations;
    
    public abstract void drawQuad(
            Texture texture, Matrix4f model, float depth, Vector4f tint);
    
    public abstract void drawText(
            String text, Vector3f location, Vector2f size, Vector4f color);
    
    /**Start the FPSAnimator driving the renderer. */
    public abstract void start();
}
