package com.example.adrin.location;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.Random;

public class EuropaPartida extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partida_europa);

        final int score = 0;

        final String ciudad = getIntent().getExtras().getString("Ciudad");
        final int partidas = getIntent().getExtras().getInt("Partidas");



        final ImageView otra = (ImageView) findViewById(R.id.fotosCiudad);
        final Button resuelvo = (Button) findViewById(R.id.Resulevo);

        if (partidas != 0) {

            int min = 1;
            int max = 8;

            Random r = new Random();
            int number = r.nextInt(max - min + 1) + min;
            final String result = String.valueOf(number);


            switch (ciudad) {
                case "Madrid":


                    switch (result) {
                        case "1":
                            //  otra.setImageBitmap(madrid1);
                            Picasso.with(getApplicationContext()).load("http://www.madridlimusinas.net/wp-content/uploads/2016/03/madrid-2.jpg").into(otra);

                            break;
                        case "2":
                            // otra.setImageBitmap(madrid2);
                            Picasso.with(getApplicationContext()).load("https://d16teuje7e44sv.cloudfront.net/spa/cities/spain/madrid-medium.jpg").into(otra);

                            break;
                        case "3":
                            // otra.setImageBitmap(madrid3);
                            Picasso.with(getApplicationContext()).load("http://bstt-madridcourse.com/wp-content/uploads/2012/10/oposiciones-madrid.jpg").into(otra);

                            break;
                        case "4":
                            // otra.setImageBitmap(madrid4);
                            Picasso.with(getApplicationContext()).load("https://cache-graphicslib.viator.com/graphicslib/thumbs674x446/22869/SITours/exclusivo-de-viator-acceso-a-primera-hora-al-palacio-real-de-madrid-in-madrid-333728.jpg").into(otra);

                            break;
                        case "5":
                            // otra.setImageBitmap(madrid5);
                            Picasso.with(getApplicationContext()).load("http://static.vueling.com/cms/media/1216306/madrid.jpg").into(otra);

                            break;
                        case "6":
                            //otra.setImageBitmap(madrid6);
                            Picasso.with(getApplicationContext()).load("https://upload.wikimedia.org/wikipedia/commons/f/f7/CTBA_(Madrid)_36.jpg").into(otra);

                            break;
                        case "7":
                            //otra.setImageBitmap(madrid7);
                            Picasso.with(getApplicationContext()).load("https://only-apartments.storage.googleapis.com/web/imgs/city/Madrid_Small.jpg").into(otra);

                            break;
                        case "8":
                            //otra.setImageBitmap(madrid8);
                            Picasso.with(getApplicationContext()).load("http://www.luxuryrentalsmadrid.com/blog/wp-content/uploads/2013/08/descubre-madrid-cabecera1.jpg").into(otra);

                            break;
                        default:
                            System.out.println("ERROR");
                            break;
                    }


                    otra.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            int min = 1;
                            int max = 8;

                            Random r = new Random();
                            int number = r.nextInt(max - min + 1) + min;
                            final String result = String.valueOf(number);


                            switch (result) {
                                case "1":
                                    //  otra.setImageBitmap(madrid1);
                                    Picasso.with(getApplicationContext()).load("http://www.madridlimusinas.net/wp-content/uploads/2016/03/madrid-2.jpg").into(otra);

                                    break;
                                case "2":
                                    // otra.setImageBitmap(madrid2);
                                    Picasso.with(getApplicationContext()).load("https://d16teuje7e44sv.cloudfront.net/spa/cities/spain/madrid-medium.jpg").into(otra);

                                    break;
                                case "3":
                                    // otra.setImageBitmap(madrid3);
                                    Picasso.with(getApplicationContext()).load("http://bstt-madridcourse.com/wp-content/uploads/2012/10/oposiciones-madrid.jpg").into(otra);

                                    break;
                                case "4":
                                    // otra.setImageBitmap(madrid4);
                                    Picasso.with(getApplicationContext()).load("https://cache-graphicslib.viator.com/graphicslib/thumbs674x446/22869/SITours/exclusivo-de-viator-acceso-a-primera-hora-al-palacio-real-de-madrid-in-madrid-333728.jpg").into(otra);

                                    break;
                                case "5":
                                    // otra.setImageBitmap(madrid5);
                                    Picasso.with(getApplicationContext()).load("http://static.vueling.com/cms/media/1216306/madrid.jpg").into(otra);

                                    break;
                                case "6":
                                    //otra.setImageBitmap(madrid6);
                                    Picasso.with(getApplicationContext()).load("https://upload.wikimedia.org/wikipedia/commons/f/f7/CTBA_(Madrid)_36.jpg").into(otra);

                                    break;
                                case "7":
                                    //otra.setImageBitmap(madrid7);
                                    Picasso.with(getApplicationContext()).load("https://only-apartments.storage.googleapis.com/web/imgs/city/Madrid_Small.jpg").into(otra);

                                    break;
                                case "8":
                                    //otra.setImageBitmap(madrid8);
                                    Picasso.with(getApplicationContext()).load("http://www.luxuryrentalsmadrid.com/blog/wp-content/uploads/2013/08/descubre-madrid-cabecera1.jpg").into(otra);

                                    break;
                                default:
                                    System.out.println("ERROR");
                                    break;
                            }

                        }
                    });

                    final double[] coord2 = new double[]{40.2459, -3.4209};

                    resuelvo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {


                            Intent reg = new Intent(EuropaPartida.this, MapsActivity.class);
                            reg.putExtra("Score", score);
                            reg.putExtra("coord", coord2);
                            reg.putExtra("Partidas", partidas);
                            startActivity(reg);


                        }
                    });

                    break;

                case "Berlin": {


                    switch (result) {
                        case "1":
                            //  otra.setImageBitmap(madrid1);
                            Picasso.with(getApplicationContext()).load("http://goandatraveler.com/wp-content/uploads/2016/10/berlin3.jpg").into(otra);

                            break;
                        case "2":
                            // otra.setImageBitmap(madrid2);
                            Picasso.with(getApplicationContext()).load("https://cdn.getyourguide.com/niwziy2l9cvz/3Nl5nGC5fq2CQ0O42awIwq/0cff0ba6cc53c2e0f9c153e820fcc8d0/berlin-Brandenburg-Gate-1112x630.jpg").into(otra);

                            break;
                        case "3":
                            // otra.setImageBitmap(madrid3);
                            Picasso.with(getApplicationContext()).load("https://www.riu.com/es/binaris/BERLIN%20002D-11-1_tcm49-84457.jpg").into(otra);

                            break;
                        case "4":
                            // otra.setImageBitmap(madrid4);
                            Picasso.with(getApplicationContext()).load("http://www.schoenenurlaub.com/wp-content/uploads/2016/01/Berlin-12.jpg").into(otra);

                            break;
                        case "5":
                            // otra.setImageBitmap(madrid5);
                            Picasso.with(getApplicationContext()).load("http://assets.fodors.com/destinations/28/christmas-market-berlin-germany-europe_main.jpg").into(otra);

                            break;
                        case "6":
                            //otra.setImageBitmap(madrid6);
                            Picasso.with(getApplicationContext()).load("http://www.travelgeekery.com/wp-content/uploads/2015/02/Reichstag.jpg").into(otra);

                            break;
                        case "7":
                            //otra.setImageBitmap(madrid7);
                            Picasso.with(getApplicationContext()).load("https://www.sixt.es/fileadmin/user_upload/pictures-city-page/berlin-city-molecule-man.jpg").into(otra);

                            break;
                        case "8":
                            //otra.setImageBitmap(madrid8);
                            Picasso.with(getApplicationContext()).load("http://4.bp.blogspot.com/-TwLl-8GUbdw/UzDpR7Nnn_I/AAAAAAAAI2M/cWZ_9W9Fqs8/s1600/The+Socialist+Fraternal+Kiss+between+Leonid+Brezhnev+and+Erich+Honecker+1979+2.jpg").into(otra);

                            break;
                        default:
                            System.out.println("ERROR");
                            break;
                    }


                    otra.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            int min = 1;
                            int max = 8;

                            Random r = new Random();
                            int number = r.nextInt(max - min + 1) + min;
                            final String result = String.valueOf(number);


                            switch (result) {
                                case "1":
                                    //  otra.setImageBitmap(madrid1);
                                    Picasso.with(getApplicationContext()).load("http://goandatraveler.com/wp-content/uploads/2016/10/berlin3.jpg").into(otra);

                                    break;
                                case "2":
                                    // otra.setImageBitmap(madrid2);
                                    Picasso.with(getApplicationContext()).load("https://cdn.getyourguide.com/niwziy2l9cvz/3Nl5nGC5fq2CQ0O42awIwq/0cff0ba6cc53c2e0f9c153e820fcc8d0/berlin-Brandenburg-Gate-1112x630.jpg").into(otra);

                                    break;
                                case "3":
                                    // otra.setImageBitmap(madrid3);
                                    Picasso.with(getApplicationContext()).load("https://www.riu.com/es/binaris/BERLIN%20002D-11-1_tcm49-84457.jpg").into(otra);

                                    break;
                                case "4":
                                    // otra.setImageBitmap(madrid4);
                                    Picasso.with(getApplicationContext()).load("http://www.schoenenurlaub.com/wp-content/uploads/2016/01/Berlin-12.jpg").into(otra);

                                    break;
                                case "5":
                                    // otra.setImageBitmap(madrid5);
                                    Picasso.with(getApplicationContext()).load("http://assets.fodors.com/destinations/28/christmas-market-berlin-germany-europe_main.jpg").into(otra);

                                    break;
                                case "6":
                                    //otra.setImageBitmap(madrid6);
                                    Picasso.with(getApplicationContext()).load("http://www.travelgeekery.com/wp-content/uploads/2015/02/Reichstag.jpg").into(otra);

                                    break;
                                case "7":
                                    //otra.setImageBitmap(madrid7);
                                    Picasso.with(getApplicationContext()).load("https://www.sixt.es/fileadmin/user_upload/pictures-city-page/berlin-city-molecule-man.jpg").into(otra);

                                    break;
                                case "8":
                                    //otra.setImageBitmap(madrid8);
                                    Picasso.with(getApplicationContext()).load("http://4.bp.blogspot.com/-TwLl-8GUbdw/UzDpR7Nnn_I/AAAAAAAAI2M/cWZ_9W9Fqs8/s1600/The+Socialist+Fraternal+Kiss+between+Leonid+Brezhnev+and+Erich+Honecker+1979+2.jpg").into(otra);

                                    break;
                                default:
                                    System.out.println("ERROR");
                                    break;
                            }
                        }
                    });

                    final double[] coord3 = new double[]{52.5243700, 13.4105300};
                    resuelvo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {


                            Intent reg = new Intent(EuropaPartida.this, MapsActivity.class);
                            reg.putExtra("Score", score);
                            reg.putExtra("coord", coord3);
                            reg.putExtra("Partidas", partidas);
                            startActivity(reg);


                        }
                    });


                    break;
                }
                case "Basilea": {


                    switch (result) {
                        case "1":
                            //  otra.setImageBitmap(madrid1);
                            Picasso.with(getApplicationContext()).load("https://s-media-cache-ak0.pinimg.com/736x/a0/98/be/a098beba1d6ec003a86e7de7ea78e023.jpg").into(otra);

                            break;
                        case "2":
                            // otra.setImageBitmap(madrid2);
                            Picasso.with(getApplicationContext()).load("http://img.myswitzerland.com/mys/n49450/images/buehne/basel_winter_650x365_2.jpg").into(otra);

                            break;
                        case "3":
                            // otra.setImageBitmap(madrid3);
                            Picasso.with(getApplicationContext()).load("http://files.newsnetz.ch/story/1/6/1/16107042/4/topelement.jpg").into(otra);

                            break;
                        case "4":
                            // otra.setImageBitmap(madrid4);
                            Picasso.with(getApplicationContext()).load("https://upload.wikimedia.org/wikipedia/commons/6/6d/Basel_SBB,_Bahnhof.jpg").into(otra);

                            break;
                        case "5":
                            // otra.setImageBitmap(madrid5);
                            Picasso.with(getApplicationContext()).load("http://media.biocalorimetry.org/2015/11/luftaufnahme_01_Basel.jpg").into(otra);

                            break;
                        case "6":
                            //otra.setImageBitmap(madrid6);
                            Picasso.with(getApplicationContext()).load("https://www.fcb.ch/getmedia/de945923-6f3c-4894-a7cc-d51a4d0f0d99/fcbasel").into(otra);

                            break;
                        case "7":
                            //otra.setImageBitmap(madrid7);
                            Picasso.with(getApplicationContext()).load("http://fminside.net/uploads/monthly_2016_04/basel-logo.png.0c977527e0a0097778e2ab9893b10fc3.png").into(otra);

                            break;
                        case "8":
                            //otra.setImageBitmap(madrid8);
                            Picasso.with(getApplicationContext()).load("http://www.roche.com/dam/jcr:7e8de406-d8fc-492c-a005-ddde60d64048/en/bau1_aussen_370px.jpg").into(otra);

                            break;
                        default:
                            System.out.println("ERROR");
                            break;
                    }


                    otra.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            int min = 1;
                            int max = 8;

                            Random r = new Random();
                            int number = r.nextInt(max - min + 1) + min;
                            final String result = String.valueOf(number);

                            switch (result) {
                                case "1":

                                    Picasso.with(getApplicationContext()).load("https://s-media-cache-ak0.pinimg.com/736x/a0/98/be/a098beba1d6ec003a86e7de7ea78e023.jpg").into(otra);

                                    break;
                                case "2":

                                    Picasso.with(getApplicationContext()).load("http://img.myswitzerland.com/mys/n49450/images/buehne/basel_winter_650x365_2.jpg").into(otra);

                                    break;
                                case "3":

                                    Picasso.with(getApplicationContext()).load("http://files.newsnetz.ch/story/1/6/1/16107042/4/topelement.jpg").into(otra);

                                    break;
                                case "4":

                                    Picasso.with(getApplicationContext()).load("https://upload.wikimedia.org/wikipedia/commons/6/6d/Basel_SBB,_Bahnhof.jpg").into(otra);

                                    break;
                                case "5":

                                    Picasso.with(getApplicationContext()).load("http://media.biocalorimetry.org/2015/11/luftaufnahme_01_Basel.jpg").into(otra);

                                    break;
                                case "6":

                                    Picasso.with(getApplicationContext()).load("https://www.fcb.ch/getmedia/de945923-6f3c-4894-a7cc-d51a4d0f0d99/fcbasel").into(otra);

                                    break;
                                case "7":

                                    Picasso.with(getApplicationContext()).load("http://fminside.net/uploads/monthly_2016_04/basel-logo.png.0c977527e0a0097778e2ab9893b10fc3.png").into(otra);

                                    break;
                                case "8":

                                    Picasso.with(getApplicationContext()).load("http://www.roche.com/dam/jcr:7e8de406-d8fc-492c-a005-ddde60d64048/en/bau1_aussen_370px.jpg").into(otra);

                                    break;
                                default:
                                    System.out.println("ERROR");
                                    break;
                            }


                        }
                    });


                    final double[] coord3 = new double[]{47.5583900, 7.5732700};
                    resuelvo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {


                            Intent reg = new Intent(EuropaPartida.this, MapsActivity.class);
                            reg.putExtra("Score", score);
                            reg.putExtra("coord", coord3);
                            reg.putExtra("Partidas", partidas);
                            startActivity(reg);


                        }
                    });

                    break;
                }
                case "Barcelona": {


                    switch (result) {
                        case "1":

                            Picasso.with(getApplicationContext()).load("http://cdn.traveler.es/uploads/images/thumbs/201144/barcelona_3771_966x.jpg").into(otra);

                            break;
                        case "2":

                            Picasso.with(getApplicationContext()).load("http://www.enforex.com/images/fichas/barcelona/ciudad-barcelona-3.jpg").into(otra);

                            break;
                        case "3":

                            Picasso.with(getApplicationContext()).load("https://www.skyscanner.es/static/sites/default/files/spain-catalonia-barcelona-sagrada-familia-519536461_0.jpg").into(otra);

                            break;
                        case "4":

                            Picasso.with(getApplicationContext()).load("https://travelinvision.com/resources/img/experiences_gallery/8c35ed29466560cb4b8d933c1d492d19.png").into(otra);

                            break;
                        case "5":

                            Picasso.with(getApplicationContext()).load("https://cdn.civitatis.com/guias/barcelona/fotos/hoteles-barcelona-hotel-w.jpg").into(otra);

                            break;
                        case "6":

                            Picasso.with(getApplicationContext()).load("http://www.barcelonabook.com/uploads/9/2/8/1/9281695/5823663_orig.jpg").into(otra);

                            break;
                        case "7":

                            Picasso.with(getApplicationContext()).load("https://images.trvl-media.com/media/content/shared/images/travelguides/destination/179992/Barcelona-52305.jpg").into(otra);

                            break;
                        case "8":

                            Picasso.with(getApplicationContext()).load("http://www.qtorb.com/wp-content/uploads/barcelona-intensa.jpg").into(otra);

                            break;
                        default:
                            System.out.println("ERROR");
                            break;
                    }


                    otra.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            int min = 1;
                            int max = 8;

                            Random r = new Random();
                            int number = r.nextInt(max - min + 1) + min;
                            final String result = String.valueOf(number);


                            switch (result) {
                                case "1":

                                    Picasso.with(getApplicationContext()).load("http://cdn.traveler.es/uploads/images/thumbs/201144/barcelona_3771_966x.jpg").into(otra);

                                    break;
                                case "2":

                                    Picasso.with(getApplicationContext()).load("http://www.enforex.com/images/fichas/barcelona/ciudad-barcelona-3.jpg").into(otra);

                                    break;
                                case "3":

                                    Picasso.with(getApplicationContext()).load("https://www.skyscanner.es/static/sites/default/files/spain-catalonia-barcelona-sagrada-familia-519536461_0.jpg").into(otra);

                                    break;
                                case "4":

                                    Picasso.with(getApplicationContext()).load("https://travelinvision.com/resources/img/experiences_gallery/8c35ed29466560cb4b8d933c1d492d19.png").into(otra);

                                    break;
                                case "5":

                                    Picasso.with(getApplicationContext()).load("https://cdn.civitatis.com/guias/barcelona/fotos/hoteles-barcelona-hotel-w.jpg").into(otra);

                                    break;
                                case "6":

                                    Picasso.with(getApplicationContext()).load("http://www.barcelonabook.com/uploads/9/2/8/1/9281695/5823663_orig.jpg").into(otra);

                                    break;
                                case "7":

                                    Picasso.with(getApplicationContext()).load("https://images.trvl-media.com/media/content/shared/images/travelguides/destination/179992/Barcelona-52305.jpg").into(otra);

                                    break;
                                case "8":

                                    Picasso.with(getApplicationContext()).load("http://www.qtorb.com/wp-content/uploads/barcelona-intensa.jpg").into(otra);

                                    break;
                                default:
                                    System.out.println("ERROR");
                                    break;
                            }
                        }
                    });


                    final double[] coord3 = new double[]{41.3887900, 2.1589900};
                    resuelvo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {


                            Intent reg = new Intent(EuropaPartida.this, MapsActivity.class);
                            reg.putExtra("Score", score);
                            reg.putExtra("coord", coord3);
                            reg.putExtra("Partidas", partidas);
                            startActivity(reg);


                        }
                    });


                    break;
                }
                case "Dublin": {


                    switch (result) {
                        case "1":

                            Picasso.with(getApplicationContext()).load("https://lonelyplanetimages.imgix.net/mastheads/stock-photo-temple-bar-district-in-dublin-at-night-100904953%20.jpg?sharp=10&vib=20&w=1200").into(otra);

                            break;
                        case "2":

                            Picasso.with(getApplicationContext()).load("https://cdn.civitatis.com/guias/dublin/fotos/dublin-four-courts.jpg").into(otra);

                            break;
                        case "3":

                            Picasso.with(getApplicationContext()).load("http://mevoyalmundo.com/wp-content/uploads/2015/05/dublin-low-cost.jpg").into(otra);

                            break;
                        case "4":

                            Picasso.with(getApplicationContext()).load("http://www.mevoyadublin.com/hs-fs/hubfs/citywallpaperhd.com-265.jpg?t=1487351588668&width=2127&name=citywallpaperhd.com-265.jpg").into(otra);

                            break;
                        case "5":

                            Picasso.with(getApplicationContext()).load("http://www.turismodigital.com/fotos/dublin-en-24-horas-3-121.jpg").into(otra);

                            break;
                        case "6":

                            Picasso.with(getApplicationContext()).load("https://cache-graphicslib.viator.com/graphicslib/thumbs674x446/5299/SITours/excursi-n-de-un-d-a-a-belfast-desde-dubl-n-in-dublin-49330.jpg").into(otra);

                            break;
                        case "7":

                            Picasso.with(getApplicationContext()).load("https://i2.wp.com/instaireland.ie/wp-content/uploads/2016/02/the-oldest-pub-in-dublin.jpg").into(otra);

                            break;
                        case "8":

                            Picasso.with(getApplicationContext()).load("http://s2.pic4you.ru/allimage/y2013/03-10/12216/3233016.png").into(otra);

                            break;
                        default:
                            System.out.println("ERROR");
                            break;
                    }


                    otra.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            int min = 1;
                            int max = 8;

                            Random r = new Random();
                            int number = r.nextInt(max - min + 1) + min;
                            final String result = String.valueOf(number);


                            switch (result) {
                                case "1":

                                    Picasso.with(getApplicationContext()).load("https://lonelyplanetimages.imgix.net/mastheads/stock-photo-temple-bar-district-in-dublin-at-night-100904953%20.jpg?sharp=10&vib=20&w=1200").into(otra);

                                    break;
                                case "2":

                                    Picasso.with(getApplicationContext()).load("https://cdn.civitatis.com/guias/dublin/fotos/dublin-four-courts.jpg").into(otra);

                                    break;
                                case "3":

                                    Picasso.with(getApplicationContext()).load("http://mevoyalmundo.com/wp-content/uploads/2015/05/dublin-low-cost.jpg").into(otra);

                                    break;
                                case "4":

                                    Picasso.with(getApplicationContext()).load("http://www.mevoyadublin.com/hs-fs/hubfs/citywallpaperhd.com-265.jpg?t=1487351588668&width=2127&name=citywallpaperhd.com-265.jpg").into(otra);

                                    break;
                                case "5":

                                    Picasso.with(getApplicationContext()).load("http://www.turismodigital.com/fotos/dublin-en-24-horas-3-121.jpg").into(otra);

                                    break;
                                case "6":

                                    Picasso.with(getApplicationContext()).load("https://cache-graphicslib.viator.com/graphicslib/thumbs674x446/5299/SITours/excursi-n-de-un-d-a-a-belfast-desde-dubl-n-in-dublin-49330.jpg").into(otra);

                                    break;
                                case "7":

                                    Picasso.with(getApplicationContext()).load("https://i2.wp.com/instaireland.ie/wp-content/uploads/2016/02/the-oldest-pub-in-dublin.jpg").into(otra);

                                    break;
                                case "8":

                                    Picasso.with(getApplicationContext()).load("http://s2.pic4you.ru/allimage/y2013/03-10/12216/3233016.png").into(otra);

                                    break;
                                default:
                                    System.out.println("ERROR");
                                    break;
                            }

                        }
                    });


                    final double[] coord3 = new double[]{53.3330600, -6.2488900};
                    resuelvo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {


                            Intent reg = new Intent(EuropaPartida.this, MapsActivity.class);
                            reg.putExtra("Score", score);
                            reg.putExtra("coord", coord3);
                            reg.putExtra("Partidas", partidas);
                            startActivity(reg);


                        }
                    });

                    break;
                }
                case "Londres": {


                    switch (result) {
                        case "1":

                            Picasso.with(getApplicationContext()).load("http://www.cambiandoelrumbo.com/wp-content/uploads/2013/08/londres.jpg").into(otra);

                            break;
                        case "2":

                            Picasso.with(getApplicationContext()).load("http://trucoslondres.com/wp-content/themes/trucoslondres/assets/images/trucoslondres-fondo.png").into(otra);

                            break;
                        case "3":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2013/11/05/19/12/urban-205986_960_720.jpg").into(otra);

                            break;
                        case "4":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2014/02/27/16/08/household-cavalry-soldier-275949_960_720.jpg").into(otra);

                            break;
                        case "5":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/03/27/20/57/blue-sky-1284254_960_720.jpg").into(otra);

                            break;
                        case "6":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/12/26/13/30/london-1932126_960_720.jpg").into(otra);

                            break;
                        case "7":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2013/10/31/14/09/phone-booth-203492_960_720.jpg").into(otra);

                            break;
                        case "8":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/12/26/13/28/taxi-1932107_960_720.jpg").into(otra);

                            break;
                        default:
                            System.out.println("ERROR");
                            break;
                    }

                    otra.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            int min = 1;
                            int max = 8;

                            Random r = new Random();
                            int number = r.nextInt(max - min + 1) + min;
                            final String result = String.valueOf(number);

                            switch (result) {
                                case "1":

                                    Picasso.with(getApplicationContext()).load("http://www.cambiandoelrumbo.com/wp-content/uploads/2013/08/londres.jpg").into(otra);

                                    break;
                                case "2":

                                    Picasso.with(getApplicationContext()).load("http://trucoslondres.com/wp-content/themes/trucoslondres/assets/images/trucoslondres-fondo.png").into(otra);

                                    break;
                                case "3":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2013/11/05/19/12/urban-205986_960_720.jpg").into(otra);

                                    break;
                                case "4":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2014/02/27/16/08/household-cavalry-soldier-275949_960_720.jpg").into(otra);

                                    break;
                                case "5":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/03/27/20/57/blue-sky-1284254_960_720.jpg").into(otra);

                                    break;
                                case "6":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/12/26/13/30/london-1932126_960_720.jpg").into(otra);

                                    break;
                                case "7":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2013/10/31/14/09/phone-booth-203492_960_720.jpg").into(otra);

                                    break;
                                case "8":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/12/26/13/28/taxi-1932107_960_720.jpg").into(otra);

                                    break;
                                default:
                                    System.out.println("ERROR");
                                    break;
                            }
                        }
                    });


                    final double[] coord3 = new double[]{51.5085300, -0.1257400};
                    resuelvo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {


                            Intent reg = new Intent(EuropaPartida.this, MapsActivity.class);
                            reg.putExtra("Score", score);
                            reg.putExtra("coord", coord3);
                            reg.putExtra("Partidas", partidas);
                            startActivity(reg);


                        }
                    });

                    break;
                }
                case "Paris": {


                    switch (result) {
                        case "1":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2013/04/11/19/46/louvre-102840_960_720.jpg").into(otra);

                            break;
                        case "2":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/11/18/19/01/paris-1836415_960_720.jpg").into(otra);

                            break;
                        case "3":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2013/02/07/21/54/palace-79213_960_720.jpg").into(otra);

                            break;
                        case "4":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/03/27/18/24/arc-de-triomphe-1283422_960_720.jpg").into(otra);

                            break;
                        case "5":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/02/19/10/46/triumphal-arc-1209394_960_720.jpg").into(otra);

                            break;
                        case "6":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/11/23/00/39/architecture-1851496_960_720.jpg").into(otra);

                            break;
                        case "7":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/11/18/16/00/architecture-1835516_960_720.jpg").into(otra);

                            break;
                        case "8":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2013/06/24/18/54/sacred-140963_960_720.jpg").into(otra);

                            break;
                        default:
                            System.out.println("ERROR");
                            break;
                    }

                    otra.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            int min = 1;
                            int max = 8;

                            Random r = new Random();
                            int number = r.nextInt(max - min + 1) + min;
                            final String result = String.valueOf(number);


                            switch (result) {
                                case "1":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2013/04/11/19/46/louvre-102840_960_720.jpg").into(otra);

                                    break;
                                case "2":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/11/18/19/01/paris-1836415_960_720.jpg").into(otra);

                                    break;
                                case "3":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2013/02/07/21/54/palace-79213_960_720.jpg").into(otra);

                                    break;
                                case "4":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/03/27/18/24/arc-de-triomphe-1283422_960_720.jpg").into(otra);

                                    break;
                                case "5":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/02/19/10/46/triumphal-arc-1209394_960_720.jpg").into(otra);

                                    break;
                                case "6":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/11/23/00/39/architecture-1851496_960_720.jpg").into(otra);

                                    break;
                                case "7":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/11/18/16/00/architecture-1835516_960_720.jpg").into(otra);

                                    break;
                                case "8":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2013/06/24/18/54/sacred-140963_960_720.jpg").into(otra);

                                    break;
                                default:
                                    System.out.println("ERROR");
                                    break;
                            }
                        }
                    });


                    final double[] coord3 = new double[]{48.8534100, 2.3488000};
                    resuelvo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {


                            Intent reg = new Intent(EuropaPartida.this, MapsActivity.class);
                            reg.putExtra("Score", score);
                            reg.putExtra("coord", coord3);
                            reg.putExtra("Partidas", partidas);
                            startActivity(reg);


                        }
                    });


                    break;
                }
                case "Pompeya": {

                    switch (result) {
                        case "1":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2015/09/04/21/33/portrait-922764_960_720.jpg").into(otra);

                            break;
                        case "2":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2015/03/02/18/22/pompeii-656357_960_720.jpg").into(otra);

                            break;
                        case "3":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/02/23/16/54/italy-1218073_960_720.jpg").into(otra);

                            break;
                        case "4":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2017/01/05/17/06/italy-1955835_960_720.jpg").into(otra);

                            break;
                        case "5":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2015/02/01/20/32/pompeii-620269_960_720.jpg").into(otra);

                            break;
                        case "6":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2014/08/30/12/00/pompeii-431577_960_720.jpg").into(otra);

                            break;
                        case "7":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2010/12/01/columnar-770_960_720.jpg").into(otra);

                            break;
                        case "8":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2014/01/27/19/09/pompeii-253364_960_720.jpg").into(otra);

                            break;
                        default:
                            System.out.println("ERROR");
                            break;
                    }

                    otra.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            int min = 1;
                            int max = 8;

                            Random r = new Random();
                            int number = r.nextInt(max - min + 1) + min;
                            final String result = String.valueOf(number);

                            switch (result) {
                                case "1":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2015/09/04/21/33/portrait-922764_960_720.jpg").into(otra);

                                    break;
                                case "2":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2015/03/02/18/22/pompeii-656357_960_720.jpg").into(otra);

                                    break;
                                case "3":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/02/23/16/54/italy-1218073_960_720.jpg").into(otra);

                                    break;
                                case "4":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2017/01/05/17/06/italy-1955835_960_720.jpg").into(otra);

                                    break;
                                case "5":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2015/02/01/20/32/pompeii-620269_960_720.jpg").into(otra);

                                    break;
                                case "6":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2014/08/30/12/00/pompeii-431577_960_720.jpg").into(otra);

                                    break;
                                case "7":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2010/12/01/columnar-770_960_720.jpg").into(otra);

                                    break;
                                case "8":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2014/01/27/19/09/pompeii-253364_960_720.jpg").into(otra);

                                    break;
                                default:
                                    System.out.println("ERROR");
                                    break;
                            }
                        }
                    });


                    final double[] coord3 = new double[]{40.7457400, 14.4969800};
                    resuelvo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {


                            Intent reg = new Intent(EuropaPartida.this, MapsActivity.class);
                            reg.putExtra("Score", score);
                            reg.putExtra("coord", coord3);
                            reg.putExtra("Partidas", partidas);
                            startActivity(reg);



                        }
                    });

                    break;
                }
                case "Praga": {

                    switch (result) {
                        case "1":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/03/25/19/00/czech-republic-1279425_960_720.jpg").into(otra);

                            break;
                        case "2":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2015/12/21/10/18/orloj-1102368_960_720.jpg").into(otra);

                            break;
                        case "3":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2015/08/24/20/22/prague-905569_960_720.jpg").into(otra);

                            break;
                        case "4":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/04/29/17/09/prague-1361374_960_720.jpg").into(otra);

                            break;
                        case "5":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/01/29/16/57/prague-1168302_960_720.jpg").into(otra);

                            break;
                        case "6":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2017/02/07/21/29/prague-2047105_960_720.jpg").into(otra);

                            break;
                        case "7":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/10/21/19/03/czech-republic-1758820_960_720.png").into(otra);

                            break;
                        case "8":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2014/11/27/16/40/clock-547839_960_720.jpg").into(otra);

                            break;
                        default:
                            System.out.println("ERROR");
                            break;
                    }

                    otra.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            int min = 1;
                            int max = 8;

                            Random r = new Random();
                            int number = r.nextInt(max - min + 1) + min;
                            final String result = String.valueOf(number);

                            switch (result) {
                                case "1":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/03/25/19/00/czech-republic-1279425_960_720.jpg").into(otra);

                                    break;
                                case "2":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2015/12/21/10/18/orloj-1102368_960_720.jpg").into(otra);

                                    break;
                                case "3":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2015/08/24/20/22/prague-905569_960_720.jpg").into(otra);

                                    break;
                                case "4":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/04/29/17/09/prague-1361374_960_720.jpg").into(otra);

                                    break;
                                case "5":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/01/29/16/57/prague-1168302_960_720.jpg").into(otra);

                                    break;
                                case "6":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2017/02/07/21/29/prague-2047105_960_720.jpg").into(otra);

                                    break;
                                case "7":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/10/21/19/03/czech-republic-1758820_960_720.png").into(otra);

                                    break;
                                case "8":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2014/11/27/16/40/clock-547839_960_720.jpg").into(otra);

                                    break;
                                default:
                                    System.out.println("ERROR");
                                    break;
                            }
                        }
                    });


                    final double[] coord3 = new double[]{50.0880400, 14.4207600};
                    resuelvo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {


                            Intent reg = new Intent(EuropaPartida.this, MapsActivity.class);
                            reg.putExtra("Score", score);
                            reg.putExtra("coord", coord3);
                            reg.putExtra("Partidas", partidas);
                            startActivity(reg);


                        }
                    });
                    break;
                }
                case "Roma": {

                    switch (result) {
                        case "1":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2014/03/26/05/47/vittorio-emanuele-monument-298412_960_720.jpg").into(otra);

                            break;
                        case "2":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2014/03/23/04/19/pantheon-293074_960_720.jpg").into(otra);

                            break;
                        case "3":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2017/02/01/16/15/colosseum-2030639_960_720.jpg").into(otra);

                            break;
                        case "4":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2017/01/01/17/39/rome-1945033_960_720.jpg").into(otra);

                            break;
                        case "5":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/08/31/13/41/italy-1633494_960_720.jpg").into(otra);

                            break;
                        case "6":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2014/03/26/05/46/trevi-fountain-298411_960_720.jpg").into(otra);

                            break;
                        case "7":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/08/31/14/27/italy-1633660_960_720.jpg").into(otra);

                            break;
                        case "8":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/11/02/10/51/rome-1791065_960_720.jpg").into(otra);

                            break;
                        default:
                            System.out.println("ERROR");
                            break;
                    }

                    otra.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            int min = 1;
                            int max = 8;

                            Random r = new Random();
                            int number = r.nextInt(max - min + 1) + min;
                            final String result = String.valueOf(number);

                            switch (result) {
                                case "1":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2014/03/26/05/47/vittorio-emanuele-monument-298412_960_720.jpg").into(otra);

                                    break;
                                case "2":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2014/03/23/04/19/pantheon-293074_960_720.jpg").into(otra);

                                    break;
                                case "3":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2017/02/01/16/15/colosseum-2030639_960_720.jpg").into(otra);

                                    break;
                                case "4":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2017/01/01/17/39/rome-1945033_960_720.jpg").into(otra);

                                    break;
                                case "5":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/08/31/13/41/italy-1633494_960_720.jpg").into(otra);

                                    break;
                                case "6":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2014/03/26/05/46/trevi-fountain-298411_960_720.jpg").into(otra);

                                    break;
                                case "7":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/08/31/14/27/italy-1633660_960_720.jpg").into(otra);

                                    break;
                                case "8":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/11/02/10/51/rome-1791065_960_720.jpg").into(otra);

                                    break;
                                default:
                                    System.out.println("ERROR");
                                    break;
                            }

                        }
                    });


                    final double[] coord3 = new double[]{41.8919300, 12.5113300};
                    resuelvo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {


                            Intent reg = new Intent(EuropaPartida.this, MapsActivity.class);
                            reg.putExtra("Score", score);
                            reg.putExtra("coord", coord3);
                            reg.putExtra("Partidas", partidas);
                            startActivity(reg);


                        }
                    });
                    break;
                }
                case "Valencia": {

                    switch (result) {
                        case "1":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2017/01/04/18/51/cac-1952795_960_720.jpg").into(otra);

                            break;
                        case "2":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2015/11/11/19/58/city-of-arts-and-science-1039163_960_720.jpg").into(otra);

                            break;
                        case "3":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2015/07/09/22/00/valencia-838631_960_720.jpg").into(otra);

                            break;
                        case "4":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/03/14/15/56/building-1255690_960_720.jpg").into(otra);

                            break;
                        case "5":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/11/22/20/51/beach-1850556_960_720.jpg").into(otra);

                            break;
                        case "6":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/01/29/13/45/paella-1167973_960_720.jpg").into(otra);

                            break;
                        case "7":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/01/23/15/23/valencia-1157601_960_720.jpg").into(otra);

                            break;
                        case "8":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2013/04/12/14/10/fireworks-102971_960_720.jpg").into(otra);

                            break;
                        default:
                            System.out.println("ERROR");
                            break;
                    }
                    otra.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            int min = 1;
                            int max = 8;

                            Random r = new Random();
                            int number = r.nextInt(max - min + 1) + min;
                            final String result = String.valueOf(number);

                            switch (result) {
                                case "1":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2017/01/04/18/51/cac-1952795_960_720.jpg").into(otra);

                                    break;
                                case "2":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2015/11/11/19/58/city-of-arts-and-science-1039163_960_720.jpg").into(otra);

                                    break;
                                case "3":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2015/07/09/22/00/valencia-838631_960_720.jpg").into(otra);

                                    break;
                                case "4":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/03/14/15/56/building-1255690_960_720.jpg").into(otra);

                                    break;
                                case "5":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/11/22/20/51/beach-1850556_960_720.jpg").into(otra);

                                    break;
                                case "6":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/01/29/13/45/paella-1167973_960_720.jpg").into(otra);

                                    break;
                                case "7":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/01/23/15/23/valencia-1157601_960_720.jpg").into(otra);

                                    break;
                                case "8":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2013/04/12/14/10/fireworks-102971_960_720.jpg").into(otra);

                                    break;
                                default:
                                    System.out.println("ERROR");
                                    break;
                            }

                        }
                    });


                    final double[] coord3 = new double[]{39.4697500, -0.3773900};
                    resuelvo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {


                            Intent reg = new Intent(EuropaPartida.this, MapsActivity.class);
                            reg.putExtra("Score", score);
                            reg.putExtra("coord", coord3);
                            reg.putExtra("Partidas", partidas);
                            startActivity(reg);


                        }
                    });
                    break;
                }
                case "Venecia": {

                    switch (result) {
                        case "1":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2013/10/12/23/59/venice-194835_960_720.jpg").into(otra);

                            break;
                        case "2":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2017/01/28/01/01/mask-2014556_960_720.jpg").into(otra);

                            break;
                        case "3":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2017/02/11/17/58/travel-2058242_960_720.jpg").into(otra);

                            break;
                        case "4":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/12/27/09/24/venice-1933559_960_720.jpg").into(otra);

                            break;
                        case "5":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2017/01/21/14/09/venice-1997306_960_720.jpg").into(otra);

                            break;
                        case "6":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/12/05/00/27/venice-1882880_960_720.jpg").into(otra);

                            break;
                        case "7":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/12/09/22/14/venice-1896208_960_720.jpg").into(otra);

                            break;
                        case "8":

                            Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2014/11/21/17/23/piazza-san-marco-540808_960_720.jpg").into(otra);

                            break;
                        default:
                            System.out.println("ERROR");
                            break;
                    }
                    otra.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {

                            int min = 1;
                            int max = 8;

                            Random r = new Random();
                            int number = r.nextInt(max - min + 1) + min;
                            final String result = String.valueOf(number);


                            switch (result) {
                                case "1":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2013/10/12/23/59/venice-194835_960_720.jpg").into(otra);

                                    break;
                                case "2":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2017/01/28/01/01/mask-2014556_960_720.jpg").into(otra);

                                    break;
                                case "3":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2017/02/11/17/58/travel-2058242_960_720.jpg").into(otra);

                                    break;
                                case "4":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/12/27/09/24/venice-1933559_960_720.jpg").into(otra);

                                    break;
                                case "5":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2017/01/21/14/09/venice-1997306_960_720.jpg").into(otra);

                                    break;
                                case "6":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/12/05/00/27/venice-1882880_960_720.jpg").into(otra);

                                    break;
                                case "7":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2016/12/09/22/14/venice-1896208_960_720.jpg").into(otra);

                                    break;
                                case "8":

                                    Picasso.with(getApplicationContext()).load("https://cdn.pixabay.com/photo/2014/11/21/17/23/piazza-san-marco-540808_960_720.jpg").into(otra);

                                    break;
                                default:
                                    System.out.println("ERROR");
                                    break;
                            }


                        }
                    });


                    final double[] coord3 = new double[]{45.4371300, 12.3326500};
                    resuelvo.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {


                            Intent reg = new Intent(EuropaPartida.this, MapsActivity.class);
                            reg.putExtra("Score", score);
                            reg.putExtra("coord", coord3);
                            reg.putExtra("Partidas", partidas);
                            startActivity(reg);


                        }
                    });
                    break;
                }
            }
        }else{

            Intent reg = new Intent(EuropaPartida.this, FinalPartida.class);
            reg.putExtra("Score", score);
            startActivity(reg);


        }

    }
}
