/**
 * 175. Combine Two Tables
 * (https://leetcode.com/problems/combine-two-tables/)
 * 175. 组合两个表
 */
SELECT
	p.FirstName,
	p.LastName,
	a.City,
	a.State
FROM
	Person p
LEFT JOIN Address a ON a.PersonId = p.PersonId;

/**
 * SQL Schema
 *
 * Create table Person (PersonId int, FirstName varchar(255), LastName varchar(255));
 * Create table Address (AddressId int, PersonId int, City varchar(255), State varchar(255));
 *
 * Truncate table Person;
 * insert into Person (PersonId, LastName, FirstName) values ('1', 'Wang', 'Allen');
 *
 * Truncate table Address;
 * insert into Address (AddressId, PersonId, City, State) values ('1', '2', 'New York City', 'New York');
 */
