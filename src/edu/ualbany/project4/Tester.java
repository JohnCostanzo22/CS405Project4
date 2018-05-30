package edu.ualbany.project4;

import java.util.ArrayList;

/**Tester class for Classes in
 *edu.albany.project4 package
 */
public class Tester {

	public static void main(String args[]) {
		
		//All tests are "expected: actual"
		//Testing BinaryWord and Complement
		BinaryWord b = new BinaryWord("001011");
		BinaryWord b2 = new BinaryWord("1111111");
		
		System.out.println("001011: " + b);
		System.out.println("110100: " + b.complement());
		System.out.println("true: " + b.equals(b));
		System.out.println("false: " + b.equals(b2));
		System.out.println("1111111: " + b2);
		System.out.println("0000000: " + b2.complement() +"\n");
		
		//Testing PositiveInteger and Semigroup
		PositiveInteger p = new PositiveInteger(50);
		PositiveInteger p2 = new PositiveInteger(150);
		PositiveInteger p3 = new PositiveInteger(100);
		
		System.out.println("100: " + p3);
		System.out.println("200: " + p.operator(p2));
		System.out.println("false: " + p.equals(p3));
		System.out.println("true: " + p.equals(new PositiveInteger(50)));
		System.out.println("150: " + p3.operator(p) + "\n");
		
		ArrayList<PositiveInteger> list = new ArrayList<>();
		list.add(p);
		list.add(p2);
		list.add(p3);
		System.out.println("300: " + PositiveInteger.combine(list));
		
		//Testing RGBColor, Semigroup, and compliment
		RGBColor r = new RGBColor(10,10,10);
		RGBColor r2 = new RGBColor(255,255,255);
		RGBColor r3 = new RGBColor(0,0,0);
		
		System.out.println("10,10,10: " + r);
		System.out.println("245,245,245: " + r.complement());
		System.out.println("127,127,127: " + r2.operator(r3));
		System.out.println("false: " + r.equals(r2));
		System.out.println("true: " + r.equals(new RGBColor(10,10,10)));
		
		ArrayList<RGBColor> list2 = new ArrayList<>();
		list2.add(r);
		list2.add(r2);
		list2.add(r3);
		System.out.println("66,66,66: " + RGBColor.combine(list2));
	}
}
