import java.util.Scanner;
class BinaryToDecimalExample{    
public static int getDecimal(int binary){  
    int decimal = 0;  
    int n = 0;  
    while(true){  
      if(binary == 0){  
        break;  
      } else {  
          int temp = binary%10;  
          decimal += temp*Math.pow(2, n);  
          binary = binary/10;  
          n++;  
       }  
    }  
    return decimal;  
}  
public static void main(String args[]){    
 Scanner scannerobject = new Scanner(System.in);
 int binarynumber=scannerobject.nextInt(); 
System.out.println("Decimal of"+binarynumber+" "+getDecimal(binarynumber));  
}}