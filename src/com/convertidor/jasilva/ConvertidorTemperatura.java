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
public class ConvertidorTemperatura {
    
    public double CelsiusToKevin(double cantingresado){
        return cantingresado + 273.15;
    }
    public double CelsiusToFharenh(double cantingresado){
        return (cantingresado * (double) (9.0/5.0)) + 32;
    }
    public double fToC(double cantingresado){
        return (cantingresado - 32) *(double)(5.0/9.0);
    }
    public double fToK(double cantingresado){
        return fToC(cantingresado) + 273.15;
    }
    public double kToC(double cantingresado){
        return cantingresado -273.15;
    }
    public double kToF(double cantingresado){
        return CelsiusToFharenh(kToC(cantingresado));
    }
}
