package model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Siswa extends PanacheEntity {

    public String nama;
    public String alamat;
    public int umur;

    public Siswa() {}

    public Siswa(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }
}
