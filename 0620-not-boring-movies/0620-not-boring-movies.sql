SELECT * FROM CINEMA 
WHERE MOD(ID,2) = 1
AND 
DESCRIPTION != 'BORING'
ORDER BY RATING DESC