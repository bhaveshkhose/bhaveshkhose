public class Projects{

    public static int power_0f_two(int n){
        if(n==0)
        {
            return n;
        }
        return n*power_0f_two(n-1);


    }

    public static void main(String[] args) {
        power_0f_two(4);
    }

}