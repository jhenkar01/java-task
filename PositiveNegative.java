public class PositiveNegative{

public static void main(String args[]){

int no[] = {1,2,-3,-6};

int countposi=0;
int countneg = 0;

for(int i=0;i<no.length;i++){
if(no[i]>0){
	
	
	System.out.println(no[i]);
countposi++;
}
else{
	
	
	System.out.println("negative:"+no[i]);
	countneg++;
}


}
 System.out.println("no of positive no:"+countposi);
 System.out.println("no of negative no:"+countneg);

}




}