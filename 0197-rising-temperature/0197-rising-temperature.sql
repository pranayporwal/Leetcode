-- Write your PostgreSQL query statement below
WITH detailWeather AS(
    SELECT id, recordDate,temperature ,
    LAG(recordDate)OVER W AS last_day,
    LAG(temperature)OVER W AS last_temp
    FROM Weather
    window W AS (ORDER BY recordDate)
)


SELECT id 
FROM detailWeather
WHERE temperature > last_temp
AND last_day + INTERVAL'1day' = recordDate;