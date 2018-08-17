INSERT INTO questions (id, question, published_at) VALUES (1, 'Favourite programming language?', parsedatetime('2015-08-05 08:40:51.620', 'yyyy-MM-dd hh:mm:ss.SSS'));

INSERT INTO question_choices (id, question_id, choice, votes) VALUES (1, 1, 'Swift', 2048);
INSERT INTO question_choices (id, question_id, choice, votes) VALUES (2, 1, 'Python', 1024);
INSERT INTO question_choices (id, question_id, choice, votes) VALUES (3, 1, 'Objective-C', 512);
INSERT INTO question_choices (id, question_id, choice, votes) VALUES (4, 1, 'Ruby', 256);
COMMIT;