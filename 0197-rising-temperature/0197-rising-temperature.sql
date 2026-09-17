-- Write your PostgreSQL query statement below
WITH detailWeather AS(
    SELECT id, recordDate,temperature ,
    LAG(recordDate)OVER(
        ORDER BY recordDate
    )AS last_day,
    LAG(temperature)OVER(
        ORDER BY recordDate
    )AS last_temp
    FROM Weather
)


SELECT id 
FROM detailWeather
WHERE temperature > last_temp
AND last_day + INTERVAL'1day' = recordDate;