create sequence hibernate_sequence start 1 increment 1
create table Language (id int4 not null, name varchar(255), primary key (id))
create table Person (DTYPE varchar(31) not null, id int4 not null, email varchar(255), name varchar(255), phoneNumber varchar(255), primary key (id))
create table Person_Language (Mentor_id int4 not null, languages_id int4 not null)
alter table if exists Person_Language add constraint FK4pmo3yui3oebd76s3o04is9ee foreign key (languages_id) references Language
alter table if exists Person_Language add constraint FK1n0vg80p7q8403bk0c2ytj62y foreign key (Mentor_id) references Person
create sequence hibernate_sequence start 1 increment 1
create table Language (id int4 not null, name varchar(255), primary key (id))
create table Person (DTYPE varchar(31) not null, id int4 not null, email varchar(255), name varchar(255), phoneNumber varchar(255), personalMentor_id int4, primary key (id))
create table Person_Language (Mentor_id int4 not null, languages_id int4 not null)
alter table if exists Person add constraint FK8vefmsh2u2brsoj6nly9s98cg foreign key (personalMentor_id) references Person
alter table if exists Person_Language add constraint FK4pmo3yui3oebd76s3o04is9ee foreign key (languages_id) references Language
alter table if exists Person_Language add constraint FK1n0vg80p7q8403bk0c2ytj62y foreign key (Mentor_id) references Person
create sequence hibernate_sequence start 1 increment 1
create table ClassRoom (id int4 not null, className varchar(255), primary key (id))
create table ClassRoom_Person (ClassRoom_id int4 not null, studentsList_id int4 not null, mentorsList_id int4 not null)
create table Language (id int4 not null, name varchar(255), primary key (id))
create table Person (DTYPE varchar(31) not null, id int4 not null, email varchar(255), name varchar(255), phoneNumber varchar(255), personalMentor_id int4, primary key (id))
create table Person_Language (Mentor_id int4 not null, languages_id int4 not null)
alter table if exists ClassRoom_Person add constraint UK_2r65il5t22kcvtcyumbqogtkn unique (studentsList_id)
alter table if exists ClassRoom_Person add constraint FKgb04x4dkfwek5mg529odtg7i7 foreign key (studentsList_id) references Person
alter table if exists ClassRoom_Person add constraint FK6w46t6fwdlhb0807s5ru1s44v foreign key (ClassRoom_id) references ClassRoom
alter table if exists ClassRoom_Person add constraint FKmlv4asnp2nqc06148q6iy2xw4 foreign key (mentorsList_id) references Person
alter table if exists Person add constraint FK8vefmsh2u2brsoj6nly9s98cg foreign key (personalMentor_id) references Person
alter table if exists Person_Language add constraint FK4pmo3yui3oebd76s3o04is9ee foreign key (languages_id) references Language
alter table if exists Person_Language add constraint FK1n0vg80p7q8403bk0c2ytj62y foreign key (Mentor_id) references Person
create sequence hibernate_sequence start 1 increment 1
create table ClassRoom (id int4 not null, className varchar(255), primary key (id))
create table ClassRoom_Person (ClassRoom_id int4 not null, studentsList_id int4 not null, mentorsList_id int4 not null)
create table Language (id int4 not null, name varchar(255), primary key (id))
create table Person (DTYPE varchar(31) not null, id int4 not null, email varchar(255), name varchar(255), phoneNumber varchar(255), personalMentor_id int4, primary key (id))
create table Person_Language (Mentor_id int4 not null, languages_id int4 not null)
alter table if exists ClassRoom_Person add constraint UK_2r65il5t22kcvtcyumbqogtkn unique (studentsList_id)
alter table if exists ClassRoom_Person add constraint FKgb04x4dkfwek5mg529odtg7i7 foreign key (studentsList_id) references Person
alter table if exists ClassRoom_Person add constraint FK6w46t6fwdlhb0807s5ru1s44v foreign key (ClassRoom_id) references ClassRoom
alter table if exists ClassRoom_Person add constraint FKmlv4asnp2nqc06148q6iy2xw4 foreign key (mentorsList_id) references Person
alter table if exists Person add constraint FK8vefmsh2u2brsoj6nly9s98cg foreign key (personalMentor_id) references Person
alter table if exists Person_Language add constraint FK4pmo3yui3oebd76s3o04is9ee foreign key (languages_id) references Language
alter table if exists Person_Language add constraint FK1n0vg80p7q8403bk0c2ytj62y foreign key (Mentor_id) references Person
create sequence hibernate_sequence start 1 increment 1
create table ClassRoom (id int4 not null, className varchar(255), primary key (id))
create table ClassRoom_Person (ClassRoom_id int4 not null, studentsList_id int4 not null, mentorsList_id int4 not null)
create table Language (id int4 not null, name varchar(255), primary key (id))
create table Person (DTYPE varchar(31) not null, id int4 not null, email varchar(255), name varchar(255), phoneNumber varchar(255), personalMentor_id int4, primary key (id))
create table Person_Language (Mentor_id int4 not null, languages_id int4 not null)
alter table if exists ClassRoom_Person add constraint UK_2r65il5t22kcvtcyumbqogtkn unique (studentsList_id)
alter table if exists ClassRoom_Person add constraint FKgb04x4dkfwek5mg529odtg7i7 foreign key (studentsList_id) references Person
alter table if exists ClassRoom_Person add constraint FK6w46t6fwdlhb0807s5ru1s44v foreign key (ClassRoom_id) references ClassRoom
alter table if exists ClassRoom_Person add constraint FKmlv4asnp2nqc06148q6iy2xw4 foreign key (mentorsList_id) references Person
alter table if exists Person add constraint FK8vefmsh2u2brsoj6nly9s98cg foreign key (personalMentor_id) references Person
alter table if exists Person_Language add constraint FK4pmo3yui3oebd76s3o04is9ee foreign key (languages_id) references Language
alter table if exists Person_Language add constraint FK1n0vg80p7q8403bk0c2ytj62y foreign key (Mentor_id) references Person
create sequence hibernate_sequence start 1 increment 1
create table ClassRoom (id int4 not null, className varchar(255), primary key (id))
create table ClassRoom_Person (ClassRoom_id int4 not null, studentsList_id int4 not null, mentorsList_id int4 not null)
create table Language (id int4 not null, name varchar(255), primary key (id))
create table Person (DTYPE varchar(31) not null, id int4 not null, email varchar(255), name varchar(255), phoneNumber varchar(255), personalMentor_id int4, primary key (id))
create table Person_Language (Mentor_id int4 not null, languages_id int4 not null)
alter table if exists ClassRoom_Person add constraint UK_2r65il5t22kcvtcyumbqogtkn unique (studentsList_id)
alter table if exists ClassRoom_Person add constraint FKgb04x4dkfwek5mg529odtg7i7 foreign key (studentsList_id) references Person
alter table if exists ClassRoom_Person add constraint FK6w46t6fwdlhb0807s5ru1s44v foreign key (ClassRoom_id) references ClassRoom
alter table if exists ClassRoom_Person add constraint FKmlv4asnp2nqc06148q6iy2xw4 foreign key (mentorsList_id) references Person
alter table if exists Person add constraint FK8vefmsh2u2brsoj6nly9s98cg foreign key (personalMentor_id) references Person
alter table if exists Person_Language add constraint FK4pmo3yui3oebd76s3o04is9ee foreign key (languages_id) references Language
alter table if exists Person_Language add constraint FK1n0vg80p7q8403bk0c2ytj62y foreign key (Mentor_id) references Person
create table ClassRoom (id  serial not null, className varchar(255), primary key (id))
create table ClassRoom_Person (ClassRoom_id int4 not null, studentsList_id int4 not null, mentorsList_id int4 not null)
create table Language (id  serial not null, name varchar(255), primary key (id))
create table Person (DTYPE varchar(31) not null, id  serial not null, email varchar(255), name varchar(255), phoneNumber varchar(255), personalMentor_id int4, primary key (id))
create table Person_Language (Mentor_id int4 not null, languages_id int4 not null)
alter table if exists ClassRoom_Person add constraint UK_2r65il5t22kcvtcyumbqogtkn unique (studentsList_id)
alter table if exists ClassRoom_Person add constraint FKgb04x4dkfwek5mg529odtg7i7 foreign key (studentsList_id) references Person
alter table if exists ClassRoom_Person add constraint FK6w46t6fwdlhb0807s5ru1s44v foreign key (ClassRoom_id) references ClassRoom
alter table if exists ClassRoom_Person add constraint FKmlv4asnp2nqc06148q6iy2xw4 foreign key (mentorsList_id) references Person
alter table if exists Person add constraint FK8vefmsh2u2brsoj6nly9s98cg foreign key (personalMentor_id) references Person
alter table if exists Person_Language add constraint FK4pmo3yui3oebd76s3o04is9ee foreign key (languages_id) references Language
alter table if exists Person_Language add constraint FK1n0vg80p7q8403bk0c2ytj62y foreign key (Mentor_id) references Person
create table ClassRoom (id  serial not null, className varchar(255), primary key (id))
create table ClassRoom_Person (ClassRoom_id int4 not null, studentsList_id int4 not null, mentorsList_id int4 not null)
create table Language (id  serial not null, name varchar(255), primary key (id))
create table Person (DTYPE varchar(31) not null, id  serial not null, email varchar(255), name varchar(255), phoneNumber varchar(255), personalMentor_id int4, primary key (id))
create table Person_Language (Mentor_id int4 not null, languages_id int4 not null)
alter table if exists ClassRoom_Person add constraint UK_2r65il5t22kcvtcyumbqogtkn unique (studentsList_id)
alter table if exists ClassRoom_Person add constraint FKgb04x4dkfwek5mg529odtg7i7 foreign key (studentsList_id) references Person
alter table if exists ClassRoom_Person add constraint FK6w46t6fwdlhb0807s5ru1s44v foreign key (ClassRoom_id) references ClassRoom
alter table if exists ClassRoom_Person add constraint FKmlv4asnp2nqc06148q6iy2xw4 foreign key (mentorsList_id) references Person
alter table if exists Person add constraint FK8vefmsh2u2brsoj6nly9s98cg foreign key (personalMentor_id) references Person
alter table if exists Person_Language add constraint FK4pmo3yui3oebd76s3o04is9ee foreign key (languages_id) references Language
alter table if exists Person_Language add constraint FK1n0vg80p7q8403bk0c2ytj62y foreign key (Mentor_id) references Person
create table ClassRoom (id  serial not null, className varchar(255), primary key (id))
create table ClassRoom_mentors (ClassRoom_id int4 not null, mentorsList_id int4 not null)
create table ClassRoom_students (ClassRoom_id int4 not null, studentsList_id int4 not null)
create table Language (id  serial not null, name varchar(255), primary key (id))
create table mentors (id  serial not null, email varchar(255), name varchar(255), phoneNumber varchar(255), primary key (id))
create table mentors_Language (Mentor_id int4 not null, languages_id int4 not null)
create table students (id  serial not null, email varchar(255), name varchar(255), phoneNumber varchar(255), personalMentor_id int4, primary key (id))
alter table if exists ClassRoom_students add constraint UK_2hymsu8tevt2dx9ytle541ngj unique (studentsList_id)
alter table if exists ClassRoom_mentors add constraint FKehtdfnrwkd6g7xbhuoscqec05 foreign key (mentorsList_id) references mentors
alter table if exists ClassRoom_mentors add constraint FK7c81sn5dd7rifjkmaku9s9snc foreign key (ClassRoom_id) references ClassRoom
alter table if exists ClassRoom_students add constraint FKcw9wf3jk64bpg4v2py2hfvx7r foreign key (studentsList_id) references students
alter table if exists ClassRoom_students add constraint FKfpodvnorqktltlv7lkolxay4f foreign key (ClassRoom_id) references ClassRoom
alter table if exists mentors_Language add constraint FKa0hvr6hjldkw6aq960ds4445 foreign key (languages_id) references Language
alter table if exists mentors_Language add constraint FKg90j6q8xjjjelvgtw75r0ufdc foreign key (Mentor_id) references mentors
alter table if exists students add constraint FK5wwavpby5g4u3tm21rfn8vqck foreign key (personalMentor_id) references mentors
create table ClassRoom (id  serial not null, className varchar(255), primary key (id))
create table ClassRoom_mentors (ClassRoom_id int4 not null, mentorsList_id int4 not null)
create table ClassRoom_students (ClassRoom_id int4 not null, studentsList_id int4 not null)
create table Language (id  serial not null, name varchar(255), primary key (id))
create table mentors (id  serial not null, details_id int4, primary key (id))
create table mentors_Language (Mentor_id int4 not null, languages_id int4 not null)
create table PersonDetails (id  serial not null, email varchar(255), name varchar(255), phoneNumber varchar(255), primary key (id))
create table students (id  serial not null, details_id int4, personalMentor_id int4, primary key (id))
alter table if exists ClassRoom_students add constraint UK_2hymsu8tevt2dx9ytle541ngj unique (studentsList_id)
alter table if exists ClassRoom_mentors add constraint FKehtdfnrwkd6g7xbhuoscqec05 foreign key (mentorsList_id) references mentors
alter table if exists ClassRoom_mentors add constraint FK7c81sn5dd7rifjkmaku9s9snc foreign key (ClassRoom_id) references ClassRoom
alter table if exists ClassRoom_students add constraint FKcw9wf3jk64bpg4v2py2hfvx7r foreign key (studentsList_id) references students
alter table if exists ClassRoom_students add constraint FKfpodvnorqktltlv7lkolxay4f foreign key (ClassRoom_id) references ClassRoom
alter table if exists mentors add constraint FKf865ocg369h7uqw744wiw0ef8 foreign key (details_id) references PersonDetails
alter table if exists mentors_Language add constraint FKa0hvr6hjldkw6aq960ds4445 foreign key (languages_id) references Language
alter table if exists mentors_Language add constraint FKg90j6q8xjjjelvgtw75r0ufdc foreign key (Mentor_id) references mentors
alter table if exists students add constraint FKhnar0nl4s1g8sh17r32nmw2au foreign key (details_id) references PersonDetails
alter table if exists students add constraint FK5wwavpby5g4u3tm21rfn8vqck foreign key (personalMentor_id) references mentors
create table ClassRoom (id  serial not null, className varchar(255), primary key (id))
create table ClassRoom_mentors (ClassRoom_id int4 not null, mentorsList_id int4 not null)
create table ClassRoom_students (ClassRoom_id int4 not null, studentsList_id int4 not null)
create table Language (id  serial not null, name varchar(255), primary key (id))
create table mentors (id  serial not null, details_id int4, primary key (id))
create table mentors_Language (Mentor_id int4 not null, languages_id int4 not null)
create table PersonDetails (id  serial not null, email varchar(255), name varchar(255), phoneNumber varchar(255), primary key (id))
create table students (id  serial not null, details_id int4, personalMentor_id int4, primary key (id))
alter table if exists ClassRoom_students add constraint UK_2hymsu8tevt2dx9ytle541ngj unique (studentsList_id)
alter table if exists ClassRoom_mentors add constraint FKehtdfnrwkd6g7xbhuoscqec05 foreign key (mentorsList_id) references mentors
alter table if exists ClassRoom_mentors add constraint FK7c81sn5dd7rifjkmaku9s9snc foreign key (ClassRoom_id) references ClassRoom
alter table if exists ClassRoom_students add constraint FKcw9wf3jk64bpg4v2py2hfvx7r foreign key (studentsList_id) references students
alter table if exists ClassRoom_students add constraint FKfpodvnorqktltlv7lkolxay4f foreign key (ClassRoom_id) references ClassRoom
alter table if exists mentors add constraint FKf865ocg369h7uqw744wiw0ef8 foreign key (details_id) references PersonDetails
alter table if exists mentors_Language add constraint FKa0hvr6hjldkw6aq960ds4445 foreign key (languages_id) references Language
alter table if exists mentors_Language add constraint FKg90j6q8xjjjelvgtw75r0ufdc foreign key (Mentor_id) references mentors
alter table if exists students add constraint FKhnar0nl4s1g8sh17r32nmw2au foreign key (details_id) references PersonDetails
alter table if exists students add constraint FK5wwavpby5g4u3tm21rfn8vqck foreign key (personalMentor_id) references mentors
create table ClassRoom (id  serial not null, className varchar(255), mentorsList_id int4, primary key (id))
create table ClassRoom_mentors (ClassRoom_id int4 not null, mentorsList_id int4 not null)
create table Language (id  serial not null, name varchar(255), primary key (id))
create table mentors (id  serial not null, details_id int4, primary key (id))
create table mentors_Language (Mentor_id int4 not null, languages_id int4 not null)
create table PersonDetails (id  serial not null, email varchar(255), name varchar(255), phoneNumber varchar(255), primary key (id))
create table students (id  serial not null, classRoom_id int4, details_id int4, personalMentor_id int4, primary key (id))
alter table if exists ClassRoom_mentors add constraint UK_acc43qsu009ys6f4tm8008hsq unique (mentorsList_id)
alter table if exists ClassRoom add constraint FKcfu0f3ffljlo36spcvoytstgo foreign key (mentorsList_id) references mentors
alter table if exists ClassRoom_mentors add constraint FKehtdfnrwkd6g7xbhuoscqec05 foreign key (mentorsList_id) references mentors
alter table if exists ClassRoom_mentors add constraint FK7c81sn5dd7rifjkmaku9s9snc foreign key (ClassRoom_id) references ClassRoom
alter table if exists mentors add constraint FKf865ocg369h7uqw744wiw0ef8 foreign key (details_id) references PersonDetails
alter table if exists mentors_Language add constraint FKa0hvr6hjldkw6aq960ds4445 foreign key (languages_id) references Language
alter table if exists mentors_Language add constraint FKg90j6q8xjjjelvgtw75r0ufdc foreign key (Mentor_id) references mentors
alter table if exists students add constraint FK2q5pwttal0taqyah9w0yaqk2v foreign key (classRoom_id) references ClassRoom
alter table if exists students add constraint FKhnar0nl4s1g8sh17r32nmw2au foreign key (details_id) references PersonDetails
alter table if exists students add constraint FK5wwavpby5g4u3tm21rfn8vqck foreign key (personalMentor_id) references mentors
create table ClassRoom (id  serial not null, className varchar(255), mentorsList_id int4, primary key (id))
create table ClassRoom_mentors (ClassRoom_id int4 not null, mentorsList_id int4 not null)
create table Language (id  serial not null, name varchar(255), primary key (id))
create table mentors (id  serial not null, details_id int4, primary key (id))
create table mentors_Language (Mentor_id int4 not null, languages_id int4 not null)
create table PersonDetails (id  serial not null, email varchar(255), name varchar(255), phoneNumber varchar(255), primary key (id))
create table students (id  serial not null, classRoom_id int4, details_id int4, personalMentor_id int4, primary key (id))
alter table if exists ClassRoom_mentors add constraint UK_acc43qsu009ys6f4tm8008hsq unique (mentorsList_id)
alter table if exists ClassRoom add constraint FKcfu0f3ffljlo36spcvoytstgo foreign key (mentorsList_id) references mentors
alter table if exists ClassRoom_mentors add constraint FKehtdfnrwkd6g7xbhuoscqec05 foreign key (mentorsList_id) references mentors
alter table if exists ClassRoom_mentors add constraint FK7c81sn5dd7rifjkmaku9s9snc foreign key (ClassRoom_id) references ClassRoom
alter table if exists mentors add constraint FKf865ocg369h7uqw744wiw0ef8 foreign key (details_id) references PersonDetails
alter table if exists mentors_Language add constraint FKa0hvr6hjldkw6aq960ds4445 foreign key (languages_id) references Language
alter table if exists mentors_Language add constraint FKg90j6q8xjjjelvgtw75r0ufdc foreign key (Mentor_id) references mentors
alter table if exists students add constraint FK2q5pwttal0taqyah9w0yaqk2v foreign key (classRoom_id) references ClassRoom
alter table if exists students add constraint FKhnar0nl4s1g8sh17r32nmw2au foreign key (details_id) references PersonDetails
alter table if exists students add constraint FK5wwavpby5g4u3tm21rfn8vqck foreign key (personalMentor_id) references mentors
create table ClassRoom (id  serial not null, className varchar(255), mentorsList_id int4, primary key (id))
create table ClassRoom_mentors (ClassRoom_id int4 not null, mentorsList_id int4 not null)
create table Language (id  serial not null, name varchar(255), primary key (id))
create table mentors (id  serial not null, details_id int4, primary key (id))
create table mentors_Language (Mentor_id int4 not null, languages_id int4 not null)
create table PersonDetails (id  serial not null, email varchar(255), name varchar(255), phoneNumber varchar(255), primary key (id))
create table students (id  serial not null, classRoom_id int4, details_id int4, personalMentor_id int4, primary key (id))
alter table if exists ClassRoom_mentors add constraint UK_acc43qsu009ys6f4tm8008hsq unique (mentorsList_id)
alter table if exists ClassRoom add constraint FKcfu0f3ffljlo36spcvoytstgo foreign key (mentorsList_id) references mentors
alter table if exists ClassRoom_mentors add constraint FKehtdfnrwkd6g7xbhuoscqec05 foreign key (mentorsList_id) references mentors
alter table if exists ClassRoom_mentors add constraint FK7c81sn5dd7rifjkmaku9s9snc foreign key (ClassRoom_id) references ClassRoom
alter table if exists mentors add constraint FKf865ocg369h7uqw744wiw0ef8 foreign key (details_id) references PersonDetails
alter table if exists mentors_Language add constraint FKa0hvr6hjldkw6aq960ds4445 foreign key (languages_id) references Language
alter table if exists mentors_Language add constraint FKg90j6q8xjjjelvgtw75r0ufdc foreign key (Mentor_id) references mentors
alter table if exists students add constraint FK2q5pwttal0taqyah9w0yaqk2v foreign key (classRoom_id) references ClassRoom
alter table if exists students add constraint FKhnar0nl4s1g8sh17r32nmw2au foreign key (details_id) references PersonDetails
alter table if exists students add constraint FK5wwavpby5g4u3tm21rfn8vqck foreign key (personalMentor_id) references mentors
create table ClassRoom (id  serial not null, className varchar(255), mentorsList_id int4, primary key (id))
create table ClassRoom_mentors (ClassRoom_id int4 not null, mentorsList_id int4 not null)
create table Language (id  serial not null, name varchar(255), primary key (id))
create table mentors (id  serial not null, details_id int4, primary key (id))
create table mentors_Language (Mentor_id int4 not null, languages_id int4 not null)
create table PersonDetails (id  serial not null, email varchar(255), name varchar(255), phoneNumber varchar(255), primary key (id))
create table students (id  serial not null, classRoom_id int4, details_id int4, personalMentor_id int4, primary key (id))
alter table if exists ClassRoom_mentors add constraint UK_acc43qsu009ys6f4tm8008hsq unique (mentorsList_id)
alter table if exists ClassRoom add constraint FKcfu0f3ffljlo36spcvoytstgo foreign key (mentorsList_id) references mentors
alter table if exists ClassRoom_mentors add constraint FKehtdfnrwkd6g7xbhuoscqec05 foreign key (mentorsList_id) references mentors
alter table if exists ClassRoom_mentors add constraint FK7c81sn5dd7rifjkmaku9s9snc foreign key (ClassRoom_id) references ClassRoom
alter table if exists mentors add constraint FKf865ocg369h7uqw744wiw0ef8 foreign key (details_id) references PersonDetails
alter table if exists mentors_Language add constraint FKa0hvr6hjldkw6aq960ds4445 foreign key (languages_id) references Language
alter table if exists mentors_Language add constraint FKg90j6q8xjjjelvgtw75r0ufdc foreign key (Mentor_id) references mentors
alter table if exists students add constraint FK2q5pwttal0taqyah9w0yaqk2v foreign key (classRoom_id) references ClassRoom
alter table if exists students add constraint FKhnar0nl4s1g8sh17r32nmw2au foreign key (details_id) references PersonDetails
alter table if exists students add constraint FK5wwavpby5g4u3tm21rfn8vqck foreign key (personalMentor_id) references mentors
create table ClassRoom (id  serial not null, className varchar(255), mentorsList_id int4, primary key (id))
create table ClassRoom_mentors (ClassRoom_id int4 not null, mentorsList_id int4 not null)
create table Language (id  serial not null, name varchar(255), primary key (id))
create table mentors (id  serial not null, details_id int4, primary key (id))
create table mentors_Language (Mentor_id int4 not null, languages_id int4 not null)
create table PersonDetails (id  serial not null, email varchar(255), name varchar(255), phoneNumber varchar(255), primary key (id))
create table students (id  serial not null, classRoom_id int4, details_id int4, personalMentor_id int4, primary key (id))
alter table if exists ClassRoom_mentors add constraint UK_acc43qsu009ys6f4tm8008hsq unique (mentorsList_id)
alter table if exists ClassRoom add constraint FKcfu0f3ffljlo36spcvoytstgo foreign key (mentorsList_id) references mentors
alter table if exists ClassRoom_mentors add constraint FKehtdfnrwkd6g7xbhuoscqec05 foreign key (mentorsList_id) references mentors
alter table if exists ClassRoom_mentors add constraint FK7c81sn5dd7rifjkmaku9s9snc foreign key (ClassRoom_id) references ClassRoom
alter table if exists mentors add constraint FKf865ocg369h7uqw744wiw0ef8 foreign key (details_id) references PersonDetails
alter table if exists mentors_Language add constraint FKa0hvr6hjldkw6aq960ds4445 foreign key (languages_id) references Language
alter table if exists mentors_Language add constraint FKg90j6q8xjjjelvgtw75r0ufdc foreign key (Mentor_id) references mentors
alter table if exists students add constraint FK2q5pwttal0taqyah9w0yaqk2v foreign key (classRoom_id) references ClassRoom
alter table if exists students add constraint FKhnar0nl4s1g8sh17r32nmw2au foreign key (details_id) references PersonDetails
alter table if exists students add constraint FK5wwavpby5g4u3tm21rfn8vqck foreign key (personalMentor_id) references mentors
create table ClassRoom (id  serial not null, className varchar(255), primary key (id))
create table Language (id  serial not null, name varchar(255), primary key (id))
create table mentors (id  serial not null, details_id int4, primary key (id))
create table PersonDetails (id  serial not null, email varchar(255), name varchar(255), phoneNumber varchar(255), primary key (id))
create table students (id  serial not null, classRoom_id int4, details_id int4, personalMentor_id int4, primary key (id))
alter table if exists mentors add constraint FKf865ocg369h7uqw744wiw0ef8 foreign key (details_id) references PersonDetails
alter table if exists students add constraint FK2q5pwttal0taqyah9w0yaqk2v foreign key (classRoom_id) references ClassRoom
alter table if exists students add constraint FKhnar0nl4s1g8sh17r32nmw2au foreign key (details_id) references PersonDetails
alter table if exists students add constraint FK5wwavpby5g4u3tm21rfn8vqck foreign key (personalMentor_id) references mentors
create table ClassRoom (id  serial not null, className varchar(255), primary key (id))
create table ClassRoom_mentors (classRooms_id int4 not null, mentorsList_id int4 not null)
create table Language (id  serial not null, name varchar(255), primary key (id))
create table mentors (id  serial not null, details_id int4, primary key (id))
create table mentors_Language (Mentor_id int4 not null, languages_id int4 not null)
create table PersonDetails (id  serial not null, email varchar(255), name varchar(255), phoneNumber varchar(255), primary key (id))
create table students (id  serial not null, classRoom_id int4, details_id int4, personalMentor_id int4, primary key (id))
alter table if exists ClassRoom_mentors add constraint UK_acc43qsu009ys6f4tm8008hsq unique (mentorsList_id)
alter table if exists ClassRoom_mentors add constraint FKehtdfnrwkd6g7xbhuoscqec05 foreign key (mentorsList_id) references mentors
alter table if exists ClassRoom_mentors add constraint FKt91rpncpg64sqd16dc2bpne60 foreign key (classRooms_id) references ClassRoom
alter table if exists mentors add constraint FKf865ocg369h7uqw744wiw0ef8 foreign key (details_id) references PersonDetails
alter table if exists mentors_Language add constraint FKa0hvr6hjldkw6aq960ds4445 foreign key (languages_id) references Language
alter table if exists mentors_Language add constraint FKg90j6q8xjjjelvgtw75r0ufdc foreign key (Mentor_id) references mentors
alter table if exists students add constraint FK2q5pwttal0taqyah9w0yaqk2v foreign key (classRoom_id) references ClassRoom
alter table if exists students add constraint FKhnar0nl4s1g8sh17r32nmw2au foreign key (details_id) references PersonDetails
alter table if exists students add constraint FK5wwavpby5g4u3tm21rfn8vqck foreign key (personalMentor_id) references mentors
create table ClassRoom (id  serial not null, className varchar(255), primary key (id))
create table ClassRoom_mentors (classRooms_id int4 not null, mentorsList_id int4 not null)
create table Language (id  serial not null, name varchar(255), primary key (id))
create table mentors (id  serial not null, details_id int4, primary key (id))
create table mentors_Language (Mentor_id int4 not null, languages_id int4 not null)
create table PersonDetails (id  serial not null, email varchar(255), name varchar(255), phoneNumber varchar(255), primary key (id))
create table students (id  serial not null, classRoom_id int4, details_id int4, personalMentor_id int4, primary key (id))
alter table if exists ClassRoom_mentors add constraint UK_acc43qsu009ys6f4tm8008hsq unique (mentorsList_id)
alter table if exists ClassRoom_mentors add constraint FKehtdfnrwkd6g7xbhuoscqec05 foreign key (mentorsList_id) references mentors
alter table if exists ClassRoom_mentors add constraint FKt91rpncpg64sqd16dc2bpne60 foreign key (classRooms_id) references ClassRoom
alter table if exists mentors add constraint FKf865ocg369h7uqw744wiw0ef8 foreign key (details_id) references PersonDetails
alter table if exists mentors_Language add constraint FKa0hvr6hjldkw6aq960ds4445 foreign key (languages_id) references Language
alter table if exists mentors_Language add constraint FKg90j6q8xjjjelvgtw75r0ufdc foreign key (Mentor_id) references mentors
alter table if exists students add constraint FK2q5pwttal0taqyah9w0yaqk2v foreign key (classRoom_id) references ClassRoom
alter table if exists students add constraint FKhnar0nl4s1g8sh17r32nmw2au foreign key (details_id) references PersonDetails
alter table if exists students add constraint FK5wwavpby5g4u3tm21rfn8vqck foreign key (personalMentor_id) references mentors
create table ClassRoom (id  serial not null, className varchar(255), primary key (id))
create table ClassRoom_mentors (classRooms_id int4 not null, mentorsList_id int4 not null)
create table Language (id  serial not null, name varchar(255), primary key (id))
create table mentors (id  serial not null, details_id int4, primary key (id))
create table mentors_Language (Mentor_id int4 not null, languages_id int4 not null)
create table PersonDetails (id  serial not null, email varchar(255), name varchar(255), phoneNumber varchar(255), primary key (id))
create table students (id  serial not null, classRoom_id int4, details_id int4, personalMentor_id int4, primary key (id))
alter table if exists ClassRoom_mentors add constraint UK_acc43qsu009ys6f4tm8008hsq unique (mentorsList_id)
alter table if exists ClassRoom_mentors add constraint FKehtdfnrwkd6g7xbhuoscqec05 foreign key (mentorsList_id) references mentors
alter table if exists ClassRoom_mentors add constraint FKt91rpncpg64sqd16dc2bpne60 foreign key (classRooms_id) references ClassRoom
alter table if exists mentors add constraint FKf865ocg369h7uqw744wiw0ef8 foreign key (details_id) references PersonDetails
alter table if exists mentors_Language add constraint FKa0hvr6hjldkw6aq960ds4445 foreign key (languages_id) references Language
alter table if exists mentors_Language add constraint FKg90j6q8xjjjelvgtw75r0ufdc foreign key (Mentor_id) references mentors
alter table if exists students add constraint FK2q5pwttal0taqyah9w0yaqk2v foreign key (classRoom_id) references ClassRoom
alter table if exists students add constraint FKhnar0nl4s1g8sh17r32nmw2au foreign key (details_id) references PersonDetails
alter table if exists students add constraint FK5wwavpby5g4u3tm21rfn8vqck foreign key (personalMentor_id) references mentors
