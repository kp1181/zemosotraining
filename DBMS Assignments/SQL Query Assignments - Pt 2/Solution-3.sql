use sakila;


select c.name,sum(amount) from film f
inner join film_category fc on f.film_id = fc.film_id
inner join category c on fc.category_id=c.category_id 

inner join inventory i on f.film_id = i.film_id
inner join rental r on i.inventory_id = r.inventory_id
inner join  payment p on p.rental_id = r.rental_id
where c.name='Animation'
;

