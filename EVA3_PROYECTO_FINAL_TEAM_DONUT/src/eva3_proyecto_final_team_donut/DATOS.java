package eva3_proyecto_final_team_donut;

import javax.swing.JOptionPane;

/**
 *
 * @author TEAM DONUT
 */
public class DATOS {

    public static double Prom;
    public static double[] datos = new double[4];
    public static Lista listaProm = new Lista();

    public static void calcProm(Lista miLista, int[] Califas) throws Exception { //MÉTODO QUE USAREMOS EN CADA ALUMNO

        int i;
        for (i = 0; i < Califas.length; i++) { //Agregamos nodos a la lista 
            miLista.add(Integer.parseInt(JOptionPane.showInputDialog("Introduzca la calificación del alumno(a) " + " de la unidad " + (i + 1) + " : ")));
        }
        miLista.printList();

        int iEdit = JOptionPane.showConfirmDialog(null, "¿Desea editar alguna calificación?", "", JOptionPane.YES_NO_OPTION);
        if (iEdit == JOptionPane.YES_OPTION) {
            int seleccion = JOptionPane.showOptionDialog(null,
                    "¿Que desea hacer?", "Selector de opciones", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
                    null, new Object[]{"Editar cierta calificación", "Eliminar todas las calificaciones"}, "");
            if (seleccion == 0) {
                int iPos = Integer.parseInt(JOptionPane.showInputDialog(null, "Posición de la calificación que desea modificar (El primer elemento es la posicón 0)"));
                int tempPos = miLista.get(iPos);
                miLista.deleteAt(iPos);
                JOptionPane.showMessageDialog(null, "Calificación eliminada");
                miLista.printList();
                Double NCalif = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la nueva calificación"));
                miLista.insertAt(iPos, NCalif);

                if ((tempPos < 70) && (NCalif >= 70)) { //Le restamos al contador de calif reprobatorias, borramos vieja calificacion y añadimos la nueva calif a la suma total
                    miLista.califsR--;
                    double NSum = ((miLista.Suma() - tempPos) + (miLista.get(iPos)));
                    miLista.sum = NSum;
                }
                if ((tempPos >= 70) && (NCalif < 70)) {
                    miLista.califsR++;
                    double NSum = ((miLista.Suma() - tempPos) + (miLista.get(iPos)));
                    miLista.sum = NSum;
                }
                JOptionPane.showMessageDialog(null, "Calificación agregada");
                miLista.printList();

            } else {
                miLista.clear();
                JOptionPane.showMessageDialog(null, "Calificaciones eliminadas\n[]");
            }
        }
        //PROMEDIO
        if (miLista.isEmpty()) {
            A_EDD_ALUMNOS a = new A_EDD_ALUMNOS();
            a.setVisible(true);
        }
        if (miLista.califsR != 0) {
            JOptionPane.showMessageDialog(null, "El alumno tiene " + miLista.califsR + " unidades reprobadas\nNO ACREDITA", "", JOptionPane.ERROR_MESSAGE);
        } else {
            Prom = (double) ((miLista.Suma()) / (miLista.length()));
            listaProm.add(Prom);

            JOptionPane.showMessageDialog(null, "Promedio final del alumno: " + Prom);
        }
    }

    public static void selectionSort(double[] datos) { //Método de ordenamiento
        for (int i = 0; i < datos.length; i++) {
            int iMin = i; //EMPIEZA EL ALGORITMO, EL MINIMO ES EL PRIMER ELEMENTO 
            for (int j = i + 1; j < datos.length; j++) { //BUSCAR POSICION DEL MAS PEQUEÑO
                //COMPARAR
                if (datos[j] < datos[iMin]) {//COMPARO ACTUAL CONTRA MINIMO 
                    iMin = j;
                }
                //SWAP
                if (i != iMin) {
                    //3 PASOS (1. RESPALDAR VALOR, 2. INTERCAMBIAR Y 3.REPONER EL VALOR RESPALDADO)
                    //1.
                    double iTemp = datos[i];
                    //2.
                    datos[i] = datos[iMin];
                    //3.
                    datos[iMin] = iTemp;
                }
            }
        }
    }

    public static void imprimirSelection(double[] datos) { //Imprimimos datos ordenados
        String acum = "";
        System.out.println("");
        for (int i = 0; i < datos.length; i++) {
            acum += ("[" + datos[i] + "]");
        }
        JOptionPane.showMessageDialog(null, acum);
    }

    public static double binarySearch(double[] datos, double valBuscar) {
        return binarySearchRecu(datos, valBuscar, 0, datos.length - 1);
    }

    private static double binarySearchRecu(double[] datos, double valBuscar, int ini, int fin) {
        int iMid;
        double iResu;
        iMid = ini + ((fin - ini) / 2); //Posición a la mitad de la busqueda
        iResu = -1; //SI EL VALOR NO EXISTE REGRESAMOS -1
        if (fin >= ini) { //Buscamos
            if (valBuscar == datos[iMid]) { //EL valor esta a la mitad 
                iResu = iMid; //Aqui esta valor y lo regresmaos 

            } else if (valBuscar < datos[iMid]) { //NO esta a la mitad, pero puede estar en la izq
                iResu = binarySearchRecu(datos, valBuscar, ini, iMid - 1);
            } else {//NO esta a la mitad, pero puede estar a la der
                iResu = binarySearchRecu(datos, valBuscar, iMid + 1, fin);
            }
        } //Se detiene el proceso 
        return iResu;

    }

}
