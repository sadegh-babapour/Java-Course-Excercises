public class SizeFactorException extends Exception {
    public SizeFactorException(){
        super("The Resizeable Factor Cannot be less than 1.0");
    }
}
