
    package employee;
    public class Employee {
        private String empName;
        private int empId;
        // Constructor khởi tạo nhân viên
        public Employee(String name, int id) {
            empName = name;
            empId = id;
       }
        // Hiển thị thông tin nhân viên
        public void displayEmployeeDetails() {
            System.out.println("Employee ID: " + empId);
            System.out.println("Employee Name: " + empName);
        }
        public static void main(String[] args) {
            Employee Em=new Employee("Tam", 4658);
           Em.displayEmployeeDetails();
        }
    }
