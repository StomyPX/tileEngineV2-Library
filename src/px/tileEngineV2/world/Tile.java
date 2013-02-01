package px.tileEngineV2.world;

import px.tileEngineV2.graphics.Texture;

/**A single tile object making up part of the world, stores basic information for
 * underlying texture and collision data.
 * @author Michael Stopa */
public abstract class Tile {
    
    // ++++ ++++ Data ++++ ++++
    
    /**Cannot enter the tile if this is true. */
    protected boolean isSolid;
    
    /**Texture representing the tile on screen. */
    protected Texture texture;
}
