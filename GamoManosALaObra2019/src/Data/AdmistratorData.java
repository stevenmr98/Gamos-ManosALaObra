package Data;

import Domain.Administrator;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Steven
 */
public class AdmistratorData {

    public boolean SaveAdministrator(Administrator admin) throws FileNotFoundException, IOException, ClassNotFoundException {
        File miArchivo = new File(Utility.Utilities.PATHTOSAVEADMINISTRATORS);
        List<Administrator> administratorList = new ArrayList<>();
        if (miArchivo.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(miArchivo));

            Object aux = ois.readObject();
            administratorList = (List<Administrator>) aux;
            ois.close();
        }
        administratorList.add(admin);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(miArchivo));
        oos.writeUnshared(administratorList);
        oos.close();
        return true;

    }//public boolean SaveAdministrator(Administrator admin) 

    public List<Administrator> read() throws FileNotFoundException, IOException, ClassNotFoundException {

        File miArchivo = new File(Utility.Utilities.PATHTOSAVEADMINISTRATORS);
        List<Administrator> administratorList = new ArrayList<>();
        if (miArchivo.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(miArchivo));

            Object aux = ois.readObject();
            administratorList = (List<Administrator>) aux;
            ois.close();
            if (administratorList == null || administratorList.isEmpty()) {
                administratorList = new ArrayList();
                administratorList.add(new Administrator());
                return administratorList;
            }
            return administratorList;
        } else {
            administratorList.add(new Administrator());
            return administratorList;
        }

    }// public List<Administrator> read()

    public boolean search(String name) throws FileNotFoundException, IOException, ClassNotFoundException {
        File miArchivo = new File(Utility.Utilities.PATHTOSAVEADMINISTRATORS);
        List<Administrator> administratoList = new ArrayList<>();
        boolean bandera = false;
        if (miArchivo.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(miArchivo));
            Object aux = ois.readObject();
            administratoList = (List<Administrator>) aux;
            ois.close();
        }
        for (int i = 0; i < administratoList.size(); i++) {

            String palabra = administratoList.get(i).getNameEmployee();
            for (int j = 0; j < palabra.length(); j++) {
                for (int x = 0; x < name.length(); x++) {
                    if (administratoList.get(i).getNameEmployee().equalsIgnoreCase(name)) {
                        return true;
                    }//if
                }//tercer for

            }//Segundo For
        }//Primer for
        return false;

    }//  public boolean buscarPorNombre(String name)

    public Administrator getAdmin(String name) throws FileNotFoundException, IOException, ClassNotFoundException {
        File miArchivo = new File(Utility.Utilities.PATHTOSAVEADMINISTRATORS);
        boolean bandera = false;
        List<Administrator> adminList = new ArrayList<>();
        if (miArchivo.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(miArchivo));
            Object aux = ois.readObject();
            adminList = (List<Administrator>) aux;
            ois.close();
        }

        for (int i = 0; i < adminList.size(); i++) {
            if (adminList.get(i).getNameEmployee().equalsIgnoreCase(name)) {
                bandera = true;
                return adminList.get(i);
            }
        }
//        if (bandera != true) {
//            for (int i = 0; i < adminList.size(); i++) {
//                for (int j = 0; j < adminList.get(i).getNombre().length(); j++) {
//                    for (int x = 0; x < nombre.length(); x++) {
//
//                        if (adminList.get(i).getNombre().charAt(0) == nombre.charAt(0)) {
//
//                            return adminList.get(i);
//                        }
//
//                    }
//                }
//
//            }
//        }
        return null;
    }

}
