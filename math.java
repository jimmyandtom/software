 public class math{
	public static void main(String[] args) {
		int x,y;
		int k=0;
		for(x=2;x<=20000;x++) {  
			boolean flag=true;
			for(y=2;y<x;y++) {
				if(x%y==0) {
					flag=false;
					break;
				}
			}
			if(flag) {
				k++;
				System.out.print(y+"\t");
				if(k%5==0) 
					System.out.println(x);
			}
		}
		}
	}
