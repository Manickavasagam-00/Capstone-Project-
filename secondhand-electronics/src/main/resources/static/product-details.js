const urlParams = new URLSearchParams(window.location.search);

const productId = urlParams.get("id");

const productDetails = document.getElementById("productDetails");

fetch(`/api/products/${productId}`)
    .then(response => {

        if (!response.ok) {
            throw new Error("Product not found");
        }

        return response.json();

    })
    .then(product => {

        productDetails.innerHTML = `
            
            <img src="${product.imageUrl}" class="details-image">

            <h2>${product.name}</h2>

            <p><strong>Brand:</strong> ${product.brand}</p>

            <p><strong>Category:</strong> ${product.category}</p>

            <p><strong>Condition:</strong> ${product.condition}</p>

            <p><strong>Description:</strong> ${product.description}</p>

            <p class="product-price">
                ₹${product.price}
            </p>

            <p><strong>Seller:</strong> ${product.sellerName}</p>

            <p><strong>Phone:</strong> ${product.sellerPhone}</p>

        `;

    })
    .catch(error => {

        productDetails.innerHTML = `
            <p>Unable to load product details.</p>
        `;

        console.error(error);

    });