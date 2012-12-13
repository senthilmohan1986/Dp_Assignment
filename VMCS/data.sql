

DROP database IF EXISTS `vmcs` ;
CREATE database IF NOT EXISTS `vmcs`;
USE `vmcs` ;

DROP TABLE IF EXISTS `vmcs`.`cashproperty` ;
create table if not exists `vmcs`.`cashproperty`(key_nm varchar(20), value varchar(20));

insert into cashproperty values ('Name5','$1');
insert into cashproperty values ('Name4','50C');
insert into cashproperty values ('Name3','20C');
insert into cashproperty values ('Name2','10C');
insert into cashproperty values ('Name1','5C');
insert into cashproperty values ('Value5','100');
insert into cashproperty values ('Value4','50');
insert into cashproperty values ('NumOfItems','5');
insert into cashproperty values ('Value3','20');
insert into cashproperty values ('Value2','10');
insert into cashproperty values ('Value1','5');
insert into cashproperty values ('Quantity5','11');
insert into cashproperty values ('Quantity4','18');
insert into cashproperty values ('Quantity3','14');
insert into cashproperty values ('Quantity2','2');
insert into cashproperty values ('Quantity1','0');
insert into cashproperty values ('Weight5','42.2');
insert into cashproperty values ('Weight4','35.0');
insert into cashproperty values ('Weight3','18.5');
insert into cashproperty values ('Weight2','10.9');
insert into cashproperty values ('Weight1','7.1');
commit;

DROP TABLE IF EXISTS `vmcs`.`drinksproperty` ;
create table if not exists `vmcs`.`drinksproperty`(key_nm varchar(20), value varchar(20));
insert into drinksproperty values ('Name6','Soya Bean');
insert into drinksproperty values ('Name5','Coca-Cola');
insert into drinksproperty values ('Name4','Soya Bean');
insert into drinksproperty values ('Name3','Sarsi');
insert into drinksproperty values ('Name2','Fanta');
insert into drinksproperty values ('Name1','Coca-Cola');
insert into drinksproperty values ('NumOfItems','6');
insert into drinksproperty values ('Quantity6','1');
insert into drinksproperty values ('Quantity5','5');
insert into drinksproperty values ('Quantity4','2');
insert into drinksproperty values ('Quantity3','0');
insert into drinksproperty values ('Quantity2','1');
insert into drinksproperty values ('Quantity1','0');
insert into drinksproperty values ('Price6','90');
insert into drinksproperty values ('Price5','100');
insert into drinksproperty values ('Price4','90');
insert into drinksproperty values ('Price3','60');
insert into drinksproperty values ('Price2','65');
insert into drinksproperty values ('Price1','100');
commit;

