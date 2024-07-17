public class ScaleRunner{

public static void main(String args[]){

Scale scale = new Scale();
System.out.println(scale);


int arr[] = {1,2,3,4};
Scale scales   =   new Scale(1000,"wipro",(short)9,14.f,arr);

System.out.println(scales);

Scale scale1   =   new Scale(1000,"wipro",(short)9,14.f,arr);

System.out.println(scale1);

Scale scale2   =   new Scale(1000,"wipro",(short)9,14.f,arr);

System.out.println(scale2);

Scale scale3  =   new Scale(1000,"wipro",(short)9,14.f,arr);

System.out.println(scale3);


}



}