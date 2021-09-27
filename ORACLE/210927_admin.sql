-- 사용자 생성
create user YEJI identified by oracle account UNLOCK;
-- 권한 부여
grant connect, resource to YEJI;

grant create session, create table, create view,
        create sequence, create procedure to YEJI;
        
alter user YEJI default tablespace users quota unlimited on users;
        
        
