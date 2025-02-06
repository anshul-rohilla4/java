public class main {
	

	public static void main(String[] args) {
		human human01=new human("niko",2005,60.2);
		human human02=new human("tommi",2003,55);

		System.out.println(human01.name);
		System.out.println(human02.name);

		
		
	}
	static class  human {
		String name;
		int YoB;
		double weight;
		
		human(String name,int YoB,double weight){ //constructor
			this.name = name;
			this.YoB = YoB;
			this.weight = weight;
			
		}
		
	}
	
}
