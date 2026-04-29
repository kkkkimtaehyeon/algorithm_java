SELECT DISTINCT c.cart_id
FROM CART_PRODUCTS c
WHERE EXISTS (
    SELECT 1
    FROM CART_PRODUCTS
    WHERE cart_id = c.cart_id
      AND name = 'Milk'
)
AND EXISTS (
    SELECT 1
    FROM CART_PRODUCTS
    WHERE cart_id = c.cart_id
      AND name = 'Yogurt'
);