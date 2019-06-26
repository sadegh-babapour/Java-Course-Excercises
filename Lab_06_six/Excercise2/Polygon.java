
import java.util.*;


class Polygon {
    private final LinkedHashSet <Line> polygon;
    private int objID;
    private static int classID;
    Iterator <Line> it;

    public Polygon(LinkedHashSet<Line> polygon) {
        this.polygon = new LinkedHashSet<Line>();
        for(Line l: polygon)
            this.polygon.add (l);
        objID = ++ classID;
        it = this.polygon.iterator();
    }

    public Iterator <Line> getLine() {
        it = polygon.iterator();
        return it;
    }

    public static int classID(){
        return classID;
    }


    public String toString() {
        // THIS METHOD DOESN'T WORK. AS PART OF EXERCISE-2 STUDENTS MUST FIX
        // IT TO RETURN A STRING WITH THE INFORMATION ABOUT START AND END
        // POINTS OF N LINES OF A POLYGON. AS SHOWN IN THE EXAMPLE BELOW:
        // The lines in polygon 1 are:
        //   Line 1: starts at (20, 30), and ends at (50, 100)
        //   Line 2: starts at (50, 100), and ends at (100, 30)
        //   Line 3: starts at (100, 30), and ends at (20, 30)
        //The lines in polygon 1 are:
        //Line 1: starts at (20, 30), and ends at (50, 100)
        //Line 2: starts at (50, 100), and ends at (105, 30)
        //Line 3: starts at (105, 30), and ends at (20, 30)
        //The perimeter of the polygon 1 is 250.18:

        String str = "";
        while (it.hasNext()){
            Line r = it.next();
            str += r.toString();
            str += "\n" ;

        }
        String s = "The Lines in polygon " + (objID) + " are:\n"
                + str;


        ;

        return s;
    }
}


