package constructor.injection;



	public class Employee {
		int id;
		String name;
		Address employeeAdress;
		
		
		public Employee(int id, String name, Address employeeAdress) {
			super();
			this.id = id;
			this.name = name;
			this.employeeAdress = employeeAdress;
		}
		
		public void show(){  
			System.out.println(id+" "+name); 
		    System.out.println(employeeAdress.toString());  

		}  
		
		

	}

