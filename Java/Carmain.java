public class Car{
	private Long cid;
	private String carwheel;
	private String light;
	
	public void carmeth(){
				 System.out.println("cid: 1");
		System.out.println("carwheel: 4");
		System.out.println("light: 4");
	}
}

public class Hundai extends Car{
	private Long hid;
	private String modelname;
	private String carlength;
	private String carwidth;
	private String carmilege;
	private String carcolor;
	public void cardetail(){
				 System.out.println("hid: 1");
		System.out.println("modelname: Hundai 209");
		System.out.println("carlength: 4");
		System.out.println("carwidth: 1.5");
		System.out.println("carmilege: 14");
		System.out.println("carcolor: black");
		
	}
}

public class Carmain{
	public static void main(String[] arg){
		Hundai h =new Hundai();
		h.carmeth();
		h.cardetail();
	}
}
	