use sakila;

select cu.*,ac.first_name,ac.last_name,cn.country
from customer cu
inner join rental r on cu.customer_id =r.customer_id
inner join inventory i on r.inventory_id = i.inventory_id
inner join film f on i.film_id = f.film_id
inner join film_actor fa on fa.film_id = f.film_id
inner join actor ac on fa.actor_id = ac.actor_id


inner join address a on a.address_id = cu.address_id
inner join city ci on ci.city_id = a.city_id
inner join country cn on ci.country_id = cn.country_id

where cn.country='Canada' and ac.first_name='NICK' and ac.last_name='WAHLBERG';