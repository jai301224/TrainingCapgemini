create table trader_products(ppid int,ppname text,ppquantity int,ppprice float);
insert into trader_products values(10122001,'Wheat',10,302.5);
insert into trader_products values(10122002,'Milk',20,1000.0);
insert into trader_products values(10122003,'Carrot',15,300.0);
insert into trader_products values(1001,'Rice',30,450.5);
insert into trader_products values(1002,'Tamarind',22,567.9);
select * from trader_products;
alter table traderproducts rename to trader_products;
