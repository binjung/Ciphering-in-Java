public class caesar {
	
	public static void main (String args[]){

		int x = Integer.parseInt (args[1]); // Declaring that CmdLine #2 is Integer
		char msgs[] = args[0].toCharArray(); // Converting 1st Arg. to Array of Characters
		int encryptedchar = 0; 
		char encrypted;

		for (int letter = 0; letter < msgs.length; letter++){ // Incrementing the Variable, Letter

			if (msgs[letter]==' '){
				encryptedchar = 32; // For Space
			}

			else if ((int) msgs[letter] >= 97 && (int)msgs[letter] <= 122){ // 97=a, 122=z
				encryptedchar = (int)msgs[letter] + (x%26); // Equation for Encrypted Letter
				if (encryptedchar > 122) { 
					encryptedchar = encryptedchar - 26; // Specific Shift for Lowercase Letter
				}
			}
			
			else if ((int) msgs[letter] >= 65 && (int)msgs[letter] <= 90){ // 65=A, 90=Z
				encryptedchar = (int)msgs[letter] + (x%26); // Eqaution for Encrypted Letter
				if (encryptedchar > 90) {
					encryptedchar = encryptedchar - 26; // Specific Shift for Uppercase Letter
				}
			}
			
			else {
				encryptedchar = encryptedchar + x; // For Characters In Bound, Do the Regular Shift
			}

			encrypted = (char) encryptedchar;
			System.out.print (encrypted);
		}
			System.out.println(); // Print in the Next Line
	}
}