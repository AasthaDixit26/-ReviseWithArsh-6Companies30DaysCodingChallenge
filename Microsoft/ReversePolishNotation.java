package Microsoft;

import java.util.Stack;

public class ReversePolishNotation {
	 public static int evalRPN(String[] tokens) {
	        Stack<Integer> t=new Stack();
	        for(int i=0;i<tokens.length;i++) {
	        	if(tokens[i].equals("+" )|| tokens[i].equals("-")|| tokens[i].equals("*")|| tokens[i].equals("/")) {
	        		int store1=t.pop();
	        		int store2=t.pop();
	        		if(tokens[i].equals("+")) {
	        			t.push(store2+store1);
	        		}
	        		if(tokens[i].equals("-")) {
	        			t.push(store2-store1);
	        		}
	        		if(tokens[i].equals("*")) {
	        			t.push(store2*store1);
	        		}
	        		if(tokens[i].equals("/")) {
	        			t.push(store2/store1);
	        		}
	        		
	        	}
	        	else {
	        		int number=Integer.parseInt(tokens[i]);
	        		t.push(number);
	        	}
	        }
	    return t.peek();
	 }
	

}
