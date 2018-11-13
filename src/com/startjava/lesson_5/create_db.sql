
DROP TABLE Jaegers;

CREATE TABLE Jaegers (
    id SMALLSERIAL PRIMARY KEY,
    modelName TEXT NOT NULL,
    mark CHAR(6) NOT NULL,
    height DECIMAL,
    weight INT,
    status VARCHAR(16) NOT NULL,
    origin VARCHAR(16) NOT NULL,
    launch DATE NOT NULL,
    kaijuKill INT
);
