package dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class SiswaDTO {
    @NotBlank(message = "Nama tidak boleh kosong")
    private String nama;

    @Min(value = 1, message = "Umur minimal 1 tahun")
    private int umur;

    @NotBlank(message = "Alamat tidak boleh kosong")
    private String alamat;

    public SiswaDTO() {}

    public SiswaDTO(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
