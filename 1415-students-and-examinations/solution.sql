# Write your MySQL query statement below

SELECT s.student_id,s.student_name,sub.subject_name, count(e.student_id) as attended_exams
FROM Students s 
CROSS JOIN Subjects sub
LEFT JOIN Examinations e
ON s.student_id = e.student_id AND sub.subject_name = e.subject_name
GROUP BY s.student_id, s.student_name, sub.subject_name
ORDER BY s.student_id, sub.subject_name

#FROM Examinations RIGHT JOIN
#(SELECT * FROM Students CROSS JOIN Subjects) AS T2
#ON Examinations.student_id = T2.student_id 
#WHERE Examinations.student_id = T2.student_id AND Examinations.subject_name = T2.subject_name
#ORDER BY T2.student_id, T2.subject_name




