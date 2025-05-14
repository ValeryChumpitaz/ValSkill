package pe.edu.valskill.valskillbackend.application;

import org.springframework.stereotype.Service;
import pe.edu.valskill.valskillbackend.domain.Skill;
import pe.edu.valskill.valskillbackend.infrastructure.repository.SkillRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SkillService {

    private final SkillRepository skillRepository;

    public SkillService(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    public List<Skill> getAllSkills() {
        return skillRepository.findAll();
    }

    public Optional<Skill> getSkillById(String id) {
        return skillRepository.findById(id);
    }

    public Skill createSkill(Skill skill) {
        return skillRepository.save(skill);
    }

    public void deleteSkill(String id) {
        skillRepository.deleteById(id);
    }
}
