package Week12;

public class Q1 {
	public static byte[] intToByteArray(int value) {
		int bytelen = Integer.SIZE/8;
		byte [] byteArray= new byte[bytelen];
		int s=0;
		for(int i=0;i<bytelen;i++) {
			
			s = (bytelen-1-i)*8;
			byteArray[i]= (byte)(value>>s);
		}
		return byteArray;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
