import java.io.IOException;

/**
 * Clase que carga los datos con los que simular un campeonato de tenis
 * 
 * @author Sergio Terrazas Lobato e Ismael Acedo Acedo
 *
 */

public class Init {
    public Init(Campeonato campeonato) throws IOException {
        // Descomentar la carga de datos que se quiera probar
        ValoresRaquetas.iniciarMapas();
        // Descomentar la carga de datos que se quiera probar
        cargarDatos1(campeonato);// Produce la salida Salida1_EC3
        // cargarDatos2(campeonato);//Produce la salida Salida2_EC3

    }

    private void cargarDatos1(Campeonato campeonato) throws IOException {
        // Instanciamos 8 zapatillas: (Los parametros estan en el orden: tipo, modelo,
        // n�mero y valor)
        Zapatillas z1 = new ZapatillasAmortiguadas("Air Zoom Vapor Pro", 42.0, 5.0);
        Zapatillas z2 = new ZapatillasConAgarre("Court Vapor React", 40.0, 5.0);
        Zapatillas z3 = new ZapatillasConAgarre("Gel-Resolution 8 GS", 40.0, 4.0);
        Zapatillas z4 = new ZapatillasAmortiguadas("Vapor Lite", 42.0, 3.0);
        Zapatillas z5 = new ZapatillasConAgarre("Court Lite", 39.0, 3.0);
        Zapatillas z6 = new ZapatillasAmortiguadas("UberSonic 4K", 40.0, 6.0);
        Zapatillas z7 = new ZapatillasAmortiguadas("Zoom GP Turbo", 43.0, 3.5);
        Zapatillas z8 = new ZapatillasConAgarre("CourtJam Bounce", 42.0, 3.5);

        // Instanciamos 8 tenistas: (Los par�metros est�n en el orden nombre,
        // zapatillas, saque, resto, ranking, pais y n�mero de pie)
        // Novedad en EC3: cada tenista es de tipo "Golpeadores" o de tipo "Voleadores"
        Tenista t1 = new Golpeadores("Novak Djokovic", z1, 90.0, 80.0, 1, "Serbia", 42.0);
        Tenista t2 = new Golpeadores("Ashleigh Barty", z2, 70.0, 80.0, 1, "Australia", 40.0);
        Tenista t3 = new Voleadores("Stefanos Tsitsipas", z7, 55.0, 48.0, 3, "Grecia", 43.0);
        Tenista t4 = new Voleadores("Karolina Pliskova", z5, 67.0, 68.5, 3, "Rep Checa", 39.0);
        Tenista t5 = new Golpeadores("Elina Svitolina", z6, 55.5, 68.5, 4, "Ucrania", 40.0);
        Tenista t6 = new Golpeadores("Alexander Zverev", z8, 59.0, 49.5, 4, "Alemania", 42.0);
        Tenista t7 = new Voleadores("Aryna Sabalenka", z3, 67.5, 79.5, 2, "Bielorrusia", 40.0);
        Tenista t8 = new Voleadores("Daniil Medvedev", z4, 79.0, 68.0, 2, "Rusia", 42.0);

        // A continuaci�n se inscribir�n a los 8 tenistas en el campeonato
        t1.realizarInscripcion();
        t2.realizarInscripcion();
        t3.realizarInscripcion();
        t4.realizarInscripcion();
        t5.realizarInscripcion();
        t6.realizarInscripcion();
        t7.realizarInscripcion();
        t8.realizarInscripcion();

        // Instanciamos zapatillas para ser usadas en el campeonato:
        // (Los par�metros est�n en el orden: tipo, modelo, n�mero y valor)
        Zapatillas z9 = new ZapatillasAmortiguadas("Lotto Space", 40.0, 5.0);
        Zapatillas z10 = new ZapatillasAmortiguadas("K-Swiss Express", 42.0, 3.0);
        Zapatillas z11 = new ZapatillasAmortiguadas("Babolat Jet Tere", 42.0, 5.5);
        Zapatillas z12 = new ZapatillasAmortiguadas("Lotto Mirage", 40.0, 6.0);
        Zapatillas z13 = new ZapatillasAmortiguadas("K-Swiss Hypercourt", 40.0, 5.0);
        Zapatillas z14 = new ZapatillasAmortiguadas("Wilson Rush", 42.0, 3.5);
        Zapatillas z15 = new ZapatillasAmortiguadas("Head Revolt", 40.0, 5.0);
        Zapatillas z16 = new ZapatillasConAgarre("Joma Slam", 40.0, 3.0);
        Zapatillas z17 = new ZapatillasConAgarre("Adidas Gamecourt", 40.0, 5.0);
        Zapatillas z18 = new ZapatillasConAgarre("Asics Gel-Game", 42.0, 4.5);
        Zapatillas z19 = new ZapatillasConAgarre("Asics Solution", 42.0, 3.0);
        Zapatillas z20 = new ZapatillasConAgarre("Nike Air Zoom", 40.0, 5.0);
        Zapatillas z21 = new ZapatillasConAgarre("Nike Zoom Vapor", 42.0, 4.0);
        Zapatillas z22 = new ZapatillasConAgarre("Wilson Kaos", 41.0, 5.0);
        Zapatillas z23 = new ZapatillasConAgarre("Head Revolt Pro", 42.0, 4.5);

        // A continuacion se inscribiran las 14 zapatillas en el campeonato
        campeonato.insertarZapatillas(z9);
        campeonato.insertarZapatillas(z10);
        campeonato.insertarZapatillas(z11);
        campeonato.insertarZapatillas(z12);
        campeonato.insertarZapatillas(z13);
        campeonato.insertarZapatillas(z14);
        campeonato.insertarZapatillas(z15);
        campeonato.insertarZapatillas(z16);
        campeonato.insertarZapatillas(z17);
        campeonato.insertarZapatillas(z18);
        campeonato.insertarZapatillas(z19);
        campeonato.insertarZapatillas(z20);
        campeonato.insertarZapatillas(z21);
        campeonato.insertarZapatillas(z22);
        campeonato.insertarZapatillas(z23);

        // Instanciamos raquetas para ser usadas en el campeonato:
        // (Los par�metros est�n en el orden: Modelo, peso, longitud, tama�o de cabeza,
        // tipo de encordado)
        // Adem�s en el caso de raquetas equilibradas tambi�n se indican al final los
        // valores potencia y control
        Raqueta r1 = new RaquetaPotente("Head Radical", 260.0, 680.0, 680.0, EstiloEncordado.ABIERTO);
        Raqueta r2 = new RaquetaPotente("Wilson Blade", 260.0, 690.0, 680.0, EstiloEncordado.ABIERTO);
        Raqueta r3 = new RaquetaPotente("Dunlop CX200", 300.0, 700.0, 630.0, EstiloEncordado.ABIERTO);
        Raqueta r4 = new RaquetaPotente("Yonex Vcore", 300.0, 680.0, 650.0, EstiloEncordado.CERRADO);
        Raqueta r5 = new RaquetaControlada("Babolat Drive", 340.0, 740.0, 600.0, EstiloEncordado.CERRADO);
        Raqueta r6 = new RaquetaControlada("Pure Aero", 340.0, 680.0, 720.0, EstiloEncordado.CERRADO);
        Raqueta r7 = new RaquetaControlada("TFlash 300", 300.0, 680.0, 680.0, EstiloEncordado.CERRADO);
        Raqueta r8 = new RaquetaControlada("Wilson Silver", 220.0, 690.0, 650.0, EstiloEncordado.ABIERTO);
        Raqueta r9 = new RaquetaEquilibrada("Prince Hornet 100", 220.0, 690.0, 600.0, EstiloEncordado.CERRADO, 2.5,
                4.0);
        Raqueta r10 = new RaquetaEquilibrada("Head Graphene", 320.0, 690.0, 630.0, EstiloEncordado.ABIERTO, 6.0, 2.0);
        Raqueta r11 = new RaquetaEquilibrada("Prince TT Bandit", 220.0, 680.0, 680.0, EstiloEncordado.CERRADO, 6.0,
                3.0);
        Raqueta r12 = new RaquetaEquilibrada("Class 100L", 320.0, 680.0, 720.0, EstiloEncordado.ABIERTO, 8.0, 1.0);

        // A continuacion se inscribiran las 12 raquetas en el campeonato
        campeonato.insertarRaqueta(r1);
        campeonato.insertarRaqueta(r2);
        campeonato.insertarRaqueta(r3);
        campeonato.insertarRaqueta(r4);
        campeonato.insertarRaqueta(r5);
        campeonato.insertarRaqueta(r6);
        campeonato.insertarRaqueta(r7);
        campeonato.insertarRaqueta(r8);
        campeonato.insertarRaqueta(r9);
        campeonato.insertarRaqueta(r10);
        campeonato.insertarRaqueta(r11);
        campeonato.insertarRaqueta(r12);

        // Novedad en EC3: Las siguientes raquetas son nuevas para EC3
        Raqueta r14 = new RaquetaPotente("Wilson Energy XL", 260.0, 690.0, 680.0, EstiloEncordado.ABIERTO);
        Raqueta r15 = new RaquetaPotente("Wilson Pro Open", 340.0, 740.0, 720.0, EstiloEncordado.ABIERTO);
        Raqueta r16 = new RaquetaPotente("Babolat Boost Drive", 220.0, 680.0, 600.0, EstiloEncordado.CERRADO);
        Raqueta r17 = new RaquetaPotente("Babolat Pure Drive", 260.0, 720.0, 600.0, EstiloEncordado.CERRADO);
        Raqueta r18 = new RaquetaControlada("Prince Force Ti OS", 340.0, 740.0, 600.0, EstiloEncordado.CERRADO);
        Raqueta r19 = new RaquetaControlada("Head Prestige Pro", 340.0, 740.0, 720.0, EstiloEncordado.ABIERTO);
        Raqueta r20 = new RaquetaControlada("Head Instinct", 220.0, 680.0, 600.0, EstiloEncordado.ABIERTO);
        Raqueta r21 = new RaquetaControlada("Dunlop Nitro", 340.0, 720.0, 600.0, EstiloEncordado.CERRADO);
        Raqueta r22 = new RaquetaEquilibrada("Prince Force", 320.0, 690.0, 630.0, EstiloEncordado.ABIERTO, 6.0, 2.0);
        Raqueta r23 = new RaquetaEquilibrada("Prince Warrior", 340.0, 740.0, 720.0, EstiloEncordado.ABIERTO, 6.0, 2.0);
        Raqueta r24 = new RaquetaEquilibrada("Wilson Pro Staff", 220.0, 680.0, 600.0, EstiloEncordado.CERRADO, 2.5,
                4.0);

        // Insertamos las nuevas raquetas de la EC3
        campeonato.insertarRaqueta(r14);
        campeonato.insertarRaqueta(r15);
        campeonato.insertarRaqueta(r16);
        campeonato.insertarRaqueta(r17);
        campeonato.insertarRaqueta(r18);
        campeonato.insertarRaqueta(r19);
        campeonato.insertarRaqueta(r20);
        campeonato.insertarRaqueta(r21);
        campeonato.insertarRaqueta(r22);
        campeonato.insertarRaqueta(r23);
        campeonato.insertarRaqueta(r24);
    }

