function validatePassword() {
    var password = document.getElementById("passwordField").value;
    if (password !== "Alten@1234") {
        alert("Incorrect password. Please try again.");
        return false; // Prevent form submission
    }
    return true; // Allow form submission
}
