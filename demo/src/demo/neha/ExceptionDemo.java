package demo.neha;



public class ExceptionDemo {
		
		public static void main(String[] args) {
			try{
					String n=null;
						System.out.println(n.length());

					}
					catch(NullPointerException e){
						System.out.println(e);}
					
					System.out.println("program is end");
				}

	}
