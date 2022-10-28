public class Test2{
    public static void main (String[] args){
	for(int i=1;i<=6;i++){
		for(int k=0;k<6;k++){
            if (k<6-i){
                System.out.print("*");
            }
            else {
                System.out.printf("%d",k-5+i);
            }
		}
		System.out.println();
	}
	}
}	