public class vigenere {
	
	public static void main (String args[]){
		
		char msgs[] = args[0].toCharArray(); // Declaring that 1st Argument is in Character
		char code[] = args[1].toCharArray(); // Declaring that 2nd Argument (code) is in Character
		int encryptedchar = 0;
		char encrypted;
		int myCount = 0; // Start Count from 0

		for (int letter = 0; letter < msgs.length; letter++){ // Incrementing the Variable, Letter

			if (msgs[letter]==' '){
				encryptedchar = 32; // For Space

			}

			else if ((int) msgs[letter] >= 97 && (int)msgs[letter] <= 122){ // a=97, z=122
				encryptedchar = ((int)msgs[letter]) + (code[myCount] - 96) %26; // Special Equation for Lowercase
				if (encryptedchar > 122) {
					encryptedchar = encryptedchar - 26; // Subtract 26 if it is out-of-bound, to go to the first letter
				}
			}
			else if ((int) msgs[letter] >= 65 && (int)msgs[letter] <= 90){ // A=65, Z=90
				encryptedchar = ((int)msgs[letter]) + (code[myCount] - 96) %26; // Special Equation For Uppercase
				if (encryptedchar > 90) {
					encryptedchar = encryptedchar - 26; // Subtract 26 if it is out-of-bound, to go to the first letter
				}
			}
			
			myCount++; // incrementing myCount
			if (myCount >= code.length){
				myCount = 0; // If the Code Length goes over the letter in args[0], Start Counting From the Beginning
			}

			encrypted = (char) encryptedchar;
			System.out.print (encrypted);
		}
			System.out.println(); // Print in the Next Line
	}
}