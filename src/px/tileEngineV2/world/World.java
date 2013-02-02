package px.tileEngineV2.world;

import java.util.LinkedList;

import org.lwjgl.util.vector.Matrix4f;

import px.tileEngineV2.graphics.Renderer;

/**Contatiner class for all objects loaded in the current gamestate, all map data and
 * actors are stored in one of these, with a new one created every time the game
 * loads a new map.
 * @author Michael Stopa */
public abstract class World {
	
	// ++++ ++++ Data ++++ ++++
	
	protected LinkedList<Map> maps;
    
	// ++++ ++++ Initialization ++++ ++++
	
	/**Create a world from a list of maps. */
	public World() {
	    
	}
	
	//TODO Open world from XML
	
	// ++++ ++++ Update Loop ++++ ++++
	
	public void update(long elapsedTime) {
	    //TODO update EVERYTHING.
	}
	
	// ++++ ++++ Drawing Loop ++++ ++++
	
	public void draw(Renderer renderer) {
	    //TODO Draw EVERYTHING (update/paint GLCanvas?)
	}
	
	// ++++ ++++ Accessors ++++ ++++
	
	public Matrix4f getViewTransform() {
	    //TODO actually calculate View transform.
	    return new Matrix4f();
	}
}
