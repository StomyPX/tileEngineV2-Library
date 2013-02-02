package px.tileEngineV2.graphics;

import org.lwjgl.util.vector.Matrix3f;

/**Wrapper class representing a texture
 * @author Michael Stopa */
public abstract class Texture {
    
    // ++++ ++++ Data ++++ ++++
    
    protected Matrix3f texCoordTransform;
    
    // ++++ ++++ Initialization ++++ ++++
    
    public Texture(TextureCache cache, String filename) {
        texCoordTransform = new Matrix3f();
    }

    public Matrix3f getTransform() {
        //TODO allow matrix tranforms here.
        return new Matrix3f();
    }
}
