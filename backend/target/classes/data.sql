CREATE TABLE IF NOT EXISTS exercises (
	id serial not null primary key,
	name VARCHAR(255) NOT NULL,
	muscle VARCHAR(255) NOT NULL,
	equipment VARCHAR(255) NOT NULL,
	link VARCHAR(255) NOT NULL
);

DELETE FROM exercises;

INSERT INTO exercises (name, muscle, equipment, link)
VALUES ('Incline barbell bench press','Chest','Barbell','https://www.youtube.com/watch?v=SrqOu55lrYU&pp=ygUbaW5jbGluZSBiYXJiZWxsIGJlbmNoIHByZXNz'),
       ('Decline barbell bench press','Chest','Barbell','https://www.youtube.com/watch?v=OR6WM5Z2Hqs&pp=ygUTZGVjbGluZSBiZW5jaCBwcmVzcw%3D%3D'),
       ('Side raises','Deltoids','Dumbells', 'https://www.youtube.com/watch?v=3VcKaXpzqRo&pp=ygUTZHVtYmVsbCBzaWRlIHJhaXNlcw%3D%3D'),
       ('High dumbell row','Traps/romboid','Dumbells', 'https://www.youtube.com/watch?v=roCP6wCXPqo&pp=ygULZHVtYmVsbCByb3c%3D'),
       ('Curls','Biceps','Dumbells', 'https://www.youtube.com/watch?v=ykJmrZ5v0Oo&pp=ygUSZHVtYmVsbCBiaWNlcCBjdXJs'),
       ('Pushups','Chest','Bodyweight', 'https://www.youtube.com/watch?v=IODxDxX7oi4&pp=ygUOaG93IHRvIHB1c2h1cHM%3D'),
       ('Barbell back squat','Quads','Barbell','https://www.youtube.com/watch?v=gcNh17Ckjgg&pp=ygUKYmFjayBzcXVhdA%3D%3D'),
       ('Triceps push down','Triceps','Cables','https://www.youtube.com/watch?v=2-LAMcpzODU&pp=ygUQdHJpY2VwcyBwdXNoZG93bg%3D%3D'),
       ('Lying leg curl','Hamstrings','Machine','https://www.youtube.com/watch?v=6y_GEg3YFC0&pp=ygUObHlpbmcgbGVnIGN1cmw%3D'),
       ('Dumbell lunges','Quadriceps','Dumbells','https://www.youtube.com/watch?v=D7KaRcUTQeE&pp=ygUOZHVtYmVsbCBsdW5nZXM%3D'),
       ('Barbell hip thrust','Glutes','Barbell','https://www.youtube.com/watch?v=L1qG25DhAk4&pp=ygUTYmFyYmVsbCBoaXAgdGhydXN0IA%3D%3D'),
       ('Pull ups','Lats','Bodyweight','https://www.youtube.com/watch?v=eGo4IYlbE5g&pp=ygUIcHVsbCB1cHM%3D'),
       ('Machine reverse flies','Rear delts','Machine','https://www.youtube.com/watch?v=5YK4bgzXDp0&pp=ygUVcmV2ZXJzZSBmbGllcyBtYWNoaW5l');