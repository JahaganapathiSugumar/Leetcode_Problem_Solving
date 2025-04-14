SELECT 
    p.product_name,
    s.year,
    s.price
FROM sales s
join product p
WHERE s.product_id = p.product_id