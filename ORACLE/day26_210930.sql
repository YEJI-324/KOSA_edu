-- PL / SQL

--Begin
--    DBMS_OUTPUT.PUT_LINE('�迹��');
--    DBMS_output.put('��ķ�');
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
--         DBMS_OUTPUT.PUT_LINE('�迹��');
--        DBMS_output.put('��ķ�');
--        DBMS_output.put_line('kimyeji');
--    end;
--    
--exec p_test;


--create or replace PROCEDURE p_test(name in varchar2)
--is
--    Begin
--         DBMS_OUTPUT.PUT_LINE(name || '�� ���� �հ��Դϴ�.');
--    end;
--    
--exec p_test('�迹��'); -- �Ű����� �Է��ϱ�

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
        DBMS_output.put_line('insert ������ ' || id || name || age || addr);
    End;
    
exec p_userlist; -- default data
exec p_userlist('yuna', '�迬��', 20, '����'); -- ��ü �ʵ� �߰�
exec p_userlist('park', '�ں���', 25); -- ���ϴ� �ʵ常 �߰�

select * from userlist;

begin
    for i in 1..10 loop
        insert into userlist(age) values(i);
    end loop;
end;