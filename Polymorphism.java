public class Circle {

	public void draw(){
		System.out.println("Drawing circle with default color Black and diameter 1 cm.");
	}
	
	public void draw(int diameter){
		System.out.println("Drawing circle with default color Black and diameter"+diameter+" cm.");
	}
	
	public void draw(int diameter, String color){
		System.out.println("Drawing circle with color"+color+" and diameter"+diameter+" cm.");
	}
}
