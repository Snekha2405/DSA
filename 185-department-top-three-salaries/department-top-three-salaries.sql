WITH RankedSalaries AS (
  SELECT 
    e.name AS Employee,
    d.name AS Department,
    e.salary AS Salary,
    DENSE_RANK() OVER (PARTITION BY e.departmentId ORDER BY e.salary DESC) AS `rank`
  FROM employee e
  JOIN department d ON e.departmentId = d.id
)
SELECT Department, Employee, Salary
FROM RankedSalaries
WHERE `rank` <= 3;
