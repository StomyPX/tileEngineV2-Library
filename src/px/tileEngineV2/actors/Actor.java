package px.tileEngineV2.actors;

import org.lwjgl.util.vector.Matrix4f;
import org.lwjgl.util.vector.Vector2f;
import org.lwjgl.util.vector.Vector3f;

/**Base class for all actors (Entities, characters, objects) within the game world.
 * @author Michael Stopa */
public abstract class Actor {
    
    /**Creates a model transformation matrix in a consistent manner (scale, rotate, move)
     * @param location Location of the object in world-space.
     * @param rotation Amount to rotate the object by (TODO find out radians or degrees)
     * counter-clockwise around its center. 
     * @param scale
     * @return */
    public static Matrix4f modelTransform(Vector2f location, 
            float rotation, Vector2f scale) {
        Matrix4f model = new Matrix4f();
        Matrix4f mScale = Matrix4f.scale(new Vector3f(scale.x, scale.y, 1f), 
                new Matrix4f(), null);
        Matrix4f mRotate = Matrix4f.rotate(rotation, 
                new Vector3f(0, 0, 1), new Matrix4f(), null);
        model = Matrix4f.mul(mRotate, mScale, null);
        Matrix4f mMove = Matrix4f.translate(location, new Matrix4f(), null);
        model = Matrix4f.mul(mMove, model, null);
        return model;
    }
}
