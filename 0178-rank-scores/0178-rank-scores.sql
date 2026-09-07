-- Write your PostgreSQL query statement below
WITH findRank AS (
SELECT score , DENSE_RANK() OVER(
    ORDER BY score DESC
) AS rank
FROM Scores)

SELECT score , rank
FROM findRank;