-- 집계(그룹) 함수
select * from student;
select sum(height), sum(weight) from student;
select avg(height) as "평균키", avg(weight) as "평균 몸무게", max(height) as "제일 큰 키", min(height) as "제일 작은 키" from student;

select count(*) from professor;
select count(bonus), count(name) from professor;

select * from emp2;

select rank(68000000) within GROUP (order by pay desc)
    from emp2;
    
select rank(90) within GROUP (order by bonus desc)
    from professor
    where bonus is not null; -- 이래야 실제 순위를 알 수 있다. null의 우선순위가 더 높음.

select name, pay, bonus 
    from professor order by bonus desc;

-- any, all
select * 
    from gift
    where g_end < any(200000, 500000); -- 둘 중 큰 값보다 작은 값을 출력

select * 
    from gift
    where g_end > any(200000, 500000); -- 둘 중 작은 값보다 큰 값을 출력

select * 
    from gift
    where g_end < all(200000, 500000); -- 둘 중 작은 값보다 작은 값을 출력
    
select * 
    from gift
    where g_end > all(200000, 500000); -- 둘 중 큰 값보다 큰 값을 출력
    
    
-- 제약조건
-- CONSTRAINT 별칭 PRIMARY key, 별칭 : 테이블명_필드명_성격  ex) board_id_pk
-- primary key는 중복 불가, not null
CREATE TABLE userlist (
    id VARCHAR2(10) CONSTRAINT id_pk PRIMARY KEY,
    name VARCHAR2(10) --not null
);

select * from userlist;
insert into userlist values('yeri', 'yeji');
insert into userlist(name) values('this_is_name'); -- 삽입할 수 없다는 오류 발생.
insert into userlist(id) values('this_is_id'); -- 정상적으로 삽입됨.
insert into userlist(id) values('yeri'); -- 무결정 제약 조건에 위해됨. primary key이므로 중복 불가


-- foreign key
CREATE TABLE fk_member(
    code number(2) NOT NULL,
    id VARCHAR2(20) NOT NULL
    CONSTRAINT id_fk REFERENCES MEMBER(id), -- member 테이블에 id가 있어야함. 같은 데이터타입이어야함.
    etc VARCHAR2(10)
);

select * from member;
desc member;

-- unique : null허용, 중복 불가능.
CREATE TABLE userlist2 (
    id VARCHAR2(10) CONSTRAINT userlist2_id_pk PRIMARY key, -- primary key는 null 불가, 중복 불가
    id_no char(13) CONSTRAINT id_no_un unique -- unique : null 가능, 중복 불가.
);

select * from userlist2;

insert into userlist2 values('yerii', '1234');
insert into userlist2(id) values('gildong');
insert into userlist2(id, id_no) values('gildong2', '1234');
insert into userlist2(id_no) values('1004');