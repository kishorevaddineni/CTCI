//Check if a string s2 is rotation of string s1

class StringRotation{
	public static void main(String[] args){
		//clockwise rotation
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		if(isRotation(s1, s2)){
			System.out.println(s2+ " is rotation of "+s1);
		}
		else{
			System.out.println(s2+ " is not rotation of "+s1);
		}
		
		//anti-clockwise rotation
		s1 = "waterbottle";
		s2 = "lewaterbott";
		
		if(isRotation(s1, s2)){
			System.out.println(s2+ " is rotation of "+s1);
		}
		else{
			System.out.println(s2+ " is not rotation of "+s1);
		}
		
		//No rotation
		s1 = "waterbottle";
		s2 = "lewaterbot";
		
		if(isRotation(s1, s2)){
			System.out.println(s2+ " is rotation of "+s1);
		}
		else{
			System.out.println(s2+ " is not rotation of "+s1);
		}
		
	}
	
	static boolean isRotation(String s1, String s2){
		return (s2+s2).contains(s1);
	}
}