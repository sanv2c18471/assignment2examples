package demo;

public class Arraymaxandmin {
	public static void main(String[] args) {
		int[] a= {20, 30, 14, 23};
		int i,max=0,min=0;
		for(i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
 		System.out.println("max value:" +max);
 		min=a[0];
	for(i=0;i<a.length;i++) {
		if(a[i]<min) {
			min=a[i];
		}
	}
		System.out.println("min value:" +min);		
}
}
