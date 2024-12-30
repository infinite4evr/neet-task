# Given a Customer table and a Payment table (with Customer ID as primary and foreign key),
# write a query to output a list of customers who have not paid their bills in the last 3 months.



select c.customer_name from customer c where c.customer_id not in
( select customer_id from payment where payment_date >= date_sub(curdate(), interval 3 month) );