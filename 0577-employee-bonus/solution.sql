# Write your MySQL query statement below
SELECT name, bonus
from Employee
Left Join Bonus
on Employee.empId = Bonus.empId
where bonus < 1000 OR bonus is null
