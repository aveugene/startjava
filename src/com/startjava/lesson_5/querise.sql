SELECT * FROM Jaegers;
SELECT * FROM Jaegers WHERE status != 'Destroyed' ORDER BY status;
SELECT * FROM Jaegers WHERE mark = 'Mark-1' OR mark = 'Mark-6' ORDER BY mark DESC;
SELECT * FROM Jaegers ORDER BY mark;
SELECT * FROM Jaegers WHERE launch = (SELECT MIN(launch) FROM Jaegers);
SELECT * FROM Jaegers WHERE kaijukill = (SELECT MAX(kaijukill) FROM Jaegers);
SELECT * FROM Jaegers WHERE kaijukill = (SELECT MIN(kaijukill) FROM Jaegers);
SELECT AVG(weight) FROM Jaegers;
UPDATE Jaegers SET kaijukill = kaijukill + 1 WHERE status != 'Destroyed';
SELECT * FROM Jaegers WHERE status != 'Destroyed' ORDER BY status;
DELETE FROM Jaegers WHERE status = 'Destroyed';
SELECT * FROM Jaegers;
