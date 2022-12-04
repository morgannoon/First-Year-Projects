package men83_lab10;

public class recursion {

	public static void main(String[] args) {
		System.out.println(sumOfDigits(-67));
		int[]list= {1,4,8,3,7};
		printArrayElements(list,list.length-1);
		//printCombos(list,"",0,3);
	}
	public static void printArrayElements(int[] a, int index) {
		if(index!=-1) {
			printArrayElements(a, index-1);
			System.out.println(a[index]);
		}
	}
	
	public static int sumOfDigits(int x) {
		int sum = 0;
		int num = Math.abs(x);
		while(num>0) {
			sum+=num%10;
			num/=10;
		}
		return sum;
	}
	
	/*public static void printCombos(int[] a, String out, int startIndex, int k) {
		
		String StringN = Arrays.toString(a);
		String StringList[]= StringN.substring(1,StringN.length()-2).split(", ");
			for(int i=startIndex;i<k;i++) {
				out += StringList[i];
			}
			out+="\n";
			System.out.print(out);

	}*/
}		
