/**
 * 
 */
package Witcher;

/**
 * @author Álvaro
 *
 */
public class TheWitcher {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public boolean isHasSoul() {
		return hasSoul;
	}
	public void setHasSoul(boolean hasSoul) {
		this.hasSoul = hasSoul;
	}
	
	public boolean isDeath() {
		if (health==0) {
			return true;
		} else if (!hasSoul){
			return true;
		} else {
			return false;
		}
	}
	
	
	
	private int health;
	private boolean hasSoul;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TheWitcher brujo = new TheWitcher();
		brujo.setName("Juan");
		brujo.setHealth(15);
		brujo.setHasSoul(true);
		
		
		if (brujo.isDeath()) {
			System.out.println(brujo.getName() +" esta muerto");
		} else {
			System.out.println(brujo.getName() +" esta vivo");
		}
	}

}
