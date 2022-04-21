create table trader(tid int,tname text,tphone text,tmailid text,tpassword text,tfeedback text);
insert into trader values(1002,'John','9846564893','John@gmail.com','Trader123','Good');
select * from trader;
delete from trader where tid = 0;