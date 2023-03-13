package questiontwo;

public class MetalElement extends Element{
    public MetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    @Override
    public void describeElement() {
        System.out.println("SYMBOL :"+getSymbol());
        System.out.println("ATOMIC NUMBER :"+getAtomicNumber());
        System.out.println("ATOMIC WEIGHT :"+getAtomicWeight());
    }
}
