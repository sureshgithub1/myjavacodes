package thetest;

class DemoforPolymorphysm{
	
	public int add(int x, int y){
		
		return x+y;
		
	}
	
	public int add(int x, int y,int z){
		
		
		return x+y+z;
	}
	
	
	
}



public class Test {

	public static void main(String[] args) {
		
		DemoforPolymorphysm demoforPolymorphysm=new DemoforPolymorphysm();
		
		
	int sum=	demoforPolymorphysm.add(4, 5);
	
	int sum1=demoforPolymorphysm.add(4, 5, 6);
	
	System.out.println(sum);
	System.out.println(sum1);
		
		
		
	}

}
