--新建测试表:test
drop table if exists test;
create table test(
  id int not null comment 'id',
  name varchar(50) comment '姓名',
  age varchar(50) comment '年龄',
  primary key(id)
) engine=innodb default charset=utf8mb4 comment '测试';

select * from test;



