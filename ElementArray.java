package questiontwo;

import java.util.Scanner;

public class ElementArray {
    public MetalElement[] getMetalElementsArray() {
        return metalElementsArray;
    }

    public NonMetalElement[] getNonMetalElementsArray() {
        return nonMetalElementsArray;
    }

    MetalElement[] metalElementsArray = new MetalElement[2];
    NonMetalElement[] nonMetalElementsArray = new NonMetalElement[2];

    public String scannerString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("enter metal or non metal");
        return scanner.nextLine();
    }

    public String scannerNameOfElement() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("enter name of elements");
        return scanner.next();
    }

    public int scannerAtomicNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ATOMIC NUMBER :");
        return scanner.nextInt();
    }

    public double scannerAtomicWeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ATOMIC WEIGHT :");
        return scanner.nextDouble();
    }

    public void addElement() {
        String str=scannerString();
        if (str.equals("metal")) {
            MetalElement metalElement = new MetalElement(scannerNameOfElement(), scannerAtomicNumber(), scannerAtomicWeight());
            for (int i = 0; i < metalElementsArray.length; i++) {
                if (metalElementsArray[i] == null) metalElementsArray[i] = metalElement;
            }
        }
       else if (str.equals("non metal")) {

            NonMetalElement nonMetalElement=new NonMetalElement(scannerNameOfElement(),scannerAtomicNumber(),scannerAtomicWeight());
            for (int i = 0; i < nonMetalElementsArray.length; i++) {
                if (nonMetalElementsArray[i] == null) nonMetalElementsArray[i] = nonMetalElement;
            }
        }
           else System.out.println("your entrance string is wrong");
    }

}
