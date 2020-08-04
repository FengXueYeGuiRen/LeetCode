/**
 * 177. Nth Highest Salary
 * (https://leetcode.com/problems/nth-highest-salary/)
 * 177. 第N高的薪水
 */
CREATE FUNCTION getNthHighestSalary (N INT) RETURNS INT
BEGIN
    SET N = N - 1;
    RETURN (
    	  SELECT
    		(
    			  SELECT DISTINCT Salary
    			  FROM Employee
    			  ORDER BY Salary DESC
    			LIMIT 1 OFFSET N
    		) SecondHighestSalary
    );
END;

/**
 * SQL Schema
 *
 * Create table If Not Exists Employee (Id int, Salary int);
 *
 * Truncate table Employee;
 * insert into Employee (Id, Salary) values ('1', '100');
 * insert into Employee (Id, Salary) values ('2', '200');
 * insert into Employee (Id, Salary) values ('3', '300');
 *
 * +----+--------+
 * | Id | Salary |
 * +----+--------+
 * | 1  | 100    |
 * | 2  | 200    |
 * | 3  | 300    |
 * +----+--------+
 *
 */
