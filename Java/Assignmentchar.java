class Assignmentchar{
	char number1;
	char number2;
	
	public char Addition(){
		char result = number1+number2;
		return result;
	}
	public static void main(String[] args){
		
		Assignmentchar assign= new Assignmentchar();
		assign.number1=1;
		assign.number2=1;
		char answer=assign.Addition();
		System.out.println(answer);
	}
}

/* C:\Users\ASUS\Documents>javac Assignmentchar.java
Assignmentchar.java:6: error: incompatible types: possible lossy conversion from int to char
                char result = number1+number2;
                                     ^
1 error
*/