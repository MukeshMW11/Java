import java.util.Arrays;

public class Practice {


    public static void main(String[] args){
//        int it = 127;
//        byte by =(byte) it;
//     long hex = 0X123FEF;
//        int bnr = 0b10101010101;
//        double oct = 754.123e23;
//    float num1 = 1.23456789f;
//    long lakh = 10_00_000;
//    double num2 = 1.23456789;
//    char a = 'b';
//    char test;
//    char div = 'a';
//    int div1 = 194;
//        System.out.println("The division is" + div1/div);
//        byte byt =64;
//
//        int te = byt << 1;
//
//        System.out.println("The byte is" + te);
//
////    byt =(byte)( byt * 2);
//
//
//
//
//    float fl = 0.7f;
//
//        System.out.printf("%.20f%n" , fl);
//
//
//    long num = -123;
//
//        System.out.println("The int byte is " + by);
//    ;test = 't';
//
//
//        System.out.println("The hexadecimal is " + lakh );
//        System.out.println("The binary is " + bnr);
//        System.out.println("The octal is " + oct);
//
//        System.out.println((0.1 + 0.2));
//    System.out.println("The floating point is : " + num1);
//        System.out.println("The double  is : "  + num2);
//        System.out.println("The char is : "  + a);
//
//
//
//

//        String i= new String("test");
//
//        switch(i){
//
//            case "Test" :
//                System.out.println("This is case 1");
//                break;
//            case "Best":
//                System.out.println("This is case 2");
//                break;
//            case "Rest":
//                System.out.println("This is case 3");
//                break;
//            default:
//                System.out.println("This is default case ");
//                break;
//        }



//        outer: for(int k=0, l=0;k<10 && l<20;k++,l+=2){
//            inner: for(int j=0;j<=k && j<=l ;j++){
//                if(j>8){
//                    System.out.println("H");
//                    break outer ;
//                }
//                System.out.print("Hello World");
//            }
//        }

//
//        first:{
//    second:{
//            third:{
//                System.out.println("Hello World");
//            }
//    }
//        }

//
//        int[] arr = new int[4];
//        for(int i=0;i<arr.length;i++){
//            arr[i] = i;
//        }
//
//        System.out.println("The array is : " + Arrays.toString(arr));


//    int[] [] arr1 = new int[3][3];
//        int[][] arr1 = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//    for(int i = 0; i < arr1.length; i++){
//        for(int j = 0; j < arr1[i].length; j++){
//            arr1[i][j] = i;
//        }
//    }
//        for(int i = 0; i < arr1.length; i++){
//            for(int j = 0; j < arr1[i].length; j++){
//                System.out.print(arr1[i][j]);
//            }
//            System.out.println();
//
//        }



        String name = "Test";
        System.out.println("The string is : " + name  + " and its length is : " + name.length());



    }


    static void hello(int age){
        System.out.println("Hello World : " + age );
    }


    static void hello(long age){
        System.out.println("Hello World : " + age );
    }

    static  void hello(String name){
        System.out.println("Hello "+ name);
    }



    static  void hello(String name, int age){
        System.out.println("Hello "+ name + " and its age is: " + age);

    }

    static void hello(int age, String name){
        System.out.println("Hello "+ name + " and its age is: " + age);
    }
}
