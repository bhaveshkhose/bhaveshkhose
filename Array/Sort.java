package Array;

public class Sort {
	
	public static void main(String[] args) {
//		System.out.println("Bhavesh");
//		String s = "    the Bhavesh : is , A : good coder:";
//		System.out.println(s);
//		System.out.println(s.trim().toLowerCase().replaceAll("[^a-z-0-9]", ""));
//		
		int[] nums = {0,0,1,1,0,1,1,0,0,0,1};
		int right =0;
		int zerocount =0;
		while(nums[right] == 1) {
			
			if(nums[right ] == 0)
				{
					System.out.println(zerocount++);
				}
			right++;	
		}
		
		
		
	
	}

}
