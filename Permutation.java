import java.util.Arrays;
class Permutation{
	public static void main(String args[]){
		if(isPermutation("abcd", "dacb")){
			System.out.println("abcd and dacb has permutation");
		}
		else{
			System.out.println("abcd and dacb has no permutation");
		}
		if(isPermutation("abcd", "dace")){
			System.out.println("abcd and dace has permutation");
		}
		else{
			System.out.println("abcd and dace has no permutation");
		}
	}
	private static boolean isPermutation(String a, String b){
		char[] aCharArray = a.toCharArray();
		char[] bCharArray = b.toCharArray();
		Arrays.sort(aCharArray);
		Arrays.sort(bCharArray);
		if(new String(aCharArray).equals(new String(bCharArray))){
			return true;
		}
		else{
			return false;
		}
	}
}
