 public class  Metromain{
	 public static void main(String[] arg){
		Metro m= new Metro();
		m.metroresult();
		m.metroresult();
	}
 }
 
 public class train{
	 private Long tid;
	 private String guage;
	 private String length;
	 
	 public void metroresult(){
		 System.out.println("tid: 1");
		System.out.println("guage: middel");
		System.out.println("length: 250m");
	 }
 }
 public class Metro extends train{
	 private Long mid;
	 private Long speed;
	 private String security;
	 
	 public void metroresult(){
		 System.out.println("tid: 1");
		System.out.println("speed: 75kg/hours");
		System.out.println("security: cctv");
	 }
 }
 
 