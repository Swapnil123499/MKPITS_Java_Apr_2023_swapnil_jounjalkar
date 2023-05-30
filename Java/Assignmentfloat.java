class Assignmentfloat{
	float number1;
	float number2;
	
	public float Addition(){
		float result = number1+number2;
		return result;
	}
	public static void main(String[] args){
		
		Assignmentfloat assign= new Assignmentfloat();
		assign.number1=2.03;
		assign.number2=3.14;
		float answer=assign.Addition();
		System.out.println(answer);
	}
}

/*C:\Users\ASUS\Documents>java Assignmentfloat.java
Assignmentfloat.java:12: error: incompatible types: possible lossy conversion from double to float
                assign.number1=2.03;
                               ^
Assignmentfloat.java:13: error: incompatible types: possible lossy conversion from double to float
                assign.number2=3.14;
                               ^
2 errors*/