use sakila;

select count(distinct f.title) from customer cu
inner join rental r on cu.customer_id =r.customer_id
inner join inventory i on r.inventory_id = i.inventory_id
inner join film f on i.film_id = f.film_id
where f.rating='R' and cu.first_name='SUSAN' and cu.last_name='WILSON';
