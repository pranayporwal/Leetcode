-- Write your PostgreSQL query statement below
SELECT w.id
FROM Weather w
JOIN Weather y
ON y.recordDate = w.recordDate - INTERVAL '1 day'
WHERE w.temperature > y.temperature;