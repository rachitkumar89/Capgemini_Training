use college;
DROP TABLE IF EXISTS emp;

CREATE TABLE emp (
  empno decimal(4,0) NOT NULL,
  ename varchar(10) default NULL,
  job varchar(9) default NULL,
  mgr decimal(4,0) default NULL,
  hiredate date default NULL,
  sal decimal(7,2) default NULL,
  comm decimal(7,2) default NULL,
  deptno decimal(2,0) default NULL
);

DROP TABLE IF EXISTS dept;

CREATE TABLE dept (
  deptno decimal(2,0) default NULL,
  dname varchar(14) default NULL,
  loc varchar(13) default NULL
);

INSERT INTO emp VALUES ('7369','SMITH','CLERK','7902','1980-12-17','800.00',NULL,'20');
INSERT INTO emp VALUES ('7499','ALLEN','SALESMAN','7698','1981-02-20','1600.00','300.00','30');
INSERT INTO emp VALUES ('7521','WARD','SALESMAN','7698','1981-02-22','1250.00','500.00','30');
INSERT INTO emp VALUES ('7566','JONES','MANAGER','7839','1981-04-02','2975.00',NULL,'20');
INSERT INTO emp VALUES ('7654','MARTIN','SALESMAN','7698','1981-09-28','1250.00','1400.00','30');
INSERT INTO emp VALUES ('7698','BLAKE','MANAGER','7839','1981-05-01','2850.00',NULL,'30');
INSERT INTO emp VALUES ('7782','CLARK','MANAGER','7839','1981-06-09','2450.00',NULL,'10');
INSERT INTO emp VALUES ('7788','SCOTT','ANALYST','7566','1982-12-09','3000.00',NULL,'20');
INSERT INTO emp VALUES ('7839','KING','PRESIDENT',NULL,'1981-11-17','5000.00',NULL,'10');
INSERT INTO emp VALUES ('7844','TURNER','SALESMAN','7698','1981-09-08','1500.00','0.00','30');
INSERT INTO emp VALUES ('7876','ADAMS','CLERK','7788','1983-01-12','1100.00',NULL,'20');
INSERT INTO emp VALUES ('7900','JAMES','CLERK','7698','1981-12-03','950.00',NULL,'30');
INSERT INTO emp VALUES ('7902','FORD','ANALYST','7566','1981-12-03','3000.00',NULL,'20');
INSERT INTO emp VALUES ('7934','MILLER','CLERK','7782','1982-01-23','1300.00',NULL,'10');

INSERT INTO dept VALUES ('10','ACCOUNTING','NEW YORK');
INSERT INTO dept VALUES ('20','RESEARCH','DALLAS');
INSERT INTO dept VALUES ('30','SALES','CHICAGO');
INSERT INTO dept VALUES ('40','OPERATIONS','BOSTON');
Select * from emp;
Select * from dept;
desc emp;
select ename from emp;
-- display ename and sal
select ename, sal from emp;
select sal from emp;
-- display salaray of employee without duplicate
select distinct sal from emp;
-- display employee name salary without duplicate 
select  distinct ename, sal from emp;

select distinct job from emp;

select distinct job, sal from emp;


-- display salary with Bonous of thousand 
select ename, sal, sal+1000 from emp;

-- Detection from sal 
select ename, sal , sal-1000 from emp;

-- display name , salary and annual salary of emp
select ename, sal , sal*12 as "Annual Salary" from emp;

-- display ename and sal with hike of 10 %
select ename, sal, sal+sal*0.1 as hike_salary from  emp;

-- display ename and sal with detection of 10 %
select ename , sal, sal*0.9 as detectsal  from emp;

-- WAQTD name and salary with monthly hike of 50s
select ename ,sal ,sal+50 as " Monthly hike" from emp; 


-- WAQTD name and annual salary with deduction of 10%
select ename , sal , sal*12 -sal*12*0.1 as annual_salary from emp;

-- WAQTD total salary given to each employee
select ename, sal ,comm, sal+comm as Total_salary from emp;

-- WAQTD   Details of all the employee along with annual salary
select * , sal*12 as Annual_salary from emp;

-- WAQTD name and designation along with 100 penaly in salary
select ename, job , sal-100 as panalty from emp;


-- WAQTD ename , deptno of employees working in Deptno 20?
select ename, deptno from emp where deptno=20;
-- WAQTD ename ,sal of employee who earning more than 2000
select ename, sal from emp where sal>=2000;

-- whose working as manager
select ename from emp where job="manager";

-- display ename and hire date of emp who hired after 1981
desc emp;
select ename, hiredate from emp where hiredate>"1981-12-31";


