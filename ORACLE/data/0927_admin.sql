-- 사용자 생성
create user happy identified by oracle account UNLOCK;
-- 권한 부여
grant connect, resource to happy;

grant create session, create table, create view,
        create sequence, create procedure to happy;
        
        
-- ora-01950 오류 해결
-- alter user [유저명] default tablespace users quota unlimited on users;
alter user kingsmile default tablespace users quota unlimited on users;