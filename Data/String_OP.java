package Data;

public class String_OP{
	
	public int String_To_Integer(String s) {
		
		s=s.trim();
		int sign =1;
		int i=0;
		
		if(s.charAt(0)=='-') {
			
			sign=-1;
			i++;
		}
		
		int sum=0;
		while(i<s.length())
		{
			char currentchar=s.charAt(i);
			if(currentchar < '0' || currentchar > '9')
			{
				break;
			}
			int a = currentchar -'0';
			
			sum = sum*10+a;
			i++;
		}
		
	return (int)(sign * sum);
		
}
	
	public  static void main(String[] args) {
		String_OP str1 = new String_OP();
		String_OP str2 = new String_OP();
		
		
		System.out.println(str1.String_To_Integer("        2838"));
		System.out.println(str2.Int_To_String(2763));
		
	}
	
	public long Int_To_String(int num)
	{
		long number = Integer.BYTES;
		return number;
		
	}

}
