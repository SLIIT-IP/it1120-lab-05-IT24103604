import java.util.Scanner;

public class IT24103604Lab5Q3{
	public static void main(String[] args){
		
		final double CHARGE_PER_DAY =48000;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Start Date (1-31): ");
		int startDate = scanner.nextInt();
		
		System.out.print("End Date (1-31): ");
		int endDate = scanner.nextInt();
		
		if((startDate<1) || (startDate>31) || (endDate<1) || (endDate>31)){
			System.out.println("Start date and end date cannot be less than 1 or greater than 31");
			System.exit(0);
		}
		
		
		if(endDate<startDate){
			System.out.println("Start date should be less than the end date");
			System.exit(0);
		}
		
		int duration = endDate-startDate;
		double totalCost= (double) duration * CHARGE_PER_DAY;
		double discount=0;
		
		if(duration<3){
			discount=0;
		}else if((duration<=3) || (duration<=4)){
			discount=10;
		}else if(duration>=5){
			discount=20;
		}
		
		System.out.println("Room Charge Per Day: Rs. "+CHARGE_PER_DAY+"/=");
		System.out.println("Number of Days Reserved: "+duration);
		System.out.println("Total Amount to be Paid: "+(totalCost*((100-discount)/100)));
		
	}
}