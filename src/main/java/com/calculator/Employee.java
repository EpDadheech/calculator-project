package com.calculator;

/**
 * Employee POJO (Plain Old Java Object) class
 * Contains employee information with getter and setter methods
 */
public class Employee {
    
    private String empId;
    private String empName;
    
    /**
     * Default constructor
     */
    public Employee() {
    }
    
    /**
     * Parameterized constructor
     * @param empId Employee ID
     * @param empName Employee Name
     */
    public Employee(String empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }
    
    /**
     * Get employee ID
     * @return empId
     */
    public String getEmpId() {
        return empId;
    }
    
    /**
     * Set employee ID
     * @param empId Employee ID to set
     */
    public void setEmpId(String empId) {
        this.empId = empId;
    }
    
    /**
     * Get employee name
     * @return empName
     */
    public String getEmpName() {
        return empName;
    }
    
    /**
     * Set employee name
     * @param empName Employee name to set
     */
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    
    /**
     * String representation of Employee object
     * @return String containing employee details
     */
    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                '}';
    }
    
    /**
     * Check equality of two Employee objects
     * @param obj Object to compare
     * @return true if equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Employee employee = (Employee) obj;
        
        if (empId != null ? !empId.equals(employee.empId) : employee.empId != null) return false;
        return empName != null ? empName.equals(employee.empName) : employee.empName == null;
    }
    
    /**
     * Generate hash code for Employee object
     * @return hash code
     */
    @Override
    public int hashCode() {
        int result = empId != null ? empId.hashCode() : 0;
        result = 31 * result + (empName != null ? empName.hashCode() : 0);
        return result;
    }
}

// Made with Bob