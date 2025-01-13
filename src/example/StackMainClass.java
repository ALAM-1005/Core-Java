package example;

import java.util.Stack;

public class StackMainClass {
	public static void main(String[] args) {

		Stack<Integer> s = new Stack<Integer>();
		s.push(10);  // add() can be used
		s.push(20);
		s.push(30);
		System.out.println(s);//[10,20,30]
		System.out.println(s.pop());//remove() can be used
		System.out.println(s.pop());
		System.out.println(s.pop());
		//System.out.println(s.pop());  EmptyStackException
		
		
	}
}
