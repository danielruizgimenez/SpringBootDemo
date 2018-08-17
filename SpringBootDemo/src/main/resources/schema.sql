CREATE TABLE questions (
	id bigint AUTO_INCREMENT PRIMARY KEY,
	question varchar(255) not null,
	published_at date not null
);

CREATE TABLE question_choices (
	id bigint AUTO_INCREMENT PRIMARY KEY,
	question_id bigint not null,
	choice varchar(255) not null,
	votes bigint not null
);