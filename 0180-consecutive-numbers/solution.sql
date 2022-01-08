# Write your MySQL query statement below
#select distinct a.num as consecutivenums from logs a,logs b,logs c where a.num=b.num #and b.num=c.num AND 
#b.id-a.id=1 and c.id-b.id=1;

SELECT DISTINCT
    l1.Num AS ConsecutiveNums
FROM
    Logs l1,
    Logs l2,
    Logs l3
WHERE
    l1.Id = l2.Id - 1
    AND l2.Id = l3.Id - 1
    AND l1.Num = l2.Num
    AND l2.Num = l3.Num
;
