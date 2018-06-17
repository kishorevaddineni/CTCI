import java.util.Arrays;
class URLify{
	public static void main(String[] args){
		String strs[] = {"a b c", " a b c d", "ab c d "," ab c d  "};
		for(String s: strs){
			System.out.println("URLified "+s+": "+prepareURL(s, s.length()));
		}
	}
	private static String prepareURL(String s, int l){
		System.out.println("Processing: "+s);
		char[] cArr = s.toCharArray();
		int noOfSpaces = countNoOfSpaces(s.toCharArray(), l);
		System.out.println("No of spaces:" +noOfSpaces);
		char[] resultCArr = new char[cArr.length+(noOfSpaces*2)];
		int resultCArrIndex = 0; 
		for(int i=0; i<l;i++, resultCArrIndex++){
			if(cArr[i] == ' '){
				resultCArr[resultCArrIndex] = '%';
				resultCArr[resultCArrIndex+1] = '2';
				resultCArr[resultCArrIndex+2] = '0';
				resultCArrIndex = resultCArrIndex+2;
			}
			else{
				resultCArr[resultCArrIndex] = cArr[i];
			}
		}
		return new String(resultCArr);
	}
	private static int countNoOfSpaces(char[] cArr1, int l){
		int count = 0;		
		for(int i=0;i<l;i++){
			if(cArr1[i] == ' '){
				count++;	
			}
		}
		return count;
	}
}
