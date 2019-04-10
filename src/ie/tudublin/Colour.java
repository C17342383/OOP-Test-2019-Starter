package ie.tudublin;

import processing.data.*;

public class Colour 
{
    public int r;
    public int g;
    public int b;
    private String string;

    public void Colour(int r, int g, int b, String string) 
    {
        this.r = r;
        this. g = g;
        this.b = b;
        this.string = string;
    }

    /**
     * @return the r
     */
    public int getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(int r) {
        this.r = r;
    }

    /**
     * @return the g
     */
    public int getG() {
        return g;
    }

    /**
     * @param g the g to set
     */
    public void setG(int g) {
        this.g = g;
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     * @return the string
     */
    public String getString() {
        return string;
    }

    /**
     * @param string the string to set
     */
    public void setString(String string) {
        this.string = string;
    }

    public String toString()
    {
        return r + "\t" + g + "\t" + b + "\t" + string;
        
    }

    public Colour(TableRow tabler)
    {
        this(tabler.getInt("r"), tabler.getInt("g"), tabler.getInt("b"), tabler.getString("colour"));
    }



}