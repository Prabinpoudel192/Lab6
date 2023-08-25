//Simple java program to demonstarate single level inheritance

class RRcampus{

	void anurodh(){
	System.out.println("This is the detali of BCA Student");
	}
}

class prabin extends RRcampus{
	int r;
	String n;
	String f;
	public prabin()
	{
	}
	public prabin(int r,String n,String f){
	this.r=r;
	this.n=n;
	this.f=f;
	}
	void aryal(){
	System.out.println("Rollno:"+r+"\n Name:"+n+"\n Faculty:"+f);
	}
}

public class Singllevelinherit{
	public static void main(String[] args){
	prabin de=new prabin(26,"Prabin","BCA");
	//de.prabin(26,"Prabin","BCA");
	de.anurodh();
	de.aryal();



}}
