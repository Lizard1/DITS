use statistic_user_role;

CREATE TABLE Rule (
	ruleId integer primary key auto_increment,
    usser varbinary(30) not null,
    tutor varbinary(30) not null,
    admmin varbinary(30) not null
);

/*ALTER TABLE Rule
MODIFY COLUMN usser binary(16) not NULL,
MODIFY COLUMN tutor binary(16) not NULL,
MODIFY COLUMN admmin binary(16) not NULL;*/


CREATE TABLE Usser (
	userId integer primary key auto_increment,
    firstName varchar(30) not null,
    lastName varchar(30) not null,
    login varchar(30) not null unique,
    pasword varchar(30) not null unique,
    ruleId integer,
    constraint user_rule_fk
    foreign key (ruleId) references statistic_user_role.rule (ruleId)
);

CREATE TABLE Topic (
	topicId integer primary key auto_increment,
	desccription varchar(300)  not null,
	name varchar(30)  not null
);

CREATE TABLE Test (
	testId integer primary key auto_increment,
    name varchar(30)  not null,
    description varchar(300)  not null,
    topicId integer,
    constraint test_topic_fk
    foreign key (topicId) references statistic_user_role.topic (topicId)
);

CREATE TABLE Question (
	questionId integer primary key auto_increment,
    description varchar(300)  not null,
    testId integer,
	constraint question_test_fk
    foreign key (testId) references statistic_user_role.test (testId)
);

CREATE TABLE Statistic (
	statisticId integer primary key auto_increment,
    datte date not null,
    correct boolean not null,
    questionId integer,
    userId integer,
	constraint statistic_user_fk
    foreign key (userId)  references  statistic_user_role.usser (userId),
    constraint statistic_qustion_fk
    foreign key (questionId) references statistic_user_role.question (questionId)
);

CREATE TABLE Literature (
	literatureId integer primary key auto_increment,
    description varchar(300)  not null,
    questionId integer,
	constraint literature_question_fk
    foreign key (questionId) references statistic_user_role.question (questionId)
);

CREATE TABLE link (
	linkId integer primary key auto_increment,
    link varchar(300)  not null,
    literatureId integer,
    constraint link_literature_fk
    foreign key (literatureId) references statistic_user_role.literature (literatureId)
);



CREATE TABLE answer (
	answerId integer primary key auto_increment,
    description varchar(500)  not null,
    correct boolean  not null,
    questionId integer,
    constraint answer_question_fk
    foreign key (questionId) references statistic_user_role.question (questionId)
);

/*
ALTER TABLE `user`
ADD CONSTRAINT users_roles_fk
foreign key (roleId) references role (roleId);

ALTER TABLE statistic
ADD CONSTRAINT statistic_user_fk
foreign key (userId) REFERENCES user(userId);
*/