SELECT * FROM TODO;
INSERT INTO TODO (ID, USERNAME, DESCRIPTION, TARGET_DATE, DONE)
VALUES (1, 'in28minutes', 'Learn Spring Boot', CURRENT_DATE(), false),
       (2, 'in28minutes', 'Learn React', DATE '2024-03-28', false),
       (3, 'in28minutes', 'Finish Springboot Udemy Course', DATE '2024-05-06', false);
