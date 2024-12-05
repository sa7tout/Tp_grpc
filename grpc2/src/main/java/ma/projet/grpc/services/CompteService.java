package ma.projet.grpc.services;

import ma.projet.grpc.entities.Compte;
import ma.projet.grpc.repositories.CompteRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CompteService {
    private final CompteRepository compteRepository;

    public CompteService(CompteRepository compteRepository) {
        this.compteRepository = compteRepository;
    }

    public List<Compte> findAllComptes() {
        return compteRepository.findAll();
    }

    public Optional<Compte> findCompteById(String id) {
        return compteRepository.findById(id);
    }

    public Compte saveCompte(Compte compte) {
        return compteRepository.save(compte);
    }

    public void deleteCompte(String id) {
        compteRepository.deleteById(id);
    }
}