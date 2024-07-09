public class ApplicationsRunner{

public static void main(String args[]){

Applications.job();
Applications.job(3);
Applications.job(4,7.5f);
Applications.job(4,7.5f,0.8765);
Applications.job(4,7.5f,0.8765,'j');
Applications.job(8);
Applications.job(4,7.5f,0.8765,'j',true);
Applications.job(4,7.5f,0.8765,'j',true,7);
Applications.job(4,7.5f,0.8765,'j',true,7,'k');
Applications.job(4,7.5f,0.8765,'j',true,7,'k',1234556);
Applications.job(4,7.5f,0.8765,'j',true,7,'k',1234556,"fine");
Applications.job(4,7.5f,0.8765,'j',true,7,'k',1234556,"fine","tired");
}
}