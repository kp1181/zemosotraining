use sakila;

select count(distinct f.title) from film f
inner join film_category fc on f.film_id = fc.film_id
inner join category c on fc.category_id=c.category_id 

inner join inventory i on i.film_id= f.film_id
inner join store s on i.store_id = s.store_id
inner join staff st on s.manager_staff_id = st.staff_id

where c.name='Sci-Fi' and st.first_name='Jon' and st.last_name = 'Stephens';

