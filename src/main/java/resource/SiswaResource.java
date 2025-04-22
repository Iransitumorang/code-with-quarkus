package resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import model.Siswa;
import service.SiswaService;

import java.util.List;

@Path("/siswa")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class SiswaResource {

    @Inject
    SiswaService siswaService;

    @GET
    public List<Siswa> getAllSiswa() {
        return siswaService.getAll();
    }

    @POST
    public void addSiswa(Siswa siswa) {
        siswaService.add(siswa);
    }
}
