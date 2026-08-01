# Problem Statement

## 1. Title
Second-Hand Electronics Trading Platform

## 2. Domain
E-Commerce / Online Marketplace

## 3. Who is the user? (2–3 user types, with roles)

### Buyer
- Register and log in to the platform
- Browse and search for second-hand electronic products
- Filter products by category, brand, price, and condition
- View product details and seller information
- Add products to wishlist
- Purchase products
- Rate and review sellers

### Seller
- Register and log in
- Create product listings with images and descriptions
- Edit or delete product listings
- Manage product availability
- View buyer inquiries and orders
- Track sales history

### Admin
- Manage users and sellers
- Approve or reject product listings
- Remove fake or inappropriate listings
- Manage product categories
- Monitor transactions and generate reports

## 4. What problem are we solving?

Many people own electronic devices such as smartphones, laptops, tablets, cameras, and gaming consoles that they no longer use but find it difficult to sell safely. Existing online marketplaces often contain fake listings, misleading product descriptions, and unverified sellers, making it difficult for buyers to trust the platform.

The Second-Hand Electronics Trading Platform provides a secure and reliable marketplace where verified users can buy and sell used electronic products. The platform allows sellers to create detailed product listings while enabling buyers to search, compare, communicate with sellers, and purchase products with greater confidence.

## 5. Proposed Solution

The application will provide the following features:

- User registration and secure login
- Buyer, Seller, and Admin roles
- Product listing with images and specifications
- Product categorization
- Search and advanced filtering
- Wishlist management
- Buyer-Seller messaging
- Order placement and management
- Ratings and reviews
- Admin approval of listings
- Dashboard and reports

## 6. Core Entities / Database Tables

1. Users
2. Products
3. Categories
4. Orders
5. Order_Items
6. Wishlist
7. Messages
8. Reviews
9. Payments
10. Product_Images

## 7. User Roles & Permissions

### Buyer
- Register/Login
- Browse products
- Search and filter products
- Add products to wishlist
- Place orders
- Send messages to sellers
- Submit ratings and reviews

### Seller
- Register/Login
- Add, edit, and delete product listings
- Upload product images
- Manage orders
- Respond to buyer messages
- View sales history

### Admin
- Manage users
- Verify sellers
- Approve or reject listings
- Remove fraudulent products
- Manage categories
- Generate system reports

## 8. Success Criteria

- Users can successfully register and log in.
- Sellers can create and manage product listings.
- Buyers can search and filter products efficiently.
- Buyers can place orders successfully.
- Buyers and sellers can exchange messages.
- Buyers can submit ratings and reviews.
- Admin can approve or reject product listings.
- Reports can be generated for platform monitoring.

## 9. Out of Scope

The following features are not included in this version:

- Real online payment gateway integration (payment simulation only)
- Mobile application
- Live GPS tracking
- Video calling
- AI chatbot
- International shipping
- Cryptocurrency payments
- Real-time delivery tracking

## 10. Chosen Track

Java (Spring Boot) + MySQL
