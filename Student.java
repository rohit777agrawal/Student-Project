
public class Student {
	
	private double[] conceptArray;
	private double[] programmingArray;
	private double[] projectArray;
	private String name;
	//private double conceptTest1;
	//private double programmingTest1;
	//private double conceptTest2;
	//private double programmingTest2;
	//private double project1;
	//private double project2;
	//private double project3;
	//private double project4;
	//private double project5;
	//private double project6;
	//private double project7;
	//private double project8;
	//private double conceptFinal;
	//private double programmingFinal;
	
	private static String professor = "Anwar Ahmed";
	
	public Student(){
		name ="";
		conceptArray = new double[3];
		programmingArray = new double[3];
		projectArray = new double[8];
		
		for (int i = 0; i<3; i++){
			conceptArray[i] = 0.0;
		}
		
		for (int i = 0; i<3; i++){
			programmingArray[i] = 0.0;
		}
		
		for (int i = 0; i<8; i++){
			projectArray[i] = 0.0;
		}
		
		
		
		/**conceptTest1 = 0.0;
		programmingTest1= 0.0;
		conceptTest2 = 0.0;
		programmingTest2 = 0.0;
		project1 = 0.0;
		project2 = 0.0;
		project3 = 0.0;
		project4 = 0.0;
		project5 = 0.0;
		project6 = 0.0;
		project7 = 0.0;
		project8 = 0.0;
		conceptFinal = 0.0;
		programmingFinal = 0.0;	**/
	}
	
	
	
	public static String getProfessor() {
		return professor;
	}



	public static void setProfessor(String professor) {
		Student.professor = professor;
	}



	public void setName(String name){
		this.name = name;
	}
	
	public String getname(){
		return name;
	}

	public double getConceptTest1() {
		return conceptArray[0];
	}

	public void setConceptTest1(double conceptTest1) {
		if (conceptTest1 >= 0 && conceptTest1 <= 100){
			this.conceptArray[0] = conceptTest1;
		}
	}

	public double getProgrammingTest1() {
		return programmingArray[0];
	}

	public void setProgrammingTest1(double programmingTest1) {
		if (programmingTest1 >= 0 && programmingTest1 <=100){
			this.programmingArray[0] = programmingTest1;
		}
		
	}

	public double getConceptTest2() {
		return conceptArray[1];
	}

	public void setConceptTest2(double conceptTest2) {
		if (conceptTest2 >= 0 && conceptTest2 <=100)
		this.conceptArray[1] = conceptTest2;
	}

	public double getProgrammingTest2() {
		return programmingArray[1];
	}

	public void setProgrammingTest2(double programmingTest2) {
		if (programmingTest2 >=0 && programmingTest2 <=100)
		this.programmingArray[1] = programmingTest2;
	}

	public double getProject1() {
		return projectArray[0];
	}

	public void setProject1(double project1) {
		if (project1 >= 0 && project1 <= 100)
		this.projectArray[0] = project1;
	}

	public double getProject2() {
		return projectArray[1];
	}

	public void setProject2(double project2) {
		if (project2 >= 0 && project2 <= 100)
		this.projectArray[1] = project2;
	}

	public double getProject3() {
		return projectArray[2];
	}

	public void setProject3(double project3) {
		if (project3 >= 0 && project3 <= 100)
		this.projectArray[2] = project3;
	}

	public double getProject4() {
		return projectArray[3];
	}

	public void setProject4(double project4) {
		if (project4 >= 0 && project4 <= 100)
		this.projectArray[3] = project4;
	}

	public double getProject5() {
		return projectArray[4];
	}

	public void setProject5(double project5) {
		if (project5 >= 0 && project5 <= 100)
		this.projectArray[4] = project5;
	}

	public double getProject6() {
		return projectArray[5];
	}

	public void setProject6(double project6) {
		if (project6 >= 0 && project6 <= 100)
		this.projectArray[5] = project6;
	}

	public double getProject7() {
		return projectArray[6];
	}

	public void setProject7(double project7) {
		if (project7 >= 0 && project7 <= 100)
		this.projectArray[6] = project7;
	}

	public double getProject8() {
		return projectArray[7];
	}

	public void setProject8(double project8) {
		if (project8 >= 0 && project8 <= 100)
		this.projectArray[7] = project8;
	}

	public double getConceptFinal() {
		return conceptArray[2];
	}

	public void setConceptFinal(double conceptFinal) {
		if (conceptFinal >=0 && conceptFinal <= 100)
		this.conceptArray[2] = conceptFinal;
	}

	public double getProgrammingFinal() {
		return programmingArray[2];
	}

	public void setProgrammingFinal(double programmingFinal) {
		if (programmingFinal >= 0 && programmingFinal <= 100)
		this.programmingArray[2] = programmingFinal;
	}
	
	
	

}
