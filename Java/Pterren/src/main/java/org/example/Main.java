package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
         System.out.println("Star pattern example 1 :-");
         for(int rows=1;rows<=4;rows++){
             for(int cols=1;cols<=rows;cols++){
                 System.out.print("*");
             }
             System.out.println();
         }

         System.out.println("Second example of pattern:-");
         for(int rows=1;rows<=4;rows++){
             for(int cols=4;cols>=rows;cols--){
                 System.out.print("*");
             }
             System.out.println();
         }
        System.out.println("Third pattern example:-");
         for(int rows=1;rows<=4;rows++){
             for(int cols=1;cols<=rows;cols++)
             {
                 System.out.print("*");
             }

             System.out.println();
         }
        for(int rows=1;rows<=4;rows++) {
            for (int col = 3; col >= rows; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
         System.out.println("Fourth example :-");


        for(int row=1;row<=4;row++){
            for(int col=3;col>=row;col--){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
           System.out.println();
        }

        System.out.println("Fifth example:-");

        for(int row=1;row<=4;row++){
            for(int col=1;col<=row;col++){
                System.out.print(" ");
            }
            for(int col=4;col>=row;col--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("Sixth Example:-");
        for(int row=1;row<=4;row++){
            for(int col =3;col>=row;col--){
                System.out.print(" ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
       for(int row=1;row<=4;row++){
           for(int col=1;col<=row;col++){
               System.out.print(" ");
           }
          for(int col=3;col>=row;col--){
              System.out.print("*");
          }
          System.out.println();
       }

       System.out.println("Seventh Example:-");

        System.out.println("first way:-");
       for(int row=1;row<=4;row++){
           for(int col=3;col>=row;col--){
               System.out.print(" ");
           }
           for(int col=1;col<=row;col++){
               System.out.print(" *");
           }
           System.out.println();
       }
        System.out.println("second way:-");
       for(int row=1;row<=4;row++){
           for(int col=3;col>=row;col--){
               if(col>row){
                   System.out.print(" ");
               }
               else {
                   System.out.print("*");
               }
           }
           System.out.println();
       }

        System.out.println("Eight example:-Pyramid pattern");
       for(int row=1;row<=4;row++){
           for(int col=4;col>row;col--){
               System.out.print(" ");
           }
          for(int col=1;col<=row;col++){
              System.out.print("#");
          }
          for(int col=1;col<row;col++){
              System.out.print("*");
          }

           System.out.println();
       }
        System.out.println("nine example of inverted pyramid:-");
       for(int row=1;row<=4;row++){
           for(int col=1;col<row;col++){
               System.out.print(" ");
           }
           for(int col=3;col>=row;col--){
               System.out.print("8");
           }
           for(int col=4;col>=row;col--){
               System.out.print("8");
           }
           System.out.println();
       }
       


    }
}