    private void cargarDatos2(Campeonato campeonato) throws IOException {
        // Instanciamos 8 zapatillas: (Los par�metros est�n en el orden: modelo, n�mero,
        // tipo valor)
        Zapatillas z1 = new ZapatillasAmortiguadas("Air Zoom Vapor Pro", 42.0, 5.0);
        Zapatillas z2 = new ZapatillasConAgarre("Court Vapor React", 40.0, 5.0);
        Zapatillas z3 = new ZapatillasConAgarre("Gel-Resolution 8 GS", 40.0, 4.0);
        Zapatillas z4 = new ZapatillasAmortiguadas("Vapor Lite", 42.0, 3.0);
        Zapatillas z5 = new ZapatillasConAgarre("Court Lite", 39.0, 3.0);
        Zapatillas z6 = new ZapatillasAmortiguadas("UberSonic 4K", 40.0, 5.5);
        Zapatillas z7 = new ZapatillasAmortiguadas("Zoom GP Turbo", 43.0, 7.0);
        Zapatillas z8 = new ZapatillasConAgarre("CourtJam Bounce", 42.0, 3.5);

        // Instanciamos 8 tenistas: (Los par�metros est�n en el orden nombre,
        // zapatillas, saque, resto, ranking, pais)

        // Novedad en EC3: cada tenista es de tipo "Golpeadores" o de tipo "Voleadores"
        Tenista t1 = new Golpeadores("Novak Djokovic", z1, 90.0, 80.0, 1, "Serbia", 42.0);
        Tenista t2 = new Golpeadores("Ashleigh Barty", z6, 70.0, 80.0, 1, "Australia", 40.0);
        Tenista t3 = new Golpeadores("Stefanos Tsitsipas", z7, 55.0, 48.0, 3, "Grecia", 43.0);
        Tenista t4 = new Golpeadores("Karolina Pliskova", z5, 67.0, 68.5, 3, "Rep Checa", 39.0);
        Tenista t5 = new Voleadores("Elina Svitolina", z3, 55.5, 68.5, 4, "Ucrania", 40.0);
        Tenista t6 = new Voleadores("Alexander Zverev", z8, 59.0, 49.5, 4, "Alemania", 42.0);
        Tenista t7 = new Voleadores("Aryna Sabalenka", z2, 67.5, 79.5, 2, "Bielorrusia", 40.0);
        Tenista t8 = new Voleadores("Daniil Medvedev", z4, 79.0, 68.0, 2, "Rusia", 42.0);

        // A continuaci�n se inscribir�n a los 8 tenistas en el campeonato
        t1.realizarInscripcion();
        t2.realizarInscripcion();
        t3.realizarInscripcion();
        t4.realizarInscripcion();
        t5.realizarInscripcion();
        t6.realizarInscripcion();
        t7.realizarInscripcion();
        t8.realizarInscripcion();

        // Instanciamos zapatillas para ser usadas en el campeonato:
        // (Los par�metros est�n en el orden: tipo, modelo, n�mero y valor)
        Zapatillas z9 = new ZapatillasAmortiguadas("Lotto Space", 40.0, 5.0);
        Zapatillas z10 = new ZapatillasConAgarre("Adidas Gamecourt", 40.0, 5.0);
        Zapatillas z11 = new ZapatillasConAgarre("Asics Gel-Game", 42.0, 4.5);
        Zapatillas z12 = new ZapatillasAmortiguadas("K-Swiss Express", 42.0, 3.0);
        Zapatillas z13 = new ZapatillasConAgarre("Joma Slam", 40.0, 3.0);
        Zapatillas z14 = new ZapatillasAmortiguadas("Babolat Jet Tere", 42.0, 5.5);
        Zapatillas z15 = new ZapatillasConAgarre("Asics Solution", 42.0, 3.0);
        Zapatillas z16 = new ZapatillasAmortiguadas("K-Swiss Hypercourt", 40.0, 5.0);
        Zapatillas z17 = new ZapatillasConAgarre("Nike Air Zoom", 40.0, 5.0);
        Zapatillas z18 = new ZapatillasConAgarre("Nike Zoom Vapor", 42.0, 4.0);
        Zapatillas z19 = new ZapatillasAmortiguadas("Wilson Rush", 42.0, 3.5);
        Zapatillas z20 = new ZapatillasAmortiguadas("Head Revolt", 40.0, 3.0);
        Zapatillas z21 = new ZapatillasAmortiguadas("Lotto Mirage", 40.0, 6.0);
        Zapatillas z22 = new ZapatillasConAgarre("Wilson Kaos", 41.0, 5.0);
        Zapatillas z23 = new ZapatillasConAgarre("Head Revolt Pro", 42.0, 4.5);

        // Insertamos Zapatillas
        campeonato.insertarZapatillas(z9);
        campeonato.insertarZapatillas(z10);
        campeonato.insertarZapatillas(z11);
        campeonato.insertarZapatillas(z12);
        campeonato.insertarZapatillas(z13);
        campeonato.insertarZapatillas(z14);
        campeonato.insertarZapatillas(z15);
        campeonato.insertarZapatillas(z16);
        campeonato.insertarZapatillas(z17);
        campeonato.insertarZapatillas(z18);
        campeonato.insertarZapatillas(z19);
        campeonato.insertarZapatillas(z20);
        campeonato.insertarZapatillas(z21);
        campeonato.insertarZapatillas(z22);
        campeonato.insertarZapatillas(z23);

        // Instanciamos raquetas para ser usadas en el campeonato:
        // (Los par�metros est�n en el orden: Modelo, peso, longitud, tama�o de cabeza,
        // tipo de encordado)
        // Adem�s en el caso de raquetas equilibradas tambi�n se indican al final los
        // valores potencia y control
        Raqueta r1 = new RaquetaPotente("Head Radical", 260.0, 680.0, 680.0, EstiloEncordado.ABIERTO);
        Raqueta r2 = new RaquetaPotente("Wilson Blade", 260.0, 690.0, 680.0, EstiloEncordado.ABIERTO);
        Raqueta r3 = new RaquetaPotente("Dunlop CX200", 300.0, 700.0, 630.0, EstiloEncordado.ABIERTO);
        Raqueta r4 = new RaquetaPotente("Yonex Vcore", 300.0, 680.0, 650.0, EstiloEncordado.CERRADO);
        Raqueta r5 = new RaquetaControlada("Babolat Drive", 340.0, 740.0, 600.0, EstiloEncordado.CERRADO);
        Raqueta r6 = new RaquetaControlada("Pure Aero", 340.0, 680.0, 720.0, EstiloEncordado.CERRADO);
        Raqueta r7 = new RaquetaControlada("TFlash 300", 300.0, 680.0, 680.0, EstiloEncordado.CERRADO);
        Raqueta r8 = new RaquetaControlada("Wilson Silver", 220.0, 690.0, 650.0, EstiloEncordado.ABIERTO);
        Raqueta r9 = new RaquetaEquilibrada("Prince Hornet 100", 220.0, 690.0, 600.0, EstiloEncordado.CERRADO, 2.5,
                4.0);
        Raqueta r10 = new RaquetaEquilibrada("Head Graphene", 320.0, 690.0, 630.0, EstiloEncordado.ABIERTO, 6.0, 2.0);
        Raqueta r11 = new RaquetaEquilibrada("Prince TT Bandit", 220.0, 680.0, 680.0, EstiloEncordado.CERRADO, 6.0,
                3.0);
        Raqueta r12 = new RaquetaEquilibrada("Class 100L", 320.0, 680.0, 720.0, EstiloEncordado.ABIERTO, 8.0, 1.0);

        // A continuacion se inscribiran las 12 raquetas en el campeonato
        campeonato.insertarRaqueta(r1);
        campeonato.insertarRaqueta(r2);
        campeonato.insertarRaqueta(r3);
        campeonato.insertarRaqueta(r4);
        campeonato.insertarRaqueta(r5);
        campeonato.insertarRaqueta(r6);
        campeonato.insertarRaqueta(r7);
        campeonato.insertarRaqueta(r8);
        campeonato.insertarRaqueta(r9);
        campeonato.insertarRaqueta(r10);
        campeonato.insertarRaqueta(r11);
        campeonato.insertarRaqueta(r12);

        // Novedad en EC3: Las siguientes raquetas son nuevas para EC3
        Raqueta r13 = new RaquetaPotente("Wilson Energy XL", 260.0, 690.0, 680.0, EstiloEncordado.ABIERTO);
        Raqueta r14 = new RaquetaPotente("Wilson Pro Open", 340.0, 740.0, 720.0, EstiloEncordado.ABIERTO);
        Raqueta r15 = new RaquetaPotente("Babolat Boost Drive", 220.0, 680.0, 600.0, EstiloEncordado.CERRADO);
        Raqueta r16 = new RaquetaPotente("Babolat Pure Drive", 260.0, 720.0, 600.0, EstiloEncordado.CERRADO);

        // Nuevas raquetas EC3
        campeonato.insertarRaqueta(r13);
        campeonato.insertarRaqueta(r14);
        campeonato.insertarRaqueta(r15);
        campeonato.insertarRaqueta(r16);
    }
}
