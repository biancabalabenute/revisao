package devices;

public class ComboDevice extends Device implements Scanner, Printer {


    public ComboDevice(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Combro processo: " + doc);
    }

    @Override
    public String scan() {
        return "Combo scaner resultado";
    }

    @Override
    public void print(String doc) {
        System.out.println("Combro impressao: " + doc);
    }
}
