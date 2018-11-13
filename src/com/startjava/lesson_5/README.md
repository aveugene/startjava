lesson_5$ sudo -u postgres psql -d jaegers < ./create_db.sql 

DROP TABLE

CREATE TABLE

lesson_5$ sudo -u postgres psql -d jaegers < ./init_db.sql 

TRUNCATE TABLE

INSERT 0 10

lesson_5$ sudo -u postgres psql -d jaegers < ./querise.sql 

-- SELECT * FROM Jaegers;

| id |    modelname    |  mark  | height | weight |  status   |  origin   |   launch   | kaijukill |
|---|---|---|---|---|---|---|---|---|
|  1 | Cherno Alpha    | Mark-1 |  85.34 |   2412 | Destroyed | Russia    | 2015-01-08 |         7|
|  2 | Guardian Bravo  | Mark-6 |  73.21 |   1975 | Active    | USA       | 2033-12-15 |         1|
|  3 | Gipsy Danger    | Mark-3 |  79.25 |   1980 | Destroyed | USA       | 2017-07-10 |         9|
|  4 | Coyote Tango    | Mark-1 |  85.34 |   2312 | Destroyed | Japan     | 2015-12-30 |         2|
|  5 | Gipsy Avenger   | Mark-6 |  81.77 |   2004 | Repairing | USA       | 2034-01-12 |         1|
|  6 | Bracer Phoenix  | Mark-5 |  70.91 |   2128 | Repairing | China     | 2025-11-01 |         1|
|  7 | Horizon Brave   | Mark-1 |  72.54 |   7890 | Destroyed | China     | 2015-12-22 |         2|
|  8 | Saber Athena    | Mark-7 |  76.91 |   1628 | Active    | USA       | 2033-12-20 |         1|
|  9 | Crimson Typhoon | Mark-4 |   76.2 |   1722 | Destroyed | China     | 2018-08-22 |         7|
| 10 | Striker Eureka  | Mark-5 |   76.2 |   1850 | Destroyed | Australia | 2019-11-02 |        11|
(10 rows)

-- SELECT * FROM Jaegers WHERE status != 'Destroyed' ORDER BY status;

| id |   modelname    |  mark  | height | weight |  status   | origin |   launch   | kaijukill |
|---|---|---|---|---|---|---|---|---|
|  2 | Guardian Bravo | Mark-6 |  73.21 |   1975 | Active    | USA    | 2033-12-15 |         1|
|  8 | Saber Athena   | Mark-7 |  76.91 |   1628 | Active    | USA    | 2033-12-20 |         1|
|  5 | Gipsy Avenger  | Mark-6 |  81.77 |   2004 | Repairing | USA    | 2034-01-12 |         1|
|  6 | Bracer Phoenix | Mark-5 |  70.91 |   2128 | Repairing | China  | 2025-11-01 |         1|
(4 rows)

-- SELECT * FROM Jaegers WHERE mark = 'Mark-1' OR mark = 'Mark-6' ORDER BY mark DESC;

 id |   modelname    |  mark  | height | weight |  status   | origin |   launch   | kaijukill |
|---|---|---|---|---|---|---|---|---|
|  2 | Guardian Bravo | Mark-6 |  73.21 |   1975 | Active    | USA    | 2033-12-15 |         1|
|  5 | Gipsy Avenger  | Mark-6 |  81.77 |   2004 | Repairing | USA    | 2034-01-12 |         1|
|  1 | Cherno Alpha   | Mark-1 |  85.34 |   2412 | Destroyed | Russia | 2015-01-08 |         7|
|  4 | Coyote Tango   | Mark-1 |  85.34 |   2312 | Destroyed | Japan  | 2015-12-30 |         2|
|  7 | Horizon Brave  | Mark-1 |  72.54 |   7890 | Destroyed | China  | 2015-12-22 |         2|
(5 rows)

-- SELECT * FROM Jaegers ORDER BY mark;

