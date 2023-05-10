package Guia_8_ejercicio_1;

import java.math.BigInteger;

public class CuentaBancaria {
    Integer numeroCuenta;
    BigInteger dniCliente;
    double saldoActual;
    
    public CuentaBancaria() {
    }

    public CuentaBancaria(Integer numeroCuenta, BigInteger dniCliente, Double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    public Integer getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(Integer numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public BigInteger getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(BigInteger dniCliente) {
        this.dniCliente = dniCliente;
    }

    public Double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(Double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    
    
}
