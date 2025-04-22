package service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import model.Siswa;
import repository.SiswaRepository;

import java.util.List;

@ApplicationScoped
public class SiswaService {

    @Inject
    SiswaRepository siswaRepository;

    public List<Siswa> getAll() {
        return siswaRepository.listAll();
    }

    public void add(Siswa siswa) {
        siswaRepository.persist(siswa);
    }
}
