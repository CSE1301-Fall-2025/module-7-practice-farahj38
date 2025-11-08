package exam.codewriting.q2;

/*
 * We wish to create a Planet class. A planet has-a(n):
		name
		mass
 */
public class Planet {

	// Define your instance variables here
	private String name;
	private int mass;
	// Write the constructor for the Planet class
	public Planet(String name, int mass) {
		this.name = name;
		this.mass = mass;
	}
	public String getName () {
		return name; //FIXME
	}
	
	public int getMass () {
		return mass; //FIXME
	}
	
	public String toString () {
		return name + ": " + mass; //FIXME
	}
	
	/**
	* When two planets collide, a new Planet should be created and returned.
	* The mass of the new planet should be the total mass of the two planets
	* involved in the collision, and it should be named after both planets.
	*/
	public Planet collide ( Planet other ) {
		String joinedName = this.name + " " + other.getName();
		int joinedMass = this.mass + other.getMass();
		Planet joinedPlanet = new Planet(joinedName, joinedMass);
		return joinedPlanet; //FIXME
	}
	
	
}
