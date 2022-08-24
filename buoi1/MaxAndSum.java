package buoi1;

public class MaxAndSum {

	public static void main(String[] args) {
		double max = Double.MIN_VALUE, sum = 0, n = 0;
		for(String s : args){
			try{
				n = Double.parseDouble(s);
			}
			catch (NumberFormatException e){
				n = 0;
			}
			sum += n;
			if(max < n) 
				max = n;
		}
		System.out.println("Tong: " + sum +"\nSo lon nhat: " + max);
	}

}
