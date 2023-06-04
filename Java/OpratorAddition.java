public class OpratorAddition{
	 public int additionInteger(int number1,int number2){
		 int sum= number1+number2;
		 System.out.println(sum);
		return sum;
		 
	 }
	 public static void main(String[]arg){
		 int number1=12,number2=21;
		 OpratorAddition addition= new OpratorAddition();
		// addition.additionInteger(12,23);
		System.out.println("Addition"+number1+" + "+number2+" = "+addition.additionInteger(number1,number2));
		 
	 }
}