-- WAQTD name and sal along with his annual salary if the annual sal is more than 12000
select ename , sal , sal*12 as annaul_salary from emp where sal*12>12000;


select concat('Mr ',ename) as employee_name from emp;

-- smith is working as clerk and earning salary of 800
select concat(ename," is working as ", job, " and earning salary of ", sal) from emp where ename ="Smith";

-- Display the details of employee working in depno is 20 and earning salary is more than 2000
select * from emp where deptno =20 and sal>2000;

-- Display name and deptno of emp who working in deptno 10 ,20
select ename , deptno from emp where deptno=10 or deptno=20;

-- Display the details of employee who earning more than 2000 in deptno 10,20
select * from emp where sal>2000 and (deptno=10 or deptno=20);

-- Display the details of employee who are not working as salseman and analyst
select * from emp where not (job='salesman' or job='analyst');

-- display the ename m deptno working in deptno 10,20
select ename , deptno from emp where deptno in (10,20);
select ename , deptno from emp where deptno not in (10,20);

-- Between : it is used whenever there is range of values and also include range values. 
-- Syntax: col_name /exp between lower_value and higher_value
-- we can not interchange range values.

-- Display name and salaray of employee who earning salary in the range of 1000 to 3000
select ename , sal from emp where sal between 1000 and 2000;
-- Display name who are hired in the year of 1981 .
Select ename , hiredate from emp where hiredate between '1981-01-01' and '1981-12-31';

-- not between : it is similar to between operator but it will rejecct
-- Syntax: col_name/exp not between lower_value_higer_value

-- display the details of employee who are not earning salary in the range of 1000 to 3000
select * from emp where sal not between  1000 and 3000;

-- IS: it is used to compare with null values. 
-- Syntax: col_name/exp is null;

-- Display details of employee who are not earning commitation
select * from emp where comm is null;

-- is not :  it is used to compare with not null values.
-- Syntax: col_name/exp is not null;

-- who is earning something comm
select * from emp where comm is not null;

-- display who earning salary but not comm
select * from emp where sal is not null and comm is null;

-- Like operator: is used for pattern matching or it used whenever the given data is incomplete.
-- to achieve pattern matching we used perecentile (% ) and underscore.
-- % it accepts more then 1 char and _ it accept single char.
-- Syntax: col_name/exp like 'pattern matching'

-- display details of employee who's name start with s 

select * from emp where ename like 's%';
select * from emp where ename like '%s';
select * from emp where ename like '%a%';

select * from emp where ename like '%a%a%';

select * from emp where ename like '%a%a%' and ename not like '%a%a%a%';

-- display name and salary who earning 4 digit of salary
select ename , sal from emp where sal between 1000 and 9999;
select ename , sal from emp where sal like '____.__';
select * from emp where length(sal)=7;

-- hire date
select * from emp where hiredate like '____-01-__';

-- not like 
select * from emp where hiredate not like '____-01-__';

-- display the name of employee who's name start with a or s
select ename from emp where ename like "a%" or ename like 's%';

-- name start with vowel 
select ename from emp where ename like 'a%'or ename like 'e%' or ename like 'i%' or ename like 'o%' or ename like 'u%';

-- details of who's start name with consonant and end with vowel
select ename from emp where (ename like '%a' and ename not like 'a%')or (ename like '%e' and ename not like 'e%')or(ename like '%i' and ename not like 'i%')or (ename like '%o' and ename not like 'o%')or(ename like '%u' and ename not like 'u%');

-- 1. LIST ALL THE EMPLOYEES WHO ARE HAVING REPORTING MANAGERS IN DEPT 10
SELECT e.*
FROM emp e, emp m
WHERE e.mgr = m.empno
  AND m.deptno = 10;

-- 2. LIST ALL THE EMPLOYEES WHOSE COMMISSION IS NULL AND WORKING AS CLERK
SELECT *
FROM emp
WHERE comm IS NULL
  AND job = 'CLERK';

-- 3. LIST ALL THE EMPLOYEES WHO DON'T HAVE A REPORTING MANAGER IN DEPTNO 10 OR 30
SELECT e.*
FROM emp e
LEFT JOIN emp m
  ON e.mgr = m.empno
WHERE m.deptno NOT IN (10, 30)
   OR e.mgr IS NULL;

-- 4. WAQTD details of the employee who's name starts with 'J' and end with 'S'.
SELECT *
FROM emp
WHERE ename LIKE 'J%S';

-- 5. WAQTD details of the employee who's is earning 4 digit salary.
SELECT *
FROM emp
WHERE sal BETWEEN 1000 AND 9999;

-- 6. WAQTD details of the employee who's name has 5 character
SELECT *
FROM EMP
WHERE LENGTH(ENAME) = 5;

