SELECT USER_ID, COUNT(*) AS followers_count FROM FOLLOWERS
GROUP BY USER_ID
ORDER BY USER_ID