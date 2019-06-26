
class Text implements Cloneable, Resizable
{
	
	private final Double DEFAULT_SIZE = 10.0;
	
    private Colour colour;
    private Double fontSize;
    
    private String text;


	public Text(String text) {
       this.text = text;
       fontSize = DEFAULT_SIZE;
	}

	public Object clone() throws CloneNotSupportedException {
	    Text obj = (Text) super.clone();
	    obj.colour = (Colour) colour.clone();
	    return obj;
    }
	
	public Double getFontSize(){
		return fontSize;
	}
	
	public void setColour(String s){
		colour = new Colour(s);
	}
	
	public void setText(String newText){
		text = newText;
	}
	
	public String getText(){
		return text ;
	}
	
	@Override
	public String toString(){
		return (text);
	}

	public void setFontSize(Double fontSize) {
		this.fontSize = fontSize;
	}

	@Override
	public void shrink(double n) throws SizeFactorException {
	    if (n <= LIMIT) {
	        throw new SizeFactorException();
        }
        else {
            fontSize = fontSize / n;
        }
	}

	@Override
	public void enlarge(double n) throws SizeFactorException {
		if (n <= LIMIT){
		    throw new SizeFactorException();
        }
        else{
            fontSize = fontSize * n;
        }

	}
}
