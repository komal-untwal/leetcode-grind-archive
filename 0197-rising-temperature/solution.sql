# Write your MySQL query statement below
SELECT t2.id as id
from Weather t1, Weather t2
where t2.temperature > t1.temperature and datediff(t2.recordDate, t1.recordDate) =1

