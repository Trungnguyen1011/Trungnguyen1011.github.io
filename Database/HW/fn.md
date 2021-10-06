```sql
SELECT * 
FROM customer INNER JOIN call_card 
ON customer.customer_id = call_card.customer_id

```

Lấy ra fantasy 

```sql

SELECT * 
FROM book INNER JOIN book_category ON book.book_id = book_category.book_id 
INNER JOIN category ON book_category.category_id = category.category_id
WHERE category.category = 'fantasy'

```

```sql

SELECT book.title, COUNT(*) AS reprinted
FROM book INNER JOIN reprint ON book.book_id = reprint.book_id 
GROUP BY book.title

```

```sql
SELECT custom_table.*, rented_book.books
FROM 
	(SELECT c.* 
	FROM customer 
	AS c INNER JOIN call_card AS cc
	ON c.customer_id = cc.customer_id 
	WHERE (DATEDIFF(CURRENT_DATE, cc.rental_date) < 30) ) 
AS custom_table
INNER JOIN
	(SELECT call_card.customer_id,  JSON_ARRAYAGG(CONCAT(book.book_id,' ', book.title)) AS books
 	FROM book INNER JOIN rental_detail 
    ON book.book_id = rental_detail.book_id 
    INNER JOIN call_card 
    ON rental_detail.card_id = call_card.card_id
    GROUP BY call_card.customer_id) 
AS rented_book 
ON rented_book.customer_id = custom_table.customer_id

```