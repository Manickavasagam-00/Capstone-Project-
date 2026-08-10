document.getElementById("registerForm").addEventListener("submit", function(event) {

    event.preventDefault();

    const user = {
        name: document.getElementById("name").value,
        email: document.getElementById("email").value,
        password: document.getElementById("password").value
    };

    fetch("/api/users/register", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(user)
    })
    .then(response => response.text())
    .then(message => {

        alert(message);

        if (message.toLowerCase().includes("success")) {
            window.location.href = "login.html";
        }

    })
    .catch(error => {
        console.error("Registration error:", error);
        alert("Registration failed");
    });

});