/*(function() {
    "use strict";
    window.addEventListener("load", function() {
        var form = document.getElementById("form-validation");
        form.addEventListener("submit", function(event) {
            if (form.checkValidity() == false) {
                event.preventDefault();
                event.stopPropagation();
                console.log("error");
            }
            form.classList.add("was-validated");
        }, false);
    }, false);
}());*/
