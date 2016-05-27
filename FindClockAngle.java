import java.util.Scanner;


 public class FindClockAngle {
	private static Scanner in;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		in = new Scanner(System.in);
		System.out.println("Enter time in hh:mm format:");
		double hour=in.nextDouble();
		double min=in.nextDouble();
		double angle=calcAngle(hour,min);
		System.out.println("The angle is:"+angle );

	}
	/*The minute hand moves 360 degree in 60 minute(or 6 degree in one minute) 
	 * and hour hand moves 360 degree in 12 hours(or 0.5 degree in 1 minute). 
	 * In h hours and m minutes, the minute hand would move (h*60 + m)*6 and 
	 * hour hand would move (h*60 + m)*0.5.*/
    private static double calcAngle(double hour,double min){
    	double angle;
    	
    	double hour_angle=0.5*(hour*60+min);
    	double min_angle=6*min;
    	angle=Math.abs(hour_angle-min_angle);
    	angle=Math.min(360-angle,angle);
    	
    	
        return angle;
    }
}
