public class JobApplicationRunner{
public static void main(String args[]){
		
		JobApplication job1= new JobApplication();
		
		String[] skills={"Java","MySql","Html","Css","javaScript"};
		JobApplication job2= new JobApplication("Jhenkar","JAVA-Developer",23,"B.E",true,89,82,skills);
		
		JobApplication job3= new JobApplication();
		job3.jobCriteria1();
		job3.jobCriteria2(23,"B.E");
		job3.jobCriteria3("B.E");
		job3.jobCriteria4(82,"B.E");
		job3.percentageCount(85,56,98,75,65,74);
		
		
	}
	}