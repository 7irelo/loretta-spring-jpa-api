INSERT INTO users (id, username, email, password) VALUES
(1, "kidrife", "kidrife@gmail.com", "efirdik"),
(2, "7irelo", "7irelo@gmail.com", "oleri7"),
(3, "alkebulan", "alkebulan@gmail.com", "nalubekla");

INSERT INTO accounts (id, user_id, type, balance) VALUES
(1, 1, "Chequing", 2000),
(2, 2, "Savings", 100000),
(3, 3, "Credit", 6500000);