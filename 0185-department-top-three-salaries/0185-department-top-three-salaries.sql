-- Write your PostgreSQL query statement below
SELECT Department , Employee , salary
FROM(
    SELECT d.name as Department , e.name AS Employee , e.salary , DENSE_RANK() OVER (
        PARTITION BY e.departmentId
        ORDER BY salary DESC
    ) AS r
    FROM Employee e 
    LEFT JOIN Department d
    ON e.departmentId = d.id
) 
WHERE r <=3;