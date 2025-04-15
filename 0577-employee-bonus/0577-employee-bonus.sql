SELECT 
    e.name,
    b.bonus

FROM employee e
LEFT JOIN bonus b
ON e.empid = b.empid
where bonus < 1000 or bonus is null;