package by.example.swimming_pool.boundary.databases.postgre.repositories;

import by.example.swimming_pool.boundary.databases.postgre.models.sportmens.Children;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChildrenRepository extends JpaRepository<Children, Long> {

}
