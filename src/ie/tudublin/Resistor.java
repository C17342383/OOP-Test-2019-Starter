package ie.tudublin;

import processing.core.PApplet;

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
    public void render();
    {
        for(int i = 0; i <=4;i++)
        {
            rect(gap, gap*2, gap*2,gap);
            gap = gap + add;
        }

    }

}