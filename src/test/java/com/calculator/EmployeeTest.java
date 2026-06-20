package com.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for Employee POJO class
 */
@DisplayName("Employee POJO Tests")
public class EmployeeTest {
    
    private Employee employee;
    
    @BeforeEach
    void setUp() {
        employee = new Employee();
    }
    
    @Test
    @DisplayName("Test default constructor")
    void testDefaultConstructor() {
        assertNotNull(employee);
        assertNull(employee.getEmpId());
        assertNull(employee.getEmpName());
    }
    
    @Test
    @DisplayName("Test parameterized constructor")
    void testParameterizedConstructor() {
        Employee emp = new Employee("E001", "John Doe");
        assertEquals("E001", emp.getEmpId());
        assertEquals("John Doe", emp.getEmpName());
    }
    
    @Test
    @DisplayName("Test setEmpId and getEmpId")
    void testSetAndGetEmpId() {
        employee.setEmpId("E123");
        assertEquals("E123", employee.getEmpId());
    }
    
    @Test
    @DisplayName("Test setEmpName and getEmpName")
    void testSetAndGetEmpName() {
        employee.setEmpName("Jane Smith");
        assertEquals("Jane Smith", employee.getEmpName());
    }
    
    @Test
    @DisplayName("Test setEmpId with null value")
    void testSetEmpIdNull() {
        employee.setEmpId(null);
        assertNull(employee.getEmpId());
    }
    
    @Test
    @DisplayName("Test setEmpName with null value")
    void testSetEmpNameNull() {
        employee.setEmpName(null);
        assertNull(employee.getEmpName());
    }
    
    @Test
    @DisplayName("Test setEmpId with empty string")
    void testSetEmpIdEmpty() {
        employee.setEmpId("");
        assertEquals("", employee.getEmpId());
    }
    
    @Test
    @DisplayName("Test setEmpName with empty string")
    void testSetEmpNameEmpty() {
        employee.setEmpName("");
        assertEquals("", employee.getEmpName());
    }
    
    @Test
    @DisplayName("Test toString method")
    void testToString() {
        employee.setEmpId("E456");
        employee.setEmpName("Bob Johnson");
        String expected = "Employee{empId='E456', empName='Bob Johnson'}";
        assertEquals(expected, employee.toString());
    }
    
    @Test
    @DisplayName("Test toString with null values")
    void testToStringWithNulls() {
        String result = employee.toString();
        assertTrue(result.contains("empId='null'"));
        assertTrue(result.contains("empName='null'"));
    }
    
    @Test
    @DisplayName("Test equals method - same object")
    void testEqualsSameObject() {
        assertTrue(employee.equals(employee));
    }
    
    @Test
    @DisplayName("Test equals method - equal objects")
    void testEqualsEqualObjects() {
        Employee emp1 = new Employee("E001", "Alice");
        Employee emp2 = new Employee("E001", "Alice");
        assertTrue(emp1.equals(emp2));
    }
    
    @Test
    @DisplayName("Test equals method - different empId")
    void testEqualsDifferentEmpId() {
        Employee emp1 = new Employee("E001", "Alice");
        Employee emp2 = new Employee("E002", "Alice");
        assertFalse(emp1.equals(emp2));
    }
    
    @Test
    @DisplayName("Test equals method - different empName")
    void testEqualsDifferentEmpName() {
        Employee emp1 = new Employee("E001", "Alice");
        Employee emp2 = new Employee("E001", "Bob");
        assertFalse(emp1.equals(emp2));
    }
    
    @Test
    @DisplayName("Test equals method - null object")
    void testEqualsNull() {
        assertFalse(employee.equals(null));
    }
    
    @Test
    @DisplayName("Test equals method - different class")
    void testEqualsDifferentClass() {
        assertFalse(employee.equals("Not an Employee"));
    }
    
    @Test
    @DisplayName("Test hashCode method - equal objects have same hash")
    void testHashCodeEqualObjects() {
        Employee emp1 = new Employee("E001", "Alice");
        Employee emp2 = new Employee("E001", "Alice");
        assertEquals(emp1.hashCode(), emp2.hashCode());
    }
    
    @Test
    @DisplayName("Test hashCode method - consistent")
    void testHashCodeConsistent() {
        employee.setEmpId("E789");
        employee.setEmpName("Charlie");
        int hash1 = employee.hashCode();
        int hash2 = employee.hashCode();
        assertEquals(hash1, hash2);
    }
    
    @Test
    @DisplayName("Test hashCode with null values")
    void testHashCodeWithNulls() {
        int hash = employee.hashCode();
        assertEquals(0, hash);
    }
    
    @Test
    @DisplayName("Test complete employee workflow")
    void testCompleteWorkflow() {
        // Create employee
        Employee emp = new Employee();
        
        // Set values
        emp.setEmpId("E999");
        emp.setEmpName("David Wilson");
        
        // Verify values
        assertEquals("E999", emp.getEmpId());
        assertEquals("David Wilson", emp.getEmpName());
        
        // Test toString
        String str = emp.toString();
        assertTrue(str.contains("E999"));
        assertTrue(str.contains("David Wilson"));
        
        // Test equals with another employee
        Employee emp2 = new Employee("E999", "David Wilson");
        assertTrue(emp.equals(emp2));
        
        // Test hashCode
        assertEquals(emp.hashCode(), emp2.hashCode());
    }
}

// Made with Bob