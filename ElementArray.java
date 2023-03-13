package questiontwo;

import java.util.Scanner;

public class ElementArray {
 MetalElement [] metalElementsArray=new MetalElement[2];
 NonMetalElement[] nonMetalElementsArray=new NonMetalElement[2];
 public  String scannerString(String type){
     Scanner scanner=new Scanner(System.in);
     System.out.println(type);
     return scanner.next();
 }
    public  int scannerAtomicNumber(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("ATOMIC NUMBER :");
        return scanner.nextInt();
    }
    public  double scannerAtomicWeight(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("ATOMIC WEIGHT :");
        return scanner.nextDouble();
    }


}
