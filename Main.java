package questiontwo;

public class Main {
    public static void main(String[] args) {
        ElementArray elementArray=new ElementArray();
        for (int i = 0; i <4 ; i++) {
            elementArray.addElement();
        }
        for (MetalElement metalElement:elementArray.getMetalElementsArray()
             ) {
            metalElement.describeElement();
        }
        for (NonMetalElement NonMetal:elementArray.getNonMetalElementsArray()
        ) {
           NonMetal.describeElement();
        }
    }

}
