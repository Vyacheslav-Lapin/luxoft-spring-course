package ru.vlapin.trainings.luxoftspringcourse.dao;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlapin.trainings.luxoftspringcourse.model.Cat;

public interface CatRepository extends JpaRepository<Cat, UUID> {
}
