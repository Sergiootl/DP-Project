Project: DP TENNIS
Aothors: Sergio Terrazas Lobato e Ismael Acedo Acedo

Objeto del proyecto:

	Para esta primera parte del trabajo, los profesores nos dicen que tenemos que hacer un torneo de tenis.
	Para ello, se nos dice que debemos dar de alta a los participantes, eliminar a los que han perdido.
	La puntuación obtenida por cada participante dependerá del tipo de zapato que se utilice y su habilidad.

Tenemos que hacer lo siguiente para ejecutar el proyecto:

	La ejecución se realiza desde la clase principal definida en el proyecto,
	que invoca una instancia de la clase INIT para cargar el
	datos y posteriormente la llamada al método Torneo de la clase Campeonato,
	que es donde se define la ejecución del proyecto:

--------------------------------------------------------------------------------------------------------------------------------------------	

EXTRAS:
	----------------------------------------------------------------------------------------------------------------------------
	PRIMERA ENTREGA:

		De la primera entrega, añadimos a nuestro proyecto los Comparator :

		-PotenciaComparator

			*Utilizamos un comparator para las potencias de las raquetas

		-EliminadosComparator

			*Utilizamos un comparator para la posicion en las que fueron eliminados unos tenistas

		-NameComparator

			*Utilizamos un comparator para que el campeonato no realiazse mas rondas si el nombte de t1 y t2 es el mismo y diga que ese tenista es el ganador

		-PointComparator

			*Utilizamos un comparator para los puntos de t1 y t2 y saber quien ha ganado dicha ronda
	
	----------------------------------------------------------------------------------------------------------------------------
	SEGUNDA ENTREGA:

		De la segunda entrega añadimos a nuestro proyecto:

		- Iterator:

			*Se usa en la clase campeonato en la asignación de raquetas a tenistas, ya que al utilizar TreeSet facilita su uso.
		- Enum:

			*Se define la clase EstiloEncordado, donde se definen los tipos de encordado de cada raqueta.

		-JUnit:

			*Utilizamos el JUnit para realizar pruebas a las clases Zapatillas,Tenistas(definido pero no funcional) y RaquetaGenerica.

		-GitHub
			
			*Utilizamos GitHub para realizar un repositorio cada vez que realizamos una modificacion

	----------------------------------------------------------------------------------------------------------------------------
	TERCERA ENTREGA:

		De la tercera entrega añadimos a nuestro proyecto:

		-MEDIOS DE COMUNICACION:
			
			*Utilizamos un patron de diseño OBSERVER para realizar esta implementacion

		-FICHERO DE TEXTO

			*Utilizamos un fichero de texto de salida para mostrar los datos del campeonato

			