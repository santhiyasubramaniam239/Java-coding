import java.util.Scanner;

 class Main{
 public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 3 numbers ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println("value of A is "+ a);
        System.out.println("value of B is "+ b);
        System.out.println("value of C is "+ c);
        if((a==b) && (a==c)){
            System.out.println("A,B and C are equal so A,B and C are largest");}
        
                     
       
         else if(a==b){
            if(a>c){
             System.out.println("A and B are equal and they are largest");}
            else{
             System.out.println("C is largest");}}
          else if(b==c){
            if(b>a){
             System.out.println("B and C are equal and they are largest");}
            else{
             System.out.println("A is largest");}}
          else if(a==c){
            if(c>b){
             System.out.println("A and C are equal and they are largest");}
            else{
             System.out.println("B is largest");}}
          else if((a!=b) && (b!=c) &&(c!=a)){
            if((a>c) && (a>b)){
             System.out.println("A is largest");}
            else if((b>a) && (b>c)){
              System.out.println("B is largest ");
            }
            else{
             System.out.println("C is largest");}}
            
        
        
         
    }
}
