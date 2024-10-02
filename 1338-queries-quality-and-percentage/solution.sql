# Write your MySQL query statement below
SELECT 
query_name, 
Round(SUM(rating/position)/count(rating), 2) as quality,
Round(SUM(CASE WHEN rating<3 THEN 1 else 0 END)/count(rating) * 100,2)as poor_query_percentage
FROM Queries
WHERE query_name is not null
GROUP BY query_name
