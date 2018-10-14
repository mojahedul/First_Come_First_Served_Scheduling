
package first_come_first_served_scheduling;

import java.util.Scanner;

import fcfs_schedule_requirements.FCFS_Scheduling_Requirements;

public class First_Come_First_Served_Scheduling {

	
	//private 
	
	public static void main(String[] args) throws Exception
	{
		int counter_BurstTime;
		int counter_OrderInput;
		int process_Number = 0;
		
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter process no: ");
		process_Number = input.nextInt();
		
		int burst_Time[] = new int[process_Number+1];
		int process_OrderQueue[] = new int[process_Number+1];
		
		
		System.out.println("\nEnter processes burst time: \n");
		
		for( counter_BurstTime = 1; counter_BurstTime <= process_Number; counter_BurstTime++ )
		{
			System.out.printf("Process %d burst time: ", counter_BurstTime);
			burst_Time[counter_BurstTime] = input.nextInt();
		}
		
//		for( counter_BurstTime = 1; counter_BurstTime <= process_Number; counter_BurstTime++ )
//		{
//			
//			System.out.print(" " + burst_Time[counter_BurstTime]);
//		}
		
		//System.out.println(process_Number);
		
		
		
		System.out.print("\nEnter the order of the processes arrival(with space): ");
		
		for( counter_OrderInput = 1; counter_OrderInput <= process_Number; counter_OrderInput++ )
		{
			process_OrderQueue[counter_OrderInput] = input.nextInt();
		}
		
		
//		for( counter_OrderInput = 1; counter_OrderInput <= process_Number; counter_OrderInput++ )
//		{
//			System.out.print(" " + process_OrderQueue[counter_OrderInput]);
//		}
		
		
		FCFS_Scheduling_Requirements object_FCFS = new FCFS_Scheduling_Requirements(process_Number, burst_Time, process_OrderQueue);
		
		object_FCFS.Grant_Chart();
		object_FCFS.Times();
		
		
		
	} //End of Main() Method;
	
	

} // End of public class First_Come_First_Served_Scheduling;