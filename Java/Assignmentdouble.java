class Assignmentdouble{
	double number1;
	double number2;
	
	public double Addition(){
		double result = number1+number2;
		return result;
	}
	public static void main(String[] args){
		
		Assignmentdouble assign= new Assignmentdouble();
		assign.number1=1;
		assign.number2=1;
		double answer=assign.Addition();
		System.out.println(answer);
	}
}