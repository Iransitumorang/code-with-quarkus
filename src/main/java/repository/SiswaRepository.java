package repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import model.Siswa;

@ApplicationScoped
public class SiswaRepository implements PanacheRepository<Siswa> {
}
