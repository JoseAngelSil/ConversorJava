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

/**
 *
 * @author Jose Angel Silva
 */
public class ConvertidorMoneda {
    
    public double mxmToUds(double cantidadIngresada){
        return cantidadIngresada / 18.63; // valor a 14-03-23
    }
    public double mxmToGbp(double cantidadIngresada){
        return cantidadIngresada / 22.65; // valor a 14-03-23
    }
    public double mxmToEuros(double cantidadIngresada){
        return cantidadIngresada / 20.00; // valor a 14-03-23
    }
    public double mxmTojpy(double cantidadIngresada){
        return cantidadIngresada * 7.21; // valor a 14-03-23
    }
    public double mxmTokrw(double cantidadIngresada){
        return cantidadIngresada * 70.04; // valor a 14-03-23
    }
    
    public double usdToMxm(double cantidadIngresada){
        return cantidadIngresada * 18.63; // valor a 14-03-23
    }
    public double gbpToMxm(double cantidadIngresada){
        return cantidadIngresada * 22.65; // valor a 14-03-23
    }
    public double eurToMxm(double cantidadIngresada){
        return cantidadIngresada * 20; // valor a 14-03-23
    }
    public double jpyToMxm(double cantidadIngresada){
        return cantidadIngresada * 0.14; // valor a 14-03-23
    }
    public double krwToMxm(double cantidadIngresada){
        return cantidadIngresada * 0.014; // valor a 14-03-23
    }
}
