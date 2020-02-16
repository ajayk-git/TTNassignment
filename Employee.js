
//entering the data in objects

var list =[];
for(let i=0; i<2; i++) {
    var employee ={};
    employee['name']=prompt("Enter the name");
    employee['age']=prompt("Enter age");
    employee['salary']=prompt("Enter Salary");
    employee['DOB']=prompt("Enter DOB");
    list.push(employee);
}
console.log(list);


//filter all employees with salary greater than 5000

console.log("Name,salary");
var list =[{Name:"Harsh",Age:21,salary:15000,DOB:"31/08/1998"},
    {Name:"Kshitiz",Age:22,salary:22500,DOB:"20/04/1997"},
    {Name:"Aditya",Age:23,salary:600,DOB:"22/02/1996"},
    {Name:"Ajay",Age:22,salary:750,DOB:"26/02/1991"},
    {Name:"Harshul",Age:22,salary:4000,DOB:"7/08/1979"},
    {Name:"Tony Stark",Age:26,salary:800,DOB:"12/02/1981"},
    {Name:"Hritik ",Age:35,salary:98000,DOB:"12/10/1970"},
    {Name:"Amit ",Age:43,salary:69000,DOB:"16/12/1976"},]

for(let i=0; i<list.length; i++)
{
    if(list[i].salary > 5000)
    {
        console.log(list[i].Name,list[i].salary);
    }
}

//update the salary whos aoge is >20 years and salary is less than 1000

console.log("Name salary Updated_Salary");
for(let i=0; i<list.length; i++)
{
    if(list[i].salary<1000 && list[i].Age >20)
    {
        var new_salary=5*list[i].salary;
        console.log(list[i].Name,list[i].salary,new_salary);
    }
}