-- 7. WAQTD name and hiredate of the employee who was hired on the first day of the month in year 1982
SELECT ENAME, HIREDATE
FROM EMP
WHERE HIREDATE LIKE '1982%-01';


-- 8. WAQTD name if the employee which has 6 character, start with 'A'  and ends with 'a'
SELECT ENAME
FROM EMP
WHERE LENGTH(ENAME) = 6
  AND ENAME LIKE 'A____a';

-- 9. WAQTD name and job of the employee if the job has a sting 'man' in it.
SELECT ENAME, JOB
FROM EMP
WHERE JOB LIKE '%man%';

-- 10 . WAQTD names of the employee having char ' s' as their last character
SELECT ENAME
FROM EMP
WHERE ENAME LIKE '%s';

-- 11. WAQTD details of the employee working as analyst and earning 4 digit salary 
 select * from emp where job='analyst' and sal like '____.__';
 
 -- 12. WAQTD names od the employee hired in first month
 select * from emp where hiredate like '____-01-__';
 
 -- 13. WAQTD details of employee having two L's present in the names and works as manager
 select * from emp where job='manager' and ename like '%l%l%';
 
 -- 14. WAQTD names of the employee if name starts with 'a' or 'j' or 's'
 select * from emp where ename like 'a%' or ename like 'j%' or ename like 's%';

-- 15. WAQTD list all employee names except for the employee who's name has 'a' as the 3rd character.
 select * from emp where ename not like '__A%';
 
 
 select length(ename) from emp;
select ename from emp where length(ename)=4;

-- display the details of employee who's name is more than 4 character but less than 7 character
select ename from emp where length(ename) between 5 and 6;


select substr('qspider',2,3);
select substr(ename,1,1) from emp;
select locate('a','malayalam');

select substr('malyalam hindi', position(' ' in 'malayalam hindi'));
select substr('rachit.snap@gmail.com',position('@' in 'rachit.snap@gmail.com'));

select substr('rachit.snap@gmail.com', 1, position('@' in 'rachit.snap@gmail.com')-1);

select current_date();
select current_timestamp();
select now();
select year(now());
select extract(month from now());


select emp.* , to_char(hiredate,'day') as day
from emp
where to_char(hiredate,'dy')='fri';

-- display the details of employee who hired in the month of march, april, may
select *, to_char(hiredate,'month') as mon
from emp
where to_char(hiredate,'month') =march;

SELECT *,
       MONTHNAME(hiredate) AS mon
FROM emp
WHERE MONTHNAME(hiredate) IN ('March','April','May');

-- display year 1981 and month feb, april , december  and day wednesday, friday
SELECT *,year(hiredate) as yy ,monthname(hiredate) as mon, dayname(hiredate) as dy
FROM emp
WHERE YEAR(hiredate) = '1981'
AND MONTHNAME(hiredate) IN ('February', 'April', 'December')
AND DAYNAME(hiredate) IN ('Wednesday', 'Friday');

select now()- interval 1 day;
select now() - interval 3 year;

select * 
from emp 
where hiredate > hiredate - interval 1 month;

SELECT TIMESTAMPDIFF(YEAR , '2025-01-01', CURDATE()) AS age_in_years; 

SELECT *
FROM emp
WHERE TIMESTAMPDIFF(YEAR, hiredate, '1985-01-01')>=3;

select ename , sal ,comm , sal + coalesce(comm,0) as total_sal
from emp;

select coalesce('apple', null , 'mango');
select coalesce( null,'apple' , 'mango');

select max(sal) from emp;
select min(sal) from emp;
select count(sal) from emp;
select avg(sal) from emp;

select count(comm) from emp;
select count(*) from emp;

-- display number of employee  whose name consist of character 'a'
select count(*) from emp
where ename like '%a%';


-- display maximum salary , minimum salary and avg salary who's working in dep 20
select max(sal), min(sal), avg(sal) from emp
where deptno=20;

-- display no of employee , and total sal of all emp who's earning more than 1700
 select count(ename),sum(sal)
 from emp
 where sal>1700;
 
 select deptno,count(*)
 from emp
 group by deptno;
 
 -- display no of emplyoee in each dept if there is salary is more than 2000?
 select deptno, count(*)
 from emp 
 where sal>2000
 group by deptno;
 
-- display  max sal given to an employee in each designation
select max(sal), min(sal),job
from emp
group by job;

-- display no of times salaries are repeated in emp table?
select sal,count(sal) 
from emp
group by sal;

-- display avg salary given to the employee's in each job?
select job,avg(sal)
from emp 
group by job;
-- display no of employee earning comminsion in each dept?
select deptno,count(comm)
from emp 
group by deptno;

select sum(sal) total_sal
from emp;
