Select count(*) no_of_employee, deptno
From emp
Group by deptno
Having count(*)>=4;

-- display no of emoloyee in each dept having atleast 2 emp in it, and there name consist of char 'a' or 's'
select deptno,count(*)
from emp
where ename like '%a%' or ename like '%s%'
group by deptno
having count(*)>=2;

-- display the salary which are repeated in emp table?
select sal,count(*)
from emp
group by sal
having count(*)>1;

-- display job and total sal of each job,if the total salary of each job is more then 9500
select job , sum(sal)
from emp 
group by job
having sum(sal)>9500;

-- calulate the avg salary of all employee and display it only if the avg exceeds 55000?
select avg(sal)
from emp
having avg(sal)>55000;

-- waqtd number of emp earning sal more than 1200 in each job and the total sal needed to pay emp of each job must exceeds 3800
select job, count(sal)
from emp 
where sal>1200
group by job
having sum(sal)>3800;

-- waqtd  job and max sal of emp in each job if the max sal exceeds 2600
select job,max(sal)
from emp
group by job
having max(sal)>2600;

-- waqtd the hiredate which are duplicated in emp table
select hiredate, count(hiredate)
from emp
group by hiredate 
having count(hiredate)>1;

-- waqtd min and max sal of each job if min sal is more than 1000 and max sal is less than 5000
select job,min(sal),max(sal)
from emp
group by job
having min(sal)>1000 and max(sal)<5000;

-- waqtd deptno and no of emp working only if there are 2 emp working in each dept as manager
select deptno , count(*)
from emp
where job='manager'
group by deptno
having  count(*)>2;


-- display no of times salaries are repeated ? arrange them in decending order?
select sal,count(sal)
from emp
group by sal
order by count(sal) desc;

select * from emp;
-- display the details of emp who's is earning salary  more than allen
select *
from emp
where sal>(select sal from emp where ename='allen');

