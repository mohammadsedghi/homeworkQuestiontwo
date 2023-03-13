package questiontwo;

public class NonMetalElement extends Element{
    public NonMetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    @Override
    public void describeElement() {
        System.out.println("SYMBOL :" + getSymbol());
        System.out.println("ATOMIC NUMBER :" + getAtomicNumber());
        System.out.println("ATOMIC WEIGHT :" + getAtomicWeight());
        System.out.println("brief of element is :  Non Metals are (usually) poor conductors of heat and electricity," +
               " and are not malleable or ductile" +
               " many of the elemental nonmetals are gases at room temperature");
    }
}
