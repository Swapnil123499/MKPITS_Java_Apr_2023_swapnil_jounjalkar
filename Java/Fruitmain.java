public class Fruit{
	private Long fruitid;
	private String test;
	private String size;
	private String quality;
	
	public void fruitdetails(){
		System.out.println("fruitid: 1");
		System.out.println("test: sweet");
		System.out.println("Size: small");
		System.out.println("quality: fresh");
	}
}
public class Mango extends Fruit{
	private Long mangoid;
	private String waight;
	private String type;
	private String state;
	
	public void mangodetail(){
		System.out.println("mangoid: 2");
		System.out.println("waight: 5kg");
		System.out.println("type: indian");
		System.out.println("state: raw");
	}
}
public class Fruimain{
	public static void main(String[] arg){
		Mango m= new Mango();
		m.mangodetail();
		m.fruitdetails();
	}
}
		