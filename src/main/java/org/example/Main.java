package org.example;

import org.example.MODELOS.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instanciando Asegurado vacío
        System.out.println("Ingrese los datos del Asegurado:");
        Asegurado aseguradoVacio = new Asegurado();
        System.out.print("ID: ");
        aseguradoVacio.setId(scanner.nextInt());
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Nombre: ");
        aseguradoVacio.setNombre(scanner.nextLine());
        System.out.print("Apellido: ");
        aseguradoVacio.setApellido(scanner.nextLine());
        System.out.print("Documento de Identidad: ");
        aseguradoVacio.setDocumentoIdentidad(scanner.nextLine());
        System.out.print("Teléfono: ");
        aseguradoVacio.setTelefono(scanner.nextLine());
        System.out.print("Email: ");
        aseguradoVacio.setEmail(scanner.nextLine());
        System.out.print("Dirección: ");
        aseguradoVacio.setDireccion(scanner.nextLine());
        System.out.print("Fecha de Nacimiento: ");
        aseguradoVacio.setFechaNacimiento(scanner.nextLine());
        System.out.print("Nacionalidad: ");
        aseguradoVacio.setNacionalidad(scanner.nextLine());
        System.out.print("Ocupación: ");
        aseguradoVacio.setOcupacion(scanner.nextLine());
        System.out.print("Estado Civil: ");
        aseguradoVacio.setEstadoCivil(scanner.nextLine());
        System.out.print("Tipo de Sangre: ");
        aseguradoVacio.setTipoSangre(scanner.nextLine());
        System.out.print("Género: ");
        aseguradoVacio.setGenero(scanner.nextLine());
        System.out.print("Fecha de Registro: ");
        aseguradoVacio.setFechaRegistro(scanner.nextLine());
        System.out.print("¿Es Activo? (true/false): ");
        aseguradoVacio.setEsActivo(scanner.nextBoolean());

        // Instanciando Asegurado lleno
        Asegurado aseguradoLleno = new Asegurado(1, "Juan", "Pérez", "12345678", "555-1234",
                "juan.perez@example.com", "Calle Falsa 123", "1990-01-01", "Chileno",
                "Ingeniero", "Soltero", "O+", "Masculino", "2023-09-30", true);

        // Instanciando Vehiculo vacío
        System.out.println("\nIngrese los datos del Vehiculo:");
        Vehiculo vehiculoVacio = new Vehiculo();
        System.out.print("ID: ");
        vehiculoVacio.setId(scanner.nextInt());
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Marca: ");
        vehiculoVacio.setMarca(scanner.nextLine());
        System.out.print("Modelo: ");
        vehiculoVacio.setModelo(scanner.nextLine());
        System.out.print("Año: ");
        vehiculoVacio.setAno(scanner.nextLine());
        System.out.print("Color: ");
        vehiculoVacio.setColor(scanner.nextLine());
        System.out.print("Número de Placa: ");
        vehiculoVacio.setNumeroPlaca(scanner.nextLine());
        System.out.print("Tipo: ");
        vehiculoVacio.setTipo(scanner.nextLine());
        System.out.print("Chasis: ");
        vehiculoVacio.setChasis(scanner.nextLine());
        System.out.print("Motor: ");
        vehiculoVacio.setMotor(scanner.nextLine());
        System.out.print("Tipo de Combustible: ");
        vehiculoVacio.setTipoCombustible(scanner.nextLine());
        System.out.print("Cantidad de Pasajeros: ");
        vehiculoVacio.setCantidadPasajeros(scanner.nextInt());
        System.out.print("Valor Comercial: ");
        vehiculoVacio.setValorComercial(scanner.nextDouble());
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Número de Serie: ");
        vehiculoVacio.setNumeroSerie(scanner.nextLine());
        System.out.print("Seguro Vigente: ");
        vehiculoVacio.setSeguroVigente(scanner.nextLine());
        System.out.print("Fecha de Registro: ");
        vehiculoVacio.setFechaRegistro(scanner.nextLine());
        System.out.print("¿Es Activo? (true/false): ");
        vehiculoVacio.setEsActivo(scanner.nextBoolean());

        // Instanciando Vehiculo lleno
        Vehiculo vehiculoLleno = new Vehiculo(1, "Toyota", "Corolla", "2020", "Rojo",
                "ABC123", "Sedan", "1HGBH41JXMN109186", "K24", "Gasolina",
                5, 15000.0, "1HGBH41JXMN109186", "Sí", "2023-09-30", true);
