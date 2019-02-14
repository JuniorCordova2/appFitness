package com.example.cabina10.latinoapp.models;
import java.util.ArrayList;
import java.util.Date;

public class Document {
    int idDocument;
    String Nombre, Descripcion;
    String Ruta;
    Date Fecha;

    public Document(int id, String _name, String _description, Date _fecha, String _path) {
        this.idDocument = id;
        this.Nombre = _name;
        this.Descripcion = _description;
        this.Fecha = _fecha;
        this.Ruta = _path;
    }

    public String getRuta() {
        return this.Ruta;
    }
    public String getNombre (){
        return this.Nombre;
    }
    public String getDescripcion() {
        return this.Descripcion;
    }
    public String getFechaText() {
        return this.Fecha.toString();
    }

    public static ArrayList<Document> getDocuments() {
        ArrayList<Document> _list = new ArrayList<>();
        _list.add(new Document(1, "Exame", "El exame", new Date(2016,12,12), "http://precadete.cima.com.pe/documentos/suboficiales/prospecto/PROSPECTO2017II.pdf"));
        _list.add(new Document(1, "Exame", "El exame", new Date(2016,12,12), "http://precadete.cima.com.pe/documentos/suboficiales/prospecto/PROSPECTO2017II.pdf"));
        _list.add(new Document(1, "Exame", "El exame", new Date(2016,12,12), "http://precadete.cima.com.pe/documentos/suboficiales/prospecto/PROSPECTO2017II.pdf"));
        _list.add(new Document(1, "Exame", "El exame", new Date(2016,12,12), "http://precadete.cima.com.pe/documentos/suboficiales/prospecto/PROSPECTO2017II.pdf"));
        _list.add(new Document(1, "Exame", "El exame", new Date(2016,12,12), "http://precadete.cima.com.pe/documentos/suboficiales/prospecto/PROSPECTO2017II.pdf"));
        _list.add(new Document(1, "Exame", "El exame", new Date(2016,12,12), "http://precadete.cima.com.pe/documentos/suboficiales/prospecto/PROSPECTO2017II.pdf"));
        return _list;
    }

    public String toString() {
        return this.Nombre;
    }
}