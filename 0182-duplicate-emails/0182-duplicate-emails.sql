-- Write your PostgreSQL query statement below
SELECT Email
FROM Person
GROUP BY email
HAVING COUNT(*)>1;