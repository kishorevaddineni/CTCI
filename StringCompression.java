
class StringCompression{
	public static void main(String[] args){
		String strToCompress = "aaabbcddddda";
		System.out.println("Compressed String of '"+strToCompress+"' is '"+compressString(strToCompress)+"'");
		strToCompress = "aabbccdd";
		System.out.println("Compressed String of '"+strToCompress+"' is '"+compressString(strToCompress)+"'");
	}
	
	//This method compresses the consecutive characters in the string passed and return the result string
	static String compressString(String s){
		if(s == null || s.isEmpty()){
			return "";
		}
		StringBuffer compressedString = new StringBuffer();
		char prevChar = '\0';
		int charCount = 0;
		for(int i=0;i<s.length();i++){
			if(prevChar != s.charAt(i)){
				if(charCount>0){
					compressedString.append(prevChar+(charCount+""));
				}
				prevChar = s.charAt(i);
				charCount = 1;
			}
			else{
				charCount++;
			}
		}
		if(charCount>0){
			compressedString.append(prevChar+(charCount+""));
		}
		//If length of compressed string is not less than actual string then return actual string otherwise return compressed string
		if(compressedString.length() < s.length()){
			return compressedString.toString();
		}
		else{
			return s;
		}
	}
}