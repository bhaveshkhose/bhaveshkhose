package Array;
import java.util.Stack;

class Solution {
	
	public static String intToRoman(int num) {
		int n[] = {1000,500,100};
		return 1+"bhavesh";
	}
	public static int romanToInt(String s) {
        int ans =0;
        int num =0;
        for (int i= s.length()-1;i>=0;i--)
        {
            switch(s.charAt(i))
            {
                case 'I':
                num =1;
                break;
                case 'V':
                num =5;
                break;
                case 'X':
                num =10;
                break;
                case 'L':
                num =50;
                break;
                case 'C':
                num =100;
                break;
                case 'D':
                num =500;
                break;
                case 'M':
                num =1000;
                break;
            }
            if(4 * num <ans)
            {
                ans =ans-num;
            }
            else
            {
                ans+=num;
            }
        }
       return ans; 
    }
	
	public static String simplifyPath(String path) {

        Stack<String> st = new Stack<>();
        String str[] = path.split("/");
        for(String c : str){

            if(c.equals("..")){
                if(!st.isEmpty()){
                    st.pop();

                }
            }
            else if(!c.equals("") && !c.equals(".")){
                st.push(c);
            }

        }
            StringBuilder string = new StringBuilder();
            for(String s : st){
                string.append("/").append(s);
            }

            return string.length() > 0 ? string.toString() : "/";
    }
	
	public  static void  main(String [] args) {
		
		
//		String str = "2";
//		String str1 = "3";
//		int a = Integer.parseInt(str);
//		int b = Integer.parseInt(str1);
//		System.out.println(a+b);
		
		int[] arr  = {1,2,3,4,5};
		
		
		
	}
	public static boolean isPerfectSquare(int num) {

        int left=1;
        int right=num;
        while(left<=right)
        {
            int mid=(left+right)/2; //8
            long square=(long) mid*mid;//64
            if(square==num)
            {
                return true;
            }
            else if(square<num){
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return false;

        
        
    }
}
