use sakila;

select count(distinct f.title) from film f
inner join film_category fc on f.film_id = fc.film_id
inner join category c on fc.category_id=c.category_id 
where special_features like '%Deleted Scenes%' and c.name='Documentary';
