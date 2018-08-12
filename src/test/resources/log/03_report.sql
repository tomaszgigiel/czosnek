SELECT source, count(*) count
FROM czosnek_logs
GROUP BY source
ORDER BY source;
