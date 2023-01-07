
public class Main
{
    
    public static boolean isRepeted(int array[], int x){
        boolean b = false;
        for(int n: array){
            if (x == n){
                b = true;
                break;
            }
        }
        return b;
    }
    
	public static void main(String[] args) {
        int array[] = {1, 2, 3};
		System.out.println(isRepeted(array, 1));
		System.out.println(isRepeted(array, 2));
		System.out.println(isRepeted(array, 4));
		
	}
}
