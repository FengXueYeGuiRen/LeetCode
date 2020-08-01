/**
 * 176. Second Highest Salary
 * (https://leetcode.com/problems/second-highest-salary/)
 * 176. 第二高的薪水
 */
SELECT
	(
	    SELECT
			    DISTINCT Salary
		  FROM
			    Employee
		  ORDER BY
			    Salary DESC
		  LIMIT 1, 1
	) SecondHighestSalary;

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
