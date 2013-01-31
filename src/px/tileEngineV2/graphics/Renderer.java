package px.tileEngineV2.graphics;

import org.lwjgl.util.vector.Vector2f;
import org.lwjgl.util.vector.Vector3f;
import org.lwjgl.util.vector.Vector4f;

/**An abstract template for platform-specific implementations of a Renderer to be
 * accessed by the core game library. All draw calls should pass through an implementation
 * extending this class.
 * @author Michael Stopa */
public abstract class Renderer {
    
    public abstract void drawQuad(
            int texture, Vector3f location, Vector2f size, Vector4f tint);
    
    public abstract void drawText(
            String text, Vector3f location, Vector2f size, Vector4f color);
}
