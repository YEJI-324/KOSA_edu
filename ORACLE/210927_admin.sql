-- ����� ����
create user YEJI identified by oracle account UNLOCK;
-- ���� �ο�
grant connect, resource to YEJI;

grant create session, create table, create view,
        create sequence, create procedure to YEJI;
        
alter user YEJI default tablespace users quota unlimited on users;
        
        
