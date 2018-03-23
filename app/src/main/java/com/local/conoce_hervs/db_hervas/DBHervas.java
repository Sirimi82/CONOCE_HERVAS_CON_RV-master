package com.local.conoce_hervs.db_hervas;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DBHervas extends SQLiteOpenHelper {


    private final String CREATE_ALOJAMIENTOS_TABLE = "CREATE TABLE Alojamientos (Id INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "Nombre TEXT NOT NULL, Localizacion TEXT NOT NULL, Informacion TEXT NOT NULL, Contacto TEXT NOT NULL, Link TEXT NOT NULL, Imagen TEXT NOT NULL)";


    private final String CREATE_RESTAURANTES_TABLE = "CREATE TABLE Restaurantes (Id INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "Nombre TEXT NOT NULL, Descripcion TEXT NOT NULL, Localizacion TEXT NOT NULL, Link TEXT NOT NULL, Foto TEXT NOT NULL)";

    private final String CREATE_PUNTOSINTERES_TABLE = "CREATE TABLE PuntosInteres (Id INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "Nombre TEXT NOT NULL, Lat TEXT, Lng TEXT, Descripcion TEXT NOT NULL, Foto TEXT)";

    private final String CREATE_RUTAS_TABLE = "CREATE TABLE Rutas (Id INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "Nombre TEXT NOT NULL, Tipo TEXT NOT NULL, Distancia TEXT NOT NULL, Duracion TEXT NOT NULL, Dificultad TEXT NOT NULL, " +
            "Itinerario TEXT NOT NULL, Foto TEXT, Link TEXT)";

    public DBHervas(Context context) {
        super(context, "DBHervas", null, 1);


    }

    public void crearTablasAloj(SQLiteDatabase db) {

        db.execSQL(CREATE_ALOJAMIENTOS_TABLE);
        db.execSQL("INSERT INTO alojamientos (id, nombre, localizacion, informacion, contacto, link, imagen) VALUES (1,'Hospedería Valle del Ambroz (4*)\n" +
                "','Centro Histórico','26 habitaciones con parking propio, salones y piscina.','Email: recepcion-ambroz@hospederiasdeextremadura.es\n" +
                "Tlfno: 927 474 828','www.hospederiasdeextremadura.com','https://www.verpueblos.com/fotos_originales/9/3/8/00210938.jpg') ");
        db.execSQL("INSERT INTO alojamientos (id, nombre, localizacion, informacion, contacto, link, imagen) VALUES (2,'Hotel Termal Resort El Salugral (4*)\n" +
                "','A 1/2KM del centro urbano, entorno natural','35 habitaciones, Balneario y Spa, piscina exterior y climatizada y parking propio.','Email: elsalugral@telefonica.net\n" +
                "Tlfno: 927 474 850','www.hotelbalneario.com','http://balneariosconencanto.net/wp-content/uploads/4hotel-el-salugral.jpg') ");
        db.execSQL("INSERT INTO alojamientos (id, nombre, localizacion, informacion, contacto, link, imagen) VALUES (3,'Hotel Sinagoga (3*)\n" +
                "','Centro urbano','42 habitaciones, salones y piscina y Spa.','Email: informacion@hotelsinagoga.com\n" +
                "Tlfno: 927 481 191\n" +
                "','www.hotelsinagoga.com','http://pix10.agoda.net/hotelImages/328/328817/328817_1212110958009314152.jpg?s=1024x768') ");
        db.execSQL("INSERT INTO alojamientos (id, nombre, localizacion, informacion, contacto, link, imagen) VALUES (4,'Casa Rural El Jardín Del Convento\n" +
                "','Centro histórico','7 habitaciones y 1 casita con amplio jardín\n" +
                "','Email: casarural@eljardindelconvento.com\n" +
                "Tfno: 927 48 11 61\n" +
                "','www.eljardindelconvento.com','https://laschicasdelpool.blogia.com/upload/20110330170018-el-jardin-del-convento.jpg') ");
        db.execSQL("INSERT INTO alojamientos (id, nombre, localizacion, informacion, contacto, link, imagen) VALUES (5,'Casas Rurales La Atalaya, Cuestecilla y El Acebo\n" +
                "','Centro Histórico','Casas completas de 1 y 2 habitaciones dobles con baño.','Email: lacuestecilla@hervasycomarca.com\n" +
                "Tfno: 678 588 906\n" +
                "','www.hervasycomarca.com','http://multimedia1.front.toprural.com/alojamiento/8/5/9/1357153443765_big.jpg') ");
        db.execSQL("INSERT INTO alojamientos (id, nombre, localizacion, informacion, contacto, link, imagen) VALUES (6,'Casa Rural Valdeamor','Casco Urbano','6 habitaciones dobles','Tfnos: 927 481 644/678 937 323','www.casaruralvaldeamor.com','https://t-ec.bstatic.com/images/hotel/max1280x900/237/23726491.jpg') ");
        db.execSQL("INSERT INTO alojamientos (id, nombre, localizacion, informacion, contacto, link, imagen) VALUES (7,'Apartamentos Rurales La Iguana\n" +
                "','Centro Histórico','17 apartamentos con cocina para 2, 4 y 6 personas con piscina\n" +
                "','Email: recepción@laiguana5.e.telefonica.net\n" +
                "Tfno: 927 481 503\n" +
                "','www.apartamentoslaiguana.com','https://media.v2.siweb.es/uploaded_thumb_big/e802e327eb96fff2b76b3288cf756d79/iguana024_1.jpg') ");
        db.execSQL("INSERT INTO alojamientos (id, nombre, localizacion, informacion, contacto, link, imagen) VALUES (8,'Apartamentos Rurales La Calleja\n" +
                "','Centro Histórico','4 apartamentos de 3 y 4 personas','Email: lacalleja@hervas.com\n" +
                "Tfno: 927 481 520\n" +
                "','www.hervas.com/lacalleja','https://t-ec.bstatic.com/images/hotel/max1280x900/174/17422623.jpg') ");
        db.execSQL("INSERT INTO alojamientos (id, nombre, localizacion, informacion, contacto, link, imagen) VALUES (9,'Bungalows Aldea Vettonia\n" +
                "','Entorno Natural Periurbano','48 bungaloes de 2,3,4 y 6 personas con piscina y pistas deportivas\n" +
                "','Email: info@aldeavetonia.com\n" +
                "Tfno: 927 473 457\n" +
                "','www.aldeavetonia.com','http://www.aldeavetonia.com/wp-content/uploads/2012/02/bunga3foto1.jpg') ");
        db.execSQL("INSERT INTO alojamientos (id, nombre, localizacion, informacion, contacto, link, imagen) VALUES (10,'Apartamentos Rurales La Judería\n" +
                "','Junto al puente medieval del río Ambroz','4 apartamentos de 2 y 3 personas\n" +
                "','Email: reservas@turnat.com\n" +
                "Tfnos: 927 414 288 y 628 718 109\n" +
                "','http://turnat.com/aptos-la-juderia#!IMG_2885','http://turnat.com/images/igallery/resized/101-200/IMG_2885-138-600-450-80-rd-255-255-255.jpg') ");
        db.execSQL("INSERT INTO alojamientos (id, nombre, localizacion, informacion, contacto, link, imagen) VALUES (11,'Apartametos Rurales El Cabildo\n" +
                "','Centro Histórico','2 apartamentos rurales de 2 a 5 personas\n" +
                "','Email: reservas@turnat.com\n" +
                "Tfnos: 927 414 288 y 628 718 109\n" +
                "','www.turnat.com','http://www.turnat.com/images/igallery/resized/1-100/007_Apto._El_Tejo-72-600-450-80-rd-255-255-255.jpg') ");
        db.execSQL("INSERT INTO alojamientos (id, nombre, localizacion, informacion, contacto, link, imagen) VALUES (12,'Apartamentos Rurales El Zarzo','Centro Histórico','3 apartamentos rurales\n" +
                "','email: reservas@elzarzo.com\n" +
                "Tfnos: 927 481 465 y 661 460 533\n" +
                "','www.elzarzo.com','http://elzarzo.com/wp-content/uploads/2015/02/elzarzo8.jpg') ");
        db.execSQL("INSERT INTO alojamientos (id, nombre, localizacion, informacion, contacto, link, imagen) VALUES (13,'Apartamentos Rurales La Plaza\n" +
                "','Centro Histórico','6 apartamentos de 2 y 4 personas\n" +
                "','Email: info@apartamentoslaplazahervas.com\n" +
                "Tfnos: 927 473 668 y 625 030 997\n" +
                "','www.apartamentoslaplazahervas.com','https://apartamentoslaplazahervas.com/wp-content/uploads/2015/11/portada4.jpg') ");
        db.execSQL("INSERT INTO alojamientos (id, nombre, localizacion, informacion, contacto, link, imagen) VALUES (14,'Apartamentos Rurales Victor Chamorro Del Arco\n" +
                "','Centro Histórico','7 Apartamentos de 2 a 4 personas\n" +
                "','Email: dormir@victorchamorro.com\n" +
                "Tfnos: 927 481 402 y 647 791 877\n" +
                "','www.apartamentosruralesvictorchamorrodelarc\n" +
                "o.com','https://q-xx.bstatic.com/images/hotel/max500/174/17459794.jpg') ");
        db.execSQL("INSERT INTO alojamientos (id, nombre, localizacion, informacion, contacto, link, imagen) VALUES (15,'Apartamentos Rurales La Platea\n" +
                "','Frente al Parque del Robledo','Apartamentos Y Duplex de 2 a 6 personas\n" +
                "\n" +
                "','Email: info@espaciosrurales.es\n" +
                "Tfnos: 927 473 191 y 618 258 936\n" +
                "','www.espaciosrurales.es','https://s-ec.bstatic.com/images/hotel/max1280x900/643/6430806.jpg') ");
        db.execSQL("INSERT INTO alojamientos (id, nombre, localizacion, informacion, contacto, link, imagen) VALUES (16,'Apartamentos Rurales El Castañar\n" +
                "','Casco Urbano','Apartamentos de 2 a 4 personas\n" +
                "','Tfnos: 927 481 398 y 659 266 559','www.apartamentoselcastanar.com','https://s-ec.bstatic.com/images/hotel/max1024x768/896/8963515.jpg') ");
        db.execSQL("INSERT INTO alojamientos (id, nombre, localizacion, informacion, contacto, link, imagen) VALUES (17,'Apartamentos Rurales Hervás y Punto\n" +
                "','Casco urbano','Apartamentos de 2 a 4 personas\n" +
                "','Email: hervasypunto@hervasturismo.com\n" +
                "Tfnos: 927 488 329 y 689 772 706\n" +
                "','www.hervasypunto.com','http://wsmedia.er2.co/5642443c0e708/cot/1600/564eff16014c4.jpg') ");
        db.execSQL("INSERT INTO alojamientos (id, nombre, localizacion, informacion, contacto, link, imagen) VALUES (18,'Apartamento Rural Doña Claudia','Centro Histórico','6 apartamentos\n" +
                "','Tfnos: 927 423 157 y 667 805 413','https://www.booking.com/hotel/es/doa-a-claudia.es.html','https://t-ec.bstatic.com/images/hotel/max1024x768/214/21498048.jpg') ");
        db.execSQL("INSERT INTO alojamientos (id, nombre, localizacion, informacion, contacto, link, imagen) VALUES (19,'Apartamentos Rurales El Canchal De La Gallina \n" +
                "','Entorno Natural Periurbano','12 apartamentos de 2 a 4 personas con piscina y jacuzzy\n" +
                "','Email: hervas@canchaldelagallina.com\n" +
                "Tfnos: 607 260 000 y 659 876 591\n" +
                "','www.canchalgallina.com','https://www.canchalgallina.com/mfoto1.jpg') ");
        db.execSQL("INSERT INTO alojamientos (id, nombre, localizacion, informacion, contacto, link, imagen) VALUES (20,'Apartamentos Rurales El Manantial Del Fresno\n" +
                "','Entorno Natural Periurbano','10 apartamentos de 4 a 6 personas con piscina y cafetería\n" +
                "','Email: info@manantialdelfresno.com\n" +
                "Tfnos: 927 481 651 y 615 500 586\n" +
                "','www.manantialdelfresno.com','https://media.er2.co/es/caceres/0000000008592/635/50b608d57cd7e.jpg') ");
        db.execSQL("INSERT INTO alojamientos (id, nombre, localizacion, informacion, contacto, link, imagen) VALUES (21,'Apartamentos Rurales Fuente Del Aliso\n" +
                "','Entorno Natural Periurbano','8 apartamentos de 4 a 6 personas con piscina y cafetería\n" +
                "','Email: info@fuentedelaliso.com\n" +
                "Tfnos: 927 473 673 y 686 252 109\n" +
                "','www.afuentedelaliso.com','http://multimedia1.front.toprural.com/alojamiento/0/1/6/1416074319553_big.jpg') ");
        db.execSQL("INSERT INTO alojamientos (id, nombre, localizacion, informacion, contacto, link, imagen) VALUES (22,'Albergue Valle Del Ambroz\n" +
                "','Entorno Natural Periurbano','10 cabañas de 8 a 12 personas con piscina, salas comunes y actividades\n" +
                "multiaventura. ','Email: información@alberguevalledelambroz.com\n" +
                "Tfnos: 927 473 292\n" +
                "','www.alberguevalledelambroz.com','http://www.directoriorural.es/casa-rural/pictures/listings/6152.jpg') ");
        db.execSQL("INSERT INTO alojamientos (id, nombre, localizacion, informacion, contacto, link, imagen) VALUES (23,'Albergue Vía De La Plata\n" +
                "','Casco Urbano','5 habitaciones de 4 a 5 personas con salas comunes\n" +
                "','Email: albergueviaplata@hotmail.com\n" +
                "Tfno: 639 402 583\n" +
                "','www.alberguesviaplata.es','http://static.consumer.es/caminodesantiago/via-de-la-plata/15/imgs/albergue-banos-de-montemayor.jpg') ");
        db.execSQL("INSERT INTO alojamientos (id, nombre, localizacion, informacion, contacto, link, imagen) VALUES (24,'Camping El Pinajarro-Bungalows\n" +
                "','Entorno Natural Periurbano','180 parcelas, bungaloes de 2 a 4 personas con piscina\n" +
                "','Email: info@campingelpinajarro.com\n" +
                "Tfno: 927 481 673\n" +
                "','www.campingelpinajarro.com','https://back.bungalowsclub.com/upload/main-images/227_20150423110923.jpg') ");
        db.execSQL("INSERT INTO alojamientos (id, nombre, localizacion, informacion, contacto, link, imagen) VALUES (25,'Apartamentos Rurales La Estrella De David\n" +
                "','Barrio Judío','3 apartamentos de 4 y 5 personas + 4 estudios de 2; 23 plazas en total\n" +
                "','Email: reservas@laestrelladedavid.es\n" +
                "Tfno: 630 624 066\n" +
                "','www.laestrelladedavid.es','https://s-ec.bstatic.com/images/hotel/max1280x900/158/15825464.jpg') ");
        db.execSQL("INSERT INTO alojamientos (id, nombre, localizacion, informacion, contacto, link, imagen) VALUES (26,'Senderos de Hervás','Centro Histórico','4 apartamentos de 2 personas\n" +
                "','Tfno: 617 756 276','http://senderosdehervas.com/','http://senderosdehervas.com/wp-content/uploads/2016/03/casa-rural-hervas-41-scalia-portfolio-justified.jpg') ");
        db.execSQL("INSERT INTO alojamientos (id, nombre, localizacion, informacion, contacto, link, imagen) VALUES (27,'La Casa Del Vado','Barrio Judío','Casa Rural de 4 personas\n" +
                "','Tfno: 669 351 356','http://www.toprural.com/Casa-rural-alquiler-%C3%ADntegro/La-Casa-Del-Vado_126758_f.html','https://t-ec.bstatic.com/images/hotel/max1024x768/848/84890290.jpg') ");
    }

    public void crearTablasBares(SQLiteDatabase db) {
        db.execSQL(CREATE_RESTAURANTES_TABLE);
        db.execSQL("INSERT INTO restaurantes (id, nombre, descripcion, localizacion, link, foto) VALUES (1,'Restaurante Nardi','Restaurante Nardi fue fundado en 1980 y rapidamente reconocido por sus excelentes carnes a la parrilla y cocina regional, en 1996 le concedieron el premio al mejor Restaurante del año, otorgado por la Cofradia Extremeña de Gastronomía." +
                "Hoy José Miguel Sánchez (hijo del cocinero fundador) en cocina y junto a su mujer Vega Serrano en sala, han logrado establecer el Restaurante como un referente gastromico de la zona. Su esfuerzo se ha visto recompensado apareciendo en las guias mas prestigiosas del pais: Aparecemos desde 2005 en guía Gourmetour, recomendados en guía Campsa y guía Michelin." +
                "Situado en la calle peatonal (centro y lugar de paso del pueblo), cercano a grandes zonas de aparcamiento, a pocos metros del museo Perez Comendador, Oficina de Turismo, tiendas de productos típicos, terrazas y bares." +
                "El local fue reformado en 2.005, decoración sencilla, actual y toques rústicos (vigas de madera, paredes de piedra)." +
                "Buen acceso y aseos prácticables para minúsvalidos. Capacidad para 50 personas aproximadamente. Lugar de espera donde poder tomar un aperitivo. Ambiente tranquilo, así como servicio de sala especializado.','Calle Braulio Navas, 19','http://restaurantenardi.com/','http://1.bp.blogspot.com/-MM3obAk6T4g/UkiVUY7cWbI/AAAAAAAAA8I/SVX10YpAmQk/s1600/la+foto+1.JPG') ");
        db.execSQL("INSERT INTO restaurantes (id, nombre, descripcion, localizacion, link, foto) VALUES (2,'Restaurante Hospedería Valle del Ambroz','Elegante, acogedor, tranquilo… el restaurante “El Convento” es perfecto para saborear la gastronomía extremeña sin prisas, apreciando cada sabor y disfrutando cada minuto." +
                "Nuestra cocina es una cocina tradicional con unos toques modernos adaptada a los tiempos que corren. Utilizamos siempre productos de la tierra de primerísima calidad." +
                "Algunos de nuestros platos estrella son el “Lomo de bacalao confitado sobre cama de calabaza y manzana con ali–oli de remolacha” o la “Pluma ibérica con ravioli de calabacín, queso de cabra y tomate concassé”." +
                "Para acompañar estos platos, qué mejor que una selección de los mejores caldos extremeños, sorprendentes por su mezcla de potencia y elegancia en boca.','Plaza del Hospital','http://www.hospederiasdeextremadura.es/hotel/hospederia-valle-del-ambroz','http://media.expedia.com/hotels/3000000/2950000/2942300/2942201/2942201_1_b.jpg') ");
        db.execSQL("INSERT INTO restaurantes (id, nombre, descripcion, localizacion, link, foto) VALUES (3,'Restaurante Hotel Sinagoga','Magnífico edificio situado en el centro urbano de Hervás con vistas espectaculares de los bosques de castaños y la Sierra de Gredos." +
                "Hospitalidad, restaurante, café-bar, y amplios salones para más de 700 comensales." +
                "Instalaciones para congresos, reuniones de empresa, bodas, banquetes... Todo esto y mucho más, lo encontrará en el Hotel Sinagoga Spa ***." +
                "Buen acceso y aseos practicables para minusválidos. Capacidad para 50 personas aproximadamente. Lugar de espera donde poder tomar un aperitivo. Ambiente tranquilo, así como servicio de sala especializado.','Avenida Provincia, 2','http://www.hotelsinagoga.com','http://www.tauroweb.es/img-agenda/hoteles/hotelsinagoga_hervas.jpg') ");
        db.execSQL("INSERT INTO restaurantes (id, nombre, descripcion, localizacion, link, foto) VALUES (4,'Restaurante El Almirez','Restaurante El Almirez ofrece cocina española y extremeña de autor desde 1997 en el emblemático Barrio Judío de Hervás. Con un local elegante y acogedor de aires románticos, cuida con esmero la presentación de sus platos utilizando en su elaboración materias primas locales, de temporada y de calidad.','Calle Collado, 19','https://www.restauranteelalmirez.com/','https://media-cdn.tripadvisor.com/media/photo-s/02/f1/bc/34/el-almirez.jpg') ");
        db.execSQL("INSERT INTO restaurantes (id, nombre, descripcion, localizacion, link, foto) VALUES (5,'Mesón La Vaca Brava','La Vaca Brava es el restaurante que los amantes de carne tierna y sabrosa esperaban. Un sitio rústico agradable con muebles de madera maciza y olor a leña. No os podéis perder su Secreto ibérico o su mítica Jeta a la brasa que lo hizo famoso entre los locales. Su excelente calidad y su entrañable atmósfera rural no os decepcionarán.','Rincón Vaca Brava, 7','https://www.tripadvisor.es/Restaurant_Review-g609023-d5608904-Reviews-La_Vaca_Brava-Hervas_Province_of_Caceres_Extremadura.html','https://igx.4sqi.net/img/general/200x200/7ZtVbMRgMiDz1rrSOUZOtOZsV8nAPI1N53TtXVtrsco.jpg') ");
        db.execSQL("INSERT INTO restaurantes (id, nombre, descripcion, localizacion, link, foto) VALUES (6,'Mesón El 60','Estamos situados en pleno corazón de Hervás, Mesón el 60 les ofrece una amplia carta de asados a la brasa desde chuletones de ternera, chuletillas de cordero, secreto iberico,chorizos asados, magro de cerdo, la famosa jeta de cerdo a la brasa, churrasco, etc.','Calle Collado, 60','https://www.tripadvisor.es/Restaurant_Review-g609023-d992770-Reviews-Meson_El_60-Hervas_Province_of_Caceres_Extremadura.html','http://turismopatanegra.com/fotosempr/33-meson-el-60-/0-1-fextur-meson-el-60--turismo-rural-extremadura.jpg') ");
        db.execSQL("INSERT INTO restaurantes (id, nombre, descripcion, localizacion, link, foto) VALUES (7,'Restaurante Sésamo','El restaurante Sesamo Casa de Comidas, es un lugar muy agradable con una reforma vintage que respeta el espíritu rústico original del local. En él la comida es de recetas tradicionales pero con toques y presentación moderna. Un auténtico placer para todos y cada uno de los sentidos.','Calle Cuestecilla, 4','http://www.sesamocasadecomidas.com/','http://www.sesamocasadecomidas.com/sites/default/files/styles/slideshow-presentacion/public/sesamo_restaurante_002.jpg?itok=Ldb6PXIp') ");
        db.execSQL("INSERT INTO restaurantes (id, nombre, descripcion, localizacion, link, foto) VALUES (8,'Restaurante A Fuego Lento','A Fuego Lento es un restaurante de cocina a la brasa." +
                "Un local reformado que con la ayuda de sus magníficos decoradores presenta un ambiente de lo más agradable y elegante mezclando toques rústicos con tradicionales españoles." +
                "El restaurante dispone de un patio interior, protagonista de la decoración; un rinconcito de lo más acogedor y tranquilo para que el cliente se sienta como en casa. ','Calle Vedelejos, 6','http://www.afuegolentohervas.com','https://media-cdn.tripadvisor.com/media/photo-s/02/bf/d9/e3/a-fuego-lento.jpg') ");
        db.execSQL("INSERT INTO restaurantes (id, nombre, descripcion, localizacion, link, foto) VALUES (9,'Restaurante Mas Que Parrilla','Restaurante Mas Que Parrilla les ofrece una selecta carta añadiendo un toque personal a la cocina y poniendo" +
                "especial atención a nuestras carnes (todas de origen Extremeñas) que podrán degustar regadas con los mejores vinos de nuestra bodega" +
                "En Restaurante Mas Que Parrilla les dispensamos un trato personalizado poniendo a su disposición un salón con un aforo de 30 personas" +
                "totalmente climatizado, disponemos de cambiador para bebes,  elevadores de asiento para los niños..." +
                "Ven a Visitarnos y Disfruta de Nuestra Especialidad en rabo de toro estofado," +
                "pescados frescos de sugerencia, todos nuestros postres son caseros, y nuestra carta esta adaptada para celiacos.','Calle Matías Pérez Marcos, 7','http://restaurante-mas-que-parrilla.business.site/','https://media-cdn.tripadvisor.com/media/photo-s/09/10/5d/21/restaurante-la-parrilla.jpg') ");
        db.execSQL("INSERT INTO restaurantes (id, nombre, descripcion, localizacion, link, foto) VALUES (10,'Bar Restaurante El Mirador','Cuenta con más de 25 años de antigüedad y una larga experiencia brindando la mejor atención para disfrutar de platos combinados, raciones, desayunos o alguna de sus muchas opciones para la cena." +
                "Atendido por sus dueños, el lugar brinda trato familiar y ambiente agradable amenizado por la vegetación y los paisajes que lo rodean." +
                "VARIEDAD DE OPCIONES" +
                "El Mirador cuenta con 6 menús diarios que se ofrecen según el interés del cliente y se cocinan especialmente. Entre ellos encuentran platos combinados y raciones a base de pescado, carne, ensaladas y ofertas de platos calientes elaborados de forma casera." +
                "Para acompañar sus exquisiteces, incluido en sus menús, se ofrece vino o agua." +
                "Además, los desayunos presentan el mejor café e infusiones con imperdibles tostadas, bocadillos o montaditos." +
                "COMODIDADES" +
                "De grandes dimensiones y estilo funcional, el lugar cuenta con aire acondicionado, calefacción, TV y lugar para aparcar. También se puede apreciar el hermoso paisaje de esta ciudad cacereña desde su terraza de verano." +
                "Se acepta efectivo y tarjetas de crédito." +
                "Además, si esta de visita en la localidad de Hervás puede alojarse en los Apartamentos Rurales La Calleja donde encontrará lo necesario para hacer agradable su estadía.','Calle Braulio Navas, 30','http://hervas.com/lacalleja/','https://www.extremadura.com/uploads/pg_models/media/photo/derivative/image/80099/bar-restaurante-el-mirador-46a5-e543_xs.jpg') ");
        db.execSQL("INSERT INTO restaurantes (id, nombre, descripcion, localizacion, link, foto) VALUES (11,'Mesón Restaurante Anvi','Situado en una de las calles más concurridas de Hervás, el mesón Anvi ofrece cocina típica de la zona, buenas carnes, gran variedad en postres, jamón al corte." +
                "Dispone de terraza de verano en la plaza de la corredera." +
                "Decoración rústica. Buen ambiente.','Calle Relator González, 21','https://www.tripadvisor.es/Restaurant_Review-g609023-d3543113-Reviews-Meson_Bar_Anvi-Hervas_Province_of_Caceres_Extremadura.html','https://scontent-mad1-1.xx.fbcdn.net/v/t1.0-9/17523123_728539637321921_6263921585079779386_n.jpg?oh=2c446a5856f822c1d1d40dc0fbc5f8ff&oe=5B43CAF9') ");
        db.execSQL("INSERT INTO restaurantes (id, nombre, descripcion, localizacion, link, foto) VALUES (12,'Restaurante El Gato en Hervás','Si la lluvia te ha sorprendido de camino a Museo Perez Comendador-Leroux, refúgiate en este restaurante. Prueba un excelente vino: no puedes dejar de hacerlo cuando te pases por El Gato en Hervas." +
                "Deliciosas ensaladas, riquísimas carnes y variedad en postres." +
                "Ambiente acogedor.','Calle Subida al consistorio, 13','http://elgatoenhervas.business.site/','https://media-cdn.tripadvisor.com/media/photo-s/11/26/03/42/mesmo-no-centro-de-hervas.jpg') ");
        db.execSQL("INSERT INTO restaurantes (id, nombre, descripcion, localizacion, link, foto) VALUES (13,'Restaurante Italiano Capisci','Situado muy próximo a la plaza de la Corredera y al Museo Pérez Comendador Leroux, el restaurante Capisci ofrece especialidades de comida italiana." +
                "Gran variedad en deliciosas pastas y estupendas pizzas." +
                "Si eres amante de la comida italiana no te lo puedes perder.','Travesia de Asensio Neila, 4','https://www.tripadvisor.es/Restaurant_Review-g609023-d11677744-Reviews-Ristorante_Capisci-Hervas_Province_of_Caceres_Extremadura.html','https://10619-2.s.cdn12.com/restaurants/small/w320/h220/106658309.jpg') ");

    }

    public void crearTablasPuntosInt(SQLiteDatabase db) {

        db.execSQL(CREATE_PUNTOSINTERES_TABLE);
        db.execSQL("INSERT INTO `PuntosInteres`(Id, Nombre, Lat, Lng, Descripcion, Foto) VALUES (1,'Barrio Judío y Puente Medieval de La Fuente Chiquita',40.275782, -5.857087,'Conjunto de calles y plazas de trazado abigarrado que mantienen vivo el legado histórico y cultural de la comunidad judía que se estableció" +
                "en Hervás entre los siglos XIV y XV, conserva elementos tradicionales de la arquitectura serrana con gran presencia del castaño en vanos, puertas y balcones, así como entramado con adobe y formando portalones y portalillos. Es llamativo también el uso de la teja árabe en vertical como un elemento aislante de n solo ojo y sillares de granito se considera, sin data histórica, el elemento arquitectónico más antiguo del municipio. Conserva una incorporación posterior en el pretil izquierdo, la lápida funeraria labrada de Don Alonso Sánchez, prócer y benefactor local a quien los lugareños llaman familiarmente El Machón del Puente. la lluvia.', 'http://www.subirimagenes.com/imagedata.php?url=http://s2.subirimagenes.com/otros/9842554barriojudio.jpg') ");
        db.execSQL("INSERT INTO `PuntosInteres`(Id, Nombre, Lat, Lng, Descripcion, Foto) VALUES (2,'Iglesia de Santa María de Aguas Vivas',40.274685, -5.858181,'Preside, sobre una pequeña colina, el centro de la población y mantiene de la construcción original defensiva, el arco y primer cuerpo de la torre, además de la muralla circundante que se convierte en un magni co mirador del atractivo pai- saje en cualquier época del año. La iglesia, levantada sobre un antiguo bastión, se modi có en sucesivas intervenciones entre los siglos XIII y XVII.','http://visitambroz.com/fotosrec/2/2-1.jpg') ");
        db.execSQL("INSERT INTO `PuntosInteres`(Id, Nombre, Lat, Lng, Descripcion, Foto) VALUES (3,'Convento Trinitario Iglesia de San Juan Bautista',40.272966, -5.856164,'Antiguo convento de la orden Trinitaria Descalza fundado por cristianos" +
                "nuevos en el siglo XVII. De especial interés son su fachada de mortero imitando ladrillo rojo, replica de la de San Nicolás de Bari, en Valladolid, y los extraordinarios retablos barrocos.', 'http://www.subirimagenes.com/imagedata.php?url=http://s2.subirimagenes.com/otros/9842555convento01.jpg') ");
        db.execSQL("INSERT INTO `PuntosInteres`(Id, Nombre, Lat, Lng, Descripcion, Foto) VALUES (4,'Casa de Los Dávila / Museo Pérez Comendador" +
                "',40.274087, -5.859683,'Solida casa palaciega del s XVIII y estilo barroco con sobria fachada de sillería en granito a dos alturas, cornisas sobrevoladas con frontón triangular y portada coronada de dintel neoclásico. Desde 1986 es sede del Museo Pérez Comendador-Leroux, Escuela de Municipal de Música y Biblioteca pública.', 'http://www.subirimagenes.com/imagedata.php?url=http://s2.subirimagenes.com/otros/9842556museoperezcomendador.jpg') ");
        db.execSQL("INSERT INTO `PuntosInteres`(Id, Nombre, Lat, Lng, Descripcion, Foto) VALUES (5,'Enfermería Franciscana / Ayuntamiento',40.275207, -5.860236,'Edificio de austera armonía constructiva con un interesante patio interior de ocho columnas y escalera de granito. Estuvo vinculado, como edi cio asistencial, al Convento de la Bien Parada de la vecina población de Abadía. En la actualidad, es sede del ayuntamiento.', 'http://www.subirimagenes.com/imagedata.php?url=http://s2.subirimagenes.com/otros/9842557ayuntamiento.jpg') ");
        db.execSQL("INSERT INTO `PuntosInteres`(Id, Nombre, Lat, Lng, Descripcion, Foto) VALUES (6,'Columnas Templarias',40.275355, -5.860606,'Procedentes de la ermita fundacional bajo la advocación de los mártires San Gervasio y San Protasio. Están situadas en la Calle Gabriel y Galán, cerca del ayuntamiento.', 'https://elviajerohistorico.files.wordpress.com/2017/03/dscn0645.jpg?w=486&h=365') ");
        db.execSQL("INSERT INTO `PuntosInteres`(Id, Nombre, Lat, Lng, Descripcion, Foto) VALUES (7,'Ermita de San Andrés',40.264289, -5.867774,'A 1.5 km del centro de la población sede del Ssmo. Cristo de La Salud, patrón de la Villa de Hervás.', 'http://www.subirimagenes.com/imagedata.php?url=http://s2.subirimagenes.com/otros/9842558ermita.jpg') ");
        db.execSQL("INSERT INTO `PuntosInteres`(Id, Nombre, Lat, Lng, Descripcion, Foto) VALUES (8,'Puente de Hierro',40.273573, -5.851825,'Elemento de interés etnográ co industrial en desuso desde la supresión de la línea de Ferrocarril Ruta de La Plata, entre Guijuelo y Plasencia.', 'http://www.subirimagenes.com/imagedata.php?url=http://s2.subirimagenes.com/otros/9842559hierro.jpg') ");

    }
    public void crearTablasRutas(SQLiteDatabase db) {

        db.execSQL(CREATE_RUTAS_TABLE);
        db.execSQL("INSERT INTO `RUTAS` (ID, Nombre, Tipo, Distancia, Duracion, Dificultad, Itinerario, Foto, Link) VALUES (1,'Vía de la Plata','Senderismo y bicicleta.','22km.','5h y 30min','Media','La ruta comienza en la fuente de ICONA de la calzada romana de Baños de Montemayor. Hay que bajar hasta la N-630 y seguir la carretera a mano izquierda durante 400 m. hasta pasar la ermita del" +
                "Humilladero, donde cogeremos un trozo de calzada que baja junto a la carretera y vuelve a salir a la misma. Seguir por la carretera, pasar la gasolinera del Roma, tomar la pista que sale a la izquierda situada junto a una granja antes de llegar a la rotonda, seguir sin desviarnos (vamos paralelo a la autovía), cruzar una carretera que encontraremos al paso, seguir por la pista, atravesar la dehesa de la Burila, pasar junto a una charca, pasar un arroyo, cruzar un abrevadero junto a un albergue ganadero, cruzar otro arroyo y dejar a la derecha otra charca. A" +
                "lo largo del cordel iremos viendo bloques de granito que indican el Camino de Santiago; al llegar a un bloque grande, dejar el cordel, tomar la pista de la derecha, pasaremos junto a una granja antes de llegar a la autovía. Seguir por el camino, pasar por debajo de la autovía, cruzar" +
                "la N-630 a la altura del cruce de La Granja, coger la pista de la izquierda situada a 100 m., cruzar la Garganta Ancha, llegamos a una carretera asfaltada por la que continuaremos durante 2 km. hasta llegar al cruce de El Lindón.', 'http://4.bp.blogspot.com/-t51Sa-FPzfc/VbAFinJn83I/AAAAAAAAAb4/V6TtuXJA8Ig/s1600/_DSC0012.jpg', 'http://www.hervasviva.com/sites/default/files/usuarios/1/via_plata.jpg') ");
        db.execSQL("INSERT INTO `RUTAS` (Id, Nombre, Tipo, Distancia, Duracion, Dificultad, Itinerario, Foto, Link) VALUES (2,'El Collao de Enmedio','Senderismo','15km.','4horas','Media','La ruta comienza en la piscina de Gargantilla, empezar a subir por la pista de cemento hasta encontrar el depósito del agua que dejaremos a la derecha y dos granjas a la izquierda. Donde termina el cemento y frente a la segunda granja, tomar la pista ancha de tierra de subida situada a la derecha,  seguir toda la ruta por la pista. Después de 7 km. llegamos al Collao Corral. Desde aquí podemos ver tres pequeños cerros, el central es el Collao De En medio, el de la izquierda la Picota de Santa María y el de la derecha El Collao Cimero. Atravesar el Collao Corral, seguir la vereda que bordea por la izquierda la Picota de Santa María hasta llegar al Collao De Enmedio." +
                "Para volver hay dos opciones:" +
                "1º) Bajar por el mismo camino de subida." +
                "2º) Atravesar el Collao Corral, tomar el primer camino que encontraremos a la derecha, a 500 m. llegaremos a la Garganta de la Buitrera, coger el camino que baja del Puerto de Honduras hasta llegar a Gargantilla.', 'http://www.subirimagenes.com/imagedata.php?url=http://s2.subirimagenes.com/otros/9842562collao.jpg', 'http://turismovalledelambroz.com/actividades/rutas/ruta07_collao_enmedio.pdf') ");
        db.execSQL("INSERT INTO `RUTAS` (Id, Nombre, Tipo, Distancia, Duracion, Dificultad, Itinerario, Foto, Link) VALUES (3,'Ruta del Moralejo','Senderismo y bicicleta','7km.','1h30min','Media-Baja','La ruta comienza a la entrada del pueblo de Casas del Monte viniendo desde la N-630, en la vuelta del Liriazo, tomar la pista de cemento que sale a mano derecha, en el cruce seguir recto, la pista se hace de tierra y comienza a descender, a unos 500 m. cruzar la garganta Madrigala dejando un cruce a la izquierda, seguir toda la ruta la pista sin desviarse ni a derecha ni a" +
                "izquierda. Fuente de Azahor (km. 1,4), bosque de robles melojos (km. 1,8), robles (km. 2,3), embarcadero de ganado a la izquierda, 300 m. más adelante cruzamos el arroyo Clica. La finca del Moralejo está en un explanada, rodeada por una pared de piedra con dos cancelas." +
                "Para regresar ir al embarcadero de ganado, pasarlo, seguir la pista de la derecha hasta cruzar la Garganta Madrigala y seguir hasta el punto de partida.', 'http://www.subirimagenes.com/imagedata.php?url=http://s2.subirimagenes.com/otros/9842564moralejo.jpg', 'http://turismovalledelambroz.com/actividades/rutas/ruta02_moralejo.pdf') ");
        db.execSQL("INSERT INTO `RUTAS` (Id, Nombre, Tipo, Distancia, Duracion, Dificultad, Itinerario, Foto, Link) VALUES (4,'Ruta del Convento de La Bien Parada','Senderismo y bicicleta','6km.','1h30min','Baja','La ruta comienza en el puente viejo de Abadía, cruzar el puente, continuar por la carretera hasta atravesar un pequeño puente donde sale una pista de tierra alambrada a la derecha, tomarla, seguir hasta llegar a la carretera de Lagunilla, girar a la izquierda junto a la carretera (por el antiguo cordel de Las Merinas) y nos separamos un poco mas adelante para pasar por" +
                "la Fuente Blanca, seguir el camino, dejar a la izquierda la Encina del Cristo (lugar de celebración de la Romería), a 200 m. atravesar la carretera de Granadilla, seguir en la misma dirección y un poco más adelante nos encontramos con una piedra grande que señala el cruce de la Cañada Soriana Occidental y la Cañada Real. Pasar la piedra y dejar la Cañada Soriana Occidental a la derecha, y un poco más adelante volver a dejar una pista a la derecha. Seguir el camino hasta llegar a la carretera de La Granja, a 50 m. tenemos el Convento de La Bien Parada. Para regresar, seguir la carretera que está a la izquierda del camino que traíamos.','http://zetaestaticos.com/extremadura/img/noticias/0/566/566269_1.jpg', 'http://turismovalledelambroz.com/actividades/rutas/ruta01_convento_bienparada.pdf') ");
        db.execSQL("INSERT INTO `RUTAS` (Id, Nombre, Tipo, Distancia, Duracion, Dificultad, Itinerario, Foto, Link) VALUES (5,'Ruta de La Chorrera','Senderismo y bicicleta','12,5km.','5horas','Media','No es la primera vez que alguna guía dedica unas páginas a la popular ruta de la Chorrera de Hervás. Bien conocida en el ámbito local,el senderista y amante de la naturaleza que se acerque a este bello pueblo de resonancia judía no pasará por alto el reclamo que la cascada ofrece. Siendo una ruta que  podemos considerar de media exigencia reúne al mismo tiempo" +
                "los requisitos para pasar una agradable jornada recorriendo las montañas que rodean Hervás y disfrutando de su ameno paisaje. El recorrido es pródigo en regatos y manantiales, los bosques de castaño y roble le proveerán de sombra si decide hacerlo en verano, y los frutales y los" +
                "prados alternan con aquellos en las umbrías laderas, de forma que componen un cuadro variado que se completa con alisedas, avellanos y fresnos en las riberas.', 'http://www.subirimagenes.com/imagedata.php?url=http://s2.subirimagenes.com/otros/9842567la-chorrera.jpg', 'https://es.wikiloc.com/rutas-senderismo/la-chorrera-de-hervas-5736349') ");
        db.execSQL("INSERT INTO `RUTAS` (Id, Nombre, Tipo, Distancia, Duracion, Dificultad, Itinerario, Foto, Link) VALUES (6,'Ruta Heidi (El Castañar de Hervás)','Senderismo(7h) y bicicleta(3h)','33km.','7horas a pie','Media','Si llegamos a Hervás por la Autovía de Cáceres o Plasencia entraremos en el pueblo por la calle Reconquista, llegaremos a la rotonda de las Cuatro Carreteras y justo en frente tendremos un parking donde dejar nuestro vehículo, también a la derecha en la Avenida Piñuelas hay mucho espacio donde aparcar, que es donde lo hicimos nosotros. Iniciamos la ruta hacia arriba por la misma calle y al final de la misma y al cruzar la via del tren vemos una señal en la carretera donde nos indica Valle del Jerte. Nos metemos en esa carretera que va hacia el Puerto de Honduras. Rodeados por abundantes castaños rodamos durante unos 1,5 km por asfalto, pasamos por delante de la plaza de toros y un poco más adelante vemos una pista asfaltada que sale por la izquierda y un cartel nos indica que se trata de la Pista Heidi. 20 metros por encima del comienzo de la pista, en la misma carretera hay una fuente donde llenar nuestros bidones de agua.  Empezamos la pista y empezamos subiendo. La pista tiene tramos de asfalto y tramos de tierra, es ancha, bien apisonada y aunque en cuesta arriba se rueda bien. La vegetación es muy frondosa de castaños primero y robles después." +
                "Poco a poco iremos ganando altura zigzagueando por la ladera de la montaña, tramos en los que el desnivel aumenta y otros donde nos permite bajar un par de piñones en nuestro casette, hay algún tramo largo de asfalto donde la bici tracciona perfectamente por lo que se hace más cómodo el avanzar. A nuestra derecha e izquierda va saliendo algún camino más modesto pero nosotros siempre avanzamos por el más ancho y principal." +
                "Cuando llevamos unos 7 km la pista suaviza, el bosque ha dejado paso a monte bajo por lo que las vistas aumentan dándonos una buena panorámica de Hervás, el embalse de Baños y del Valle de Ambroz." +
                "Una vez que la pista suaviza, la velocidad aumenta en nuestro velocímetro, el plato grande va entrando de vez en cuando y lo kilómetros se hacen más cortos. Nos encontramos una gran cantidad de regueros que bajan de los picos del Pinajarro y Valdeamor y después de unos dias de lluvia como encontramos nosotros hicieron mojarnos los pies, digo lo mismo de las fuentas. Por este tramo hay muchas fuentes donde ir rellenando los bidones aunque no creo que sea necesario pues el desgaste hídrico no es muy alto." +
                "Vamos recorriendo la sierra prácticamente a la misma cota, alguna ligera subidita con su correspondiente bajada. Después de una pequeña cuesta arriba llegamos a un colladito donde el camino se bifurca, seguimos por la izquierda (En todos los cruces importantes vimos señales de Sendero de Pequeño Recorrido (Marcas amarillas y blancas) no siempre muy visibles y por lo que habrá que estar un poco pendiente) y empieza una cuesta abajo que nos llevará de una forma divertida hasta cerca de Hervás. En este tramo de bajada saldrán varias pistas a la derecha, nosotros no las haremos caso, la bajada es rápida con regueras por lo que tendremos que ir cambiando de trazada constantemente. En cuando hemos perdido altura, han vuelto a aparecer los robles y los castaños por lo que es de nuevo una zona muy bonita. Finalmente llegamos a la carretera, seguimos por la izquierda hacia Hervás. Cuando tenemos el pueblo a la vista y justo antes de cruzar un puente nos metemos por la izquierda en un caminito que sirve para ir a las fincas y huertos que hay en las cercanías del pueblo y que después de hacer unas curvas llegamos al pueblo entrando al mismo por el Puente de la Fuente Chiquita y en el barrio Judio donde en una terracita y con una cerveza en la mano terminamos la ruta de hoy. ', 'http://www.subirimagenes.com/imagedata.php?url=http://s2.subirimagenes.com/otros/9842568ruta-heidi.jpg', 'http://turismovalledelambroz.com/actividades/rutas/ruta13_pista_de_heidi.pdf') ");
        db.execSQL("INSERT INTO `RUTAS` (Id, Nombre, Tipo, Distancia, Duracion, Dificultad, Itinerario, Foto, Link) VALUES (7,'Ruta Paseo de La Cerecilla','Senderismo ','3km.','40min','Baja','Salimos del Albergue de la Estación en dirección a la Hospedería para llegar al matadero de Anbonisa. Frente al matadero sale un camino que cruza la vía y continuamos a la izquierda por un camino de cemento que llega al Puente del Monte Chico. Sin cruzarlo seguimos por la derecha hasta llegar al Puente del Pedrogoso y sin cruzarlo seguimos por la carretera y a unos 300 m. llegamos al Puente Blanco. No lo cruzamos, seguimos por la derecha, atravesamos la vía y volvemos a llegar al Albergue.', 'http://visitambroz.com/fotosrec/261/261-4.jpg', 'http://4.bp.blogspot.com/-B4dfSUW52f0/UPx1-8-WNfI/AAAAAAAAAuA/1r75Na8pzHw/s1600/IMG_5421.JPG') ");
        db.execSQL("INSERT INTO `RUTAS` (Id, Nombre, Tipo, Distancia, Duracion, Dificultad, Itinerario, Foto, Link) VALUES (8,'Ruta del Castañar del Duque','Senderismo y bicicleta','15,4km.','3h40min','Media','Comenzamos la ruta en 4 carreteras de Hervás en dirección Aldeanueva del Camino, giramos a la izquierda en el cruce dirección Valle del Jerte. A unos 300m. nos encontramos otro cruce, seguimos de frente, cruzamos el puente sobre el rio Gallegos y pasamos por debajo del puente del Monte, giramos a la derecha, por la carretera de Gargantilla y a 1 km. a la izquierda nos encontramos una pista que se desarrolla entre robles y castaños. En el km. 3,7 llegamos a un desvío y seguimos a la derecha hasta cruzar La Garganta de Andrés. A unos 100m. coger la pista de la derecha y 100 m. después coger la pista de subida de la izquierda. A unos 200 m. la pista se divide en dos veredas, tomar la de la izquierda, continuar, unos 400 m. más adelante" +
                "llegamos a una pista ancha y a unos 100 m. donde la pista se hace curva tomar la pista de la derecha que atraviesa el Castañar del Duque, al salir del bosque la pista se divide, tomar la de la izquierda, continuar hasta llegar al PK7 del Puerto de Honduras. Una vez aquí, seguimos por la izquierda bajando por la carretera hasta llegar al Puente de la Umbría del Rey, seguir" +
                "carretera abajo hasta el Puente de Juan Pinto y a unos 100 m. tomar una pista que sube a la derecha y que 100 m. más arriba se bifurca y volvemos a tomar el camino de la derecha que nos lleva hasta la Pista Heidi, la cruzamos y seguimos bajando hasta llegar a la carretera del Puerto de Honduras frente a la Plaza de Toros. Continuamos por la carretera de la derecha y llegamos al Puente del Pedrogoso, a unos 300 m. en la bifurcación tomar el camino de la derecha paralelo a la vía del tren hasta cruzarla y 100 m. más adelante retornaremos hasta el punto de partida.','http://www.subirimagenes.com/imagedata.php?url=http://s2.subirimagenes.com/otros/98425693131.jpg', 'http://turismovalledelambroz.com/actividades/rutas/ruta10_el_castanar.pdf') ");
        db.execSQL("INSERT INTO `RUTAS` (Id, Nombre, Tipo, Distancia, Duracion, Dificultad, Itinerario, Foto, Link) VALUES (9,'Ruta Media','Senderismo y bicicleta','9,4km.','2h15min','Media','Igual que la anterior, pero al llegar al km. 3.7 tomamos la pista de subida de la izquierda hasta el Puerto de Honduras y continuamos por la izquierda unos 600 m. hasta cruzar el puente de Juan Pinto. Unos 200 m. más abajo sale una pista a la derecha que sube, y 100 m. más arriba se bifurca, tomar la de la izquierda hasta la Pista Heidi y continuar por esta a su izquierda hasta llegar a la Fuente de San Gregorio. Seguir carretera abajo hasta llegar al cruce de la Plaza de" +
                "Toros, tomar la carretera de la izquierda hasta el Puente del Monte donde enlazamos con la carretera que llevábamos.','http://www.subirimagenes.com/imagedata.php?url=http://s2.subirimagenes.com/otros/9842572pinajarro1.jpg', 'http://turismovalledelambroz.com/actividades/rutas/ruta10_el_castanar.pdf') ");
        db.execSQL("INSERT INTO `RUTAS` (Id, Nombre, Tipo, Distancia, Duracion, Dificultad, Itinerario, Foto, Link) VALUES (10,'Bosques del Ambroz','Senderismo y bicicleta','25,5km.','6horas aprox','Media','Ya desde el autobús se observan unos maravillosos paisajes que auguran una gran ruta. Salida de la plaza del Ayuntamiento de La Garganta (a las 9 horas) donde se concentraron todos los senderistas, tomamos dirección a Candelario por carretera (300 mts.) dejamos el mismo por un camino que nos lleva a la Ermita de San Gregorio junto al Castañar, de ahí tomamos el camino que unía La Garganta y Hervás, con una bajada que se hace muy peligrosa, debido a la humedad sobre el empedrado, entre vegetación y pequeños cursos de agua (que abunda por todos lados)." +

                "Después de tomar una pista unos 50 metros nos incorporamos a una vereda muy estrecha y" +
                "casi escondida en la vegetación con prados verdes a ambos lados y curso de agua que" +
                "atravesamos por varios puentes (Puente de La Candeleda y Puente de Martín). Llegamos a la" +
                "vía del tren que atravesamos por un túnel y que nos lleva a más prados verdes (preciosos)," +
                "esta senda nos conduce a Hervás por el Puente de la Fuente Chiquita en el Barrio Judío que" +
                "visitamos , tras una parada para tomar algo y reponer fuerzas. Una vez visitado Hervás retomamos nuestra ruta para dirigirnos a Gargantilla, para ello, tras un kilómetro por carretera que lleva a Plasencia nos desviamos a la Izquierda por una vereda que nos adentra en un maravilloso bosque de Castaños, que uno quiere que nunca acabe, y donde se puede observar el Otoño en todo su esplendor, del cual uno queda prendado y llama a sus amigos para contarles que esta viviendo un momento maravilloso y que no quiere irse de allí, pero la ruta debe continuar, tras cruzar algunas gargantas (entre ella la Garganta de Andrés) llegamos a el punto más alto que se llega en la ruta y desde el cual se pueden observar unas maravillosas vistas del Pantano de Gabriel y Galan, de toda la Comarca, y de los pueblos de Gargantilla y Hervás entre otros." +

                "Tras unos minutos de contemplación nos disponemos a bajar hasta el pueblo de Gargantilla," +
                "donde se puede observar el curso del río por el centro de la localidad. Y donde observo una" +
                "estampa que tiene poco futuro (desgraciadamente) un hombre a lomos de su burro y con el" +
                "cual comparto unas palabras acerca del tiempo y de las cosas del lugar.  Tras la conversación, continúo la ruta que me llevará a el lugar de destino (Segura de Toro), para ello y tras cruzar la localidad de Gargantilla nos adentramos en otro tipo de paisaje totalmente distinto a el anterior, nos encontramos con una Dehesa (espacios que personalmente me gusta muchísimo y del cual disfruto de cada momento) pasando varias portillas (sin molestar a el ganado que pasta ajeno a nuestra presencia) y la Garganta Honduras, llegamos a Segura de Toro a las 14:30 horas donde nos espera un buen chocolate con churros por gentileza de la organización del evento (al cual me parece que no faltaré en próximas ediciones y que recomiendo a todo el mundo, pese al madrugón que supone) y donde podemos ver su Iglesia Parroquial de San Juan del s. XV, así como su todo de piedra en la" +
                "plaza del ayuntamiento y los restos de un Castillo del s. XIII del cual queda un muro y el torreón" +
                "que se utilizó como campanario.','http://www.subirimagenes.com/imagedata.php?url=http://s2.subirimagenes.com/otros/98425701791.jpg', null) ");
        db.execSQL("INSERT INTO `RUTAS` (Id, Nombre, Tipo, Distancia, Duracion, Dificultad, Itinerario, Foto, Link) VALUES (11,'Ruta Puerto de Honduras','Senderismo','23km.','5h40min','Media-Alta','La Ruta parte de la calle más alta del pueblo de Aldeanueva del Camino, situada al lado de la" +
                "iglesia y pasa una pista deportiva y la piscina, al llegar a la autovía girar a la izquierda, 200 m." +
                "más adelante pasar debajo de ella, a 100 m. tomar el camino que está situado al lado de una" +
                "torreta de telefonía móvil. Seguimos subiendo, atravesar la vía del tren, al llegar a un cruce" +
                "girar a la izquierda, dirección Gargantilla. Al llegar a Gargantilla subir una calle que da a una" +
                "plaza con una fuente, seguir recto hasta llegar a otra plaza, atravesarla, llegar a otra plaza con" +
                "un caño, girar a la derecha, cruzar un puente y seguir por la calle de cemento que encontraremos a la izquierda hasta llegar a la piscina natural (recorrido hasta aquí 2,6km.). Seguir subiendo, después de pasar tres cruces de camino a unos 2 km. la pista se estrecha, seguir subiendo en paralelo al río, cruzar un río y dos arroyos, el camino cruza el río al lado de una roca, subir el último tramo del Puerto de Honduras." +

                "Para bajar hay dos opciones:" +
                "1º) Bajar por la carretera hasta el km. 7." +
                "2º) Bajar 1 km. por la carretera, hasta la primera curva de herradura, subir un poco a la derecha" +
                "campo a través hasta llegar a una pared de piedra con una alambrada que delimita la cuerda" +
                "de la montaña. Seguir la pared hasta llegar a unas rocas, las bordeamos y bajando a la izquierda llegamos al P.K. 10 de la carretera, cruzados ésta junto a un cartel, bajamos en línea recta, y unos 300 m. se cruza de nuevo la carretera. Buscar un claro en el bosque donde hay un castaño viejo, pasarlo, a unos 50 m. giramos a la izquierda, unos 300 m. más abajo por la carretera llegamos al P.K. 7, 50 m. más abajo atravesar una portilla y coger la pista de la izquierda, 200 m. más adelante encontraremos un cruce, seguir bajando, al llegar a una desviación tomar la de la izquierda hasta llegar al río, cruzarlo, y unos 100 m. más adelante cogemos la pista que nos lleva hasta la piscina natural.', 'https://www.quetiempo.es/fotos/hervas/hervas--puerto-de-honduras_57340228.jpg', 'http://turismovalledelambroz.com/actividades/rutas/ruta10_el_castanar.pdf') ");


    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        crearTablasAloj(db);
        crearTablasBares (db);
        crearTablasPuntosInt (db);
        crearTablasRutas (db);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
