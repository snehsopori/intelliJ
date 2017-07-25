public class Employee {
    String fName;
    String lName;
    String deptName;
    int empId;
    String location;

    public Employee(String fName, String lName, String deptName, int empId, String location) {
        this.fName = fName;
        this.lName = lName;
        this.deptName = deptName;
        this.empId = empId;
        this.location = location;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getDeptName() {
        return deptName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    @Override
    public String toString() {
        return fName + "," +
                "," + lName +
                "," + deptName +
                "," + empId + "," + location;
    }
}
