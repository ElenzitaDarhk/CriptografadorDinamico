INSERT INTO AppClient (id, name) VALUES (1, 'ApiUsuario');
ALTER SEQUENCE AppClient_seq RESTART WITH 2;

INSERT INTO Algorithm (id, name) VALUES (1, 'DES');
ALTER SEQUENCE Algorithm_seq RESTART WITH 2;

INSERT INTO Configuration (id, appClientId, algorithmId, KeyWord, InitialDate, Enable, UpdateDate) 
VALUES (1, 1, 1, 'Teste', '2025-08-27 05:07', true, '2025-08-27 05:07');
ALTER SEQUENCE Configuration_seq RESTART WITH 2;