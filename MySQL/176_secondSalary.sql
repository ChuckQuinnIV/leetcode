SELECT (SELECT MAX(Salary) FROM EMPLOYEE
WHERE Salary NOT IN (SELECT MAX(Salary) FROM Employee))
SecondHighestSalary;
