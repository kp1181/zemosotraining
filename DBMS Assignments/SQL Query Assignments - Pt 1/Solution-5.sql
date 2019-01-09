use sakila;

select count(*) from film where film_id in
(select film_id from film_actor 
inner join actor on film_actor.actor_id = actor.actor_id
where actor.first_name='SEAN' and actor.last_name='WILLIAMS'
);
