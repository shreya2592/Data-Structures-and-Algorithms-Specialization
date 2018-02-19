package week1;

import java.util.Scanner;
import java.util.Stack;

public class BracketBalance {

	public static int balancedBrackets(String br){
		
		boolean result;
		int position =0;
		Stack<Character> stack = new Stack<Character>();
		for (int i=0;i<br.length();i++){
			char ch= br.charAt(i);
			if(ch=='('|| ch=='[' ||ch=='{'){
				stack.push(ch);
				position++;
			}
						
			if (ch==')'||ch=='}'|| ch==']'){
				  if (stack.isEmpty())
	                    return position;
	              else if(!isMatching(stack.pop(), ch))
	                        return position;
	              else 
	            	  position--;
			}
			
			
			
		}
		if(!stack.isEmpty())
			return position;
		return -1;
		

	}
		
		public static boolean isMatching(char c1, char c2){
			
			  if(c1=='(' && c2==')')
	                return true;
	            else if (c1=='{' && c2=='}')
	                return true;
	            else if (c1=='[' && c2==']')
	                return true;
	            else 
	                return false;
			
		}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		String bk= sc.next();
		int result= balancedBrackets(bk);
		
		if(result==-1){
			System.out.println("Success!!");
		}
		
		else{
			System.out.println(result);
		}
		
		
		sc.close();

	}

}