| id |    modelname    |  mark  | height | weight |  status   |  origin   |   launch   | kaijukill |
|---|---|---|---|---|---|---|---|---|
|  1 | Cherno Alpha    | Mark-1 |  85.34 |   2412 | Destroyed | Russia    | 2015-01-08 |         7|
|  7 | Horizon Brave   | Mark-1 |  72.54 |   7890 | Destroyed | China     | 2015-12-22 |         2|
|  4 | Coyote Tango    | Mark-1 |  85.34 |   2312 | Destroyed | Japan     | 2015-12-30 |         2|
|  3 | Gipsy Danger    | Mark-3 |  79.25 |   1980 | Destroyed | USA       | 2017-07-10 |         9|
|  9 | Crimson Typhoon | Mark-4 |   76.2 |   1722 | Destroyed | China     | 2018-08-22 |         7|
| 10 | Striker Eureka  | Mark-5 |   76.2 |   1850 | Destroyed | Australia | 2019-11-02 |        11|
|  6 | Bracer Phoenix  | Mark-5 |  70.91 |   2128 | Repairing | China     | 2025-11-01 |         1|
|  5 | Gipsy Avenger   | Mark-6 |  81.77 |   2004 | Repairing | USA       | 2034-01-12 |         1|
|  2 | Guardian Bravo  | Mark-6 |  73.21 |   1975 | Active    | USA       | 2033-12-15 |         1|
|  8 | Saber Athena    | Mark-7 |  76.91 |   1628 | Active    | USA       | 2033-12-20 |         1|
(10 rows)

-- SELECT * FROM Jaegers WHERE launch = (SELECT MIN(launch) FROM Jaegers);

| id |  modelname   |  mark  | height | weight |  status   | origin |   launch   | kaijukill |
|---|---|---|---|---|---|---|---|---|
|  1 | Cherno Alpha | Mark-1 |  85.34 |   2412 | Destroyed | Russia | 2015-01-08 |         7|
(1 row)

-- SELECT * FROM Jaegers WHERE kaijukill = (SELECT MAX(kaijukill) FROM Jaegers);

| id |   modelname    |  mark  | height | weight |  status   |  origin   |   launch   | kaijukill |
|---|---|---|---|---|---|---|---|---|
| 10 | Striker Eureka | Mark-5 |   76.2 |   1850 | Destroyed | Australia | 2019-11-02 |        11|
(1 row)

-- SELECT * FROM Jaegers WHERE kaijukill = (SELECT MIN(kaijukill) FROM Jaegers);

 id |   modelname    |  mark  | height | weight |  status   | origin |   launch   | kaijukill |
|---|---|---|---|---|---|---|---|---|
|  2 | Guardian Bravo | Mark-6 |  73.21 |   1975 | Active    | USA    | 2033-12-15 |         1|
|  5 | Gipsy Avenger  | Mark-6 |  81.77 |   2004 | Repairing | USA    | 2034-01-12 |         1|
|  6 | Bracer Phoenix | Mark-5 |  70.91 |   2128 | Repairing | China  | 2025-11-01 |         1|
|  8 | Saber Athena   | Mark-7 |  76.91 |   1628 | Active    | USA    | 2033-12-20 |         1|
(4 rows)

-- SELECT AVG(weight) FROM Jaegers;

|           avg           |
|---|
|  2590.1000000000000000 |
(1 row)

-- UPDATE Jaegers SET kaijukill = kaijukill + 1 WHERE status != 'Destroyed';

UPDATE 4

-- SELECT * FROM Jaegers WHERE status != 'Destroyed' ORDER BY status;

| id |   modelname    |  mark  | height | weight |  status   | origin |   launch   | kaijukill |
|---|---|---|---|---|---|---|---|---|
|  2 | Guardian Bravo | Mark-6 |  73.21 |   1975 | Active    | USA    | 2033-12-15 |         2|
|  8 | Saber Athena   | Mark-7 |  76.91 |   1628 | Active    | USA    | 2033-12-20 |         2|
|  5 | Gipsy Avenger  | Mark-6 |  81.77 |   2004 | Repairing | USA    | 2034-01-12 |         2|
|  6 | Bracer Phoenix | Mark-5 |  70.91 |   2128 | Repairing | China  | 2025-11-01 |         2|
(4 rows)

-- DELETE FROM Jaegers WHERE status = 'Destroyed';

DELETE 6

--SELECT * FROM Jaegers;

| id |   modelname    |  mark  | height | weight |  status   | origin |   launch   | kaijukill |
|---|---|---|---|---|---|---|---|---|
|  2 | Guardian Bravo | Mark-6 |  73.21 |   1975 | Active    | USA    | 2033-12-15 |         2|
|  5 | Gipsy Avenger  | Mark-6 |  81.77 |   2004 | Repairing | USA    | 2034-01-12 |         2|
|  6 | Bracer Phoenix | Mark-5 |  70.91 |   2128 | Repairing | China  | 2025-11-01 |         2|
|  8 | Saber Athena   | Mark-7 |  76.91 |   1628 | Active    | USA    | 2033-12-20 |         2|
(4 rows)
