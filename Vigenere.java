class Vigenere{
	public static void main(String args[]){
		String input = args[0];
		String key = args[1];
		String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		input = input.toUpperCase();
		key = key.toUpperCase();
		int temp; int j=0;
		char[] cipher = new char[input.length()];
		for(int i=0;i<input.length();i++)
		{
			if(j>=key.length())
			{
				j=0;
			}			
			temp = input.codePointAt(i) + alphabets.indexOf(key.charAt(j));
			j++;
			if(temp>=65 & temp<=90 )			
			{
				cipher[i] = (char)temp;
			}
			else
			{
				temp=temp-26;				
				cipher[i] = (char)temp;
			} 
		}
		for(int i=0;i<input.length();i++)
		{
			System.out.print(cipher[i]);
		}
	}
}
