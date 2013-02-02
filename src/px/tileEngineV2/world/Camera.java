package px.tileEngineV2.world;

import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector2f;

public class Camera {
    
    // ++++ ++++ Data ++++ ++++
    
    Vector2f location = new Vector2f();
    
    // ++++ ++++ Accessors ++++ ++++
    
    public Matrix4f getViewTransform() {
        //TODO actually view transformation.
        return new Matrix4f();
    }
}
