package Array;

class Solution {
    public boolean isPerfectSquare(int num) {

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
