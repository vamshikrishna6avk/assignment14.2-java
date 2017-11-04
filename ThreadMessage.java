/*printing message "welcome to acadgild" for 10 times each after 3 second and starting the thread more than one time by handling exception*/
package threadexample; //created package name as threadexample

public class ThreadMessage extends Thread{ //created class names as ThreadMessage which extends thread to implement the threads

		public void run(){   // Here  Extending Thread Class is required to 'override run()' method.
			                 // Here The run method contains the actual logic to be executed by thread.  
			
			for (int orderNumber=1;orderNumber<=10;orderNumber++){	 //here creating a for loop  to execute it  for 10 times
				try{                            //the sleep method throws an Interrupted Exception to handle this we are using try catch block
						
						Thread.sleep(3000);//here sleep() it makes current executing thread to sleep for a specified interval of time. Time is in milli seconds.
				}
				catch (InterruptedException e){      // throws an interrupted exception
						
				}
	    System.out.println("Welcome to AcadGild");   //it gives the output as welcome to AcadGild for every 3 seconds
	  //system is used to return code
        //out is a static member
   //println is used to print text and gives output
			}
		  }   
		  public static void main(String args[]){      //here created main method
			//Here public is a access modifier which defines who can access this method
				//Here static a keyword which identifies class related thing
				//void is used to define return type of the method,void means method wont return any value
				//main is name of method,and to display
				//declares method String[]
				//String[]args means arguments will be passed into main method and says that main() as a parameter
			  
		    ThreadMessage object=new ThreadMessage();    //created  object 
		    
		     object.start();   //Creating of thread object never starts execution, we need to call 'start()' method to run a thread
		  }
		
		}  

	