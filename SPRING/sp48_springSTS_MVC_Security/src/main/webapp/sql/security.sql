create table bank(
   account varchar2(10) primary key, --계좌번호
   balance number --잔액
);   

 insert into bank values('A01',1000);
 insert into bank values('A02',500);
  commit
 select * from bank;
 
 
--계좌이체
1. 인출하다
update bank set balance=balane-인출금액 where account = 출금계좌번호;


2. 인출한 금액만큼 입금한다
update bank set balance=balance+인출금액 where account =입금계좌번호;

select balance from bank where account='A02';



select * from dept;
select * from dept2;
