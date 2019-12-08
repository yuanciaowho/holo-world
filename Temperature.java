/**
 * @author Yuanchao Hu
 * @version 2019-10-24
 */
public class Temperature {
	
	
	public static int coldest(double[] temperatures) {

		int count = 0;
		
		for(int i = 0; i < temperatures.length; i++) {
			if(temperatures[count] > temperatures[i]) {
				count = i;
			}
			
		}
		
		
		
		
		return count+1;
	}
	
	public static void main(String[] args) {
		double[] temperatures = new double[365];
		temperatures[30] = -10;
		temperatures[60] = -10;
		System.out.println(coldest(temperatures));
	}

}
