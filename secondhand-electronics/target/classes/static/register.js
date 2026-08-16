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

    .then(response => {

        if (!response.ok) {
            throw new Error("Registration failed");
        }

        return response.json();
    })

    .then(data => {

        document.getElementById("message").innerText =
            "Registration successful! A welcome email has been sent.";

        document.getElementById("registerForm").reset();

    })

    .catch(error => {

        console.error("Registration error:", error);

        document.getElementById("message").innerText =
            "Registration failed. Please try again.";

    });

});