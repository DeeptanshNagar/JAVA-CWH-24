package com.company;

public class cwh_25_practiceSet_ch5 {
    public static void main(String[] args) {
//      Question 1
//        int n = 4;
//        for(int i=n; i>0; i--){
//            for(int j = 0; j<i; j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//      ---PRACTING SOME MORE PATTERNS---
//       Ques : print *
//                    **
//                    ***
//                    ****

//        for(int i = 1; i<=4; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

//---------------------------------------------------------------------------------------------------------

//       ****
//       ***
//       **
//       *
        for(int i = 1; i<=4; i++){
            for(int j=4; j>=i; j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }

//        ------------------------------------------------------------------------------------------------------------

//        *
//        **
//        ***
//        ****
//        ***
//        **
//        *

//        for(int i = 1; i<=4; i++){
//            for(int j = 1; j<=i ; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i =1; i<=4; i++){
//            for(int j = 3; j>=i; j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//-----------------------------------------------------------------------------------------------------

//        *
//       **
//      ***
//     ****

//        for (int i = 1; i <= 4; i++) {
//            for (int j = 4; j >= i; j--) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//------------------------------------------------------------------------------------------------------------------

//       ****
//        ***
//         **
//          *

//        for(int i = 1; i <= 4; i++){
//            for(int j=1; j <= i ; j++){
//                System.out.print(" ");
//            }
//            for(int k = 4; k>=i; k--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//-------------------------------------------------------------------------------------------------------------
//        *
//       **
//      ***
//     ****
//      ***
//       **
//        *

//        for (int i = 1; i <= 4; i++) {
//            for (int j = 3; j >= i; j--) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i = 1; i <= 4; i++){
//            for(int j=1; j <= i ; j++){
//                System.out.print(" ");
//            }
//            for(int k = 3; k>=i; k--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }




    }
}