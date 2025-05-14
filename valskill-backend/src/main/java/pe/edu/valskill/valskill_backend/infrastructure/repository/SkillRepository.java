package pe.edu.valskill.valskillbackend.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SkillRepository extends MongoRepository<Skill, String> {
}
