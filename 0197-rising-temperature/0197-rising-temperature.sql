-- Write your PostgreSQL query statement below
WITH detailWeather AS(
    SELECT id , recordDate ,temperature, 
    LAG(recordDate) OVER (
        ORDER BY recordDate
    ) AS prev_date,
    LAG(temperature) OVER (
        ORDER BY recordDate
    ) AS prev_temp
    FROM Weather
)

SELECT id
FROM detailWeather
WHERE prev_date + INTERVAL'1 day' = recordDate
AND temperature > prev_temp;