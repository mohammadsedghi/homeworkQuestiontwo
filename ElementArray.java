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
        return scanner.next();
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
        if (scannerString().equals(" metal")) {
            // MetalElement metalElement=new MetalElement("Li",3,6.941);
            // MetalElement metalElement1=new MetalElement("Na",11,22.989769);
            MetalElement metalElement = new MetalElement(scannerNameOfElement(), scannerAtomicNumber(), scannerAtomicWeight());
            for (int i = 0; i < metalElementsArray.length; i++) {
                if (metalElementsArray[i] == null) metalElementsArray[i] = metalElement;
            }
        }
        if (scannerString().equals("non metal")) {
            // NonMetalElement nonMetalElement=new NonMetalElement("He",2,4.002602);
            //  NonMetalElement nonMetalElement1=new NonMetalElement("N",7,14.0067);
            NonMetalElement nonMetalElement=new NonMetalElement(scannerNameOfElement(),scannerAtomicNumber(),scannerAtomicWeight());
            for (int i = 0; i < nonMetalElementsArray.length; i++) {
                if (nonMetalElementsArray[i] == null) nonMetalElementsArray[i] = nonMetalElement;
            }
        }
           else System.out.println("your entrance string is wrong");
    }

}
