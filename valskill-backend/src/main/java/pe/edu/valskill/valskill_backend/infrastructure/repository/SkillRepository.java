package pe.edu.valskill.valskillbackend.infrastructure.repository;

import pe.edu.valskill.valskillbackend.domain.Skill;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SkillRepository extends MongoRepository<Skill, String> {
}
