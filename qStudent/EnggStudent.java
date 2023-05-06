package qStudent;

public class EnggStudent extends Student{
	String branch;
	
	public EnggStudent(String branch) {
		this.branch=branch;
	}
	
	void displayBranch()
	{
		super.display();
		System.out.println("Branch: "+branch);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
