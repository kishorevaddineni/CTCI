
class PalindromePermutation{
	public static void main(String[] args){
		
		if(getPalindromePermutation("Tact coa")){		
			System.out.println("Entered String is palindrome");
		}
		else{
			System.out.println("Entered String is not palindrome");
		}
	}
	static boolean getPalindromePermutation(String input){
		
		char[] cArr= input.toLowerCase().toCharArray();

		//Create HashTable for characters in string
		int[] hashTable = new int[128];
		for(int i=0;i<cArr.length;i++){
			//int n = cArr[i];
			//System.out.println(cArr[i] +": "+n);
			hashTable[cArr[i]]++;
			//System.out.println(hashTable[cArr[i]]);
		} 

		//Check whether the input string is Palindrome or not from HashTable
		int oddCharCount = 0;
		int noOfChar = 0;
		boolean includeSpaces = false;
		for(int i=0;i<hashTable.length;i++){
			if(hashTable[i]!=0){
				if((i !=32) ||  includeSpaces){
					noOfChar = noOfChar + hashTable[i];
					if((hashTable[i]%2) != 0){
						oddCharCount++;
						if(oddCharCount>1) return false;
					}
				}
				
				
			}
		}
		if((oddCharCount == 1) && (noOfChar%2 == 0)){
			return false;
		}
		
		return true;
	}
}
