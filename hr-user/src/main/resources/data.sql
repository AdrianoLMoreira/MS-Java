INSERT INTO tb_user (name, email, password) VALUES ('Clark Kent', 'kent@gmail.com', '$2a$10$dpBVn91tvnZG/tcBUmrMqOnhUB.Fl/AjpwpvY8uniG7yIt9HH0fsy');
INSERT INTO tb_user (name, email, password) VALUES ('Bruce Wayne', 'wayne@gmail.com', '$2a$10$B5mcxdpz9Fo7f51yjxTJcONlE.QhYfEDUtX3AbeGZSjIRj2YuX4Jq');

INSERT INTO tb_role (role_name) VALUES ('ROLE_OPERATOR');
INSERT INTO tb_role (role_name) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);