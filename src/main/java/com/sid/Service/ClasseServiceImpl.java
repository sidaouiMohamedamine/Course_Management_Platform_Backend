package com.sid.Service;


import com.sid.Entity.Classe;
import com.sid.Repository.ClasseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClasseServiceImpl implements IClasseService {

    @Autowired
    private ClasseRepository classeRepository;

    @Override
    public Classe ajouterClasse(Classe c) {
        return classeRepository.save(c);

    }
}
