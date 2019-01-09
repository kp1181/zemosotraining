use sakila;
select title,name,count(title) as tmp from film f 
inner join inventory i on f.film_id = i.film_id
inner join rental r on i.inventory_id = r.inventory_id
inner join film_category fc on f.film_id = fc.film_id
inner join category c on fc.category_id=c.category_id 
where name='Horror' 
group by title
order by tmp desc
limit 3
;
