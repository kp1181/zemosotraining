use sakila;

select c.name from customer cu
inner join rental r on cu.customer_id =r.customer_id
inner join inventory i on r.inventory_id = i.inventory_id
inner join film f on i.film_id = f.film_id


inner join film_category fc on f.film_id = fc.film_id
inner join category c on fc.category_id=c.category_id 

where cu.first_name='PATRICIA' and cu.last_name='JOHNSON'
group by c.name
order by count(c.name) desc
limit 3
;