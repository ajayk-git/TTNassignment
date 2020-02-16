function intrest()
{
    var amount = prompt("Enter the amount");
    var intrest = prompt("Enter the intrest rate");
    var year = prompt("Enter the number of year");
    var months = prompt("Enter the number of months");
    var days = prompt("Enter number of days");
    var S_I = ((amount * intrest * year) + (amount * intrest * months % 12) + (amount * intrest * days % 365)) / 100;
    document.write(S_I);
}