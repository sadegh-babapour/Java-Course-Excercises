public interface Resizable {
    static final double LIMIT = 1.0;
    public void shrink(double n) throws SizeFactorException;
    public void enlarge(double n) throws SizeFactorException;
}
