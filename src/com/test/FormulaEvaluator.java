package com.test;

import java.awt.*;
import javax.swing.*;

public class FormulaEvaluator 
{
	public static void main(String args[])
	{
		String str = "mnopqmrstuv";
		int checker = 0;
		for (int i = 0; i< str.length(); i++)
		{
			int val = str.charAt(i) - 'a';
			System.out.println("Checker Before: " + Integer.toBinaryString(checker));
			System.out.println("Val:" + Integer.toBinaryString(val));
			if ((checker & (1<<val)) > 0)
			{
				System.out.println(" false");
				return;
			}
			checker |= (1<<val);
			System.out.println("Checker:" + Integer.toBinaryString(checker));
			System.out.println("Left Shift:" + (1<<val));
		}
		System.out.println(" true");
	}
}
	   /* JFrame f1;
	    JPanel p1, p2;//, p3;
	    GridLayout gl;

	    FormulaEvaluator()
	    {
	        f1 = new JFrame( "Color RGB Use" );
	        p1 = new JPanel();
	        p2 = new JPanel();
	        //p3 = new JPanel();

	        gl = new GridLayout(3,1);

	        f1.getContentPane().add( p1 );
	        f1.getContentPane().add( p2 );
	       // f1.getContentPane().add( p3 );

	        f1.setSize( 400, 300 );
	        f1.setVisible( true );
	        f1.setLayout( gl );

	        BaseColor pan1 = new BaseColor(Color.GREEN.getRed(), Color.GREEN.getGreen(), Color.GREEN.getBlue());
	        p1.setBackground(pan1.createColor());

	        BaseColor pan2 = new BaseColor(200, 240, 200);
	        p2.setBackground(pan2.createColor());

	        f1.setDefaultCloseOperation( f1.EXIT_ON_CLOSE );
	    }

	    public static void main( String asd[] )
	    {
	        new FormulaEvaluator();
	    }
	}
	/*public static void main(String args[])
	{
		System.out.println(evaluateFormula("678.0*5+(0.5*(20-5))"));
	}
	
	protected static double evaluateFormula(String formulaReplaced) 
	{
		if (formulaReplaced == null)
		{
			return 0.0;
		}
		formulaReplaced = "(" + formulaReplaced + ")";
		Stack<String> operators  = new Stack<String>();
        Stack<Double> values = new Stack<Double>();
        StringBuffer operand = new StringBuffer();
        for(char s : formulaReplaced.toCharArray())
        {
        	if (s == '(')
        	{
        		operators.push("" + s);
        	}
        	else if (s == '+' || s == '-' || s == '*' || s == '/')
        	{
        		if (operand != null && operand.length() > 0)
        		{
        			values.push(Double.parseDouble(operand.toString()));
        			operand = new StringBuffer();
        		}
        		if (! operators.isEmpty() && (! operators.peek().equals("(")))
        		{
        			String op = operators.pop();
            		double v = values.pop();
            		if (op.equals("+"))
        			{
        				v = values.pop() + v;
        			}
        			else if (op.equals("-")) 
        			{
        				v = values.pop() - v;
        			}
        			else if (op.equals("*"))  
        			{
        				v = values.pop() * v;
        			}
        			else if (op.equals("/"))
        			{
        				v = values.pop() / v;
        			}
        			values.push(v);        			
        		}
        		operators.push("" + s);
        	}
            else if (s == ')') 
            {
            	if (operand != null && operand.length() > 0)
        		{
        			values.push(Double.parseDouble(operand.toString()));
        			operand = new StringBuffer();
        		}
            	if (operators.peek() != "(")
            	{
            		String op = operators.pop();
            		double v = values.pop();
            		if (op.equals("+"))
        			{
        				v = values.pop() + v;
        			}
        			else if (op.equals("-")) 
        			{
        				v = values.pop() - v;
        			}
        			else if (op.equals("*"))  
        			{
        				v = values.pop() * v;
        			}
        			else if (op.equals("/"))
        			{
        				v = values.pop() / v;
        			}
        			values.push(v);
            	}
            	else
            	{
            		operators.pop();
            	}
            }
            else 
            {
            	operand.append(s);
            }
        }
        while (! operators.isEmpty())
        {
        	String op = operators.pop();
    		double v = values.pop();
    		if (op.equals("+"))
			{
				v = values.pop() + v;
			}
			else if (op.equals("-")) 
			{
				v = values.pop() - v;
			}
			else if (op.equals("*"))  
			{
				v = values.pop() * v;
			}
			else if (op.equals("/"))
			{
				v = values.pop() / v;
			}
			values.push(v);
        }
        return values.pop();
	}
}*/
