package asg59;

class Voter{
	int voterId;
	String vName;
	int age;
	
	Voter(int voterId, String vName,int age ){
		if(age<18) {
			//System.out.println("Hello");
			try {
				throw new Exception("invalid age for voter");
			} catch (Exception e) {
				//e.printStackTrace();
				System.out.println(e);
			}
		}
		else {
			//System.out.println("QQQQ");
			this.age=age;
			this.voterId=voterId;
			this.vName=vName;
		}
		
		
			
	}

	
	public String display() {
		return "Voter [voterId=" + voterId + ", vName=" + vName + ", age=" + age + "]";
	}
	
	
}

public class asg59 {

	public static void main(String[] args) {
		Voter a = new Voter(1,"Karan",25);
		System.out.println(a.display());
		Voter a1 = new Voter(1,"Karan",24);
		System.out.println(a.display());
	}
	
}