class RailFence{
	public static void main(String args[]){
		String plainText = args[0];
		StringBuffer cipherText =  new StringBuffer();
		StringBuffer deCipherText =  new StringBuffer();
		int length = plainText.length();
		int count=0;
		for(int i=0;i<length;i++)
		{
			cipherText.append(plainText.charAt(i));
			count++;
			i++;
		}
		for(int i=1;i<length;i++)
		{
			cipherText.append(plainText.charAt(i));
			i++;
		}
		System.out.println("Here is the cipher text");
		System.out.println(cipherText);
		System.out.println("Decryption is");
		if(length%2==0)
		{length=length/2;}
		else
		{length=(length/2) + 1;}
		for(int i=0;i<length;i++)
		{
			deCipherText.append(cipherText.charAt(i));
			if(i==length-1){
			break;
			}
			else{
			deCipherText.append(cipherText.charAt(count+i));
			}
		}
		System.out.println(deCipherText);
	}
}
