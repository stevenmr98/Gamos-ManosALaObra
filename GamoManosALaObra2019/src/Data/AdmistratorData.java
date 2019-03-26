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

    }//  public boolean search
//****************************PRIMER INTENTO GETADMIN*****************************************************
//    public Administrator getAdmin(String name) throws FileNotFoundException, IOException, ClassNotFoundException {
//        File miArchivo = new File(Utility.Utilities.PATHTOSAVEADMINISTRATORS);
//        boolean bandera = false;
//        List<Administrator> adminList = new ArrayList<>();
//        if (miArchivo.exists()) {
//            
//            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(miArchivo));
//            Object aux = ois.readObject();
//            adminList = (List<Administrator>) aux;
//            ois.close();
//              for (int i = 0; i < adminList.size(); i++) {
//            if (adminList.get(i).getNameEmployee().equalsIgnoreCase(name)&&bandera!=true) {
//                adminList.add(new Administrator());
//                bandera = true;
//                return adminList.get(i);
//            }
//        }
//
//      
//        }
//
//        return null;
//    }
    //**********************SEGUNDO INTENTO GETADMIN*************************************
//     public String getAdmin(String name) throws FileNotFoundException, IOException, ClassNotFoundException {
//        File miArchivo = new File(Utility.Utilities.PATHTOSAVEADMINISTRATORS);
//        boolean bandera = false;
//        String temp="";
//        List<Administrator> adminList = new ArrayList<>();
//        if (miArchivo.exists()) {
//            
//            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(miArchivo));
//            Object aux = ois.readObject();
//            adminList = (List<Administrator>) aux;
//            ois.close();
//            
//              for (int i = 0; i < adminList.size(); i++) {
//            if (adminList.get(i).getNameEmployee().equalsIgnoreCase(name)&&bandera!=true){
//                bandera = true;
//                return temp=adminList.get(i).toString();
//            }
//        }
//            }
//      
//        
//
//        return null;
//    }
    //************************************TERCER INTENTO GETADMIN
        public Administrator getAdmin (String name) throws FileNotFoundException, IOException, ClassNotFoundException {
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
                        return administratoList.get(i);
                    }//if
                }//tercer for

            }//Segundo For
        }//Primer for
        return null;

        }
        public boolean delete(String name) throws IOException, FileNotFoundException, ClassNotFoundException {
        File miArchivo = new File(Utility.Utilities.PATHTOSAVEADMINISTRATORS);
        List<Administrator> administratorList = new ArrayList<Administrator>();
        if (miArchivo.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(miArchivo));
            Object aux = ois.readObject();
            administratorList = (List<Administrator>) aux;
            ois.close();
        }

        for (int i = 0; i < administratorList.size(); i++) {
            if (administratorList.get(i).getNameEmployee().equalsIgnoreCase( name)) {
                administratorList.remove(administratorList.get(i));
                ObjectOutputStream ouput = new ObjectOutputStream(new FileOutputStream(miArchivo));
                ouput.writeUnshared(administratorList);
                ouput.close();
                return true;
            }
        }

        return false;
    }//
}
