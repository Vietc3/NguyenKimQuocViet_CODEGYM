var regexp = /^[A-Z]/;

function isFirstLetterUpperCase(str){
    if (regexp.test(str)) {
        console.log("String's first character is uppercase");
    } else {
        console.log("String's first character is not uppercase");
    }
}
