use sakila;
select distinct cu.*,c.name,cn.country
from customer cu
inner join rental r on cu.customer_id =r.customer_id
inner join inventory i on r.inventory_id = i.inventory_id
inner join film f on i.film_id = f.film_id
inner join film_category fc on f.film_id = fc.film_id
inner join category c on fc.category_id=c.category_id 

inner join address a on a.address_id = cu.address_id
inner join city ci on ci.city_id = a.city_id
inner join country cn on ci.country_id = cn.country_id

where c.name='Sports' and cn.country='India';