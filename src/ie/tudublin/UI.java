package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet
{	
	Resistor res;
	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
	}

	public void setup() 
	{

	}
	
	public void draw()
	{	
		loadColours();
		printColours();
		findColour();	
		loadResistor();
		printResistor();
		res.render();	
	}

	ArrayList<Colour> colours = new ArrayList<Colour>;

	public void loadColours()
	{
		Table table = loadTable("colours.csv", "header");
        for(TableRow tabler:table.rows())
        {
            Colour c = new Colour(tabler);
            colours.add(c);
        }   

	}

	public void printColours()
	{
		for(Colour c : colours)
		{
			System.out.println(c);
		}

	}

	public Colour findColor(int value)
	{
		for(int i =0; i< Sizeof(colours);i++)
		{
			if(i == value)
			{
				return colours(i);
			}
		}
	}

	ArrayList<Resistor> resistors = new ArrayList<Resistor>;

	public void loadResistor()
	{
		Table table2 = loadTable("resistors.csv", "row");
        for(TableRow tabler2:table2.rows())
        {
            Resistor r = new Resistor(tabler2);
            resistors.add(r);
        }   

	}

	public void printResistor()
	{
		for(Resistor r : resistors)
		{
			System.out.println(r);
		}

	}


}
