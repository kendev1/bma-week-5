import java.util.Calendar;
import java.text.SimpleDateFormat;
/***************************************************************************
 * 
 * 
 * @author Kenneth Ho
 * Create Task Object - Define minimal repesentation of a Task
 */


public class Assignment {

	/**
	 * @param args
	 */
	
	

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Testing GetElements .........\n");
		System.out.println("Testing passing correct data- (index is 2, array size of string array is 6\n)");
		String[]TestArray = {"red", "blue", "indigo", "yellow", "green", "white"};
		String Elementresult = getElement(TestArray,2);
		System.out.println("Result of index search: " + Elementresult + ". It should be indigo\n");
		
		System.out.println("Testing passing incorrect data- (index is 18 and array size of string array is 6\n)");
	    Elementresult = getElement(TestArray,18);
		System.out.println("Result of index search: " + Elementresult + ". It should be NULL\n\n\n");

		System.out.println("Testing Task constructors by printing Task Objects .........\n");
		System.out.println("println Task() - WILL NOT WORK WITH JUST AN OBJECT ...");
		Task ATask_1 = new Task();
//		System.out.println(ATask_1 + "\n");
		Task ATask_2 = new Task("Grade The Finals");
//		System.out.println(ATask_2 + "\n");
		Task ATask_3 = new Task("Complete December coursework", "11-10-2012", "11-25-2012");
//		System.out.println(ATask_3 + "\n");
		
		System.out.println("println Task() - WILL WORK WITH REFERENCING MEMBERS OF OBJECT ...");
		System.out.println("Task Desciption, no parms: " + ATask_1.TaskDescription + "\n");
		System.out.println("Task Start Date, no parms: " + ATask_1.TaskStartDate + "\n");
		System.out.println("Task End Date  , no parms: " + ATask_1.TaskEndDate + "\n\n");
		
		System.out.println("println Task() - WILL WORK WITH REFERENCING MEMBERS OF OBJECT ...");
		System.out.println("Task Desciption, pass TaskTitle: " + ATask_2.TaskDescription + "\n");
		System.out.println("Task Start Date, default: " + ATask_2.TaskStartDate + "\n");
		System.out.println("Task End Date  , default: " + ATask_2.TaskEndDate + "\n\n");
		
		System.out.println("println Task() - WILL WORK WITH REFERENCING MEMBERS OF OBJECT ...");
		System.out.println("Task Desciption, pass TaskTitle: " + ATask_3.TaskDescription + "\n");
		System.out.println("Task Start Date, pass TaskBeginDate: " + ATask_3.TaskStartDate + "\n");
		System.out.println("Task End Date  , pass TaskCompleteDate: " + ATask_3.TaskEndDate + "\n\n");
		
		
		
		
		
		
		System.out.println("Testing Task Object .........\n");					
		
       	// Test Task with no parameters	
		Task ATask = new Task();
		String TaskVal = ATask.toString();
		System.out.println(TaskVal + "\n");
		
		// Test Task with one parameter - TaskTitle
		TaskVal = ATask.toString("Grade The Finals");
		System.out.println(TaskVal + "\n");
		
