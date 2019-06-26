public class Point
{
    private double xCoor;
    private double yCoor;
    private String label;

    public Point()
    {

    }
    public Point(double x, double y, String name)
    {
        xCoor = x;
        yCoor = y;
        label = name;
    }

    public double getxCoor() {
        return xCoor;
    }

    public double getyCoor() {
        return yCoor;
    }

    public String getLabel() {
        return label;
    }

    public void setxCoor(double xCoor) {
        this.xCoor = xCoor;
    }

    public void setyCoor(double yCoor) {
        this.yCoor = yCoor;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String toString()
    {
        String descrip = label + "(" + Double.toString(xCoor) +
                "," + Double.toString(yCoor) + ")";
        return descrip;
    }
}
