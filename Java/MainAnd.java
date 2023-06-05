class logicalAnd{
	

	public boolean logicalAndOperator(boolean var1, boolean var2){
		return var1 && var2;
	}

	public boolean logicalAndOperator(boolean var1, boolean var2, boolean var3){
		return var1 && var2 && var3;
	}

	public boolean logicalAndOperator(boolean var1, boolean var2, boolean var3, boolean var4){
		return var1 && var2 && var3 && var4;
	}

	public boolean logicalAndOperator(boolean var1, boolean var2, boolean var3, boolean var4, boolean var5){
		return var1 && var2 && var3 && var4 && var5;
	}
}
class MainAnd{
	public static void main(String[] args){
	
		logical logicalOperator1 = new logicalAnd();
		System.out.println("The value of given logical operator using two parameter is : " + logicalOperator1.logicalAndOperator(true,true));

	
		logical logicalOperator2 = new logicalAnd();
		System.out.println("The value of given logical operator using three parameter is : " + logicalOperator2.logicalAndOperator(true,false,true));

	
		logical logicalOperator3 = new logicalAnd();
		System.out.println("The value of given logical operator using four parameter is : " + logicalOperator3.logicalAndOperator(true,false,true,false));

	
		logical logicalOperator4 = new logicalAnd();
		System.out.println("The value of given logical operator using five parameter is : " + logicalOperator4.logicalAndOperator(true,true,false,false,true));
	}
}