		// Test Task with all three parameters- TaskTitle, TaskBeginDate and TaskCompleteDate
		TaskVal = ATask.toString("Complete December coursework", "11-10-2012", "11-25-2012");
		System.out.println(TaskVal + "\n");
		
	
	}
	
	static String getElement(String[] values, int index) {
		String[] TaskArray;
		TaskArray = values;
		int Taskindex = index;
		if ((Taskindex < 0) || (Taskindex >= values.length)) {
			return null;	
		} else {
			return TaskArray[Taskindex];
		}
		
	}
	
	

	
	public static class Task {
		public String TaskDescription;
		public String TaskStartDate;
		public String TaskEndDate;
		public static final String Date_Format_Now = "MM-dd-yyyy";

/*********************************************************************************
 *      Constructers		
 */
		
 	    public  Task() {
 	    	this.TaskDescription = "Complete Weekly Lecture";
 	    	Calendar taskcal = Calendar.getInstance();
 	    	SimpleDateFormat taskdf = new SimpleDateFormat(Date_Format_Now);
 	    	this.TaskStartDate = taskdf.format(taskcal.getTime());
 	    	taskcal.add(Calendar.DATE, 7);
 	    	this.TaskEndDate = taskdf.format(taskcal.getTime());	    	
 	    	String TaskInfo = "The Task is: " + this.TaskDescription + "\n" +"The Start Date for Task is: " + this.TaskStartDate + "\n" + "The End Date for Task is: " + this.TaskEndDate + "\n\n";
 
 	    }
 	    
 	    public  Task(String TaskTitle) {
 	    	this.TaskDescription = TaskTitle;
 	    	Calendar taskcal = Calendar.getInstance();
 	    	SimpleDateFormat taskdf = new SimpleDateFormat(Date_Format_Now);
 	    	this.TaskStartDate = taskdf.format(taskcal.getTime());
 	    	taskcal.add(Calendar.DATE, 7);
 	    	this.TaskEndDate = taskdf.format(taskcal.getTime());
 	    	String TaskInfo = "The Task is: " + this.TaskDescription + "\n" +"The Start Date for Task is: " + this.TaskStartDate + "\n" + "The End Date for Task is: " + this.TaskEndDate + "\n\n";
	
 	    }
 	    
 	    public Task(String TaskTitle,String TaskBeginDate, String TaskCompleteDate) {
 	    	this.TaskDescription = TaskTitle;
 	    	this.TaskStartDate = TaskBeginDate;
 	    	this.TaskEndDate = TaskCompleteDate;
 	    	String TaskInfo = "The Task is: " + this.TaskDescription + "\n" +"The Start Date for Task is: " + this.TaskStartDate + "\n" + "The End Date for Task is: " + this.TaskEndDate + "\n\n";
 	    }
 	    
 /***********************************************************************************************/	    
 // Case #1: Override toString class from Object superclass -                                   
 //	    Signature: No Parameters                                                                
 //     Return: TaskInfo - (String description of Task)	                                                    
 //	    Defaults: TaskDescription- "Complete Weekly Lecture                                     
 //               TaskStartDate - Current time when task is created                            
 //               TaskEndDate   - One week from Start Date                                       	    
 /***********************************************************************************************/	    
 	    
	    public String toString() {
 		    this.TaskDescription = "Complete Weekly Lecture";
	    	Calendar taskcal = Calendar.getInstance();	    	
            SimpleDateFormat taskdf = new SimpleDateFormat(Date_Format_Now);
 	    	this.TaskStartDate = taskdf.format(taskcal.getTime());
 	    	taskcal.add(Calendar.DATE, 7);
 	    	this.TaskEndDate = taskdf.format(taskcal.getTime());
 	    	String TaskInfo = "The Task is: " + this.TaskDescription + "\n" +"The Start Date for Task is: " + this.TaskStartDate + "\n" + "The End Date for Task is: " + this.TaskEndDate + "\n\n";
 	    	return TaskInfo;
 	    }
	    
/***********************************************************************************************/	    
// Case #2: Override toString class from Object superclass -                                   
//	   Signature: TaskDescription = TaskTitle, TaskStartDate and TaskEndDate are defaulted   
//     Return: String description of Task
//	           TaskDescription = TaskTitle (first parameter) 
//     Defaults: TaskStartDate - Current time when task is created                             
//               TaskEndDate   - One week from Start Date                                      
/***********************************************************************************************/	   	    
 	    
	    public String toString(String TaskTitle) {
 	    	this.TaskDescription = TaskTitle;
 	    	Calendar taskcal = Calendar.getInstance();
 	    	SimpleDateFormat taskdf = new SimpleDateFormat(Date_Format_Now);
 	    	this.TaskStartDate = taskdf.format(taskcal.getTime());
 	    	taskcal.add(Calendar.DATE, 7);
 	    	this.TaskEndDate = taskdf.format(taskcal.getTime());
 	    	String TaskInfo = "The Task is: " + this.TaskDescription + "\n" +"The Start Date for Task is: " + this.TaskStartDate + "\n" + "The End Date for Task is: " + this.TaskEndDate + "\n\n";
 	    	return TaskInfo;
 	    }
	    
/***********************************************************************************************/	    
// Case #3: Override toString class from Object superclass -                                   
//	    Signature: TaskDescription = TaskTitle, TaskStartDate = TaskBeginDate and TaskEndDate=TaskCompleteDate                                                               
//      Return: TaskInfo - (String description of Task)	                                                    
//	    TaskDescription- TaskTitle (first parameter), TaskStartDate = TaskBeginDate (second parameter)
//                       TaskEndDate = TaskComplete (third parameter                                     
//      TaskStartDate - Current time when task is created                            
//      TaskEndDate   - One week from Start Date                                       	    
/***********************************************************************************************/	    
	    
	    public String toString(String TaskTitle, String TaskBeginDate, String TaskCompleteDate) {
 	    	this.TaskDescription = TaskTitle; 	    	
 	    	this.TaskStartDate = TaskBeginDate;	    	
 	    	this.TaskEndDate = TaskCompleteDate;
 	    	String TaskInfo = "The Task is: " + this.TaskDescription + "\n" +"The Start Date for Task is: " + this.TaskStartDate + "\n" + "The End Date for Task is: " + this.TaskEndDate + "\n\n";
 	    	return TaskInfo;
 	    }
 	    
		
	}	

}




