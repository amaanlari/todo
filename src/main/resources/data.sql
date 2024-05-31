-- -- Create sequence for ID generation
-- CREATE TABLE IF NOT EXISTS todo_sequence (
--     id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY
-- );
--
-- INSERT INTO TODO_SEQUENCE (id) SELECT 4 FROM dual WHERE NOT EXISTS (SELECT * FROM TODO_SEQUENCE WHERE id = 4);
--
--
--
-- CREATE TABLE IF NOT EXISTS todo (
--     id BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
--     username VARCHAR(255) NOT NULL,
--     description VARCHAR(255),
--     target_date DATE,
--     done BOOLEAN NOT NULL
--     );

INSERT INTO todo (id, username, description, target_date, done)
VALUES (1, 'in28minutes', 'Learn Spring Boot', NOW(), false),
       (2, 'in28minutes', 'Learn React', '2024-03-28', false),
       (3, 'in28minutes', 'Finish Springboot Udemy Course', '2024-05-06', false);
