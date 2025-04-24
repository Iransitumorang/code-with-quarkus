package service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import model.Siswa;
import repository.SiswaRepository;

import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class SiswaService {

    @Inject
    SiswaRepository siswaRepository;

    public List<Siswa> getAll() {
        return siswaRepository.listAll();
    }

    public Optional<Siswa> getById(Long id) {
        return siswaRepository.findByIdOptional(id);
    }

    @Transactional
    public void add(Siswa siswa) {
        siswaRepository.persist(siswa);
    }

    @Transactional
    public boolean update(Long id, Siswa data) {
        Optional<Siswa> existing = siswaRepository.findByIdOptional(id);
        if (existing.isPresent()) {
            Siswa s = existing.get();
            s.nama = data.nama;
            s.alamat = data.alamat;
            s.umur = data.umur;
            return true;
        }
        return false;
    }

    @Transactional
    public boolean delete(Long id) {
        return siswaRepository.deleteById(id);
    }
}
