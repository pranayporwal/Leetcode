-- Write your PostgreSQL query statement below
SELECT id
FROM (
    SELECT id , temperature,recordDate, LAG(temperature) OVER(
        ORDER BY recordDate
    ) AS prev,
    LAG(recordDate) OVER (
        ORDER BY recordDate
    ) as prev_date
    FROM Weather
) x
WHERE temperature > prev 
AND recordDate = prev_date + INTERVAL '1 day';
