package com.oops.lamda.javaStreams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Employee {
	public static List<Employee> employeelist;
	private int id;
	private String name;
	private int age;
	private String gender;
	private String department;
	private int yearOfJoining;
	private double salary;

	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getDepartment() {
		return department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public static void main(String[] args) {

		employeelist = new ArrayList<Employee>();

		employeelist.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeelist.add(new Employee(122, "Paul Nikusi", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeelist.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeelist.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeelist.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeelist.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeelist.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeelist.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeelist.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeelist.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.0));
		employeelist.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeelist.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeelist.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeelist.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10500.0));
		employeelist.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeelist.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeelist.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

		totalNumberOfMaleAndFemaleEmployees();
		System.out.println("\n");
		printAllDepartmentNamesInAnOrganization();
		System.out.println("\n");
		avaerageAgeOfMaleAndFemaleEmployees();
		System.out.println("\n");
		getTheDetailsOfHighestPaidEmployeeInTheOrganization();
		System.out.println("\n");
		getNamesOfAllEmployeesWhoJoindAfterTheYear2015();
		System.out.println("\n");
		countTheNumberOfEmployeeDeparmentwise();
		System.out.println("\n");
		departmentwiseAverageSalary();
		System.out.println("\n");
		getYougestMaleEmployeeInProductDevlopment();
		System.out.println("\n");
		getTheDetailsOfMostWorkingExprienceInTheOrganization();
		System.out.println("\n");
		countNumberOfMaleAndFemaleInTHeSalesAndMraketingTeam();
		System.out.println("\n");
		avgSalOfMaleAndFemaleEmployee();
		System.out.println("\n");
		listdownNameOfAllEmployeesFromEachDepartment();
		System.out.println("\n");
		avaerageAndTotalSalaryOfWholeOrgannization();
		System.out.println("\n");
		getEmployesWhoseAgeIsLessThanOrEqualto25();
		System.out.println("\n");
		findOldestEmployeeInTheOrganization();
		System.out.println("\n");

	}

	public static void totalNumberOfMaleAndFemaleEmployees() {
		System.out.println("Q. How many Male and Female employees are in the organization ?");
		Map<String, Long> noMaleAndFemaleEmployees = employeelist.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

		System.out.println(noMaleAndFemaleEmployees);
	}

	public static void printAllDepartmentNamesInAnOrganization() {
		System.out.println("Q. Get the name of all department in the organization ?");
		employeelist.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
	}

	public static void avaerageAgeOfMaleAndFemaleEmployees() {
		System.out.println("Q. What is the average age of male and female employees in the Organization ?");
		Map<String, Double> avaerageAgeOfMaleAndFemaleEmployees = employeelist.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));

		System.out.println(avaerageAgeOfMaleAndFemaleEmployees);
	}

	public static void getTheDetailsOfHighestPaidEmployeeInTheOrganization() {
		System.out.println("Q. Find the highest paid employee in the Organization ?");
		Optional<Employee> highestPaidEmployee = employeelist.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));

		System.out.println(highestPaidEmployee.get().getName());
	}

	public static void getNamesOfAllEmployeesWhoJoindAfterTheYear2015() {
		System.out.println("Q. Get the name of all employees who have joined after the Year 2015 ?");
		employeelist.stream().filter(e -> e.getYearOfJoining() > 2015).map(Employee::getName)
				.forEach(System.out::println);
	}

	public static void countTheNumberOfEmployeeDeparmentwise() {
		System.out.println("Q. Count the number of employees in each department ?");
		Map<String, Long> employeeCountByDepartment = employeelist.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

		Set<Entry<String, Long>> emp = employeeCountByDepartment.entrySet();

		for (Entry<String, Long> entry : emp) {
			System.out.println(entry.getKey() + " ==> " + entry.getValue());
		}

	}

	public static void departmentwiseAverageSalary() {
		System.out.println("Q. Get the departmentwise average salary ?");
		Map<String, Double> avgSal = employeelist.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

		Set<Entry<String, Double>> e = avgSal.entrySet();

		for (Entry<String, Double> entry : e) {
			System.out.println(entry.getKey() + " ==> " + entry.getValue());
		}
	}

	public static void getYougestMaleEmployeeInProductDevlopment() {
		System.out.println("Q. Get the Details of Youngest Male Employee In Product Development ?");

		Optional<Employee> yougestMaleEmployeeInProductDevlopment = employeelist.stream()
				.filter(e -> e.getGender().equalsIgnoreCase("Male")
						&& e.getDepartment().equalsIgnoreCase("Product Development"))
				.min(Comparator.comparingInt(Employee::getAge));

		Employee youngestEmpInProductDevelopment = yougestMaleEmployeeInProductDevlopment.get();

		System.out.println("---------------------------------------------");

		System.out.println("ID : " + youngestEmpInProductDevelopment.getId());

		System.out.println("Name : " + youngestEmpInProductDevelopment.getName());

	}

	public static void getTheDetailsOfMostWorkingExprienceInTheOrganization() {
		System.out.println("Q. Who has most exprience in the organization ?");

		Optional<Employee> seniorMostEmployeeInTheOrganization = employeelist.stream()
				.sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();

		System.out.println("Id : " + seniorMostEmployeeInTheOrganization.get().getId());

		System.out.println("Name : " + seniorMostEmployeeInTheOrganization.get().getName());

		System.out.println("Age : " + seniorMostEmployeeInTheOrganization.get().getAge());

		System.out.println("Gender : " + seniorMostEmployeeInTheOrganization.get().getGender());

		System.out.println("Department : " + seniorMostEmployeeInTheOrganization.get().getDepartment());

		System.out.println("Year Of Joining : " + seniorMostEmployeeInTheOrganization.get().getYearOfJoining());

		System.out.println("Salary : " + seniorMostEmployeeInTheOrganization.get().getSalary());

	}

	public static void countNumberOfMaleAndFemaleInTHeSalesAndMraketingTeam() {
		System.out.println("Q. How many male and female employees are there in the Sales and Marketing team ?");

		Map<String, Long> countMaleAndFemale = employeelist.stream()
				.filter(e -> e.getDepartment().equalsIgnoreCase("Sales And Marketing"))
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

		System.out.println(countMaleAndFemale);
	}

	public static void avgSalOfMaleAndFemaleEmployee() {
		System.out.println("Q. What is the average salary of Male and Female Employees in the organization ?");

		Map<String, Double> avgSalOfMaleAndFemale = employeelist.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));

		System.out.println(avgSalOfMaleAndFemale);
	}

	public static void listdownNameOfAllEmployeesFromEachDepartment() {
		System.out.println("Q. List down names of all employees in each department ?");

		Map<String, List<Employee>> empFromEachDept = employeelist.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));

		for (Entry<String, List<Employee>> entry : empFromEachDept.entrySet()) {

			System.out.println("--------------------------------------");

			System.out.println("Employees In " + entry.getKey() + " : ");

			System.out.println("--------------------------------------");

			List<Employee> list = entry.getValue();

			for (Employee emp : list) {
				System.out.println(emp.getName());
			}
		}
	}

	public static void avaerageAndTotalSalaryOfWholeOrgannization() {
		System.out.println("Q. What is the avaerage and Total salary of the whole organization ?");

		System.out.println();

		DoubleSummaryStatistics employeeSalaryStatistics = employeelist.stream()
				.collect(Collectors.summarizingDouble(Employee::getSalary));

		System.out.println("Average Salary : " + employeeSalaryStatistics.getAverage());

		System.out.println("Total Salary : " + employeeSalaryStatistics.getSum());

	}

	public static void getEmployesWhoseAgeIsLessThanOrEqualto25() {
		System.out.println(
				"Q. Seperate the employess who are younger or equla to 25 years from those employees who are older than 25 years");

		Map<Boolean, List<Employee>> seperateEmployeeByAge = employeelist.stream()
				.collect(Collectors.partitioningBy(e -> e.getAge() > 25));

		Set<Entry<Boolean, List<Employee>>> empSet = seperateEmployeeByAge.entrySet();

		for (Entry<Boolean, List<Employee>> entry : empSet) {
			System.out.println("----------------------------------------------------");

			if (entry.getKey()) {
				System.out.println("Employee older than 25 years");
			} else {
				System.out.println("Employees are younger than or equal to 25 years");
			}

			System.out.println("------------------------------------------------------");

			List<Employee> list = entry.getValue();

			for (Employee e : list) {
				System.out.println(e.getName());
			}
		}

	}

	public static void findOldestEmployeeInTheOrganization() {
		System.out.println("Q. Who is the Oldest Employee In TheOrganization");
		System.out.println();

		Optional<Employee> maxAge = employeelist.stream().max(Comparator.comparingInt(Employee::getAge));

		Employee oldestEmployee = maxAge.get();

		System.out.println("Name : " + oldestEmployee.getName());
		System.out.println("Age : " + oldestEmployee.getAge());
		System.out.println("Department : " + oldestEmployee.getDepartment());
	}

}
