import java.util.Scanner;
class details{
    int Empid,salary;
    String F_Name,L_Name;
    details(int id,String fn, String ln,int sal){
        Empid = id;
        F_Name = fn;
        L_Name = ln;
        salary = sal;
    }
    public int getID(){return Empid;}
    public String getFirstName(){return F_Name;}
    public String getLastName(){return L_Name;}
    public String getName(){return F_Name+" "+L_Name;}
    public int getSalary(){return salary;}
    public void setSalary(int sa){salary=sa;}
    public int getAnnualSalary(){return salary = salary * 12;}
    public int raiseSalary(int percent) {return salary = (int) (salary * (1 + percent / 100.0));}
    public String toString(){
        return "EMPID : "+ Empid +" Name :"+F_Name+" "+L_Name+" Salary :"+salary;
    }

}
class Employee {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of Employees: ");
        int n = s.nextInt();
        details[] emp = new details[n];
        int Empid, salary;
        String F_Name, L_Name;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the Employee ID: ");
            Empid = s.nextInt();
            System.out.print("Enter First Name: ");
            F_Name = s.next();
            System.out.print("Enter Last Name: ");
            L_Name = s.next();
            System.out.print("Enter Salary: ");
            salary = s.nextInt();
            emp[i] = new details(Empid, F_Name, L_Name, salary);
        }

        boolean continueUpdating = true;
        while (continueUpdating) {
            System.out.println("\nOptions:");
            System.out.println("1. Set Salary");
            System.out.println("2. Raise Salary");
            System.out.println("3. Show Employee Details");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the Employee ID: ");
                    int target = s.nextInt();
                    System.out.print("Enter the amount to set Salary: ");
                    int setsal = s.nextInt();
                    for (int i = 0; i < emp.length; i++) {
                        if (target == emp[i].Empid) {
                            emp[i].setSalary(setsal);
                            System.out.println("Updated Salary: " + emp[i].getSalary());
                        }
                    }
                    break;
                case 2:
                    System.out.print("Enter the Employee ID: ");
                    target = s.nextInt();
                    System.out.print("Enter the percentage to be raised: ");
                    int percent = s.nextInt();
                    for (details empDetail : emp) {
                        if (target == empDetail.Empid) {
                            int raisedSalary = empDetail.raiseSalary(percent);
                            System.out.println("The salary raised to: " + raisedSalary);
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < n; i++) {
                        System.out.println(emp[i]);
                    }
                    break;

                case 4:
                    continueUpdating = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}