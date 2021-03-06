package edu.troy.cs3360.fall2013.team1.brickbreak.engine;
/**
 * This Class defines a box surrounding an object that is aligned to the x and y axes.
 * Its x and y coordinates are aligned to the x and y axes of the current plane.
 * 
 * @author Dexter Parks
 * @version 1.0
 * @since 2013-11-14
 */
public class AABB extends Rectangle {

	//-----Constructors
	/**
	 * Default constructor.
	 * Sets the coordinates to 0,0 and the width and height to 1
	 */
	public AABB() {
		super();
	}
	
	/**
	 * Creates a new AABB with specified x, y, width, and height options
	 * @param x X coordinate
	 * @param y Y Coordinate
	 * @param width Width of the bounding box
	 * @param height Height of the bounding box
	 */
	public AABB(float x, float y, float width, float height) {
		super(x, y, width, height);
	}

	//public AABB(float x, float y, float width, float height) {
		// TODO Auto-generated constructor stub
	//}

	
	
}
