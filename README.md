# U3-ejercicio23
# Sistema de Cuentas Bancarias y Perfiles Financieros

## Objetivo principal

Desarrollar un sistema bancario en Java que permita representar diferentes tipos de cuentas mediante herencia, reutilizando operaciones comunes y especializando su comportamiento.

## Descripción

Se implementa una clase base `CuentaBancaria` que contiene los datos principales de una cuenta y métodos para depositar, extraer dinero y consultar el saldo.

A partir de esta clase se desarrollan `CajaAhorro`, que permite aplicar intereses mensuales, y `CuentaCorriente`, que incorpora un límite de sobregiro y sobrescribe el método de extracción para permitir retiros por encima del saldo disponible dentro del margen autorizado.

## Conceptos aplicados

- Herencia
- Encapsulamiento
- Constructores y uso de `super`

  ![U3 ejercicio23](U3%20ejercicio23.png)
- Sobrescritura de métodos (`@Override`)
- Polimorfismo
- Validación de operaciones financieras
