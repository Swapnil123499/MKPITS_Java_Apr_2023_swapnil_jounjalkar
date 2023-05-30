class Assignmentboolean{
	boolean number1;
	boolean number2;
	
	public int Addition(){
		int result = number1+number2;
		return result;
	}
	public static void main(String[] args){
		
		Assignmentboolean assign= new Assignmentboolean();
		assign.number1=1;
		assign.number2=1;
		int answer=assign.Addition();
		System.out.println(answer);
	}
}
/*
C:\Users\ASUS\Documents>javac Assignmentboolean.java
Assignmentboolean.java:6: error: bad operand types for binary operator '+'
                int result = number1+number2;
                                    ^
  first type:  boolean
  second type: boolean
Assignmentboolean.java:12: error: incompatible types: int cannot be converted to boolean
                assign.number1=1;
                               ^
Assignmentboolean.java:13: error: incompatible types: int cannot be converted to boolean
                assign.number2=1;
                               ^
3 errors
*/