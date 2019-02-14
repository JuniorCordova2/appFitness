package com.example.cabina10.latinoapp.models;
import java.util.Date;
import java.util.ArrayList;

public class Student {
    private int idStudent;
    private int DNI;
    private String Nombres;
    private String ApPaterno;
    private String ApMaterno;
    private String Domicilio;
    private String Correo;
    private String Telefono;
    private Date FechaNacimiento;

    public Student(int _idStudent, int _DNI, String _Telefono, String _name, String _Paterno, String _Materno, String _Domicilio, String _Correo, Date _FechaNacimiento) {
        this.setIdStudent(_idStudent);
        this.setDNI(_DNI);
        this.setTelefono(_Telefono);
        this.setNombres(_name);
        this.setApPaterno(_Paterno);
        this.setApMaterno(_Materno);
        this.setDomicilio(_Domicilio);
        this.setCorreo(_Correo);
        this.setFechaNacimiento(_FechaNacimiento);
    }

    public Student(int _idStudent, int _DNI, String _Telefono, String _name, String _Paterno, String _Materno, String _Domicilio, String _Correo) {
        this.setIdStudent(_idStudent);
        this.setDNI(_DNI);
        this.setTelefono(_Telefono);
        this.setNombres(_name);
        this.setApPaterno(_Paterno);
        this.setApMaterno(_Materno);
        this.setDomicilio(_Domicilio);
        this.setCorreo(_Correo);
    }

    public Student(){

    }

    public String getDNI() { return String.format("%s", this.DNI); }
    public String getTelefono() { return this.Telefono; }
    public String getNombres() { return this.Nombres; }
    public String getApPaterno() { return this.ApPaterno; }
    public String getApMaterno() { return this.ApMaterno; }
    public String getDomicilio() { return this.Domicilio; }
    public String getCorreo() { return this.Correo; }
    public String getFechaNacimiento(){
    if (FechaNacimiento != null){
        return this.FechaNacimiento.toString();
    }else{
        return "1999-01-01";
    }};

    public static ArrayList<Student> getStudents() {
        ArrayList<Student> _list = new ArrayList<>();
        _list.add(new Student(001, 73568985, "955689875", "Alonso", "Campos", "Torres", "Jr. Los Lirios S/N", "acampos@gmail.com", new Date(2016,12,12)));
        _list.add(new Student(001, 73568985, "936452356", "Alonso", "Campos", "Torres", "Jr. Los Lirios S/N", "acampos@gmail.com", new Date(2016,12,12)));
        _list.add(new Student(001, 73568985, "956485232", "Alonso", "Campos", "Torres", "Jr. Los Lirios S/N", "acampos@gmail.com", new Date(2016,12,12)));
        _list.add(new Student(001, 73568985, "978562356", "Alonso", "Campos", "Torres", "Jr. Los Lirios S/N", "acampos@gmail.com", new Date(2016,12,12)));
        return _list;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public void setApPaterno(String apPaterno) {
        ApPaterno = apPaterno;
    }

    public void setApMaterno(String apMaterno) {
        ApMaterno = apMaterno;
    }

    public void setDomicilio(String domicilio) {
        Domicilio = domicilio;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }
}