// Instanciando Beneficiario vacío
        System.out.println("Ingrese los datos del Beneficiario:");
        Beneficiario beneficiarioVacio = new Beneficiario();
        System.out.print("ID: ");
        beneficiarioVacio.setId(scanner.nextInt());
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Nombre: ");
        beneficiarioVacio.setNombre(scanner.nextLine());
        System.out.print("Apellido: ");
        beneficiarioVacio.setApellido(scanner.nextLine());
        System.out.print("Documento de Identidad: ");
        beneficiarioVacio.setDocumentoIdentidad(scanner.nextLine());
        System.out.print("Parentesco: ");
        beneficiarioVacio.setParentesco(scanner.nextLine());
        System.out.print("Teléfono: ");
        beneficiarioVacio.setTelefono(scanner.nextLine());
        System.out.print("Email: ");
        beneficiarioVacio.setEmail(scanner.nextLine());
        System.out.print("Dirección: ");
        beneficiarioVacio.setDireccion(scanner.nextLine());
        System.out.print("¿Es Activo? (true/false): ");
        beneficiarioVacio.setEsActivo(scanner.nextBoolean());
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Fecha de Nacimiento: ");
        beneficiarioVacio.setFechaNacimiento(scanner.nextLine());

        // Instanciando Beneficiario lleno
        Beneficiario beneficiarioLleno = new Beneficiario(1, "Ana", "González", "98765432",
                "Esposa", "555-4321", "ana.gonzalez@example.com", "Calle Siempre Viva 789",
                true, "1995-05-15");

        // Instanciando Aseguradora vacío
        System.out.println("\nIngrese los datos de la Aseguradora:");
        Aseguradora aseguradoraVacio = new Aseguradora();
        System.out.print("ID: ");
        aseguradoraVacio.setId(scanner.nextInt());
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Nombre: ");
        aseguradoraVacio.setNombre(scanner.nextLine());
        System.out.print("Teléfono: ");
        aseguradoraVacio.setTelefono(scanner.nextLine());
        System.out.print("Email: ");
        aseguradoraVacio.setEmail(scanner.nextLine());
        System.out.print("Dirección: ");
        aseguradoraVacio.setDireccion(scanner.nextLine());
        System.out.print("RUC: ");
        aseguradoraVacio.setRuc(scanner.nextLine());
        System.out.print("¿Es Activa? (true/false): ");
        aseguradoraVacio.setEsActiva(scanner.nextBoolean());
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Tipo de Seguro: ");
        aseguradoraVacio.setTipoSeguro(scanner.nextLine());
        System.out.print("País: ");
        aseguradoraVacio.setPais(scanner.nextLine());
        System.out.print("Ciudad: ");
        aseguradoraVacio.setCiudad(scanner.nextLine());

        // Instanciando Aseguradora llena
        Aseguradora aseguradoraLleno = new Aseguradora(1, "Aseguradora S.A.", "555-6789",
                "contacto@aseguradora.com", "Avenida Siempre Viva 456", "123456789",
                true, "Todo Riesgo", "Chile", "Santiago");

        // Instanciando Accidente vacío
        System.out.println("\nIngrese los datos del Accidente:");
        Accidente accidenteVacio = new Accidente();
        System.out.print("ID: ");
        accidenteVacio.setId(scanner.nextInt());
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Fecha: ");
        accidenteVacio.setFecha(scanner.nextLine());
        System.out.print("Lugar: ");
        accidenteVacio.setLugar(scanner.nextLine());
        System.out.print("Descripción: ");
        accidenteVacio.setDescripcion(scanner.nextLine());
        System.out.print("Tipo de Accidente: ");
        accidenteVacio.setTipoAccidente(scanner.nextLine());
        System.out.print("Daños Materiales valor: ");
        accidenteVacio.setDanossMateriales(scanner.nextDouble());
        System.out.print("¿Hay Lesionados? (true/false): ");
        accidenteVacio.setHayLesionados(scanner.nextBoolean());
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Estado: ");
        accidenteVacio.setEstado(scanner.nextLine());
        System.out.print("ID Asegurado: ");
        accidenteVacio.setIdAsegurado(scanner.nextLine());
        System.out.print("ID Vehículo: ");
        accidenteVacio.setIdVehiculo(scanner.nextLine());

        // Instanciando Accidente lleno
        Accidente accidenteLleno = new Accidente(1, "2023-09-30", "Avenida Libertador",
                "Choque frontal", "Choque", 1500.0, true, "Pendiente",
                "123", "456");


        // Mostrar información
        System.out.println(" asegurado vacio ID: " + aseguradoVacio.getId());
        System.out.println("Nombre: " + aseguradoVacio.getNombre());
        System.out.println("Apellido: " + aseguradoVacio.getApellido());
        System.out.println("Documento de Identidad: " + aseguradoVacio.getDocumentoIdentidad());
        System.out.println("Teléfono: " + aseguradoVacio.getTelefono());
        System.out.println("Email: " + aseguradoVacio.getEmail());
        System.out.println("Dirección: " + aseguradoVacio.getDireccion());
        System.out.println("Fecha de Nacimiento: " + aseguradoVacio.getFechaNacimiento());
        System.out.println("Nacionalidad: " + aseguradoVacio.getNacionalidad());
        System.out.println("Ocupación: " + aseguradoVacio.getOcupacion());
        System.out.println("Estado Civil: " + aseguradoVacio.getEstadoCivil());
        System.out.println("Tipo de Sangre: " + aseguradoVacio.getTipoSangre());
        System.out.println("Género: " + aseguradoVacio.getGenero());
        System.out.println("Fecha de Registro: " + aseguradoVacio.getFechaRegistro());
        System.out.println("Es Activo: " + aseguradoVacio.isEsActivo());

        System.out.println("asegurado lleno ID: " + aseguradoLleno.getId());
        System.out.println("Nombre: " + aseguradoLleno.getNombre());
        System.out.println("Apellido: " + aseguradoLleno.getApellido());
        System.out.println("Documento de Identidad: " + aseguradoLleno.getDocumentoIdentidad());
        System.out.println("Teléfono: " + aseguradoLleno.getTelefono());
        System.out.println("Email: " + aseguradoLleno.getEmail());
        System.out.println("Dirección: " + aseguradoLleno.getDireccion());
        System.out.println("Fecha de Nacimiento: " + aseguradoLleno.getFechaNacimiento());
        System.out.println("Nacionalidad: " + aseguradoLleno.getNacionalidad());
        System.out.println("Ocupación: " + aseguradoLleno.getOcupacion());
        System.out.println("Estado Civil: " + aseguradoLleno.getEstadoCivil());
        System.out.println("Tipo de Sangre: " + aseguradoLleno.getTipoSangre());
        System.out.println("Género: " + aseguradoLleno.getGenero());
        System.out.println("Fecha de Registro: " + aseguradoLleno.getFechaRegistro());
        System.out.println("Es Activo: " + aseguradoLleno.isEsActivo());



        System.out.println("vehiculo lleno ID: " + vehiculoLleno.getId());
        System.out.println("Marca: " + vehiculoLleno.getMarca());
        System.out.println("Modelo: " + vehiculoLleno.getModelo());
        System.out.println("Año: " + vehiculoLleno.getAno());
        System.out.println("Color: " + vehiculoLleno.getColor());
        System.out.println("Número de Placa: " + vehiculoLleno.getNumeroPlaca());
        System.out.println("Tipo: " + vehiculoLleno.getTipo());
        System.out.println("Chasis: " + vehiculoLleno.getChasis());
        System.out.println("Motor: " + vehiculoLleno.getMotor());
        System.out.println("Tipo de Combustible: " + vehiculoLleno.getTipoCombustible());
        System.out.println("Cantidad de Pasajeros: " + vehiculoLleno.getCantidadPasajeros());
        System.out.println("Valor Comercial: " + vehiculoLleno.getValorComercial());
        System.out.println("Número de Serie: " + vehiculoLleno.getNumeroSerie());
        System.out.println("Seguro Vigente: " + vehiculoLleno.getSeguroVigente());
        System.out.println("Fecha de Registro: " + vehiculoLleno.getFechaRegistro());
        System.out.println("Es Activo: " + vehiculoLleno.isEsActivo());

        System.out.println("vehiculo vacio ID: " + vehiculoVacio.getId());
        System.out.println("Marca: " + vehiculoVacio.getMarca());
        System.out.println("Modelo: " + vehiculoVacio.getModelo());
        System.out.println("Año: " + vehiculoVacio.getAno());
        System.out.println("Color: " + vehiculoVacio.getColor());
        System.out.println("Número de Placa: " + vehiculoVacio.getNumeroPlaca());
        System.out.println("Tipo: " + vehiculoVacio.getTipo());
        System.out.println("Chasis: " + vehiculoVacio.getChasis());
        System.out.println("Motor: " + vehiculoVacio.getMotor());
        System.out.println("Tipo de Combustible: " + vehiculoVacio.getTipoCombustible());
        System.out.println("Cantidad de Pasajeros: " + vehiculoVacio.getCantidadPasajeros());
        System.out.println("Valor Comercial: " + vehiculoVacio.getValorComercial());
        System.out.println("Número de Serie: " + vehiculoVacio.getNumeroSerie());
        System.out.println("Seguro Vigente: " + vehiculoVacio.getSeguroVigente());
        System.out.println("Fecha de Registro: " + vehiculoVacio.getFechaRegistro());
        System.out.println("Es Activo: " + vehiculoVacio.isEsActivo());

        // Imprimiendo datos de Beneficiario vacío
        System.out.println("\nBeneficiario vacío:");
        System.out.println("ID: " + beneficiarioVacio.getId());
        System.out.println("Nombre: " + beneficiarioVacio.getNombre());
        System.out.println("Apellido: " + beneficiarioVacio.getApellido());
        System.out.println("Documento de Identidad: " + beneficiarioVacio.getDocumentoIdentidad());
        System.out.println("Parentesco: " + beneficiarioVacio.getParentesco());
        System.out.println("Teléfono: " + beneficiarioVacio.getTelefono());
        System.out.println("Email: " + beneficiarioVacio.getEmail());
        System.out.println("Dirección: " + beneficiarioVacio.getDireccion());
        System.out.println("¿Es Activo?: " + beneficiarioVacio.isEsActivo());
        System.out.println("Fecha de Nacimiento: " + beneficiarioVacio.getFechaNacimiento());

        // Imprimiendo datos de Beneficiario lleno
        System.out.println("\nBeneficiario lleno:");
        System.out.println("ID: " + beneficiarioLleno.getId());
        System.out.println("Nombre: " + beneficiarioLleno.getNombre());
        System.out.println("Apellido: " + beneficiarioLleno.getApellido());
        System.out.println("Documento de Identidad: " + beneficiarioLleno.getDocumentoIdentidad());
        System.out.println("Parentesco: " + beneficiarioLleno.getParentesco());
        System.out.println("Teléfono: " + beneficiarioLleno.getTelefono());
        System.out.println("Email: " + beneficiarioLleno.getEmail());
        System.out.println("Dirección: " + beneficiarioLleno.getDireccion());
        System.out.println("¿Es Activo?: " + beneficiarioLleno.isEsActivo());
        System.out.println("Fecha de Nacimiento: " + beneficiarioLleno.getFechaNacimiento());

        // Imprimiendo datos de Aseguradora vacío
        System.out.println("\nAseguradora vacío:");
        System.out.println("ID: " + aseguradoraVacio.getId());
        System.out.println("Nombre: " + aseguradoraVacio.getNombre());
        System.out.println("Teléfono: " + aseguradoraVacio.getTelefono());
        System.out.println("Email: " + aseguradoraVacio.getEmail());
        System.out.println("Dirección: " + aseguradoraVacio.getDireccion());
        System.out.println("RUC: " + aseguradoraVacio.getRuc());
        System.out.println("¿Es Activa?: " + aseguradoraVacio.isEsActiva());
        System.out.println("Tipo de Seguro: " + aseguradoraVacio.getTipoSeguro());
        System.out.println("País: " + aseguradoraVacio.getPais());
        System.out.println("Ciudad: " + aseguradoraVacio.getCiudad());

        // Imprimiendo datos de Aseguradora llena
        System.out.println("\nAseguradora llena:");
        System.out.println("ID: " + aseguradoraLleno.getId());
        System.out.println("Nombre: " + aseguradoraLleno.getNombre());
        System.out.println("Teléfono: " + aseguradoraLleno.getTelefono());
        System.out.println("Email: " + aseguradoraLleno.getEmail());
        System.out.println("Dirección: " + aseguradoraLleno.getDireccion());
        System.out.println("RUC: " + aseguradoraLleno.getRuc());
        System.out.println("¿Es Activa?: " + aseguradoraLleno.isEsActiva());
        System.out.println("Tipo de Seguro: " + aseguradoraLleno.getTipoSeguro());
        System.out.println("País: " + aseguradoraLleno.getPais());
        System.out.println("Ciudad: " + aseguradoraLleno.getCiudad());

        // Imprimiendo datos de Accidente vacío
        System.out.println("\nAccidente vacío:");
        System.out.println("ID: " + accidenteVacio.getId());
        System.out.println("Fecha: " + accidenteVacio.getFecha());
        System.out.println("Lugar: " + accidenteVacio.getLugar());
        System.out.println("Descripción: " + accidenteVacio.getDescripcion());
        System.out.println("Tipo de Accidente: " + accidenteVacio.getTipoAccidente());
        System.out.println("Daños Materiales: " + accidenteVacio.getDanossMateriales());
        System.out.println("¿Hay Lesionados?: " + accidenteVacio.isHayLesionados());
        System.out.println("Estado: " + accidenteVacio.getEstado());
        System.out.println("ID Asegurado: " + accidenteVacio.getIdAsegurado());
        System.out.println("ID Vehículo: " + accidenteVacio.getIdVehiculo());

        // Imprimiendo datos de Accidente lleno
        System.out.println("\nAccidente lleno:");
        System.out.println("ID: " + accidenteLleno.getId());
        System.out.println("Fecha: " + accidenteLleno.getFecha());
        System.out.println("Lugar: " + accidenteLleno.getLugar());
        System.out.println("Descripción: " + accidenteLleno.getDescripcion());
        System.out.println("Tipo de Accidente: " + accidenteLleno.getTipoAccidente());
        System.out.println("Daños Materiales: " + accidenteLleno.getDanossMateriales());
        System.out.println("¿Hay Lesionados?: " + accidenteLleno.isHayLesionados());
        System.out.println("Estado: " + accidenteLleno.getEstado());
        System.out.println("ID Asegurado: " + accidenteLleno.getIdAsegurado());
        System.out.println("ID Vehículo: " + accidenteLleno.getIdVehiculo());

        scanner.close();
    }
}