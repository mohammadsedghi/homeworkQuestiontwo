package questiontwo;

public class Main {
    // MetalElement metalElement=new MetalElement("Li",3,6.941);
    // MetalElement metalElement1=new MetalElement("Na",11,22.989769);
    // NonMetalElement nonMetalElement=new NonMetalElement("He",2,4.002602);
    //  NonMetalElement nonMetalElement1=new NonMetalElement("N",7,14.0067);
    public static void main(String[] args) {
        ElementArray elementArray=new ElementArray();
        for (int i = 0; i <4; i++) {
            elementArray.addElement();

        }
        System.out.println("===================================================");
        for (MetalElement metalElement:elementArray.getMetalElementsArray()
        ) {
            if (metalElement!=null) {
                metalElement.describeElement();
            }
        }
        for (NonMetalElement nonMetal:elementArray.getNonMetalElementsArray()
        ) {
            if (nonMetal!=null) {
                nonMetal.describeElement();
            }
        }
    }

}
