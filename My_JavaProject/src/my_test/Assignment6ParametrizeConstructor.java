package my_test;

public class Assignment6ParametrizeConstructor {

	String ename;
	int eage;
	int esalary;

	Assignment6ParametrizeConstructor(String name, int age, int salary) {
		ename = name;
		eage = age;
		esalary = salary;
	}

	void emplDetailsDisplay(Assignment6ParametrizeConstructor abc) {
		System.out.println(abc.ename + " " + abc.eage + " " + abc.esalary);
	}

	public static void main(String[] args) {
		Assignment6ParametrizeConstructor emp1 = new Assignment6ParametrizeConstructor("Ram", 20, 20000);
		Assignment6ParametrizeConstructor emp2 = new Assignment6ParametrizeConstructor("Shyam", 22, 22000);
		Assignment6ParametrizeConstructor emp3 = new Assignment6ParametrizeConstructor("Vamsi", 25, 25000);
		Assignment6ParametrizeConstructor emp4 = new Assignment6ParametrizeConstructor("Vijay", 30, 30000);
		Assignment6ParametrizeConstructor emp5 = new Assignment6ParametrizeConstructor("Purna", 35, 35000);

		emp1.emplDetailsDisplay(emp1);
		emp1.emplDetailsDisplay(emp2);
		emp1.emplDetailsDisplay(emp3);
		emp1.emplDetailsDisplay(emp4);
		emp1.emplDetailsDisplay(emp5);
	}
}