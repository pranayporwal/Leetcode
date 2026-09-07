-- Write your PostgreSQL query statement below
WITH topSalary AS(
    SELECT d.name AS Department , e.name as  Employee , e.salary as Salary, DENSE_RANK() OVER(
        PARTITION BY e.departmentId 
        ORDER BY e.salary DESC
    ) AS salary_rank
    FROM Employee e
    LEFT JOIN Department d
    ON e.departmentId = d.id
)

SELECT Department , Employee , Salary
FROM topSalary
WHERE salary_rank <= 3;