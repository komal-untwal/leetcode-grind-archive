# Write your MySQL query statement below
SELECT * 
from Cinema
where MOD(id,2) <> 0 AND description <> "boring"
Order by rating DESC
