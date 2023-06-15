public class Shoes{
	private Long sid;
	private String typematerial;
	private String color;
	
	public void shoe(){
		 System.out.println("sid: 1");
		System.out.println("typematerial: cloth");
		System.out.println("color: blue");
	}
}
public class Loffer extends Shoes{
	private Long lid;
	private String number;
	private boolean heal;
	private String brand;
	private String sell;
	
	public void loffshoe(){
		 System.out.println("lid: 2");
		System.out.println("number: 9");
		System.out.println("heal: false(no)");
		System.out.println("brand: indian");
		System.out.println("sell: 50%");
		
	}
}

public class Shoesmain{
	public static void main(String[]arg){
		Loffer loffer=new Loffer();
		loffer.shoe();
		loffer.loffshoe();
	}
}
	