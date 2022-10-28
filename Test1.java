public class Test1{
    public static void main (String[] args){
	for(int i=1;i<=6;i++){
		int j=1;
		for(int k=0;k<6;k++){
            if (k<6-i){
                System.out.print("*");
            }
            else {
                System.out.print(j);
                j=j+1;
            }
		}
		System.out.println();
	}
	}
}	