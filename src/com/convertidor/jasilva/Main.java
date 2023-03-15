/*
 * Copyright 2023 Jose Angel Silva.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.convertidor.jasilva;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose Angel Silva
 */
public class Main {

    public static void main(String[] args) {
        while (true) {
            solicitudDeDatos();

        }
    }

    private static void solicitudDeDatos() {
        String opciones[] = {"Monedas", "Temperatura"};
        String opcion = (String) JOptionPane.showInputDialog(null, "Opciones",
                "Convertidor", JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

        if (opcion.equals(opciones[0])) {
            convertirMonedas();
        }
        if (opcion.equals(opciones[1])) {
            convertirTemperatura();
        }
    }

    private static void convertirMonedas() {
        ConvertidorMoneda monedas = new ConvertidorMoneda();
        String opciones[] = {"mxm a usd", "mxm a gbp", "mxm a eur", "mxm a jpy", "mxm a krw",
            "usd a mxm", "gbp a mxm", "eur a mxm", "jpy a mxm", "mxm a krm"};
        String opcion = (String) JOptionPane.showInputDialog(null, "Opciones",
                "Convertidor", JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
        double cantidad = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese una cantidad"));
        double cantidadConvertida;
        String mensaje;
        if (opcion.equals(opciones[0])) {
            cantidadConvertida = monedas.mxmToUds(cantidad);
            //System.out.println(cantidadConvertida);
            mensaje = String.format("Cantidad: %.2f mxm\n"
                    + "Total: %.2f usd \n", cantidad, cantidadConvertida);
            JOptionPane.showMessageDialog(null, mensaje);
        }
        if (opcion.equals(opciones[1])) {
            cantidadConvertida = monedas.mxmToGbp(cantidad);
            mensaje = String.format("Cantidad: %.2f mxm\n"
                    + "Total: %.2f gbp \n", cantidad, cantidadConvertida);
            JOptionPane.showMessageDialog(null, mensaje);

        }
        if (opcion.equals(opciones[2])) {
            cantidadConvertida = monedas.mxmToEuros(cantidad);
            mensaje = String.format("Cantidad: %.2f mxm\n"
                    + "Total: %.2f eur \n", cantidad, cantidadConvertida);
            JOptionPane.showMessageDialog(null, mensaje);

        }
        if (opcion.equals(opciones[3])) {
            cantidadConvertida = monedas.mxmTojpy(cantidad);
            mensaje = String.format("Cantidad: %.2f mxm\n"
                    + "Total: %.2f jpy \n", cantidad, cantidadConvertida);
            JOptionPane.showMessageDialog(null, mensaje);

        }
        if (opcion.equals(opciones[4])) {
            cantidadConvertida = monedas.mxmTokrw(cantidad);
            mensaje = String.format("Cantidad: %.2f mxm\n"
                    + "Total: %.2f krw \n", cantidad, cantidadConvertida);
            JOptionPane.showMessageDialog(null, mensaje);

        }
        if (opcion.equals(opciones[5])) { // dolar a mxm
            cantidadConvertida = monedas.usdToMxm(cantidad);
            mensaje = String.format("Cantidad: %.2f usd\n"
                    + "Total: %.2f mxm \n", cantidad, cantidadConvertida);
            JOptionPane.showMessageDialog(null, mensaje);

        }
        if (opcion.equals(opciones[6])) { // gbp a mxm
            cantidadConvertida = monedas.gbpToMxm(cantidad);
            mensaje = String.format("Cantidad: %.2f gbp\n"
                    + "Total: %.2f mxm \n", cantidad, cantidadConvertida);
            JOptionPane.showMessageDialog(null, mensaje);

        }
        if (opcion.equals(opciones[7])) { // eur a mxm
            cantidadConvertida = monedas.eurToMxm(cantidad);
            mensaje = String.format("Cantidad: %.2f eur\n"
                    + "Total: %.2f mxm \n", cantidad, cantidadConvertida);
            JOptionPane.showMessageDialog(null, mensaje);

        }
        if (opcion.equals(opciones[8])) { // jpy a mxm
            cantidadConvertida = monedas.jpyToMxm(cantidad);
            mensaje = String.format("Cantidad: %.2f jpy\n"
                    + "Total: %.2f mxm \n", cantidad, cantidadConvertida);
            JOptionPane.showMessageDialog(null, mensaje);

        }
        if (opcion.equals(opciones[9])) { // krw
            cantidadConvertida = monedas.krwToMxm(cantidad);
            mensaje = String.format("Cantidad: %.2f krw\n"
                    + "Total: %.2f mxm \n", cantidad, cantidadConvertida);
            JOptionPane.showMessageDialog(null, mensaje);

        }
    }
    
    private static void convertirTemperatura(){
        ConvertidorTemperatura temp = new ConvertidorTemperatura();
        String opciones[] = {"C a K", "C a F", "F a C", "F a K", "K a C", "K a F"};
        String opcion = (String) JOptionPane.showInputDialog(null, "Opciones",
                "Convertidor", JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
        double cantidad = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la temperatura a convertir"));
        double tempConvertida;
        String mensaje;
        if(opcion.equals(opciones[0])){
            tempConvertida = temp.CelsiusToKevin(cantidad);
            mensaje = String.format("Cantidad: %.2f C\n"
                    + "Total: %.2f K\n", cantidad, tempConvertida);
            JOptionPane.showMessageDialog(null, mensaje);
        }
        if(opcion.equals(opciones[1])){
            tempConvertida = temp.CelsiusToFharenh(cantidad);
            mensaje = String.format("Cantidad: %.2f C\n"
                    + "Total: %.2f F\n", cantidad, tempConvertida);
            JOptionPane.showMessageDialog(null, mensaje);
        }
        if(opcion.equals(opciones[2])){
            tempConvertida = temp.fToC(cantidad);
            mensaje = String.format("Cantidad: %.2f F\n"
                    + "Total: %.2f C\n", cantidad, tempConvertida);
            JOptionPane.showMessageDialog(null, mensaje);
        }
        if(opcion.equals(opciones[3])){
            tempConvertida = temp.fToK(cantidad);
            mensaje = String.format("Cantidad: %.2f F\n"
                    + "Total: %.2f K\n", cantidad, tempConvertida);
            JOptionPane.showMessageDialog(null, mensaje);
        }
        if(opcion.equals(opciones[4])){
            tempConvertida = temp.kToC(cantidad);
            mensaje = String.format("Cantidad: %.2f K\n"
                    + "Total: %.2f C\n", cantidad, tempConvertida);
            JOptionPane.showMessageDialog(null, mensaje);
        }
        if(opcion.equals(opciones[5])){
            tempConvertida = temp.kToF(cantidad);
            mensaje = String.format("Cantidad: %.2f K\n"
                    + "Total: %.2f F\n", cantidad, tempConvertida);
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }
}
