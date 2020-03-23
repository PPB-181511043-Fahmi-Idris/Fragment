package com.example.homeworkmanager;

public class Task {
    public String getNamaMatkul() {
        return namaMatkul;
    }

    public void setNamaMatkul(String namaMatkul) {
        this.namaMatkul = namaMatkul;
    }

    public String getDeskripsiTugas() {
        return deskripsiTugas;
    }

    public void setDeskripsiTugas(String deskripsiTugas) {
        this.deskripsiTugas = deskripsiTugas;
    }

    public String getDeadline() { return deadline; }

    public void setDeadline(String deadline) { this.deadline = deadline; }

    private String namaMatkul;
    private String deskripsiTugas;
    private String deadline;


    public Task(String namaMatkul, String deskripsiTugas, String deadline) {
        this.namaMatkul = namaMatkul;
        this.deskripsiTugas = deskripsiTugas;
        this.deadline = deadline;
    }
}
