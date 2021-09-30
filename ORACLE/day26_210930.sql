-- PL / SQL

--Begin
--    DBMS_OUTPUT.PUT_LINE('김예지');
--    DBMS_output.put('흠냐뤼');
--    DBMS_output.put_line('kimyeji');
--End;

--declare vno number(4);
--        vname varchar2(20);
--Begin
--    select empno, name
--        into vno, vname
--        from emp2
--        where empno=&empno;
--End;

-- Procedure

--create or replace PROCEDURE p_test
--is
--    Begin
--         DBMS_OUTPUT.PUT_LINE('김예지');
--        DBMS_output.put('흠냐뤼');
--        DBMS_output.put_line('kimyeji');
--    end;
--    
--exec p_test;


--create or replace PROCEDURE p_test(name in varchar2)
--is
--    Begin
--         DBMS_OUTPUT.PUT_LINE(name || '님 시험 합격입니다.');
--    end;
--    
--exec p_test('김예지'); -- 매개변수 입력하기

---------------------------------------------------------
select * from userlist;
drop table userlist;

create table userlist(
    id varchar2(10),
    name varchar2(10),
    age number,
    addr varchar2(20)
);

create or replace procedure p_userlist(
    id in userlist.id%type:='yerrrrrri',
    name in userlist.name%type default 'yeji',
    age in userlist.age%type := 10,
    addr in userlist.addr%type := null
)
is
    Begin
        insert into userlist values(id, name, age, addr);
        DBMS_output.put_line('insert 정보는 ' || id || name || age || addr);
    End;
    
exec p_userlist; -- default data
exec p_userlist('yuna', '김연아', 20, '서울'); -- 전체 필드 추가
exec p_userlist('park', '박보검', 25); -- 원하는 필드만 추가

select * from userlist;

begin
    for i in 1..10 loop
        insert into userlist(age) values(i);
    end loop;
end;