public class lines {
    public static int maxBisectors(int n) {
        if (n%2==0){
            return (n/2)*(n/2);
        }
        else {
            return (((n-1)/2)*((n-1)/2)+n/2);
        }
    }
}