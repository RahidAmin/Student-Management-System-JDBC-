package Student;

import java.awt.Button;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		
	System.out.println("Welcome to Student Management...");
	System.out.println("             Manu                 ");
	System.out.println("Press 1 to add Students.. ");
	System.out.println("Press 2 to Delete Students.. ");
	System.out.println("Press 3 to Display Students.. ");
	System.out.println("Press 4 to Exit from Apps.. ");
	
    while(true) {
    
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Press the Button: ");
    int c=Integer.parseInt(br.readLine());
    
    if(c==1)
    {
    	//add students
    	System.out.println("Enter Student Name");
    	String name=br.readLine();
    	System.out.println("Enter Student Phone no");
    	String PhoneNo=br.readLine();
    	System.out.println("Enter Student City");
    	String City=br.readLine();
    	Student st=new Student(name,PhoneNo,City);
    	boolean answer=StudentDao.InsertStudentsIntoDb(st);
    	if(answer)
    	{
    		System.out.println("Students added Successfully ");
    	}
    	else
    	{
    		System.out.println("Something went wrong try again");
    	}
    	System.out.println(st);
    	
    }
    else if(c==2)
    {
    	System.out.println("Enter Student Id to Delete: ");
    	//delete students
    	int UserId=Integer.parseInt(br.readLine());
    	boolean f=StudentDao.deteleStudent(UserId);
    	if(f)
    	{
    		System.out.println("Successfully Deleted....");
    	}else
    	{
    		System.out.println("Something went wrong try again...");
    	}
    }
    else if(c==3)
    {
    	//display students
    	StudentDao.ShowAllStudents();
    }
    else if(c==4)
    {
    	break;
    }
    else 
    {
    	
    }
    
    }
    System.out.println("Thank you for using my application...");
    
	}

}
