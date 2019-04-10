package ie.tudublin;

import processing.core.PApplet;
import processing.core.*;

public class Resistor extends PApplet
{
    public int value;
    public int ones;
    public int tens;
    public int hundreds;

    public void Resistor(int value) 
    {
        hundreds = (value / 100);
        tens = (value - (hundreds * 100)) / 10;
        ones = value - ((hundreds * 100)  + (tens * 10));
        print(hundreds + ",");
        print(tens + ",");
        println(ones);

    }

    int gap = 500/13;
    int add = gap*3;
    int widthDivided = 500 - gap;
    int wDivplus = 500 + gap;
    int middle = 500;
    int resistorSize = gap*2;
    int gapDivide = gap/10;
    public void render();
    {
        for(int i = 0; i <=4;i++)
        {
            rect(gap, gap*2, gap*2,gap);
            line(gap*2,widthDivided,gap*2 , gap );
            line(gap*2, wDivplus, gap*2, gap);
            //fill(getR(), getG(), getB())
            rect(gap+(gapDivide*2, gapDivide, gap*2, gapDivide);
            gap = gap + add;
        }

    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the ones
     */
    public int getOnes() {
        return ones;
    }

    /**
     * @param ones the ones to set
     */
    public void setOnes(int ones) {
        this.ones = ones;
    }

    /**
     * @return the tens
     */
    public int getTens() {
        return tens;
    }

    /**
     * @param tens the tens to set
     */
    public void setTens(int tens) {
        this.tens = tens;
    }

    /**
     * @return the hundreds
     */
    public int getHundreds() {
        return hundreds;
    }

    /**
     * @param hundreds the hundreds to set
     */
    public void setHundreds(int hundreds) {
        this.hundreds = hundreds;
    }

}