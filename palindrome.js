function palindrom() {
    var test = document.getElementById("word").value;
    var result = "";

    for (var index = test.length - 1; index >= 0; index--) {
        result = result.concat(test[index]);
    }
    if (result === test) {
        alert("Yes,Pallindrome");
    }
    else {
        alert("notPallindrome");
    }
}