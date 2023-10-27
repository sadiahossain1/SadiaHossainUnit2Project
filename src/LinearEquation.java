public class LinearEquation {
    /* Instance Variables */
    private int x1;
    private int y1;
    private int x2;
    private int y2;


    /* Creates a LinearEquation object */
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

/* Calculates and returns distance between (x1, y1) and (x2, y2), rounded to
   the nearest hundredth */
    public double distance() {
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        distance = roundedToHundredth(distance);
        return distance;
    }

    /* Calculates and returns the y-intercept of the line between (x1, y1) and
       (x2, y2), rounded to the nearest hundredth */
    public double yIntercept() {
        double slope = (double) (y2 - y1) / (x2 - x1);
        double yInt = (double) y1 - (slope * x1);
        yInt = roundedToHundredth(yInt);
        return yInt;
    }

    /* Calculates and returns the slope of the line between (x1, y1) and
       (x2, y2), rounded to the nearest hundredth */
    public double slope() {
        double slope = (double) (y2 - y1) / (x2 - x1);
        slope = roundedToHundredth(slope);
        return slope;
    }

    /* Returns a String that represents the linear equation of the line through points
       (x1, y1) and (x2, y2) in slope-intercept (y = mx + b) form, e.g. "y = 3x + 1.5".
     */
    public String equation() {
        if ((y2 - y1) % (x2 - x1) != 0 && slope() > 0 && slope() != 1 && (y2 - y1) > 0) {
            if (yIntercept() > 0) {
                return "y = " + (y2 - y1) + "/" + (x2 - x1) + "x + " + yIntercept();
            } else if (yIntercept() < 0) {
                return "y = " + (y2 - y1) + "/" + (x2 - x1) + "x - " + Math.abs(yIntercept());
            } else {
                return "y = " + (y2 - y1) + "/" + (x2 - x1) + "x";
            }
        } else if ((y2 - y1) % (x2 - x1) == 0 && slope() != 1 && slope() != -1 && slope() != 0) {
            if (yIntercept() > 0) {
                return "y = " + (int) slope() + "x + " + yIntercept();
            } else if (yIntercept() < 0) {
                return "y = " + (int) slope() + "x - " + Math.abs(yIntercept());
            } else {
                return "y = " + (int) slope() + "x";
            }
        } else if (slope() == 1) {
            if (yIntercept() > 0) {
                return "y = x + " + yIntercept();
            } else if (yIntercept() < 0) {
                return "y = x - " + Math.abs(yIntercept());
            } else {
                return "y = x";
            }
        } else if (slope() == -1) {
            if (yIntercept() > 0) {
                return "y = -x + " + yIntercept();
            } else if (yIntercept() < 0) {
                return "y = -x - " + Math.abs(yIntercept());
            } else {
                return "y = -x";
            }
        } else if (((y2 - y1) < 0 && (x2 - x1) > 0) && ((y2 - y1) % (x2 - x1) != 0) ||
                ((y2 - y1) > 0 && (x2 - x1) < 0) && ((y2 - y1) % (x2 - x1) != 0)) {
            if (yIntercept() > 0) {
                return "y = -" + Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1) + "x + " + yIntercept();
            } else if (yIntercept() < 0) {
                return "y = -" + Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1) + "x - " + Math.abs(yIntercept());
            } else {
                return "y = -" + Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1) + "x";
            }
        } else if ((y2 - y1) < 0 && (x2 - x1) < 0 && (y2 - y1) % (x2 - x1) != 0) {
            if (yIntercept() > 0) {
                return "y = " + Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1) + "x + " + yIntercept();
            } else if (yIntercept() < 0){
                return "y = " + Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1) + "x - " + Math.abs(yIntercept());
            } else {
                return "y = " + Math.abs(y2 - y1) + "/" + Math.abs(x2 - x1) + "x";
            }
        } else {
            return "y = " + (int) yIntercept();
        }

    }

    /* Returns a String of the coordinate point on the line that has the given x value, with
       both x and y coordinates as decimals to the nearest hundredth, e.g (-5.0, 6.75) */
    public String coordinateForX(double xValue) {
        xValue = roundedToHundredth(xValue);
        double yValue = xValue * slope() + yIntercept();
        yValue = roundedToHundredth(yValue);
        return "The point on the line is (" + xValue + ", " + yValue + ")";
    }

    /* "Helper" method for use elsewhere in your methods; returns the value toRound rounded
        to the nearest hundredth

        HINT:  the Math.round method can help with this!
     */
    public double roundedToHundredth(double toRound) {
        toRound = toRound * 100;
        toRound = Math.round(toRound)/100.00;
        return toRound;
    }

    /* Returns a string that includes all information about the linear equation, each on
       separate lines:
         - The original points: (x1, y1) and (x2, y2)
         - The equation of the line in y = mx + b format (using equation() method)
         - The slope of the line, as a decimal (using slope() method)
         - The y-intercept of the line (using yIntercept() method)
         - The distance between the two points (using distance() method)

      This method should call all other appropriate methods to get the info it needs:
      equation(), slope(), yIntercept(), distance().

      */
    public String lineInfo() {
        return "The two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ")" + "\nThe " +
                "equation of the line between these points is: " + equation() + "\nThe slope of this line is: "
                + slope() + "\nThe y-intercept of the line is: " + yIntercept() + "\nThe distance between the " +
                "two points is: " + distance();
    }

}
