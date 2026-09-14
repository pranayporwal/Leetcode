-- Write your PostgreSQL query statement below
SELECT p.product_name, s.year, s.price
FROM Sales S
LEFT JOIN Product P
USING(product_id);
