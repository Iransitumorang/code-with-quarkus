package util;

import jakarta.enterprise.event.Observes;
import jakarta.transaction.Transactional;
import io.quarkus.runtime.StartupEvent;
import model.Siswa;

public class Startup {

    @Transactional
    void onStart(@Observes StartupEvent ev) {
        if (Siswa.count() == 0) {
            new Siswa("Andi", 18, "Medan").persist();
        }
    }
}
