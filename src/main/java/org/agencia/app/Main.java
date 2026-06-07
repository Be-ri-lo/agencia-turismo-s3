package org.agencia.app;

import org.agencia.model.Cliente;
import org.agencia.model.Guia;
import org.agencia.model.Proveedor;
import org.agencia.model.Tour;
import org.agencia.util.RutInvalidoException;
import org.agencia.util.RutValidador;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // -----------------------------------------------------------------
        // ESCENARIO 1: TOUR GASTRONÓMICO TRADICIONAL
        // -----------------------------------------------------------------
        System.out.println("AGENCIA DE TURISMO LLANQUIHUE");
        try {
            Guia guia1 = new Guia(
                    "Carlos",
                    "Andrade",
                    "11111112-1",
                    true,
                    "Indefinido",
                    LocalDate.of(2024, 3, 1)
            );
            //validar rut Guia
            RutValidador.validarRut(guia1.getRut());

            Proveedor provGastronomia = new Proveedor(
                    "René",
                    "Gallardo",
                    "12876543-2",
                    "Llanquihue",
                    "Restaurante"
            );
            //validar rut Proveedor
            RutValidador.validarRut(provGastronomia.getRut());

            provGastronomia.setLugar("Frutillar");
            provGastronomia.setTipoDeServicio("Gastronomía (Kuchen Tradicional)");

            //Cliente
            Cliente clienteFamiliar = new Cliente(
                    "María",
                    "Ortega",
                    "11111111-K",
                    28
            );
            //validar rut Cliente
            RutValidador.validarRut(clienteFamiliar.getRut());

            // Construimos el primer Tour
            Tour tourKuchen = new Tour(clienteFamiliar, guia1, provGastronomia);

            // -----------------------------------------------------------------
            // ESCENARIO 2: TOUR DE AVENTURA (Datos y roles totalmente distintos)
            // -----------------------------------------------------------------
            // Segundo guía con datos diferentes
            Guia guia2 = new Guia(
                    "Cristóbal",
                    "Mendoza",
                    "19123456-7",
                    false,
                    "Plazo Fijo",
                    LocalDate.of(2026, 1, 15)
            );
            //validar rut Guia
            RutValidador.validarRut(guia2.getRut());

            // Un proveedor de un rubro totalmente distinto (Transporte/Aventura) y en otra comuna
            Proveedor provAventura = new Proveedor(
                    "Verónica",
                    "Ruiz",
                    "14987654-K",
                    "Puerto Varas",
                    "Transporte"
            );
            //validar rut Proveedor
            RutValidador.validarRut(provAventura.getRut());

            provAventura.setLugar("Saltos del Petrohué");
            provAventura.setTipoDeServicio("Aventura (Rafting en Río Petrohué)");

            // Un cliente que representa otro perfil (un turista de la tercera edad o extranjero)
            Cliente clienteAventurero = new Cliente(
                    "Hans",
                    "Müller",
                    "16888999-5",
                    35
            );
            //validar rut CleinteAventurero
            RutValidador.validarRut(clienteAventurero.getRut());

            // Construimos el segundo Tour
            Tour tourRafting = new Tour(clienteAventurero, guia2, provAventura);


            System.out.println("--> Ficha Tour Cultural/Gastronómico: ");
            System.out.println(tourKuchen);
            System.out.println();

            System.out.println("--> Ficha Tour Aventura: ");
            System.out.println(tourRafting);
            System.out.println("-----------------------------------------------------");

        } catch (RutInvalidoException ex) {
            System.out.println("ERROR DE VALIDACION");
            System.out.println(ex.getMessage());
        }
    }
}


