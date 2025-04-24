package resource;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
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

    @GET
    @Path("/{id}")
    public Response getSiswa(@PathParam("id") Long id) {
        return siswaService.getById(id)
                .map(siswa -> Response.ok(siswa).build())
                .orElse(Response.status(Response.Status.NOT_FOUND).build());
    }

    @POST
    @Transactional
    public Response addSiswa(Siswa siswa) {
        siswaService.add(siswa);
        return Response.status(Response.Status.CREATED).build();
    }

    @PUT
    @Path("/{id}")
    public Response updateSiswa(@PathParam("id") Long id, Siswa siswa) {
        boolean updated = siswaService.update(id, siswa);
        return updated ?
                Response.ok().build() :
                Response.status(Response.Status.NOT_FOUND).build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteSiswa(@PathParam("id") Long id) {
        boolean deleted = siswaService.delete(id);
        return deleted ?
                Response.noContent().build() :
                Response.status(Response.Status.NOT_FOUND).build();
    }
}
