public class Weekend{
  public static final double gst = 0.18;
  public static void getGst(int price){
   System.out.println("the get GST of item is:");
   double totalprice = Weekend.gst*price+price;
   System.out.println("totalprice:"+totalprice);
   }
   public static void bank(){
	   
	   String accname = "rohith";
	   int deposit = 34556;
	   int credit = 2344;
	   int balance = deposit-credit;
	   System.out.println("acc name is:"+accname);
	   System.out.println("credit amount:"+credit);
	    System.out.println("deposit amnt:"+deposit);
	    System.out.println("banlance is:"+balance);
	   
   }
   
   
	  
	  public static void getaccbalance(int accbalance){
	  System.out.println("the acc balance:");
	  int debit = 132;
	  int credit = 78;
	  int balance = (debit-credit)+accbalance;
	  System.out.println("debit amount:"+debit);
	  System.out.println("credit amount:"+credit);
	  System.out.println("balance amount:"+balance);
	  }
	  
	  
	  public static void getaccname(String lname){
		  
		  System.out.println("the acc holder is:");
		  String accfname = "mahesh";
		  String accmname = "raj";
		  String acchloderfullname  = accfname+accmname+lname;
		  System.out.println("accfname:"+accfname);
		  System.out.println("accmname:"+accmname);
		  System.out.println("acchloderfullname:"+acchloderfullname);
	  }
	  
	  public static void getbankname(String name){
		  String fname = "state";
		  String mname = "bank";
		  String lname = "india";
		  String fullname = name + " " + fname+mname+lname;
		  System.out.println("fname:"+fname);
		  System.out.println("mname:"+mname);
		  System.out.println("lname:"+lname);
		  System.out.println("fullname:"+fullname);
		  
		  
		  
		  
		  
		  
		  
		  
	  }
		  
		  
		  
	  }
	  
	  
	  
	  
	  
	  
  
  