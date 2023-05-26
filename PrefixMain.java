import java.util.Stack;


public class PrefixMain {		
			public static int Calc(int a,int b,char operator)
			{
				switch(operator)
				{
				case '$':return (int)Math.pow(a,b);
				case '+':return a+b;
				case '/':return a/b;
				case '*':return a*b;
				case '-':return a-b;
				
				}
				return 0;
			}
			public static int Solveprefix(String post)
			{
				Stack<Integer> s=new Stack<Integer>();
				for(int i=post.length()-1;i>=0;i--)
				{
					char sym=post.charAt(i);
					if(Character.isDigit(sym)){
						String operand=Character.toString(sym);
					   s.push(Integer.parseInt(operand));}
					   else
					   {
						   int a=s.pop();
						   int b=s.pop();
						   int c=Calc(a,b,sym);
						   s.push(c);
					   }
				}
				return s.pop();
				
				
			}
			public static void main(String[] args) 
			{
				String prefix="++4/*5-3229";
//				String r=prefix.reverse();
				int result=Solveprefix(prefix);
				System.out.println("Result:"+result);

			}

		


	}

