import java.util.HashMap;
class IsUnique{
	public static void main(String args[]){
		
		if(isUnique("Hello")){
			System.out.println("Hello has unique characters");	
		}		
		else{
			System.out.println("Hello is does not have unique characters");
		} 

		if(isUnique("Remo")){
			System.out.println("Remo has unique characters");	
		}		
		else{
			System.out.println("Remo is does not have unique characters");
		} 

	}
	private static boolean isUnique(String s){
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
		for(Character c: s.toCharArray()){
			if(charCount.get(c) ==null || charCount.get(c) == 0){
				charCount.put(c, 1);
				//System.out.println("Char Count of "+c+": "+charCount.get(c
			}
			else{
				return false;
			}
		}
		return true;
	} 
}
